package com.ibm.smartcloud.core.dao.hibernate.support;

import org.hibernate.dialect.MySQLInnoDBDialect;
import org.hibernate.dialect.function.SQLFunctionTemplate;

public class MySQLLocalDialect extends MySQLInnoDBDialect {

	public MySQLLocalDialect() {
		super();
		registerFunction("convert", new SQLFunctionTemplate(
				org.hibernate.Hibernate.STRING, "convert(?1 using ?2)"));
	}

}
