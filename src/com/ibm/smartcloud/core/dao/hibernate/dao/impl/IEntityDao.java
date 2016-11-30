package com.ibm.smartcloud.core.dao.hibernate.dao.impl;

import java.io.Serializable;
import java.util.List;

/**
 * 针对单个Entity对象的CRUD操作定义.
 */
public interface IEntityDao<T, PK extends Serializable> {

	T get(PK id);

	List<T> getAll();

	void save(T entity);

	void remove(T entity);

	void update(T entity);

	String getIdName(Class<T> clazz);

}
