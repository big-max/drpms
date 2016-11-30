package com.ibm.tws.service;

import java.util.List;

import com.ibm.tws.bean.JobAndSystemConfigBean;



public interface JobConfigService {

	public List<JobAndSystemConfigBean> getConfigList();
	
	public List<JobAndSystemConfigBean> getConfigListByNameDesc();
	
	public List<JobAndSystemConfigBean> getConfigSerialList();

	public List<JobAndSystemConfigBean> getConfigsById(String id);
	
	public List<JobAndSystemConfigBean> getConfigsByName(String name);
	
	public JobAndSystemConfigBean add(JobAndSystemConfigBean jobAndSystemConfigBean) throws Exception ;
	
	public void delete(String id) throws Exception ;

	public void update(JobAndSystemConfigBean jobAndSystemConfigBean) throws Exception;
	
}
