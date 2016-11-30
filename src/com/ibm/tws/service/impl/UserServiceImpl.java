package com.ibm.tws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.smartcloud.core.dao.hibernate.service.IOperateManager;
import com.ibm.tws.bean.UserBean;
import com.ibm.tws.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private IOperateManager<UserBean, String> operateManager;
	
	public IOperateManager<UserBean, String> getOperateManager() {
		return operateManager;
	}

	public void setOperateManager(IOperateManager<UserBean, String> operateManager) {
		this.operateManager = operateManager;
	}
	
	@Override
	public List<UserBean> getUserList() {		
		operateManager.setEntityClass(UserBean.class);
		List<UserBean> list = operateManager.createQuery("from UserBean");
		return list;		
	}

	@Override
	public List<UserBean> getUserListByDepartmentId(String departmentId) {
		operateManager.setEntityClass(UserBean.class);
		List<UserBean> list = operateManager.createQuery("from UserBean where departmentId = ?", departmentId);
		return list;
	}

	@Override
	public UserBean add(UserBean userBean) throws Exception {
		operateManager.setEntityClass(UserBean.class);
		operateManager.save(userBean);
		return userBean;
	}

	@Override
	public void update(UserBean userBean) throws Exception {
		operateManager.setEntityClass(UserBean.class);
		operateManager.update(userBean);
	}
	
	@Override
	public void delete(String id) throws Exception {
		operateManager.delete(id, true);
	}
}