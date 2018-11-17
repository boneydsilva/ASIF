package com.Asif.TestAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;







public class Dream11TestRun {


public static void main(String[] args)throws MalformedURLException, InterruptedException{
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	
	DesiredCapabilities capabilities = new DesiredCapabilities();

	capabilities.setCapability("deviceName","Nexus_5X_API_28");
	capabilities.setCapability("platformName","Android");
	capabilities.setCapability("appPackage", "com.dream11sportsguru");
	capabilities.setCapability("appActivity", "com.dream11sportsguru.MainActivity");
	capabilities.setCapability("avd", "Nexus_5X_API_28");
	
	WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	
	
	//driver.quit();

  
}
}