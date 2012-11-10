package com.mobile.android.tests;

import java.util.Collection;

import junit.framework.TestCase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OneTest extends TestCase {
	private WebDriver driver;

	@BeforeTest
	public void setWebDriver(){
		WebDriver driver = new FirefoxDriver();
		this.driver = driver;
		try {
			testMobileAndroid(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public static void testMobileAndroid(WebDriver driver) throws Exception {
		//Create new driver for Android Simulator
		
		//nd now use this to visit mobile Nationwide Site via Android
		driver.get("http:www.cnn.com/");

		//Enter Zip Code for next step (Get an Auto Insurance Quote
		
		WebElement element = driver.findElement(By.name("Zip"));
		element.sendKeys("50021");
		
		//Find the Log In button element by its name
		element = driver.findElement(By.name("getQuote"));
		
		if(element.isDisplayed()){
			//Click "Get A Quote" button
			element.submit();
		}

		//Exit the test
		driver.quit();
	}	

}
