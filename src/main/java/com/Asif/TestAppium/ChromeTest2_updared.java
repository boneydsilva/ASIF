package com.Asif.TestAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;







public class ChromeTest2_updared {

	private static AppiumDriver<?> driver;
	
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
	
	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
  
	
	
	String bag_name = "brown colour fashionable buckled rubber made sling bag for women";
	
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.amazon.in/");
	
	driver.findElementByXPath(".//*[@resource-id='nav-search-keywords']/*").click();
	
	
	driver.findElement(By.className("nav-input")).click();	
	driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[3]/div[1]/a/h2")).click();
		
	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs2.get(1));
	Thread.sleep(1000);
	driver.findElement(By.id("buybox-see-all-buying-choices-announce")).click();			 
	driver.findElement(By.name("submit.addToCart")).click();			  
	driver.findElement(By.id("hlb-view-cart-announce")).click();
	    
	String after_add =  driver.findElement(By.className("a-list-item")).getText();
	System.out.println(after_add);
				   
	//boolean bool =after_add.contains(bag_name);
	
/*	driver.get("http://www.amazon.in");
	System.out.println("Title "+driver.getTitle());

	driver.findElement(By.name("email")).sendKeys("boneydsilva@gmail.com");
	
	
	driver.findElement(By.name("pass")).sendKeys("@@@boney@@@");
	driver.findElement(By.id("u_0_5")).click();

	Thread.sleep(10000);*/
	
	driver.quit();

  
}
}