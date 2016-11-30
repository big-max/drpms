package com.ibm.smartcloud.core.dao.hibernate.support;




import java.util.ArrayList;



/**
 * 分页对象.
 * 包含数据及分页信息.
 *  @author robin_lai@thbs.com 
 */
public class HibernatePage implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	/**
     * 当前页第一条数据的位置,从0开始

     */
    private int start;
    /**
     * 每页的记录数
     */
    private int pageSize = HqlPage.DEFAULT_PAGE_SIZE;

    
    @SuppressWarnings("unused")
	private int currentPageNo;
    
    public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}


	/**
     * 当前页中存放的记录

     */
    private Object data;
    /**
     * 总记录数
     */
    private int totalCount;

    /**
     * 构造方法，只构造空页

     */
    @SuppressWarnings("unchecked")
	public HibernatePage() {
        this(0, 0, HqlPage.DEFAULT_PAGE_SIZE, new ArrayList());
    }

    /**
     * 默认构造方法

     *
     * @param start     本页数据在数据库中的起始位置
     * @param totalSize 数据库中总记录条数

     * @param pageSize  本页容量
     * @param data      本页包含的数据

     */
    public HibernatePage(int start, int totalSize, int pageSize, Object data) {
        this.pageSize = pageSize;
        this.start = start;
        this.totalCount = totalSize;
        this.data = data;
    }

    /**
     * 取数据库中包含的总记录数
     */
    public int getTotalCount() {
        return this.totalCount;
    }

    /**
     * 取总页数

     */
    public int getTotalPageCount() {
        if (totalCount % pageSize == 0)
            return totalCount / pageSize;
        else
            return totalCount / pageSize + 1;
    }

    /**
     * 取每页数据容量

     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 当前页中的记录

     */
    public Object getResult() {
        return data;
    }

    /**
     * 取当前页码,页码从1开始

     */
    public int getCurrentPageNo() {
        return (start / pageSize) + 1;
    }

    /**
     * 是否有下一页

     */
    public boolean hasNextPage() {
        return (this.getCurrentPageNo() < this.getTotalPageCount() - 1);
    }

    /**
     * 是否有上一页

     */
    public boolean hasPreviousPage() {
        return (this.getCurrentPageNo() > 1);
    }

    /**
     * 获取任一页第一条数据的位置，每页条数使用默认值

     */
    protected static int getStartOfPage(int pageNo) {
        return getStartOfPage(pageNo, HqlPage.DEFAULT_PAGE_SIZE);
    }

    /**
     * 获取任一页第一条数据的位置,startIndex从0开始

     */
    public static int getStartOfPage(int pageNo, int pageSize) {
        return (pageNo - 1) * pageSize;
    }
   
    
    /**
     * Frank增加
     * @param obj
     */
    public void setResult(Object obj){
    	this.data=obj;
    }
    
}

