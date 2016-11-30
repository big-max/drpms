package com.ibm.smartcloud.core.util;

import swat.ReturnCode;
import swat.cwa;

/**
 * 类描述:验证用户登录的账户和密码
 * 类名称:BluepagesUtil
 * @author hanxinxing   创建时间：2014年7月31日上午 10:17
 * @version 1.0
 */

public class BluepagesUtil {
	
	public static int authenicte(String emailAddress, String password){
		
		ReturnCode code = cwa.authenticate("bluepages.ibm.com", emailAddress, password);
		if(code.getCode() == 0){
			//success
			return 0;
		}else{
			//fail
			return 1;
		}
	}

}
