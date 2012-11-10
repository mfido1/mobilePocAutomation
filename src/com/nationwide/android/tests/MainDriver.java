package com.mobile.android.tests;

import com.mobile.android.*;
import com.thoughtworks.selenium.DefaultSelenium;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MainDriver {

	public static void main(String[] args)  {	
		String serverHost = "http://www.google.com";
		int serverPort = 4443;
		String browser ="InternetExplorerDriver";
		String appURL = "http://www.google.com";
		
		// We could use any driver for our tests...
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// ... but only if it supports javascript
		capabilities.setJavascriptEnabled(true);
		
		// Get a handle to the driver. This will throw an exception
		// if a matching driver cannot be located

		// Query the driver to find out more information
		//OneTest oneTest = new OneTest(serverHost, serverPort, browser, appURL);

	}
}
