package com.rosy.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.rosy.Constants;
import com.rosy.service.ApcaOrganizationManager;
import com.rosy.service.UserManager;


public final class ManageHelper {

	protected ManageHelper()

	{
		ctx = new FileSystemXmlApplicationContext(paths);
		mrgUserManager = (UserManager) getBean("userManager");
		mrgUserManager = (UserManager) getBean("userManager");
		mrgOrganization = (ApcaOrganizationManager) getBean("apcaOrganizationManager");
		
	}

	public static synchronized ManageHelper getManageHelper() {
		if (instance == null)
			instance = new ManageHelper();
		return instance;
	}

	private Object getBean(String name) {
		return ctx.getBean(name);
	}

	private static final String[] paths = { Constants.APP_CONTEXT_HIBERNATE,
			Constants.APP_CONTEXT_SERVICE, Constants.APP_CONTEXT_RESOURCE };

	private static ApplicationContext ctx;

	private static ManageHelper instance;

	private UserManager mrgUserManager;
	
	private ApcaOrganizationManager mrgOrganization ;

	public ApcaOrganizationManager getMrgOrganization() {
		return mrgOrganization;
	}

	public void setMrgOrganization(ApcaOrganizationManager mrgOrganization) {
		this.mrgOrganization = mrgOrganization;
	}

	public UserManager getMrgUserManager() {
		return mrgUserManager;
	}

	public void setMrgUserManager(UserManager mrgUserManager) {
		this.mrgUserManager = mrgUserManager;
	}



	
}
