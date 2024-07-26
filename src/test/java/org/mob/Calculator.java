package org.mob;


import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Calculator {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
     UiAutomator2Options uiautomator2options=new UiAutomator2Options();
     uiautomator2options.setCapability("deviceName","NexusNaga");
     uiautomator2options.setCapability("app","C:\\Users\\LENOVO\\eclipse-workspace\\MobileTesting\\src\\test\\resources\\ApiDemos-debug.apk");
     
     
     AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),uiautomator2options);
     Thread.sleep(10000);
     driver.quit();
}
}