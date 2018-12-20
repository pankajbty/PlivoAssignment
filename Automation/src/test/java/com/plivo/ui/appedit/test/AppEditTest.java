package com.plivo.ui.appedit.test;

import org.testng.annotations.Test;

import com.plivo.tests.BaseTest;
import com.plivo.ui.PageObjectFactory;
import com.plivo.ui.appedit.AppEdit;

public class AppEditTest extends BaseTest{
	AppEdit appEditObj;
	
	@Test
	public void test_login(){
		appEditObj = PageObjectFactory.getAppEditObject(getDriver());
		
		//appEditObj.getLetsGetStartedClass().click();
		
	}
}
