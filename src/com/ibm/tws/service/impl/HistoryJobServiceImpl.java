package com.ibm.tws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.smartcloud.core.dao.hibernate.service.IOperateManager;
import com.ibm.tws.bean.HistoryJobBean;
import com.ibm.tws.service.HistoryJobService;


@Service("historyJobService")
public class HistoryJobServiceImpl implements HistoryJobService {
	@Autowired
	private IOperateManager<HistoryJobBean, String> operateManager;
	
	public IOperateManager<HistoryJobBean, String> getOperateManager() {
		return operateManager;
	}

	public void setOperateManager(IOperateManager<HistoryJobBean, String> operateManager) {
		this.operateManager = operateManager;
	}
	
	@Override
	public List<HistoryJobBean> getHistoryJobList() {		
		operateManager.setEntityClass(HistoryJobBean.class);
		List<HistoryJobBean> list = operateManager.createQuery("from HistoryJobBean");// order by jobdate desc
		return list;		
	}
	
	@Override
	public List<HistoryJobBean> getHistoryJobList(String begin,String end) {		
		operateManager.setEntityClass(HistoryJobBean.class);
		//String hql = " from HistoryJobBean h where h.jobdate  between '"+begin+"'　and '"+end+"'";
		String hql = " from HistoryJobBean h where h.jobdate between  '"+begin+"' and  '"+end+"' order by h.jobdate ";
		List<HistoryJobBean> list = operateManager.createQuery(hql);
		return list;		
	}
	
	@Override
	public List<HistoryJobBean> getHistoryJobListByDate(String date) {		
		operateManager.setEntityClass(HistoryJobBean.class);
		System.out.println("///"+date);
		String hql = " from HistoryJobBean h where h.jobdate < '"+date+"' order by h.jobdate";
		List<HistoryJobBean> list = operateManager.createQuery(hql);
		System.out.println(list.size());
		return list;		
	}

	@Override
	public HistoryJobBean add(HistoryJobBean bean) throws Exception {
		operateManager.setEntityClass(HistoryJobBean.class);
		operateManager.save(bean);
		return bean;
	}

	@Override
	public void update(HistoryJobBean bean) throws Exception {
		operateManager.setEntityClass(HistoryJobBean.class);
		operateManager.update(bean);
	}
	
	@Override
	public void delete(String id) throws Exception {
		operateManager.delete(id, true);
	}
	
	
}