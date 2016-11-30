package com.ibm.tws.service;

import java.util.List;

import com.ibm.tws.bean.DepartmentBean;



public interface DepartmentService {
	
	public List<DepartmentBean> getDepartmentList();

	public DepartmentBean add(DepartmentBean departmentBean) throws Exception ;
	
	public void delete(String id) throws Exception ;

	public void update(DepartmentBean departmentBean) throws Exception;
	
}
