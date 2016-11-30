package com.ibm.smartcloud.core.dao.db;

/**
 * 
 * @Title：DbContextHolder 
 * @Description: 数据源管理
 * @Auth: ZhangLong
 * @CreateTime:Apr 8, 2015 3:24:54 PM     
 * @version V1.0
 */
public class DbContextHolder {

	private static final ThreadLocal contextHolder = new ThreadLocal();
	
    public static void setDbType(String dbType) {
        contextHolder.set(dbType);
    }
  
    public static String getDbType() {
        return (String) contextHolder.get();
    }   
  
    public static void clearDbType() {
        contextHolder.remove();
    }
}