package com.plivo.ui.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.plivo.ui.BasePage;

import junit.framework.Assert;

public class LoginPage extends BasePage implements LoginPageConstants{
	
	public LoginPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	LoginPage lp;
	@FindBy(id = createApp)
	WebElement createAppId;
	public WebElement getCreateAppId(){
		return createAppId;
	}
	
	@FindBy(xpath = helpLink)
	WebElement helpLinkXpath;
	public WebElement getHelpLinkXpath(){
		return helpLinkXpath;
	}

	@FindBy(linkText = resetPasswordLink)
	WebElement resetPasswordLinkText;
	public WebElement getResetPasswordLinkText(){
		return resetPasswordLinkText;
	}
	
	public String getUrl(){
		return homePageURL;
	}
	
	public void validateLoginPage(){
		lp = new LoginPage(getDriver());
		Assert.assertEquals(true, lp.getHelpLinkXpath().isDisplayed());
		Assert.assertEquals(true, lp.getResetPasswordLinkText().isDisplayed());
	}
	
}
