package com.Asif.TestAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;


import io.appium.java_client.android.AndroidDriver;




public class Calculator2 {


public static void main(String[] args)throws MalformedURLException{
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	
	DesiredCapabilities capabilities = new DesiredCapabilities();

	//capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
	capabilities.setCapability("deviceName","Nexus_5X_API_28");
	capabilities.setCapability("platformName","Android");
	capabilities.setCapability("automationName", "Appium");
	capabilities.setCapability("appPackage", "com.android.calculator2");
	capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	capabilities.setCapability("avd", "Nexus_5X_API_28");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Boney\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
  
	driver.findElement(By.id("com.android.calculator2:id/digit_7")).click();
	driver.findElement(By.id("com.android.calculator2:id/digit_6")).click();
	driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
	driver.findElement(By.id("com.android.calculator2:id/digit_4")).click();
	driver.findElement(By.id("com.android.calculator2:id/digit_3")).click();
	driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
	driver.quit();

  
}
}