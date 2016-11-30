package com.ibm.tws.quartzJob;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.ibm.tws.bean.HistoryJobBean;
import com.ibm.tws.bean.StaticConst;
import com.ibm.tws.service.HistoryJobService;
import com.ibm.tws.service.JobService;
import com.ibm.tws.ws.types.TWS_Types.FilterCriteria;
import com.ibm.tws.ws.types.TWS_Types.JobInstance;


public class SaveHistoryRecordJob {

	public JobService getJobService() {
		return jobService;
	}

	public void setJobService(JobService jobService) {
		this.jobService = jobService;
	}

	public HistoryJobService getHistoryJobService() {
		return historyJobService;
	}

	public void setHistoryJobService(HistoryJobService historyJobService) {
		this.historyJobService = historyJobService;
	}

	private JobService jobService;

	private HistoryJobService historyJobService;
	
	public void execute() {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("-------"+sd.format(new Date())+"::::test save ");
		
		String jobStreamName = StaticConst.job_stream_name; 
		FilterCriteria f= new FilterCriteria();
		f.setValue(new String[]{jobStreamName});
		//f.setValue(new String[]{"DRTEST"});
		f.setDataType("JOB_STREAM_NAME");
		
		try {
			JobInstance[] jobinstances = jobService.queryJobs("",new FilterCriteria[]{f});			
			int sys1 = jobinstances.length;
			int sys1_STARTED = 0;
			int sys1_ERROR = 0;
			int sys1_COMPLETED = 0;
			int sys1_WAITING = 0;
			List<String> comlist = StaticConst.getStatusCompleted();
			List<String> runlist = StaticConst.getStatusRunning();
			List<String> errlist = StaticConst.getStatusError();
			List<String> redlist = StaticConst.getStatusReady();
			for (JobInstance jobInstance : jobinstances) {	
				String state = jobInstance.getStatus().toLowerCase();
				if(comlist.contains(state)){
					sys1_COMPLETED = sys1_COMPLETED + 1;
				}else if(runlist.contains(state) || (jobInstance.getActualArrival().getTimeInMillis()>0 && StaticConst.status_waiting.equals(state))){
					sys1_STARTED = sys1_STARTED + 1;
				}else if(errlist.contains(state)){
					sys1_ERROR = sys1_ERROR + 1;
				}else if(redlist.contains(state)){
					sys1_WAITING = sys1_WAITING + 1;
				}	
			}
			HistoryJobBean his = new HistoryJobBean();
			his.setId(UUID.randomUUID().toString());
			//his.setJobdate(new java.sql.Date(new Date().getTime()));
			his.setStarted(Math.round(((double)sys1_STARTED/(double)sys1)*100));
			his.setError(Math.round(((double)sys1_ERROR/(double)sys1)*100));
			his.setCompleted(Math.round(((double)sys1_COMPLETED/(double)sys1)*100));
			his.setWaiting(Math.round(((double)sys1_WAITING/(double)sys1)*100));
			//his.setDescription("");
			historyJobService.add(his);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	
		
		
	}
}
