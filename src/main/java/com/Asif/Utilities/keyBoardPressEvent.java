package com.Asif.Utilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class keyBoardPressEvent {

	public void sendKeys(String str, TouchAction TA) throws InterruptedException {
		
		
		char[] temp = str.toCharArray();
		
		for(char c :temp) {
			
			
			if(c == ' ') {
				int[] Point = KB.space.getCoordinateA();
				TA.press(PointOption.point(Point[0], Point[1])).release().perform();
			}
			else if(Character.isUpperCase(c)) {
				int[] Point = KB.UpperCase.getCoordinateA();
				TA.press(PointOption.point(Point[0], Point[1])).release().perform();
				 Thread.sleep(900);
				 
				 
				 
				Point = KB.valueOf(c+"").getCoordinateA();
				TA.press(PointOption.point(Point[0], Point[1])).release().perform();
				Thread.sleep(200);
			}
			else {
				int[] Point = KB.valueOf(c+"").getCoordinateA();
				TA.press(PointOption.point(Point[0], Point[1])).release().perform();
			}
			
			Thread.sleep(400);
		}
	}
}
