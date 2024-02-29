package com.linkcxo.setup;
import java.io.File;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServerLocalDriver {
	
	
@BeforeTest
	public void setup() {
		
		 AppiumServiceBuilder builder=new AppiumServiceBuilder();
		 builder.withAppiumJS(new File("C:/Users/GOWTHAM/AppData/Roaming/npm/node_modules/appium/build/lib/main.js"))
		 .usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
		 .usingAnyFreePort()
		 .withIPAddress("127.0.0.1")
		 .withArgument(() -> "--base-path", "/wd/hub")
	     .withArgument(GeneralServerFlag.SESSION_OVERRIDE);
		
		 
		 AppiumDriverLocalService service=AppiumDriverLocalService.buildService(builder);
		 service.start();
	}

}
