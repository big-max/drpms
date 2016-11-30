package com.ibm.smartcloud.core.dao.hibernate.service;

import java.util.List;

/**
 * 增删改查公共服务接口
 */
public interface IOperateManager<T,PK> {

	/**
	 * 设置实体类型
	 * @param type
	 */
	public abstract void setEntityClass(Class<T> entity);
	
	/**
	 * 设置主码类型
	 * @param type
	 */
	public abstract void setPKClass(Class<PK> pk);

	/**
	 * 保存
	 * 
	 * @param transientInstance
	 */
	public abstract void save(T transientInstance) throws Exception;

	/**
	 * 删除
	 * 
	 * @param persistentInstance
	 */
	public abstract void delete(PK id) throws Exception;
	
	
	public abstract void delete(PK id, boolean flag) throws Exception;

	/**
	 * 附加
	 * 
	 * @param detachedInstance
	 * @return
	 */
	public abstract T merge(T detachedInstance) throws Exception;

	/**
	 * 更新或保存

	 * 
	 * @param instance
	 */
	public abstract void saveOrUpdate(T instance) throws Exception;

	
	public abstract void saveOrUpdateObj(Object entity) throws Exception;
	
	/**
	 * 持久化

	 * 
	 * @param instance
	 */
	public abstract void update(T instance) throws Exception;

	/**
	 * 按ID查找
	 * 
	 * @param id
	 * @return
	 */
	public abstract T findById(PK id);

	public abstract List<T> findAll() ;	
	
	/**
	 * 按条件查找
	 * 
	 * @param instance
	 * @return
	 */
	public abstract List<T> findByExample(T instance);

	/**
	 * 检查是否存在
	 * @param usertemp
	 */
	public abstract boolean ifExistBy(String propertyName, Object value);

	/**
	 * 按条件查找
	 * @param propertyName
	 * @param value
	 * @return
	 */
	public abstract List<T> findBy(String propertyName, Object value);
	/**
	 * 按条件查找(唯一值)
	 * @param propertyName
	 * @param value
	 * @return
	 */
	public abstract T findUniqueBy(String propertyName, Object value);
	/**
	 * 消除与 Hibernate Session 的关联

	 * 
	 */
	public void evit(T entity);
	
	public void flush();

	public abstract List<T> createQuery(String hql, Object... values);

	public abstract List<T> createQuery(String hql, Object[]... values);	

}