package org.mob;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Mobile {
	public static void main(String[] args) {
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");
		cap.setCapability("udid", "b3893d15");
		cap.setCapability("deviceName", "Redmi10");
		cap.setCapability("packageName", "");
		cap.setCapability("appActivity", "");
		
		
	}

}
