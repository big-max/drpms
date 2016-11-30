package com.ibm.tws.service;

import java.util.List;

import com.ibm.tws.bean.UserBean;



public interface UserService {

	public List<UserBean> getUserList();

	public List<UserBean> getUserListByDepartmentId(String departmentId);

	public UserBean add(UserBean userBean) throws Exception ;
	
	public void delete(String id) throws Exception ;

	public void update(UserBean userBean) throws Exception;
	
}
