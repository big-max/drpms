package com.ibm.smartcloud.core.dao.hibernate.dao.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.criterion.DetachedCriteria;



import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.util.Assert;

import com.ibm.smartcloud.core.dao.hibernate.support.HibernatePage;
import com.ibm.smartcloud.core.dao.hibernate.support.HqlPage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class serves as the Base class for all other DAOs - namely to hold
 * common CRUD methods that they might all use. You should only need to extend
 * this class when your require custom CRUD logic.
 *
 * <p>To register this class in your Spring context file, use the following XML.
 * <pre>
 *      &lt;bean id="fooDao" class="com.eigpay.dao.hibernate.GenericDaoHibernate"&gt;
 *          &lt;constructor-arg value="com.eigpay.model.Foo"/&gt;
 *          &lt;property name="sessionFactory" ref="sessionFactory"/&gt;
 *      &lt;/bean&gt;
 * </pre>
 *
 * @author <a href="mailto:bwnoll@gmail.com">Bryan Noll</a>
 * @param <T> a type variable
 * @param <PK> the primary key for that type
 */
public class GenericDAOHibernate<T, PK extends Serializable> extends HibernateDaoSupport implements GenericDAO<T, PK> {
    /**
     * Log variable for all child classes. Uses LogFactory.getLog(getClass()) from Commons Logging
     */
    protected final Log log = LogFactory.getLog(getClass());
    private Class<T> persistentClass;

    /**
     * Constructor that takes in a class to see which type of entity to persist
     * @param persistentClass the class type you'd like to persist
     */
    public GenericDAOHibernate(final Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<T> getAll() {
        return super.getHibernateTemplate().loadAll(this.persistentClass);
    }
    
    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<T> getAllDistinct() {
        Collection result = new LinkedHashSet(getAll());
        return new ArrayList(result);
    }
    
    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public T get(PK id) {
        T entity = (T) super.getHibernateTemplate().get(this.persistentClass, id);

        if (entity == null) {
            log.warn("Uh oh, '" + this.persistentClass + "' object with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(this.persistentClass, id);
        }

        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public boolean exists(PK id) {
        T entity = (T) super.getHibernateTemplate().get(this.persistentClass, id);
        return entity != null;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public T save(T object) {
        return (T) super.getHibernateTemplate().merge(object);
    }

    /**
     * {@inheritDoc}
     */
    public void remove(PK id) {
        super.getHibernateTemplate().delete(this.get(id));
    }
    
   /** 
    * {@inheritDoc}
    */
   @SuppressWarnings("unchecked")
   public List<T> findByNamedQuery(
       String queryName, 
       Map<String, Object> queryParams) {
       String []params = new String[queryParams.size()];
       Object []values = new Object[queryParams.size()];
       int index = 0;
       Iterator<String> i = queryParams.keySet().iterator();
       while (i.hasNext()) {
           String key = i.next();
           params[index] = key;
           values[index++] = queryParams.get(key);
       }
       return (List<T>) getHibernateTemplate().findByNamedQueryAndNamedParam(
           queryName, 
           params, 
           values);
   }
   @SuppressWarnings("unchecked")
   public List<T> findByNamedParam(
       String queryStr, 
       Map<String, Object> queryParams) {
       String []params = new String[queryParams.size()];
       Object []values = new Object[queryParams.size()];
       int index = 0;
       Iterator<String> i = queryParams.keySet().iterator();
       while (i.hasNext()) {
           String key = i.next();
           params[index] = key;
           values[index++] = queryParams.get(key);
       }
       return (List<T>) getHibernateTemplate().findByNamedParam(
    	queryStr, 
           params, 
           values);
   }
   
   @SuppressWarnings("unchecked")
   public List retrieveByDetachedCriteria(DetachedCriteria dc,boolean clearSession){
	  	if(clearSession){
	  		getHibernateTemplate().clear();
	  	}
	  	
	  	return getHibernateTemplate().findByCriteria(dc);
   }
   
   @SuppressWarnings("unchecked")
  public List retrieveByDetachedCriteria(DetachedCriteria dc){
  	return this.retrieveByDetachedCriteria(dc, false);
  }
  
  @SuppressWarnings("unchecked")
  public List retrieveByDetachedCriteria(DetachedCriteria dc,int firstResult,int maxResults){
  	return this.retrieveByDetachedCriteria(dc, false,firstResult, maxResults);
  }
  
  @SuppressWarnings("unchecked")
  public List retrieveByDetachedCriteria(DetachedCriteria dc,boolean clearSession,int firstResult,int maxResults){
  	if(clearSession){
  		getHibernateTemplate().clear();
  	}
  	return getHibernateTemplate().findByCriteria(dc, firstResult, maxResults);
  }
	  
	/**
	 * 
	 * HQL��ҳ��ѯ��Ĭ��count�ķ�ʽ �Զ�������
	 */
	public HibernatePage pagedQuery(String hql, int pageNo, int pageSize)
	{
		return pagedQuery(hql, pageNo, pageSize, HqlPage.COUNT_MODE);
	}

	/**
	 * HQL��ҳ��ѯ��Ĭ��count�ķ�ʽ ʹ�� ExtremeTable ��ͷ��̬����
	 */
	@SuppressWarnings("unchecked")
	public HibernatePage pagedQuery(String hql, Map orderMap, int pageNo, int pageSize)
	{
		return pagedQuery(hql, orderMap, pageNo, pageSize,
				HqlPage.COUNT_MODE);
	}

	/**
	 * HQL��ҳ��ѯ,����ָ�������ģʽ, �����Count��ʽ,���ڴ˲����hsql��ת�����ѯ�� ʹ�� ExtremeTable ��ͷ��̬����
	 */
	@SuppressWarnings("unchecked")
	public HibernatePage pagedQuery(String hql, Map orderMap, int pageNo, int pageSize,
			int mode)
	{
		Assert.hasText(hql);
		hql = addExtremeTableOrder("",removeOrders(hql), orderMap);
		Query query = getSession().createQuery(hql);

		if (mode == HqlPage.COUNT_MODE)
		{
			String countQueryString = " select count (*) "
					+ removeSelect(removeOrders(hql));
			List countlist = getHibernateTemplate().find(countQueryString);
			Long totalCount ;
			if(countlist.get(0)!=null)
				totalCount = (Long) countlist.get(0);
			else
				totalCount = new Long(0);

			return HqlPage.getPageInstanceByCount(query, pageNo, pageSize,
					totalCount.intValue());
		}
		else
			return HqlPage.getPageInstance(query, pageNo, pageSize, mode);
	}
	
	@SuppressWarnings("unchecked")
	public HibernatePage pagedQueryWithCountHql(String countHql,String hql, Map orderMap, int pageNo, int pageSize,
			int mode)
	{
		Assert.hasText(hql);
		hql = addExtremeTableOrder("",removeOrders(hql), orderMap);
		Query query = getSession().createQuery(hql);

		if (mode == HqlPage.COUNT_MODE)
		{
			String countQueryString = countHql;
			List countlist = getHibernateTemplate().find(countQueryString);
			Long totalCount ;
			if(countlist.get(0)!=null)
				totalCount = (Long) countlist.get(0);
			else
				totalCount = new Long(0);

			return HqlPage.getPageInstanceByCount(query, pageNo, pageSize,
					totalCount.intValue());
		}
		else
			return HqlPage.getPageInstance(query, pageNo, pageSize, mode);
	}
	
	
	/**
	 * HQL��ҳ��ѯ��Ĭ��count�ķ�ʽ ʹ�� ExtremeTable ��ͷ��̬����
	 * add by eric
	 */
	@SuppressWarnings("unchecked")
	public HibernatePage queryPageInfo(String hql, Map orderMap, int pageNo, int pageSize)
	{
		return queryPageInfo(hql, orderMap, pageNo, pageSize,
				HqlPage.COUNT_MODE);
	}
	
	/**
	 * HQL��ҳ��ѯ,����ָ�������ģʽ, �����Count��ʽ,���ڴ˲����hsql��ת�����ѯ�� ʹ�� ExtremeTable ��ͷ��̬����
	 * add by eric �����group byʱͳ����������������
	 */
	@SuppressWarnings("unchecked")
	public HibernatePage queryPageInfo(String hql, Map orderMap, int pageNo, int pageSize,
			int mode)
	{
		Assert.hasText(hql);
		
		log.debug("�����hql��:"+hql);
		String newHql = hql.toLowerCase();
//			hql = hql.toLowerCase();
		if(newHql.indexOf("group by")<=0&&newHql.indexOf("distinct")<=0&&newHql.indexOf("order")<0){
			hql = addExtremeTableOrder("",removeOrders(hql), orderMap);
			return pagedQuery(hql,orderMap,pageNo,pageSize,mode);
		}else{
			
			Query query = getSession().createQuery(hql);
			if (mode == HqlPage.COUNT_MODE) {
				int totalCount = query.list().size();
				return HqlPage.getPageInstanceByCount(query, pageNo, pageSize, totalCount);
			} else
				return HqlPage.getPageInstance(query, pageNo, pageSize, mode);
		}
			
		
	}
		
	public HibernatePage pageQuery(Query query,int pageNo, int pageSize,int totalCount){
		return HqlPage.getPageInstanceByCount(query, pageNo, pageSize,totalCount);
	}

	/**
	 * HQL��ҳ��ѯ,����ָ�������ģʽ, �����Count��ʽ,���ڴ˲����hsql��ת�����ѯ�� HQL �Զ�������
	 */

	@SuppressWarnings("unchecked")
	public HibernatePage pagedQuery(String hql, int pageNo, int pageSize, int mode)
	{
		Assert.hasText(hql);
		Query query = getSession().createQuery(hql);

		if (mode == HqlPage.COUNT_MODE)
		{
			String countQueryString = " select count (*) "
					+ removeSelect(removeOrders(hql));
			List countlist = getHibernateTemplate().find(countQueryString);
			Long totalCount = (Long) countlist.get(0);

			return HqlPage.getPageInstanceByCount(query, pageNo, pageSize,
					totalCount.intValue());
		}
		else
			return HqlPage.getPageInstance(query, pageNo, pageSize, mode);
	}
	public int countQuery(Query query){
		Long count=(Long)query.list().get(0);
		return count.intValue();
		
	}
	public HibernatePage pagedQuery(Query query, int pageNo, int pageSize, int totalCount)
	{
			return HqlPage.getPageInstanceByCount(query, pageNo, pageSize,
					totalCount);		
	}
	@SuppressWarnings("unchecked")
	public List pagedList(Query query, int pageNo, int pageSize, int totalCount)
	{
			return HqlPage.getListResult(query, totalCount,pageNo, pageSize	);		
	}
	/**
	 * ȥ��select �Ӿ䣬δ����union�����
	 */
	public  String removeSelect(String hql)
	{
		Assert.hasText(hql);
		int beginPos = hql.toLowerCase().indexOf("from");
		Assert.isTrue(beginPos != -1, " hql : " + hql
				+ " must has a keyword 'from'");
		return hql.substring(beginPos);
	}

	/**
	 * ȥ��orderby �Ӿ�
	 */
	public String removeOrders(String hql)
	{
		Assert.hasText(hql);
		Pattern p = Pattern.compile("order\\s*by[\\w|\\W|\\s|\\S]*",
				Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(hql);
		StringBuffer sb = new StringBuffer();
		while (m.find())
		{
			m.appendReplacement(sb, "");
		}
		m.appendTail(sb);
		return sb.toString();
	}

	/**
	 * 
	 * @param hql
	 * @param orderMap
	 * @return hql ׷�� ExtremeTable ��ͷ��̬����
	 */
	@SuppressWarnings("unchecked")
	public  String addExtremeTableOrder(String object,String hql, Map orderMap)
	{
		Assert.hasText(hql);
		StringBuffer sb = new StringBuffer(hql);
		sb = addExtremeTableOrder(object,orderMap, sb);
		return sb.toString();
	}

	/**
	 * @param orderMap
	 * @param sb
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public StringBuffer addExtremeTableOrder(String object,Map orderMap, StringBuffer sb) {
		String column;
		String orderby;
		if (!orderMap.isEmpty())
		{
			for (int i = 0; i < orderMap.keySet().size(); i++)
			{
				column = orderMap.keySet().iterator().next().toString();
				orderby = orderMap.get(column).toString();
				if(!object.equals("")){
				sb = sb.append(" order by "+object+".").append(column).append(" ").append(
						orderby);
				}else{
					sb = sb.append(" order by ").append(column).append(" ").append(
							orderby);
				}
			}
		}
		return sb;
	}
		
}
