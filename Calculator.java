import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Calculator {

	@Test
	public void test() throws MalformedURLException {
		       File appDir = new File("src");
		   
		    File app = new File(appDir, "com.digitalchemy.calculator.freedecimal-4.9.5-APK4Fun.com (1).apk");

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElementById("com.digitalchemy.calculator.freedecimal:id/n7").click();
		
		driver.findElementById("com.digitalchemy.calculator.freedecimal:id/multiply").click();
		
		driver.findElementById("com.digitalchemy.calculator.freedecimal:id/n8").click();
		
		driver.findElementById("com.digitalchemy.calculator.freedecimal:id/equals").click();
		
		
		
		
		
		
	
	}

}
