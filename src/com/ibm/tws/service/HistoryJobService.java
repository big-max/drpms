package com.ibm.tws.service;


import java.util.List;

import com.ibm.tws.bean.HistoryJobBean;



public interface HistoryJobService {

	public List<HistoryJobBean> getHistoryJobList();

	public List<HistoryJobBean> getHistoryJobList(String begin,String end);
	
	public List<HistoryJobBean> getHistoryJobListByDate(String date);
	
	public HistoryJobBean add(HistoryJobBean bean) throws Exception ;
	
	public void delete(String id) throws Exception ;

	public void update(HistoryJobBean bean) throws Exception;
	
}
