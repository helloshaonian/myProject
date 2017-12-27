package com.myProject.configuration.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.RealmSecurityManager;

public class ShiroUtiles {

	
	/**
	 * 手动清除缓存
	 */
	public static void clearCache(){
		RealmSecurityManager securityManager =  
			      (RealmSecurityManager) SecurityUtils.getSecurityManager(); 
		AuthRealm ar=(AuthRealm) securityManager.getRealms().iterator().next();
		ar.clearCache();
	}
}
