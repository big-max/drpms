package com.ibm.tws.controller;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.smartcloud.core.controller.BaseController;
import com.ibm.smartcloud.core.dao.hibernate.dao.IBaseDao;
import com.ibm.smartcloud.core.dao.hibernate.service.IOperateManager;
import com.ibm.smartcloud.core.dao.hibernate.service.impl.OperateManagerImp;
import com.ibm.tws.bean.DepartmentBean;
import com.ibm.tws.bean.HistoryJobBean;
import com.ibm.tws.bean.JobAndSystemConfigBean;
import com.ibm.tws.bean.StaticConst;
import com.ibm.tws.bean.UserBean;
import com.ibm.tws.service.DepartmentService;
import com.ibm.tws.service.HistoryJobService;
import com.ibm.tws.service.JobConfigService;
import com.ibm.tws.service.JobService;
import com.ibm.tws.service.UserService;
import com.ibm.tws.service.impl.UserServiceImpl;
import com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType;
import com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType;
import com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType;
import com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType;
import com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType;
import com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType;
import com.ibm.tws.ws.services.TWS_Job.JobServiceProxy;
import com.ibm.tws.ws.services.TWS_JobStream.JobStreamServiceProxy;
import com.ibm.tws.ws.services.TWS_Scheduling.SchedulingFactoryProxy;
import com.ibm.tws.ws.types.TWS_Types.FilterCriteria;
import com.ibm.tws.ws.types.TWS_Types.JobInstance;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class JobController extends BaseController{
	@Autowired
	private JobConfigService jobConfigService;
	@Autowired
	private JobService jobService;
	@Autowired
	private UserService userService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private HistoryJobService historyJobService;
	private Logger logger = Logger.getLogger(this.getClass());
	public static  int steps=50; //用于控制日志的输出数量
	public static int current = 0;//
	@RequestMapping("/dashboard")
	public String getDashboard(HttpServletRequest request) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		List<UserBean> uList = userService.getUserList();
		request.setAttribute("users", uList);
		
		//阶段区分数据
		String[] data = getTaskJobsByStage();
		request.setAttribute("data", data);
				
		return "home/dashboard";
	}	
	
	@RequestMapping("/people")
	public String getPeople(HttpServletRequest request) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		List<DepartmentBean> dList = departmentService.getDepartmentList();
		for(DepartmentBean d: dList){
			List<UserBean> uList = userService.getUserListByDepartmentId(d.getId());
			d.setUsers(uList);
		}
		request.setAttribute("departmentsByUsers", dList);
		return "home/people";
	}
	
	@RequestMapping("/task")
	public String getTask(HttpServletRequest request) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		JSONObject obj = this.getStaticTaskStartJobs();
		request.setAttribute("obj", obj);
		return "home/task";
	}
	
	@RequestMapping("/process")
	public String getProcess(HttpServletRequest request) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		//JSONObject obj = this.getStaticTaskStartJobs();
		//request.setAttribute("obj", obj);
		return "home/process";
	}
	
	
	@RequestMapping("/system")
	public String getSystem(HttpServletRequest request) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		JSONObject data = getTaskJobsBySys();		
		request.setAttribute("data", data);        
		return "home/system";
	}
	
	//通过状态视图查看job
	@RequestMapping("/getTaskJobsByStatus")
	public String getTaskJobsByStatus(HttpServletRequest request,HttpServletResponse response) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		String jobStreamName = StaticConst.job_stream_name; 
		FilterCriteria f= new FilterCriteria();
		f.setValue(new String[]{jobStreamName});
		f.setDataType("JOB_STREAM_NAME");
		JobInstance[] jobinstances = jobService.queryJobs("",new FilterCriteria[]{f});
		
		List<JobInstance> completeds = new ArrayList<JobInstance>();
		List<JobInstance> starteds = new ArrayList<JobInstance>();
		List<JobInstance> errors = new ArrayList<JobInstance>();
		List<JobInstance> waitings = new ArrayList<JobInstance>();
		
		List<String> comlist = StaticConst.getStatusCompleted();
		List<String> runlist = StaticConst.getStatusRunning();
		List<String> errlist = StaticConst.getStatusError();
		List<String> redlist = StaticConst.getStatusReady();
		

		for (JobInstance jobInstance : jobinstances) {	
			String state = jobInstance.getStatus().toLowerCase();
			if(comlist.contains(state)){
				completeds.add(jobInstance);
			}else if(runlist.contains(state)){
				starteds.add(jobInstance);
			}else if(errlist.contains(state)){
				errors.add(jobInstance);
			}else if(redlist.contains(state)){
				if(jobInstance.getActualArrival().getTimeInMillis()>0 && StaticConst.status_waiting.equals(state)){
					starteds.add(jobInstance);
				}else{
					waitings.add(jobInstance);
				}
			}			
		}
		
		Long int1 = Long.valueOf(starteds.size());		
		Long int2 = Long.valueOf(errors.size());
		Long int3 = Long.valueOf(completeds.size());
		Long int4 = Long.valueOf(waitings.size());

		JSONArray data = new JSONArray();
		if(int3>0){
			JSONObject obj = new JSONObject();
			obj.put("value", int3);
			obj.put("name", "已成功");
			data.add(obj);
		}
		if(int1>0){
			JSONObject obj = new JSONObject();
			obj.put("value", int1);
			obj.put("name", "进行中");
			data.add(obj);
		}
		if(int2>0){
			JSONObject obj = new JSONObject();
			obj.put("value", int2);
			obj.put("name", "已失败");
			data.add(obj);
		}
		if(int4>0){
			JSONObject obj = new JSONObject();
			obj.put("value", int4);
			obj.put("name", "未开始");
			data.add(obj);
		}			
		try {
	        response.setContentType("text/html;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");			
			response.getWriter().print(data);
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//查看正在运行的job
	@RequestMapping("/getTaskStartJobs")
	public String getTaskStartJobs(HttpServletRequest request,HttpServletResponse response) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		try {
			JSONObject obj = this.getStaticTaskStartJobs();
			//JSONArray jsonarray = JSONArray.fromObject(jobinstances);
	        response.setContentType("text/html;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");			
			response.getWriter().print(obj);
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//系统的视图查看job
	@RequestMapping("/getJobsBySys")
	public String getJobsBySys(HttpServletRequest request,HttpServletResponse response) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		try {
			JSONObject data = getTaskJobsBySys();
	        response.setContentType("text/html;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");			
			response.getWriter().print(data);
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}


	//通过任务阶段来区分查看job
	@RequestMapping("/getTaskJobsByStage")
	public String getTaskJobsByStage(HttpServletRequest request,HttpServletResponse response) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		try {
			String[] data = getTaskJobsByStage();
			JSONObject obj = new JSONObject();
			obj.put("data", data);
	        response.setContentType("text/html;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");			
			response.getWriter().print(obj);
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	//通过时间视图查看job
	@RequestMapping("/getTaskJobsByTime")
	public String getTaskJobsByTime(HttpServletRequest request,HttpServletResponse response) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{

		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sf = new SimpleDateFormat("HH:mm");
		long ctime = System.currentTimeMillis();
		Calendar now = Calendar.getInstance();  
		now.add(Calendar.MINUTE, -30);   
		//now.add(Calendar.MINUTE, -10);  
		long mtime = now.getTimeInMillis();
		String begin = sd.format(new Date(mtime));
		String end = sd.format(new Date(ctime));
        
		try {
			List<HistoryJobBean> list = historyJobService.getHistoryJobList(begin,end);
			int len = list.size();
			String[] times = new String[len];
			Float[] starteds = new Float[len];
			Float[] errors = new Float[len];
			Float[] completeds = new Float[len];
			Float[] waitings = new Float[len];
			
			for (int i=0;i<list.size();i++) {
				HistoryJobBean h = list.get(i);
				times[i] = sf.format(new Date(h.getJobdate().getTime()));
				starteds[i] = Float.valueOf(h.getStarted());
				errors[i] = Float.valueOf(h.getError());
				completeds[i] = Float.valueOf(h.getCompleted());
				waitings[i] = Float.valueOf(h.getWaiting());	
			}
			/*String[] starteds = new String[len];
			String[] errors = new String[len];
			String[] completeds = new String[len];
			String[] waitings = new String[len];
			
			for (int i=0;i<list.size();i++) {
				HistoryJobBean h = list.get(i);
				times[i] = sf.format(new Date(h.getJobdate().getTime()));
				starteds[i] = h.getStarted()+"%";
				errors[i] = h.getError()+"%";
				completeds[i] = h.getCompleted()+"%";
				waitings[i] = h.getWaiting()+"%";	
			}*/
			JSONObject obj = new JSONObject();
			obj.put("times", times);
			obj.put("starteds", starteds);
			obj.put("errors", errors);
			obj.put("completeds", completeds);
			obj.put("waitings", waitings);
			response.setContentType("text/html;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");			
			response.getWriter().print(obj);
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//解析正在运行的job
	private JSONObject getStaticTaskStartJobs() throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		//FilterCriteria f= new FilterCriteria();
		//f.setValue(new String[]{"STARTED"});
		//f.setValue(new String[]{"BLOCKED","CANCELLED","COMPLETED","ERROR","HELD","READY","STARTED","WAITING","UNDECIDED"});
		//f.setDataType("STATUS_LIST");
		String jobStreamName = StaticConst.job_stream_name; 
		FilterCriteria f2= new FilterCriteria();
		f2.setValue(new String[]{jobStreamName});
		f2.setDataType("JOB_STREAM_NAME");
		JobInstance[] jobinstances = jobService.queryJobs("",new FilterCriteria[]{f2});	
		if( current<steps ){
			logger.info("start");
			for(int i = 0 ; i < jobinstances.length;i++)
				{
					logger.info(jobinstances[i]);
				}
			System.out.println(jobinstances.length);
			logger.info("end");
			current++;
		}
		List<JobAndSystemConfigBean> clist = jobConfigService.getConfigListByNameDesc();
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Boolean allsuccess = true;	
		List<JobAndSystemConfigBean> newlist = new ArrayList<JobAndSystemConfigBean>();
		for (JobAndSystemConfigBean bean : clist) {			
			for (JobInstance jobInstance : jobinstances) {			
				long actualArrival = jobInstance.getActualArrival().getTimeInMillis(); 	
				String date1 = null;
				if(actualArrival>0){
					date1 = sd.format(new Date(actualArrival));
				}	
				long expectStartDate = -1;
				if(bean.getName().equals(jobInstance.getJobName()) ){
					if ( bean.getPlanStartTime() >0 ){
						expectStartDate = bean.getPlanStartTime();
					}else{
						expectStartDate = -1;
					}	
					String date2 = expectStartDate>-1? sd.format(new Date(expectStartDate)) : null;
					bean.setStartDate(date1);
					bean.setExpectStartDate(date2);	

					if(expectStartDate>0 && actualArrival-expectStartDate>10){
						bean.setLagtime(true);
					}
					String state = jobInstance.getStatus().toLowerCase();
					bean.setStatus(StaticConst.getStatus(state));
					bean.setColorclass(StaticConst.getColorClassByStatus(state));
					bean.setJobName(jobInstance.getJobName());
					//如果是状态属于 进行中或者未开始  则表示未完成
					if(StaticConst.getStatusRunning().contains(state) || StaticConst.getStatusReady().contains(state)){
						allsuccess = false;		
					}
					if(StaticConst.getStatusRunning().contains(state)
							|| StaticConst.getStatusCompleted().contains(state)
							||StaticConst.getStatusError().contains(state) ){
						newlist.add(bean);
					}else if(actualArrival>0 && StaticConst.status_waiting.equals(state)){
						String running = StaticConst.status_running;
						bean.setStatus(StaticConst.getStatus(running));
						bean.setColorclass(StaticConst.getColorClassByStatus(running));
						newlist.add(bean);
					}
					break;
				}
				
			}
			
		} 
		JSONObject obj = new JSONObject();
		obj.put("jobinstances", newlist);
		obj.put("allsuccess", allsuccess);
		return obj;
	}

	//通过系统的视图查看job
	private JSONObject getTaskJobsBySys() throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		String jobStreamName = StaticConst.job_stream_name; 
		FilterCriteria f= new FilterCriteria();
		f.setValue(new String[]{jobStreamName});
		f.setDataType("JOB_STREAM_NAME");
		
		JobInstance[] jobinstances = jobService.queryJobs("",new FilterCriteria[]{f});			
		
		List<JobAndSystemConfigBean> clist = jobConfigService.getConfigList();
		
		List<String> comlist = StaticConst.getStatusCompleted();
		List<String> runlist = StaticConst.getStatusRunning();
		List<String> errlist = StaticConst.getStatusError();
		List<String> redlist = StaticConst.getStatusReady();
	
		int sys1 = 0;
		int sys1_STARTED = 0;
		int sys1_ERROR = 0;
		int sys1_COMPLETED = 0;
		int sys1_WAITING = 0;
		
		int sys2 = 0;
		int sys2_STARTED = 0;
		int sys2_ERROR = 0;
		int sys2_COMPLETED = 0;
		int sys2_WAITING = 0;
		
		int sys3 = 0;
		int sys3_STARTED = 0;
		int sys3_ERROR = 0;
		int sys3_COMPLETED = 0;
		int sys3_WAITING = 0;
		
		int sys4 = 0;
		int sys4_STARTED = 0;
		int sys4_ERROR = 0;
		int sys4_COMPLETED = 0;
		int sys4_WAITING = 0;

		int sys5 = 0;
		int sys5_STARTED = 0;
		int sys5_ERROR = 0;
		int sys5_COMPLETED = 0;
		int sys5_WAITING = 0;

		for (JobInstance jobInstance : jobinstances) {	
			for (JobAndSystemConfigBean bean : clist) {
				String sysname = bean.getSystemName();
				if(bean.getName().equals(jobInstance.getJobName()) && !"".equals(sysname)){
					String state = jobInstance.getStatus().toLowerCase();
					long atime = jobInstance.getActualArrival().getTimeInMillis();
					if(StaticConst.system_all.equals(sysname)){
						sys1 = sys1 + 1;
						sys2 = sys2 + 1;
						sys3 = sys3 + 1;
						sys4 = sys4 + 1;
						sys5 = sys5 + 1;
						if(comlist.contains(state)){
							sys1_COMPLETED = sys1_COMPLETED + 1;
							sys2_COMPLETED = sys2_COMPLETED + 1;
							sys3_COMPLETED = sys3_COMPLETED + 1;
							sys4_COMPLETED = sys4_COMPLETED + 1;
							sys5_COMPLETED = sys5_COMPLETED + 1;
						}else if(runlist.contains(state) || 
								(StaticConst.status_waiting.equals(state) && atime>0)){
							sys1_STARTED = sys1_STARTED + 1;
							sys2_STARTED = sys2_STARTED + 1;
							sys3_STARTED = sys3_STARTED + 1;
							sys4_STARTED = sys4_STARTED + 1;
							sys5_STARTED = sys5_STARTED + 1;
						}else if(errlist.contains(state)){
							sys1_ERROR = sys1_ERROR + 1;
							sys2_ERROR = sys2_ERROR + 1;
							sys3_ERROR = sys3_ERROR + 1;
							sys4_ERROR = sys4_ERROR + 1;
							sys5_ERROR = sys5_ERROR + 1;
						}else if(redlist.contains(state)){
							sys1_WAITING = sys1_WAITING + 1;
							sys2_WAITING = sys2_WAITING + 1;
							sys3_WAITING = sys3_WAITING + 1;
							sys4_WAITING = sys4_WAITING + 1;
							sys5_WAITING = sys5_WAITING + 1;
						}
					}else if(StaticConst.system_core.equals(sysname)){
						sys1 = sys1 + 1;
						if(comlist.contains(state)){
							sys1_COMPLETED = sys1_COMPLETED + 1;
						}else if(runlist.contains(state) || 
								(StaticConst.status_waiting.equals(state) && atime>0)){
							sys1_STARTED = sys1_STARTED + 1;
						}else if(errlist.contains(state)){
							sys1_ERROR = sys1_ERROR + 1;
						}else if(redlist.contains(state)){
							sys1_WAITING = sys1_WAITING + 1;
						}
					}else if(StaticConst.system_new_credit.equals(sysname)){
						sys2 = sys2 + 1;
						if(comlist.contains(state)){
							sys2_COMPLETED = sys2_COMPLETED + 1;
						}else if(runlist.contains(state) || 
								(StaticConst.status_waiting.equals(state) && atime>0)){
							sys2_STARTED = sys2_STARTED + 1;
						}else if(errlist.contains(state)){
							sys2_ERROR = sys2_ERROR + 1;
						}else if(redlist.contains(jobInstance.getStatus())){
							sys2_WAITING = sys2_WAITING + 1;
						}
					}else if(StaticConst.system_counter_prepose.equals(sysname)){
						sys3 = sys3 + 1;
						if(comlist.contains(state)){
							sys3_COMPLETED = sys3_COMPLETED + 1;
						}else if(runlist.contains(state) || 
								(StaticConst.status_waiting.equals(state) && atime>0)){
							sys3_STARTED = sys3_STARTED + 1;
						}else if(errlist.contains(state)){
							sys3_ERROR = sys3_ERROR + 1;
						}else if(redlist.contains(state)){
							sys3_WAITING = sys3_WAITING + 1;
						}
					}else if(StaticConst.system_transaction_route.equals(sysname)){
						sys4 = sys4 + 1;
						if(comlist.contains(state)){
							sys4_COMPLETED = sys4_COMPLETED + 1;
						}else if(runlist.contains(state) || 
								(StaticConst.status_waiting.equals(state) && atime>0)){
							sys4_STARTED = sys4_STARTED + 1;
						}else if(errlist.contains(state)){
							sys4_ERROR = sys4_ERROR + 1;
						}else if(redlist.contains(state)){
							sys4_WAITING = sys4_WAITING + 1;
						}
					}else if(StaticConst.system_encrypt_platform.equals(sysname)){
						sys5 = sys5 + 1;
						if(comlist.contains(state)){
							sys5_COMPLETED = sys5_COMPLETED + 1;
						}else if(runlist.contains(state) || 
								(StaticConst.status_waiting.equals(state) && atime>0)){
							sys5_STARTED = sys5_STARTED + 1;
						}else if(errlist.contains(state)){
							sys5_ERROR = sys5_ERROR + 1;
						}else if(redlist.contains(state)){
							sys5_WAITING = sys5_WAITING + 1;
						}
					}
					
				}
			}
		} 
		
		
		
		JSONArray data1 = new JSONArray();
		if(sys1_COMPLETED>0){
			JSONObject o = new JSONObject();
			o.put("value", sys1_COMPLETED);
			o.put("name", "已成功");
			data1.add(o);
		} 
		if(sys1_STARTED>0) {
			JSONObject o = new JSONObject();
			o.put("value", sys1_STARTED);
			o.put("name", "进行中");
			data1.add(o);
		}
		if(sys1_ERROR>0){
			JSONObject o = new JSONObject();
			o.put("value", sys1_ERROR);
			o.put("name", "已失败");
			data1.add(o);
		}
		if(sys1_WAITING>0){
			JSONObject o = new JSONObject();
			o.put("value", sys1_WAITING);
			o.put("name", "未开始");
			data1.add(o);
		} 
		
        
		JSONArray data2 = new JSONArray();
		if(sys2_COMPLETED>0){
			JSONObject o = new JSONObject();
			o.put("value", sys2_COMPLETED);
			o.put("name", "已成功");
			data2.add(o);
		} 
		if(sys2_STARTED>0){
			JSONObject o = new JSONObject();
			o.put("value", sys2_STARTED);
			o.put("name", "进行中");
			data2.add(o);
		} 
		if(sys2_ERROR>0){
			JSONObject o = new JSONObject();
			o.put("value", sys2_ERROR);
			o.put("name", "已失败");
			data2.add(o);
		} 
		
		if(sys2_WAITING>0){
			JSONObject o = new JSONObject();
			o.put("value", sys2_WAITING);
			o.put("name", "未开始");
			data2.add(o);
		}        
		JSONArray data3 = new JSONArray();
		if(sys3_COMPLETED>0){
			JSONObject o = new JSONObject();
			o.put("value", sys3_COMPLETED);
			o.put("name", "已成功");
			data3.add(o);
		}
		if(sys3_STARTED>0){
			JSONObject o = new JSONObject();
			o.put("value", sys3_STARTED);
			o.put("name", "进行中");
			data3.add(o);
		} 
		if(sys3_ERROR>0){
			JSONObject o = new JSONObject();
			o.put("value", sys3_ERROR);
			o.put("name", "已失败");
			data3.add(o);
		}		
		if(sys3_WAITING>0){
			JSONObject o = new JSONObject();
			o.put("value", sys3_WAITING);
			o.put("name", "未开始");
			data3.add(o);
		} 
		
		JSONArray data4 = new JSONArray();
		if(sys4_COMPLETED>0){
			JSONObject o = new JSONObject();
			o.put("value", sys4_COMPLETED);
			o.put("name", "已成功");
			data4.add(o);
		} 
		if(sys4_STARTED>0){
			JSONObject o = new JSONObject();
			o.put("value", sys4_STARTED);
			o.put("name", "进行中");
			data4.add(o);
		} 
		if(sys4_ERROR>0){
			JSONObject o = new JSONObject();
			o.put("value", sys4_ERROR);
			o.put("name", "已失败");
			data4.add(o);
		} 
		
		if(sys4_WAITING>0){
			JSONObject o = new JSONObject();
			o.put("value", sys4_WAITING);
			o.put("name", "未开始");
			data4.add(o);
		}        
		JSONArray data5 = new JSONArray();
		if(sys5_COMPLETED>0){
			JSONObject o = new JSONObject();
			o.put("value", sys5_COMPLETED);
			o.put("name", "已成功");
			data5.add(o);
		}
		if(sys5_STARTED>0){
			JSONObject o = new JSONObject();
			o.put("value", sys5_STARTED);
			o.put("name", "进行中");
			data5.add(o);
		} 
		if(sys5_ERROR>0){
			JSONObject o = new JSONObject();
			o.put("value", sys5_ERROR);
			o.put("name", "已失败");
			data5.add(o);
		}		
		if(sys5_WAITING>0){
			JSONObject o = new JSONObject();
			o.put("value", sys5_WAITING);
			o.put("name", "未开始");
			data5.add(o);
		} 
		
		JSONObject data = new JSONObject();
		data.put("data1",data1);
		data.put("data2",data2);
		data.put("data3",data3);
		data.put("data4",data4);
		data.put("data5",data5);
		return data;
	}
	
	//串行任务视图
	@RequestMapping("/getSerialTaskJobs")
	public String getSerialTaskJobs(HttpServletRequest request,HttpServletResponse response) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		String jobStreamName = StaticConst.job_stream_name; 
		FilterCriteria f= new FilterCriteria();
		f.setValue(new String[]{jobStreamName});
		f.setDataType("JOB_STREAM_NAME");
		JobInstance[] jobinstances = jobService.queryJobs("",new FilterCriteria[]{f});
		//获取所有的串行任务集合
		List<JobAndSystemConfigBean> clist = jobConfigService.getConfigSerialList();
				
			
		List<String> jobs = new ArrayList<String>();
		/*SimpleDateFormat sd = new SimpleDateFormat("HH.mm");
		List<Double> start = new ArrayList<Double>();
		List<Double> expect = new ArrayList<Double>();*/
		
		List<Long> start = new ArrayList<Long>();
		List<Long> expect = new ArrayList<Long>();
		
		int i = 0;
		for (JobAndSystemConfigBean bean : clist) {
			for (JobInstance jobInstance : jobinstances) {	
				//判断名称是否相等
				if(bean.getName().equals(jobInstance.getJobName())){
					//实际开始时间
					long actualArrival = jobInstance.getActualArrival().getTimeInMillis(); 
					//Double date1 = 00.00;
					//Double date2 = 00.00;
					if(actualArrival>0){
						/*date1 = Double.valueOf(sd.format(new Date(actualArrival)));
						start.add(date1);*/
						start.add(actualArrival);
					}						
					//预计开始时间
					if ( bean.getPlanStartTime() >0 ){
						//date2 = Double.valueOf(sd.format(new Date(bean.getPlanStartTime())));
						//expect.add(date2);	
						expect.add(bean.getPlanStartTime());
					}
					jobs.add(jobInstance.getJobName());
						
					i = i+1;
					break;
				}
			}
		}
		  
		/*String[] jobs2 = (String[])jobs.toArray(new String[i]);
		Double[] start2 = (Double[])start.toArray(new Double[i]);
		Double[] expect2 = (Double[])expect.toArray(new Double[i]);*/
		
		JSONObject obj = new JSONObject();
		obj.put("jobs", jobs);
		obj.put("start", start);
		obj.put("expect", expect);
		
		Map<String,String> jobmap = StaticConst.getKeyJobs();
		obj.put("jobmap", jobmap);
		List<String> jobnames = StaticConst.getJobnames();
		obj.put("jobnames", jobnames);
		
		try {
	        response.setContentType("text/html;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");			
			response.getWriter().print(obj);
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}


	//通过任务阶段来区分查看job
	private String[] getTaskJobsByStage() throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		
		String jobStreamName = StaticConst.job_stream_name; 
		FilterCriteria f= new FilterCriteria();
		f.setValue(new String[]{jobStreamName});
		f.setDataType("JOB_STREAM_NAME");		
		JobInstance[] jobinstances = jobService.queryJobs("",new FilterCriteria[]{f});			
		//int size = jobinstances.length;
		List<JobAndSystemConfigBean> clist = jobConfigService.getConfigList();
	
		int stage1 = 0;
		int stage2 = 0;
		int stage3 = 0;
		int stage4 = 0;
		int stage5 = 0;
		int stage6 = 0;
		int stage7 = 0;
		int stage8 = 0;
		int stage9 = 0;
		int stage10 = 0;
		int stage11 = 0;
		int stage12 = 0;
		
		int succ1 = 0;
		int succ2 = 0;
		int succ3 = 0;
		int succ4 = 0;
		int succ5 = 0;
		int succ6 = 0;
		int succ7 = 0;
		int succ8 = 0;
		int succ9 = 0;
		int succ10 = 0;
		int succ11 = 0;
		int succ12 = 0;
		
		List<String> comlist = StaticConst.getStatusCompleted();
		for (JobInstance jobInstance : jobinstances) {				
			for (JobAndSystemConfigBean bean : clist) {
				if(bean.getName().equals(jobInstance.getJobName()) && bean.getPhaseInSystem()!=null){
					String state = jobInstance.getStatus().toLowerCase();
					if(StaticConst.stage_check.equals(bean.getPhaseInSystem())){
						stage1 = stage1 +1;
						if(comlist.contains(state)){
							succ1 = succ1 +1;
						}
					}else if(StaticConst.stage_production_sys_shutdown.equals(bean.getPhaseInSystem())){
						stage2 = stage2 +1;
						if(comlist.contains(state)){
							succ2 = succ2 +1;
						}
					}else if(StaticConst.stage_storage_switch.equals(bean.getPhaseInSystem())){
						stage3 = stage3 +1;
						if(comlist.contains(state)){
							succ3 = succ3 +1;
						}
					}else if(StaticConst.stage_network_switch.equals(bean.getPhaseInSystem())){
						stage4 = stage4 +1;
						if(comlist.contains(state)){
							succ4 = succ4 +1;
						}
					}else if(StaticConst.stage_disastreco_sys_startup.equals(bean.getPhaseInSystem())){
						stage5 = stage5 +1;
						if(comlist.contains(state)){
							succ5 = succ5 +1;
						}
					}else if(StaticConst.stage_disastreco_validated.equals(bean.getPhaseInSystem())){
						stage6 = stage6 +1;
						if(comlist.contains(state)){
							succ6 = succ6 +1;
						}
					}else if(StaticConst.stage_network_backcut.equals(bean.getPhaseInSystem())){
						stage7 = stage7 +1;
						if(comlist.contains(state)){
							succ7 = succ7 +1;
						}
					}else if(StaticConst.stage_production_sys_startup.equals(bean.getPhaseInSystem())){
						stage8 = stage8 +1;
						if(comlist.contains(state)){
							succ8 = succ8 +1;
						}
					}else if(StaticConst.stage_production_validated.equals(bean.getPhaseInSystem())){
						stage9 = stage9 +1;
						if(comlist.contains(state)){
							succ9 = succ9 +1;
						}
					}else if(StaticConst.stage_disastreco_sys_shutdown.equals(bean.getPhaseInSystem())){
						stage10 = stage10 +1;
						if(comlist.contains(state)){
							succ10 = succ10 +1;
						}
					}else if(StaticConst.stage_storage_backcut.equals(bean.getPhaseInSystem())){
						stage11 = stage11 +1;
						if(comlist.contains(state)){
							succ11 = succ11 +1;
						}
					}else if(StaticConst.stage_data_backup.equals(bean.getPhaseInSystem())){
						stage12 = stage12 +1;
						if(comlist.contains(state)){
							succ12 = succ12 +1;
						}
					}
				}
			}
		} 
	
		String a1 = String.valueOf(Math.round(((double)succ1/(double)stage1)*100))+"%";
		String a2 = String.valueOf(Math.round(((double)succ2/(double)stage2)*100))+"%";
		String a3 = String.valueOf(Math.round(((double)succ3/(double)stage3)*100))+"%";
		String a4 = String.valueOf(Math.round(((double)succ4/(double)stage4)*100))+"%";
		String a5 = String.valueOf(Math.round(((double)succ5/(double)stage5)*100))+"%";
		String a6  = String.valueOf(Math.round(((double)succ6/(double)stage6)*100))+"%";
		String a7  = String.valueOf(Math.round(((double)succ7/(double)stage7)*100))+"%";
		String a8  = String.valueOf(Math.round(((double)succ8/(double)stage8)*100))+"%";
		String a9  = String.valueOf(Math.round(((double)succ9/(double)stage9)*100))+"%";
		String a10 = String.valueOf(Math.round(((double)succ10/(double)stage10)*100))+"%";
		String a11 = String.valueOf(Math.round(((double)succ11/(double)stage11)*100))+"%";
		String a12 = String.valueOf(Math.round(((double)succ12/(double)stage12)*100))+"%";
	    
	    String[] data = new String[]{a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12};
		return data;
	}

	@RequestMapping("/test")
	public String test(HttpServletRequest request) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		
		//JobInstance[] jobinstances = this.getStaticTaskStartJobs();
		String jobStreamName = StaticConst.job_stream_name; 
		FilterCriteria f= new FilterCriteria();
		f.setValue(new String[]{jobStreamName});
		f.setDataType("JOB_STREAM_NAME");
		JobInstance[] jobinstances = jobService.queryJobs("",new FilterCriteria[]{f});
		request.setAttribute("joblist", jobinstances);
		
//		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Calendar now = Calendar.getInstance();  
//		//now.add(Calendar.DATE, -1);   
//		//now.add(Calendar.HOUR, -2);
//		now.add(Calendar.MINUTE, -30);     
//		long mtime = now.getTimeInMillis();
//		Date date = new Date(mtime);
//		System.out.println(sd.format(date));
//		
//		now.add(Calendar.MINUTE, -50);     
//		long mtime1 = now.getTimeInMillis();
//		Date date1 = new Date(mtime1);
//		
//				
//		List<HistoryJobBean> hbean = historyJobService.getHistoryJobListByDate(sd.format(date));
//		System.out.println("------------///"+hbean.size());
//		
////		List<HistoryJobBean> hbean2 = historyJobService.getHistoryJobList(sd.format(date1),sd.format(date));
////		System.out.println("------------///"+hbean2.size());
		
//		
		return "home/test";
	}
	
	@RequestMapping("/getJobList")
	public String getJobList(HttpServletRequest request) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		
		SchedulingFactoryProxy proxy = new SchedulingFactoryProxy("http://10.28.0.236:31115/PlanServicesWeb/services/SchedulingFactory");
		JobServiceProxy proxy1 = new JobServiceProxy("http://10.28.0.236:31115/PlanServicesWeb/services/JobService");
		JobStreamServiceProxy proxy2 = new JobStreamServiceProxy("http://10.28.0.236:31115/PlanServicesWeb/services/JobStreamService");
		List<JobAndSystemConfigBean> list = jobConfigService.getConfigList();
		for (JobAndSystemConfigBean jobAndSystemConfigBean : list) {
			System.out.println(jobAndSystemConfigBean.getName());
		}
		  
		  
		  
		FilterCriteria f= new FilterCriteria();
		//f.setValue(new String[]{"COMPLETED"});
		//f.setDataType("STATUS_LIST");
		//f.setValue(new String[]{"DRPMSSVR"});
		//f.setDataType("WORKSTATION_NAME");
		//f.setValue(new String[]{"SUCC"});
		//f.setValue(new String[]{"BLOCKED","CANCELLED","COMPLETED","ERROR","HELD","READY","STARTED","WAITING","UNDECIDED"});
		//f.setDataType("STATUS_LIST");
		//f.setMaximum("5");
		String jobStreamName = StaticConst.job_stream_name; 
		f.setValue(new String[]{jobStreamName});
		f.setDataType("JOB_STREAM_NAME");
		JobInstance[] jstreams = proxy.queryJobs(null, new FilterCriteria[]{f});
		System.out.println(jstreams.length);
		
		for (JobInstance jobInstance : jstreams) {
			//System.out.println(jobInstance.getJobName()+"=="+jobInstance.getJobStreamName()+"=="+jobInstance.getWorkstationName()+"=="+jobInstance.getExtendedStatus());
			System.out.println(jobInstance.getWorkstationName()+"#"+jobInstance.getJobStreamName()+"."+jobInstance.getJobName());

			  for (JobAndSystemConfigBean jobAndSystemConfigBean : list) {
					System.out.println(jobAndSystemConfigBean.getName());
					if (jobInstance.getJobId()==jobAndSystemConfigBean.getId()) {
						
					}
				}
			
		}
		
		request.setAttribute("joblist", jstreams);
	
		return "home/joblist";
	}
	 
	
	@RequestMapping("/echartstest")
	public String echartstest(HttpServletRequest request) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		return "home/echartstest";
	}
	
	@RequestMapping("/readExcel")
	public String readExcel(HttpServletRequest request) throws Exception{
		
		File file = new File("C:/Users/IBM_ADMIN/Desktop/TWS/ExcelDemo.xls");

		String[][] result = ReadExcel.getData(file, 1);
		int rowLength = result.length;
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (int i = 0; i < rowLength; i++) {
			//System.out.println("Y".equals(result[i][3])?1:0);
			JobAndSystemConfigBean bean = new JobAndSystemConfigBean();
			bean.setId(UUID.randomUUID().toString());
			bean.setName(result[i][0]);
			bean.setDescription(result[i][1]);
			bean.setSerial("Y".equals(result[i][3])?1:0);
			bean.setPhaseInSystem(result[i][4]);
			bean.setSystemName(result[i][5]);
			bean.setUsername(result[i][6]);
			Date dt1 = sf.parse(result[i][1]);
			long time1 = dt1.getTime();
			bean.setPlanStartTime(time1);
			jobConfigService.add(bean);
		}
		List<JobAndSystemConfigBean> clist = jobConfigService.getConfigListByNameDesc();
		request.setAttribute("joblist", clist);
		
		return "home/jobtest";
	}
	
	
	@RequestMapping("/getSerialTaskJobs1")
	public String getSerialTaskJobs1(HttpServletRequest request,HttpServletResponse response) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		String jobStreamName = StaticConst.job_stream_name; 
		FilterCriteria f= new FilterCriteria();
		f.setValue(new String[]{jobStreamName});
		f.setDataType("JOB_STREAM_NAME");
		JobInstance[] jobinstances = jobService.queryJobs("",new FilterCriteria[]{f});
		//获取所有的串行任务集合
		List<JobAndSystemConfigBean> clist = jobConfigService.getConfigSerialList();
				
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	
		List<String> jobs = new ArrayList<String>();
		List<Double> start = new ArrayList<Double>();
		List<Double> expect = new ArrayList<Double>();
		List<Date> start1 = new ArrayList<Date>();
		List<Date> expect1 = new ArrayList<Date>();
		
		List<Long> start2 = new ArrayList<Long>();
		List<Long> expect2 = new ArrayList<Long>();
		
		
		int i = 0;
		for (JobAndSystemConfigBean bean : clist) {
			for (JobInstance jobInstance : jobinstances) {	
				//判断名称是否相等
				if(bean.getName().equals(jobInstance.getJobName())){
					//实际开始时间
					long actualArrival = jobInstance.getActualArrival().getTimeInMillis(); 
					Double date1 = 00.00;
					Double date2 = 00.00;
					if(actualArrival>0){
						/*date1 = Double.valueOf(sd.format(new Date(actualArrival)));
						start.add(date1);*/
						start2.add(actualArrival);
					}						
					//预计开始时间
					if ( bean.getPlanStartTime() >0 ){
						/*date2 = Double.valueOf(sd.format(new Date(bean.getPlanStartTime())));
						expect.add(date2);	*/	
						expect2.add(bean.getPlanStartTime());
					}
					jobs.add(jobInstance.getJobName());
					start1.add(actualArrival>0?new Date(actualArrival):null);	
					expect1.add(bean.getPlanStartTime()>0?new Date(actualArrival):null);
					//start2.add(actualArrival>0?actualArrival:null);	
					//expect2.add(bean.getPlanStartTime()>0?bean.getPlanStartTime():null);
					i = i+1;
					break;
				}
			}
		}
		  
		/*String[] jobs2 = (String[])jobs.toArray(new String[i]);
		Double[] start2 = (Double[])start.toArray(new Double[i]);
		Double[] expect2 = (Double[])expect.toArray(new Double[i]);*/
		JSONObject obj = new JSONObject();
		obj.put("jobs", jobs);
		obj.put("start", start);
		obj.put("expect", expect);
		obj.put("start1", start1);
		obj.put("expect1", expect1);
		obj.put("start2", start2);
		obj.put("expect2", expect2);

		try {
	        response.setContentType("text/html;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");			
			response.getWriter().print(obj);
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
