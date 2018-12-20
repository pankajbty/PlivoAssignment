package com.plivo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
private static WebDriver driver;
	
	public BaseTest() {
		// TODO Auto-generated constructor stub
	}

	/*
	  Setup new WebDriver
	  Based on the value passed
	 */
	@BeforeTest
	@Parameters("browser")
	protected void setupBrowser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//resources//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
//			System.setProperty("webdriver.gecko.driver", ".//src//test/resources//geckodriver.exe");
//			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", ".//src//test/resources//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", ".//src//test/resources//MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}
	
	//Close All the browser instances
	@AfterTest
	protected void afterTest() {
		if(driver != null) {
			driver.close();
			driver.quit();
		}
	}
	
	//Get the WebDriver
	public WebDriver getDriver() {
		return driver;
	}
}
