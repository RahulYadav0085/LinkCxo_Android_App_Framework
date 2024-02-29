package com.linkcxo.pageobject.signout.module;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class SignOut {
AppiumDriver<MobileElement> driver;

public SignOut(AppiumDriver<MobileElement> driver) {
	this.driver=driver;
}
	
By Moretab=MobileBy.xpath("//android.widget.TextView[@text='More']");
	
	
	
	
	
public void signout() throws InterruptedException {
		
		driver.findElement(Moretab).click();
		Thread.sleep(1000);

	 driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Sign Out\").instance(0))")).click();

      }

}

