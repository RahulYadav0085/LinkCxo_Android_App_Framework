package com.linkcxo.pageobject.signuploginmodule;
import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class LoginViaPhone
{
	 public AppiumDriver driver;

    public LoginViaPhone(AppiumDriver driver) {
        this.driver = driver;
       }
     By  Signuptxt= MobileBy.xpath("//android.widget.TextView[@text='Continue with Email or Mobile No.']");  
     By  Enrtytxt= MobileBy.xpath("//android.widget.EditText[@text='Your Email or Mobile No']"); 
	 By  SubmitBtn= MobileBy.xpath("//android.widget.Button[@content-desc=\"Continue to Send OTP\"]/android.widget.TextView");
	 By  Otptxt1= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[1]");
	 By  Otptxt2= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[2]");
	 By  Otptxt3= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[3]");
	 By  Otptxt4= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[4]");
	 By  Otptxt5= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[5]");
	 By  Otptxt6= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[6]");
	 By  VerifyBtn= MobileBy.xpath("//android.widget.TextView[@text='Confirm to Verify']");


	 
    public void Signpage( String email) throws InterruptedException {
    	
    	driver.findElement(Signuptxt).click();
    	Thread.sleep(1000);
    	driver.findElement(Enrtytxt).isDisplayed();
    
    
    	driver.findElement(Enrtytxt).sendKeys(email);
    	Thread.sleep(1000);
    	driver.findElement(SubmitBtn).click();
    } 	
    
    public void otpPage(String otp) throws InterruptedException {
    	
    	driver.findElement(VerifyBtn).isEnabled();
    	Thread.sleep(1000);
    	driver.findElement(Otptxt1).click();
    	Thread.sleep(1000);
    	driver.findElement(Otptxt1).sendKeys(otp);
    	Thread.sleep(1000);
    	driver.findElement(Otptxt2).click();
    	Thread.sleep(1000);
    	driver.findElement(Otptxt2).sendKeys(otp);
    	Thread.sleep(1000);
    	driver.findElement(Otptxt3).click();
    	Thread.sleep(1000);
    	driver.findElement(Otptxt3).sendKeys(otp);
    	Thread.sleep(1000);
    	driver.findElement(Otptxt4).click();
    	Thread.sleep(1000);
    	driver.findElement(Otptxt4).sendKeys(otp);
    	Thread.sleep(1000);
    	driver.findElement(Otptxt5).click();
    	Thread.sleep(1000);
    	driver.findElement(Otptxt5).sendKeys(otp);
    	Thread.sleep(1000);
    	driver.findElement(Otptxt6).click();
    	Thread.sleep(1000);
    	driver.findElement(Otptxt6).sendKeys(otp);
    	Thread.sleep(1000);
    
    	
    } 
}
	

