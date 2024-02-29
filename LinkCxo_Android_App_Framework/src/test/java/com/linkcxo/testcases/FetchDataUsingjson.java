package com.linkcxo.testcases;
 
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
	import com.linkcxo.pageobject.signout.module.SignOut;
	import com.linkcxo.pageobject.signuploginmodule.LoginViaPhone;
	import com.linkcxo.utils.JsonReadData;

	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.MobileElement;
	import io.appium.java_client.service.local.AppiumDriverLocalService;
	import io.appium.java_client.service.local.AppiumServiceBuilder;
	import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class FetchDataUsingjson { 

AppiumDriver<MobileElement> driver;

public  static void main(String args[]) throws InterruptedException, IOException, ParseException, org.json.simple.parser.ParseException {
		 
	   String email1=JsonReadData.getTestdata("EMAIL");
		  String otp1=JsonReadData.getTestdata("OTP");
		 	
			DesiredCapabilities dc = new DesiredCapabilities();
		    	dc.setCapability("platformName", "Android");
				dc.setCapability("deviceName", "LinkCxOPhone");
				dc.setCapability("UDID", "emulator-5554");
				dc.setCapability("platformVersion", "14");
				dc.setCapability("app", "D://LinkCxO//application.apk");
				URL url= new URL("http://127.0.0.1:4723/wd/hub");
				AppiumDriver<MobileElement> driver =  new AppiumDriver<MobileElement>(url, dc);
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
				//************/LOGIN Via MOBIE NUMBER\************\\
				LoginViaPhone object1  =new LoginViaPhone(driver);
				 object1.Signpage(email1);
	             object1.otpPage(otp1);
	          System.out.println("LOGIN SUCCESSFULLY DONE "); 
	             
	             
	             
	            //************/SIGNOUT USER\************\\               
//	           SignOut sign=new SignOut(driver);
//	                sign.signout();
//	           
	     }
	 }
	        
