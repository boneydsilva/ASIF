package com.Asif.TestAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;




public class AmazonTest {


	private static AndroidDriver driver;
	private static final String url= "http://127.0.0.1:4723/wd/hub"; 
	
	
public static void main(String[] args)throws MalformedURLException, InterruptedException{
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	
	
	
	DesiredCapabilities capabilities = new DesiredCapabilities();

	capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	capabilities.setCapability("deviceName","Nexus_5X_API_28");
	capabilities.setCapability("platformName","Android");
	capabilities.setCapability("automationName", "Appium");
	capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
	capabilities.setCapability("appActivity", "com.amazon.micron.StartupActivity");
	capabilities.setCapability("avd", "Nexus_5X_API_28");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Boney\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	driver =  new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);	
	driver.findElementById("in.amazon.mShop.android.shopping:id/web_home_shop_by_department_label").click();
	// Click on Main menu
	driver.findElementByClassName("android.widget.ImageView").click();
	// Click on Home link under Main menu
	driver.findElement(By.name("Home")).click();
	// Click on Sign In link on the Home Screen
	driver.findElementByName("Sign inHello. Link").click();
 
		// Entering UserName using Parent node strategy
	WebElement parentElement = driver.findElement(By.name("Amazon Sign In"));
	List<WebElement> childElements = parentElement.findElements(By.className("android.view.View"));
	WebElement mainElement = childElements.get(4);
	mainElement.findElement(By.className("android.widget.EditText")).sendKeys("Your_UserName");
	// Entering Password using Xpath & Sibling strategy
	driver.findElementByXPath("//android.view.View[@content-desc='Password']/following-sibling::android.view.View/android.widget.EditText").sendKeys("Your_Password");
	// Click on Sign In button
	driver.findElement(By.name("Sign in")).click();
	// This is to kill the Android driver
	driver.quit();

  
}
}