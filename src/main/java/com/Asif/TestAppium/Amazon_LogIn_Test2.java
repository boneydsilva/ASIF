package com.Asif.TestAppium;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

import com.Asif.Utilities.keyBoardPressEvent;

public class Amazon_LogIn_Test2 {
	private static AppiumDriver<?> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/Amazon/");
		System.out.println(appDir);
		File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");

		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		
		
		capabilities.setCapability("autoGrantPermissions", true);
		
		
		capabilities.setCapability("automationName","Appium");
		//capabilities.setCapability("automationName","UiAutomator2");
		
		capabilities.setCapability("deviceName","Nexus_5X_API_28");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("platformName","Android");
		//capabilities.setCapability("unicodeKeyboard", "true");
		//capabilities.setCapability("resetKeyboard", "true");
		
		capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");		
		capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		capabilities.setCapability("avd", "Nexus_5X_API_28");



		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		// Click on Shop by Deparment link
		Thread.sleep(5000);
		driver.findElementByXPath(".//*[@text='Skip sign in']").click();
		// Click on Main menu
		Thread.sleep(4000);
		driver.findElementById("in.amazon.mShop.android.shopping:id/search_edit_text").click();
		
		//MobileElement textElement = (MobileElement) driver.findElementById("in.amazon.mShop.android.shopping:id/search_edit_text");
		Thread.sleep(5000);
		
		MobileElement elm = (MobileElement) driver.findElementByClassName("android.widget.LinearLayout"); 
		
		
		TouchAction TA = new TouchAction(driver);     
		
		
		(new keyBoardPressEvent()).sendKeys("abcdefghijklmnopqrstuvwxyz", TA);
		
		Thread.sleep(1000);
		
		
		//driver.findElementById("in.amazon.mShop.android.shopping:id/search_edit_text").sendKeys("Rish");
		
		System.out.println("right about now..........2");
	
		//
		driver.quit();

	}

}