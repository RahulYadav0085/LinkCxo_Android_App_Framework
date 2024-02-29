package com.linkcxo.setup;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
  

public class SetUpPage {
	AppiumDriver driver;
	    @BeforeMethod
	    public void setUp() throws MalformedURLException {
	    	
	    	DesiredCapabilities dc = new DesiredCapabilities();
	    	dc.setCapability("platformName", "Android");
			dc.setCapability("deviceName", "LinkCxOPhone");
			dc.setCapability("UDID", "emulator-5554");
			dc.setCapability("platformVersion", "14");
			dc.setCapability("app", "D://LinkCxO//application.apk");
			URL url= new URL("http://127.0.0.1:4723/wd/hub");
			AppiumDriver driver =  new AppiumDriver(url, dc);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	        
	    }

	    @AfterMethod
	    public void tearDown() {
	    	 if (driver != null) {
	 	        driver.quit();
	 	   }  
	    }
	        
	    }
	



