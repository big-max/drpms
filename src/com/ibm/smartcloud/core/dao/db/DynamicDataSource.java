package com.ibm.smartcloud.core.dao.db;

import org.apache.log4j.Logger;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 
 * @Title：DynamicDataSource 
 * @Description: 动态数据源管理
 * @Auth: ZhangLong
 * @CreateTime:Apr 8, 2015 3:25:56 PM     
 * @version V1.0
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
	
	private final static Logger  logger  = Logger.getLogger(DynamicDataSource.class);   
	 
    @Override  
    protected Object determineCurrentLookupKey() {
    	logger.info("Logger Info Begin===========DB==========="+DbContextHolder.getDbType());
        return DbContextHolder.getDbType();
    }
}