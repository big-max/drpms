package com.ibm.tws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.smartcloud.core.dao.hibernate.service.IOperateManager;
import com.ibm.tws.bean.DepartmentBean;
import com.ibm.tws.service.DepartmentService;


@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private IOperateManager<DepartmentBean, String> operateManager;
	public IOperateManager<DepartmentBean, String> getOperateManager() {
		return operateManager;
	}
	public void setOperateManager(IOperateManager<DepartmentBean, String> operateManager) {
		this.operateManager = operateManager;
	}
	
	@Override
	public List<DepartmentBean> getDepartmentList() {		
		operateManager.setEntityClass(DepartmentBean.class);
		List<DepartmentBean> list = operateManager.createQuery("from DepartmentBean");
		return list;		
	}

	@Override
	public DepartmentBean add(DepartmentBean departmentBean) throws Exception {
		operateManager.setEntityClass(DepartmentBean.class);
		operateManager.save(departmentBean);
		return departmentBean;
	}

	@Override
	public void update(DepartmentBean departmentBean) throws Exception {
		operateManager.setEntityClass(DepartmentBean.class);
		operateManager.update(departmentBean);
	}
	
	@Override
	public void delete(String id) throws Exception {
		operateManager.delete(id, true);
	}
}