package com.Asif.TestAppium;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

import com.Asif.Utilities.keyBoardPressEvent;

public class Amazon_LogIn_Test_SauceLabs {
	private static AppiumDriver<?> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		/*	File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/Amazon/");
		System.out.println(appDir);
		File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");*/

		
		DesiredCapabilities capabilities = new DesiredCapabilities();
			
		capabilities.setCapability("testobject_api_key", "B21747779F82452BA8330EF0CF2D9259");
		capabilities.setCapability("platformVersion", "7");
		capabilities.setCapability("deviceName", "LG_Nexus_5X_free");
		capabilities.setCapability("deviceName","LG_Nexus_5X_free");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("browserName", "Chrome");
	
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Boney\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new RemoteWebDriver(new URL("https://eu1.appium.testobject.com/wd/hub"), capabilities);
	  
		driver.get("http://www.amazon.in");
		System.out.println("Title "+driver.getTitle());

		driver.findElement(By.name("email")).sendKeys("boneydsilva@gmail.com");
		
		
		driver.findElement(By.name("pass")).sendKeys("@@@boney@@@");
		driver.findElement(By.id("u_0_5")).click();

		Thread.sleep(10000);
		
		driver.quit();

	}

}