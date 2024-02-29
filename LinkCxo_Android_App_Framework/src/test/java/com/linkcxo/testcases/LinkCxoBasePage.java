package com.linkcxo.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Test;
import com.linkcxo.pageobject.signout.module.SignOut;
import com.linkcxo.pageobject.signuploginmodule.LoginViaPhone;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LinkCxoBasePage {

AppiumDriver<MobileElement> driver;


 @Test(dataProvider="readexcel",dataProviderClass=com.linkcxo.utils.ReadExcelData.class)
public void mobileLogin(String email, String otp) throws MalformedURLException, InterruptedException {
	
	 	
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
			 object1.Signpage(email);
             object1.otpPage(otp);
          System.out.println("LOGIN SUCCESSFULLY DONE "); 
             
             
             
            //************/SIGNOUT USER\************\\               
           SignOut sign=new SignOut(driver);
                sign.signout();
           
     }
 }
        




   
    	

		
		
	
	

