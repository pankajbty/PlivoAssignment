package com.plivo.tests.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

import com.plivo.tests.BaseTest;
import com.plivo.ui.PageObjectFactory;
import com.plivo.ui.appedit.AppEdit;
import com.plivo.ui.appedit.AppEditConstants;
import com.plivo.ui.home.LoginPage;

import bsh.util.Util;
import junit.framework.Assert;

public class LoginPageTest extends BaseTest{
	LoginPage loginPageObj;
	AppEdit appEditObj;
	
	@Test
	public void test_login(){
		loginPageObj = PageObjectFactory.getLoginPageObject(getDriver());
		
		loginPageObj.openUrl(loginPageObj.getUrl());
		loginPageObj.validateLoginPage();
		loginPageObj.getCreateAppId().click();
		
		appEditObj = PageObjectFactory.getAppEditObject(getDriver());
		
		AppEdit.waitForElementToAppear(appEditObj.getLetsGetStartedByXpath());
		appEditObj.getLetsGetStartedByXpath().click();
		appEditObj.getPlusNewPageById().click();
		AppEdit.waitForElementToAppear(appEditObj.getEnterNewPageNameByXpath());
		appEditObj.getEnterNewPageNameByXpath().sendKeys(AppEditConstants.enterNameInNewPageTextField);
		AppEdit.waitForElementToAppear(appEditObj.getCreateByXpath());
		appEditObj.getCreateByXpath().click();
		AppEdit.waitForElementToAppear(appEditObj.getMessagingByLinkText());
		appEditObj.getMessagingByLinkText().click();
		
		appEditObj.sleep(1000);
		appEditObj.dragNDrop(appEditObj.getSendAnSMSDragByXpath(), appEditObj.getTabById());
		appEditObj.dragNDropByNegativeSide(appEditObj.getSendAnSMSDragByClass(),0,-100);
		
		appEditObj.dragNDrop(appEditObj.getSendAnEmailDragByXpath(), appEditObj.getTabById());
		appEditObj.dragNDropBy(appEditObj.getSendEmailDragByXpath());
		appEditObj.getTabById().click();
		
		//This exit is for the Send An SMS 
		appEditObj.getBaiscButtonLinkText().click();
		appEditObj.dragNDrop(appEditObj.getHangUpExitByXpath(), appEditObj.getTabById());
		appEditObj.dragNDropByNegativeSide(appEditObj.getMoveHangUpExitByXpath(),-400,-100);
		
		//This Exit is for the Send An Email Sent 
		appEditObj.dragNDrop(appEditObj.getHangUpExitByXpath(), appEditObj.getTabById());
		appEditObj.dragNDropByNegativeSide(appEditObj.getMoveHangUpExit2ByXpath(),0,100);
		
		//This Exit is for the Send An Email not sent
		appEditObj.dragNDrop(appEditObj.getHangUpExitByXpath(), appEditObj.getTabById());
		appEditObj.dragNDropByNegativeSide(appEditObj.getMoveHangUpExit3ByXpath(),250,250);
		
		appEditObj.getSendAnSMSPhoneNumberByXpath().sendKeys("9980458254");
		appEditObj.getsendAnSMSMessageTextByXpath().sendKeys("Test");
		
		appEditObj.getSmtpURLByXpath().sendKeys("smtp.gmail.com");
		appEditObj.getSmtpPortByXpath().sendKeys("465");
		appEditObj.getUsernameFieldByXpath().sendKeys("abc@gmail.com");
		appEditObj.getPasswordFieldByXpath().sendKeys("abcdef");
		appEditObj.getFromFieldByXpath().sendKeys("abc@gmail.com");
		appEditObj.getToFieldByXpath().sendKeys("xyz@gmail.com");
		appEditObj.getSubjectFieldByXpath().sendKeys("Hello everyone");
		appEditObj.getsendAnEmailMessageTextByXpath().sendKeys("Enter the coding world");
		
		
		//Do the drag and drop on the element in the Test tab
		appEditObj.dragNDrop(appEditObj.getStartCircleDragElementByXpath(), appEditObj.getSendAnSMSTriangleByXpath());
		appEditObj.dragNDrop(appEditObj.getSendAnSMSCircleSentByXpath(), appEditObj.getExitTriangle1ByXpath());
		appEditObj.dragNDrop(appEditObj.getSendAnSMSCircleNotSentByXpath(), appEditObj.getSendAnEmailTriangleByXpath());
		appEditObj.dragNDrop(appEditObj.getSendAnEmailCircleSentByXpath(), appEditObj.getExitTriangle2ByXpath());
		appEditObj.dragNDrop(appEditObj.getSendAnEmailCircleNotSentByXpath(), appEditObj.getExitTriangle3ByXpath());
	
		appEditObj.sleep(10000);
		
	}
		
}
