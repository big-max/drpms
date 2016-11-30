package com.ibm.tws.quartzJob;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.ibm.tws.bean.HistoryJobBean;
import com.ibm.tws.service.HistoryJobService;
import com.ibm.tws.service.JobService;

public class DeleteHistoryRecordJob {
	
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
		System.out.println("-------"+sd.format(new Date()) + ":test delete job");		
		Calendar now = Calendar.getInstance();  
		//now.add(Calendar.DATE, -1);   
		now.add(Calendar.HOUR, -1);
		//now.add(Calendar.MINUTE, -30);     
		long mtime = now.getTimeInMillis();
		Date date = new Date(mtime);
		
		try {
			List<HistoryJobBean> hbean = historyJobService.getHistoryJobListByDate(sd.format(date));
			System.out.println(hbean.size());	
			for(HistoryJobBean h: hbean){
				historyJobService.delete(h.getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}
	

	
}
