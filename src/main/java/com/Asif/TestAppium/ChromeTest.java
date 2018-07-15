package com.Asif.TestAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;







public class ChromeTest {


public static void main(String[] args)throws MalformedURLException, InterruptedException{
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	
	DesiredCapabilities capabilities = new DesiredCapabilities();

	//capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
	capabilities.setCapability("deviceName","Nexus_5X_API_28");
	capabilities.setCapability("platformName","Android");
	capabilities.setCapability("automationName", "Appium");
	capabilities.setCapability("browserName", "Chrome");
	capabilities.setCapability("avd", "Nexus_5X_API_28");
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Boney\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
  
	driver.get("http://www.amazon.in");
	System.out.println("Title "+driver.getTitle());

	driver.findElement(By.name("email")).sendKeys("boneydsilva@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("@@@boney@@@");
	driver.findElement(By.id("u_0_5")).click();

	Thread.sleep(10000);
	
	driver.quit();

  
}
}