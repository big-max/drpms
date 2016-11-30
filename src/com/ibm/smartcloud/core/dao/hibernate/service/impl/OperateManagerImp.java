package com.ibm.smartcloud.core.dao.hibernate.service.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;

import com.ibm.smartcloud.core.dao.hibernate.dao.IBaseDao;
import com.ibm.smartcloud.core.dao.hibernate.service.IOperateManager;



/**
 * 增删改查公共服务接口
 */
public class OperateManagerImp<T,PK extends Serializable> implements IOperateManager<T,PK> {

	// /////////////////////////////////////////////属性///////////////////////////////////////////
	@SuppressWarnings("unused")
	private Logger logger = Logger.getLogger(this.getClass());
	/**
	 * 通用DAO
	 */
	private IBaseDao<T,PK> genericDao;
	
	// /////////////////////////////////////////////存取方法///////////////////////////////////////////
	public IBaseDao<T, PK> getGenericDao() {
		return this.genericDao;
	}
	
	public void setGenericDao(IBaseDao<T, PK> genericDao) {
		this.genericDao = genericDao;
	}

	// /////////////////////////////////////////////构造方法///////////////////////////////////////////
	public OperateManagerImp() {
	}

	// /////////////////////////////////////////////实体传递方法///////////////////////////////////////////
	
	/* (non-Javadoc)
	 * @see com.eigpay.service.IOperateManager#setEntityClass(java.lang.Class)
	 */
	public void setEntityClass(Class<T> entity) {
		this.genericDao.setEntityClass(entity);
		
	}

	/* (non-Javadoc)
	 * @see com.eigpay.service.IOperateManager#setPKClass(java.lang.Class)
	 */
	public void setPKClass(Class<PK> pk) {
		this.genericDao.setPKClass(pk);
	}
	

	// /////////////////////////////////////////////服务方法///////////////////////////////////////////
	/* (non-Javadoc)
	 * @see com.eigpay.service.IOperateManager#save(java.lang.Object)
	 */
	public void save(T transientInstance) throws Exception {
		this.genericDao.save(transientInstance);
	}

	/* (non-Javadoc)
	 * @see com.eigpay.service.IOperateManager#delete(java.lang.Object)
	 */
	public void delete(PK id) throws Exception {
		this.genericDao.removeById(id);
	}
	
	/**
	 * 物理删除
	 */
	public void delete(PK id, boolean flag) throws Exception {
		this.genericDao.removeById(id, flag);
	}

	/* (non-Javadoc)
	 * @see com.eigpay.service.IOperateManager#merge(java.lang.Object)
	 */
	public T merge(T detachedInstance) throws Exception {
		return this.genericDao.merge(detachedInstance);
	}

	/* (non-Javadoc)
	 * @see com.eigpay.service.IOperateManager#saveOrUpdate(java.lang.Object)
	 */
	public void saveOrUpdate(T instance) throws Exception {
		this.genericDao.saveOrUpdate(instance);
	}

	public void update(T instance) throws Exception{
		this.genericDao.update(instance);
	}
	
	public void saveOrUpdateObj(Object entity) throws Exception {
		this.genericDao.saveOrUpdateObj(entity);
	}

	/* (non-Javadoc)
	 * @see com.eigpay.service.IOperateManager#findById(java.lang.Object)
	 */
	public T findById(PK id) {
		return this.genericDao.get(id);
	}
	
	public List<T> findAll() {
		return this.genericDao.getAll();
	}
	
	/* (non-Javadoc)
	 * @see com.eigpay.service.IOperateManager#findByExample(java.lang.Object)
	 */
	public List<T> findByExample(T instance) {
		return this.genericDao.findByExample(instance);
	}

	/* (non-Javadoc)
	 * @see com.eigpay.service.IOperateManager#findBy(java.lang.String, java.lang.Object)
	 */
	public List<T> findBy(String propertyName, Object value){
		return this.genericDao.findBy(propertyName, value);
	}
	
	/* (non-Javadoc)
	 * @see com.eigpay.service.IOperateManager#findUniqueBy(java.lang.String, java.lang.Object)
	 */
	public T findUniqueBy(String propertyName, Object value){
		return this.genericDao.findUniqueBy(propertyName, value);
	}

	/* (non-Javadoc)
	 * @see com.eigpay.service.IOperateManager#ifExistByExample(com.eigpay.model.User)
	 */
	public  boolean ifExistBy(String propertyName, Object value) {
		T entity=this.findUniqueBy(propertyName, value);
		if(entity==null){
			return false; 
		}else{
			this.getGenericDao().evit(entity);
			return true;
		}
	}

	public void evit(T entity) {
		this.getGenericDao().evit(entity);
	}	
	
	public void flush(){
		this.getGenericDao().flush();
	}
	/*
	 * hql
	 * */
	@SuppressWarnings("unchecked")
	@Override
	public List<T> createQuery(String hql, Object... values) {
		Query q = genericDao.createQuery(hql, values);
		return (List<T>) q.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> createQuery(String hql, Object[]... values) {
		Query q = genericDao.createQuery(hql, values);
		return (List<T>) q.list();
	}
}
