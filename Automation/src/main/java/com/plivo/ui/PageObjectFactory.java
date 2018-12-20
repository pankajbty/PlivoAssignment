/**
 * 
 */
package com.plivo.ui;

import org.openqa.selenium.WebDriver;

import com.plivo.ui.appedit.AppEdit;
import com.plivo.ui.home.LoginPage;

/**
 * @author PYadav
 *
 */
public class PageObjectFactory {
	private static LoginPage loginPage = null;
	private static AppEdit appEdit = null;
	
	public static LoginPage getLoginPageObject(WebDriver driver){
		if (loginPage == null){
			loginPage = new LoginPage(driver);
		}
		return loginPage;
	}
	
	public static AppEdit getAppEditObject(WebDriver driver){
		if (appEdit == null){
			appEdit = new AppEdit(driver);
		}
		return appEdit;
	}
	
}
