package com.ibm.smartcloud.core.dao.hibernate.support;

import org.hibernate.Query;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;





import java.util.List;

/**
 * 使用Hql查询的的分页查询类.
 * 支持执行Count查询, 利用JDBC的SrollLast()功能 和取出全部数据统计size三种方式取得总记录条数
 * @author robin_lai@thbs.com 
 */
public class HqlPage {

	

	public static final int SCROLL_MODE = 1;

	public static final int LIST_MODE = 2;

	public static final int COUNT_MODE = 3;

	public static final int DEFAULT_PAGE_SIZE = 5;

    /**
     * 默认以getCount方式创建Page
     */
    public static HibernatePage getPageInstance(Query query, int pageNo, int pageSize) {
        return getPageInstance(query, pageNo, pageSize, SCROLL_MODE);
    }


    /**
     * 使用不同模式创建Page.
     */
    public static HibernatePage getPageInstance(Query query, int pageNo, int pageSize, int mode) {

        if (mode == SCROLL_MODE)
            return HqlPage.getPageInstanceByScroll(query, pageNo, pageSize);
        if (mode == LIST_MODE)
            return HqlPage.getPageInstanceByList(query, pageNo, pageSize);
        if (mode == COUNT_MODE)
            throw new IllegalArgumentException("Error Mode,you should use getPageInstance(Query query, int pageNo, int pageSize, int mode,int totalCount)");
        return null;
    }
  

    public static HibernatePage getPageInstanceByCount(Query query, int pageNo, int pageSize, int totalCount) {
        return getPageResult(query, totalCount, pageNo, pageSize);
    }

    protected static HibernatePage getPageInstanceByScroll(Query query, int pageNo, int pageSize) {
        ScrollableResults scrollableResults = query.scroll(ScrollMode.SCROLL_SENSITIVE);
        scrollableResults.last();

        //rowNumber从0开始，为空时则为-1,因此计算totalCount时应+1
        int totalCount = scrollableResults.getRowNumber() + 1;
        return getPageResult(query, totalCount + 1, pageNo, pageSize);
    }


    protected static HibernatePage getPageInstanceByList(Query query, int pageNo, int pageSize) {
        query.scroll(ScrollMode.FORWARD_ONLY);
        int totalCount = query.list().size();
        return getPageResult(query, totalCount, pageNo, pageSize);
    }

    @SuppressWarnings("unchecked")
	private static HibernatePage getPageResult(Query q, int totalCount, int pageNo, int pageSize) {
        if (totalCount < 1) return new HibernatePage();
        int startIndex = Page.getStartOfPage(pageNo, pageSize);
        
        List list = null; 
        	if(startIndex == 0 && pageSize == 0)
        	{
        		list = q.list();
        	}else
        	{
        		list = q.setFirstResult(startIndex).setMaxResults(pageSize).list();
        	}
        return new HibernatePage(startIndex, totalCount, pageSize, list);
    }
    @SuppressWarnings("unchecked")
    public static List getListResult(Query q, int totalCount, int pageNo, int pageSize) {
        if (totalCount < 1) return null;
        int startIndex = Page.getStartOfPage(pageNo, pageSize);
       return q.setFirstResult(startIndex).setMaxResults(pageSize).list();

    }
}

