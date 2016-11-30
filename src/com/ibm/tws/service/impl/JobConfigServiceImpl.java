package com.ibm.tws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.smartcloud.core.dao.hibernate.service.IOperateManager;
import com.ibm.tws.bean.JobAndSystemConfigBean;
import com.ibm.tws.service.JobConfigService;


@Service("jobConfigService")
public class JobConfigServiceImpl implements JobConfigService {
	@Autowired
	private IOperateManager<JobAndSystemConfigBean, String> operateManager;
	public IOperateManager<JobAndSystemConfigBean, String> getOperateManager() {
		return operateManager;
	}

	public void setOperateManager(IOperateManager<JobAndSystemConfigBean, String> operateManager) {
		this.operateManager = operateManager;
	}
	
	@Override
	public List<JobAndSystemConfigBean> getConfigList() {	
		operateManager.setEntityClass(JobAndSystemConfigBean.class);
		List<JobAndSystemConfigBean> list = operateManager.findAll();
		return list;		
	}
	
	@Override
	public List<JobAndSystemConfigBean> getConfigListByNameDesc() {	
		operateManager.setEntityClass(JobAndSystemConfigBean.class);
		List<JobAndSystemConfigBean> list = operateManager.createQuery("from JobAndSystemConfigBean order by planStartTime desc");
		return list;		
	}
	
	//获取所有的串行任务list
	@Override
	public List<JobAndSystemConfigBean> getConfigSerialList() {	
		operateManager.setEntityClass(JobAndSystemConfigBean.class);
		List<JobAndSystemConfigBean> list = operateManager.createQuery("from JobAndSystemConfigBean where serial = 1 order by planStartTime ");
		return list;		
	}

	

	@Override
	public List<JobAndSystemConfigBean> getConfigsById(String id) {
		operateManager.setEntityClass(JobAndSystemConfigBean.class);
		List<JobAndSystemConfigBean> list = operateManager.createQuery("from JobAndSystemConfigBean where id = ? ", id);
		return list;	
	}

	@Override
	public List<JobAndSystemConfigBean> getConfigsByName(String name) {
		operateManager.setEntityClass(JobAndSystemConfigBean.class);
		List<JobAndSystemConfigBean> list = operateManager.createQuery("from JobAndSystemConfigBean where name = ? ", name);
		return list;	
	}
	
	@Override
	public JobAndSystemConfigBean add(JobAndSystemConfigBean jobAndSystemConfigBean) throws Exception {
		operateManager.setEntityClass(JobAndSystemConfigBean.class);
		operateManager.save(jobAndSystemConfigBean);
		return jobAndSystemConfigBean;
	}

	@Override
	public void delete(String id) throws Exception {
		operateManager.delete(id, true);
	}

	@Override
	public void update(JobAndSystemConfigBean jobAndSystemConfigBean) throws Exception {
		operateManager.setEntityClass(JobAndSystemConfigBean.class);
		operateManager.update(jobAndSystemConfigBean);
		
	}


}