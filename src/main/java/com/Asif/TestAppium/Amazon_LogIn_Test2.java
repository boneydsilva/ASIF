package com.Asif.TestAppium;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
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
	
		/*	File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/Amazon/");
		System.out.println(appDir);
		File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");*/

		
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



		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		
		Thread.sleep(2000);
		driver.findElementByXPath(".//*[@text='Skip sign in']").click();

		Thread.sleep(2000);
		driver.findElementById("in.amazon.mShop.android.shopping:id/search_edit_text").click();
		
		Thread.sleep(2000);		
		MobileElement elm = (MobileElement) driver.findElementByClassName("android.widget.LinearLayout"); 
		
		
		TouchAction TA = new TouchAction(driver);		
		
		(new keyBoardPressEvent()).sendKeys("rish", TA);		
		Thread.sleep(1000);
		
		
		TA.press(PointOption.point(313, 377)).release().perform();
		
		MobileElement  resultContainter = (MobileElement) driver.findElementByXPath(".//*[@resource-id='resultItems' and @index='1' and @class='android.widget.ListView']");
		List<MobileElement> listOfBooks = resultContainter.findElementsByXPath(".//*/android.view.View[1]");
		
		
		for(MobileElement lb : listOfBooks) {
			
			System.out.println(lb.getText() + "     ");
			System.out.println();
			
			if(lb.getText().contains("Sanjay Dutt")) {
				lb.click();		
			
			}
				
			
		}
		

		TA.press(PointOption.point(517, 1034)).moveTo(PointOption.point(517, 450)).perform();		
		
		System.out.println("idhar");
		Thread.sleep(2000);
		
		driver.findElementByXPath(".//*[@resource-id='a-autoid-0']/*").click();		
		driver.findElementByXPath(".//*[@text='Qty:']/../..//*[@text='2']").click();
		driver.findElementByXPath(".//*[@resource-id='a-autoid-1']").click();
		
		//TA.press(PointOption.point(517, 1034)).moveTo(PointOption.point(517, 450)).perform();
		//Thread.sleep(2000);
		//TA.press(PointOption.point(517, 1034)).moveTo(PointOption.point(517, 450)).perform();
		//Thread.sleep(2000);
		
		
		Thread.sleep(10000);
		
		//driver.quit();

	}

}