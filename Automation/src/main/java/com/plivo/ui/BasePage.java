package com.plivo.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.plivo.ui.appedit.AppEdit;

import bsh.util.Util;

public class BasePage {
	private static final int TIMEOUT = 10;	// Seconds
	private static final int POLLING = 200;	// Mills 
	
	protected static WebDriver driver;
	private static WebDriverWait wait;
	
	//Sets the WebDriver
	public BasePage(WebDriver webDriver) {
		driver = webDriver;
		wait = new WebDriverWait(driver, TIMEOUT, POLLING);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
	}

	//Returns the WebDriver
	public static WebDriver getDriver() {
		return driver;
	}
	
	//Open URL
	public void openUrl(String url) {
		getDriver().get(url);
	}
	
	//Wait for Element to Appear
	public static void waitForElementToAppear(WebElement element) {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	//Wait for Element to Disappear 
	public static void waitForElementToDisappear(By locator) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}
	
	//Wait for an element to be Clickable
	public static void waitForElementToClickable(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));	
		}catch (StaleElementReferenceException ex) {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		
	}
	
	//Perform Drag and Drop
	public void dragNDrop(WebElement source, WebElement destination){
	 	Actions action = new Actions(getDriver());
//		action.dragAndDrop(source, destination).perform();
//		action.clickAndHold(source).moveToElement(destination).release(destination);
		action.clickAndHold(source).build().perform();
		sleep(1000);
 		action.moveToElement(destination).build().perform();
 		sleep(1000);
		action.release(destination).build().perform();
		sleep(1000);
	}
	
	public void dragNDropBy(WebElement source){
		Actions action = new Actions(getDriver());
		action.clickAndHold(source).build().perform();
		sleep(1000);
		action.moveByOffset(400, -100).build().perform();
		sleep(1000);
		action.release().build().perform();
		sleep(1000);
	}
	
	public void dragNDropByNegativeSide(WebElement source,int xOffset,int yOffset){
		Actions action = new Actions(getDriver());
		action.clickAndHold(source).build().perform();
		sleep(1000);
		action.moveByOffset(xOffset, yOffset).build().perform();
		sleep(1000);
		action.release().build().perform();
		sleep(1000);
	}
	
	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
