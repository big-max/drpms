package com.ibm.smartcloud.core.dao.hibernate.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseHibernateDAO extends HibernateDaoSupport {

	protected HibernateTemplate hbTemplate = this.getHibernateTemplate();
	/**
	 * 获得session
	 */
	public Session openSession() throws Exception{
		return SessionFactoryUtils.getSession(getSessionFactory(), false);
	}

	/**
	 * 获得Query对象
	 */
	public Query getQuery(String sql) throws Exception {
		Session session = this.openSession();
		Query query = session.createQuery(sql);
		return query;
	}

	/**
	 * 获得Criteria对象
	 */
	@SuppressWarnings("unchecked")
	public Criteria getCriteria(Class clazz) throws Exception {

		Session session = this.openSession();
		Criteria criteria = session.createCriteria(clazz);
		return criteria;
	}

}
