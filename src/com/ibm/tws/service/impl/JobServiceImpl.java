package com.ibm.tws.service.impl;

import com.ibm.tws.bean.StaticConst;
import com.ibm.tws.service.JobService;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType;
import com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType;
import com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType;
import com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType;
import com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType;
import com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType;
import com.ibm.tws.ws.services.TWS_Scheduling.SchedulingFactoryProxy;
import com.ibm.tws.ws.types.TWS_Types.FilterCriteria;
import com.ibm.tws.ws.types.TWS_Types.JobInstance;
import com.ibm.tws.ws.types.TWS_Types.JobStreamInstance;

@Service("jobService")
public class JobServiceImpl implements JobService {

	@Override
	public JobInstance[] queryJobs() throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType, TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException {
		SchedulingFactoryProxy proxy = new SchedulingFactoryProxy(StaticConst.SchedulingFactoryProxyUrl);
				JobInstance[] jstreams = proxy.queryJobs(null, null);
				return jstreams;
	}
	
	@Override
	public JobInstance[] queryJobs(String engineName, FilterCriteria[] filter) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType,	TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		SchedulingFactoryProxy proxy = new SchedulingFactoryProxy(StaticConst.SchedulingFactoryProxyUrl);
		JobInstance[] jstreams = proxy.queryJobs(engineName, filter);
		return jstreams;
	}
	
	@Override
	public JobStreamInstance[] queryJobStreams(String engineName, FilterCriteria[] filter) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType,	TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException{
		SchedulingFactoryProxy proxy = new SchedulingFactoryProxy(StaticConst.SchedulingFactoryProxyUrl);
		JobStreamInstance[] jstreams = proxy.queryJobStreams(engineName, filter);
		return jstreams;
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(new Date().toString() + ":test delete job");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar now = Calendar.getInstance();  
		//now.add(Calendar.DATE, -1);   
//		now.add(Calendar.HOUR, -2);
		now.add(Calendar.MINUTE, -30);     
		long mtime = now.getTimeInMillis();
		Date date;
		try {
			date = (Date)format.parse(format.format(mtime));
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //new Date(mtime);
		
		
		
//		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		long ctime = System.currentTimeMillis();
//		Calendar now = Calendar.getInstance();  
//		now.add(Calendar.MINUTE, -30);     
//		long mtime = now.getTimeInMillis();
//        System.out.println(ctime+"..."+mtime);
//        
//        System.out.println(sd.format(new Date(ctime))+"..."+sd.format(new Date(mtime)));
//         
//        
		
//		try {
//			SchedulingFactoryProxy proxy = new SchedulingFactoryProxy("http://10.28.0.236:31115/PlanServicesWeb/services/SchedulingFactory");
//			FilterCriteria f= new FilterCriteria();
//			f.setValue(new String[]{"20151022"});
//			f.setDataType("START_TIME");
//			JobInstance[] jstreams = proxy.queryJobs(null, new FilterCriteria[]{f});
//			System.out.println(jstreams.length);
//		} catch (RemoteException e) {
////			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		try {
//			SchedulingFactoryProxy proxy = new SchedulingFactoryProxy("http://10.28.0.236:31115/PlanServicesWeb/services/SchedulingFactory");
//			JobServiceProxy proxy1 = new JobServiceProxy("http://10.28.0.236:31115/PlanServicesWeb/services/JobService");
//			JobStreamServiceProxy proxy2 = new JobStreamServiceProxy("http://10.28.0.236:31115/PlanServicesWeb/services/JobStreamService");
//			
//			FilterCriteria f= new FilterCriteria();
//			//f.setValue(new String[]{"COMPLETED"});
//			//f.setDataType("STATUS_LIST");
//			//f.setValue(new String[]{"DRPMSSVR"});
//			//f.setDataType("WORKSTATION_NAME");
//			//f.setValue(new String[]{"SUCC"});
//			//f.setDataType("INTERNAL_STATUS_LIST");
//			
//			f.setValue(new String[]{"BLOCKED","CANCELLED","COMPLETED","ERROR","HELD","READY","STARTED","WAITING","UNDECIDED"});
//			
//			f.setDataType("STATUS_LIST");
//			f.setMaximum("5");
//			f.setMinimum("1");
//			JobInstance[] jstreams = proxy.queryJobs(null, new FilterCriteria[]{f});
//			System.out.println(jstreams.length);
//			
//			/*for (JobInstance jobInstance : jstreams) {
//				//System.out.println(jobInstance.getJobName()+"=="+jobInstance.getJobStreamName()+"=="+jobInstance.getWorkstationName()+"=="+jobInstance.getExtendedStatus());
//				//System.out.println(jobInstance.getWorkstationName()+"#"+jobInstance.getJobStreamName()+"."+jobInstance.getJobName());
//				
//				System.out.println(jobInstance.getActualArrival().getTimeInMillis()+"///"+
//						jobInstance.getActualEnd().getTimeInMillis()+"///"+
//						jobInstance.getStartTime().getTimeInMillis()+"///"+
//						jobInstance.getLatestStartTime().getTimeInMillis()+"///"+
//						jobInstance.getDeadlineTime().getTimeInMillis()+"///"+
//						jobInstance.getLatestOut().getTimeInMillis());
//			}*/
//			
//			/*FilterCriteria f2= new FilterCriteria();
//			f.setValue(new String[]{"COMPLETED"});
//			f.setDataType("START_TIME");
//			f2.setValue(new String[]{"DRPMSSVR"});
//			f2.setDataType("WORKSTATION_NAME");
//			
//			JobStreamInstance[] jstreams = proxy.queryJobStreams(null, new FilterCriteria[]{f2});
//			System.out.println(jstreams.length);
//			
//			for (JobStreamInstance jobInstance : jstreams) {
//				System.out.println(jobInstance.getWorkstationName()+"#"+jobInstance.getJobStreamId());
//			}*/
//			
////			DRPMSSVR#FINALPOSTREPORTS.CREATEPOSTREPORTS
////			DRPMSSVR#FINAL.MAKEPLAN
////			DRPMSSVR#FINALPOSTREPORTS.CHECKSYNC
////			DRPMSSVR#FINAL.SWITCHPLAN
////			DRPMSSVR#FINAL.STARTAPPSERVER
////			DRPMSSVR#FINAL.STARTAPPSERVER
////			DRPMSSVR#FINAL.SWITCHPLAN
////			DRPMSSVR#FINAL.SWITCHPLAN
////			DRPMSSVR#FINAL.MAKEPLAN
////			DRPMSSVR#FINALPOSTREPORTS.CREATEPOSTREPORTS
////			DRPMSSVR#FINALPOSTREPORTS.CHECKSYNC
////			DRPMSSVR#FINAL.STARTAPPSERVER
////			DRPMSSVR#FINAL.MAKEPLAN
////			DRPMSSVR#FINALPOSTREPORTS.UPDATESTATS
////			DRPMSSVR#FINALPOSTREPORTS.UPDATESTATS
//			
//			////workstationName#jobStreamName.jobName
//			//proxy1.getProperties("", "DRPMSSVR#FINAL.STARTAPPSERVER");
//
//			
////			DRPMSSVR#26210abd-29cd-3a9e-9088-fdb492d124f5
////			DRPMSSVR#3a4288e7-fe59-3fd9-ad01-35a81d5f1fc2
////			DRPMSSVR#8b04c2a2-6f48-3d8d-8f4a-ecbcff923012
////			DRPMSSVR#91f93c5a-9b2b-3fd8-bf7b-6c8773dfd837
////			DRPMSSVR#de5d500f-3777-3ebc-b829-1ee076588d1b
////			
//			//proxy2.getJobsList("", "DRPMSSVR#26210abd-29cd-3a9e-9088-fdb492d124f5");
//			
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
}