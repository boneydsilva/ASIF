package com.Asif.TestAppium;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Amazon_LogIn_Test {
	private static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/Amazon/");
		System.out.println(appDir);
		File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");

		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		
		
		capabilities.setCapability("autoGrantPermissions", true);
		capabilities.setCapability("automationName","Appium");
		capabilities.setCapability("deviceName","Nexus_5X_API_28");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("platformName","Android");
		
		capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");		
		capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		capabilities.setCapability("avd", "Nexus_5X_API_28");



		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		// Click on Shop by Deparment link
		driver.findElement(By.xpath(".//*[@text='Skip sign in']")).click();
		// Click on Main menu
		Thread.sleep(3000);
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/search_edit_text")).click();
		//Thread.sleep(3000);
		WebElement textElement = driver.findElement(By.className("android.widget.EditText"));
		
		/*try {
		     textElement.click();  
		     new ProcessBuilder(new String[]{"adb", "-s", "5554", "shell", "input", "text", "rish"})
		       .redirectErrorStream(true)
		       .start();
		} catch (IOException e) {
		   e.printStackTrace();
		}
		*/
		String command = "adb -s input keyevent KEYCODE_A";
		try {
		Process result = Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			// TODO Auto-generated catch block**
		e.printStackTrace();
		}
		
		Actions a =  new Actions(driver);
		
		a.sendKeys("rish").build().perform();
		
		driver.quit();

	}

}