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

public class AppRaaga {

	@Test
	public void test() throws MalformedURLException {
		       File appDir = new File("src");
		  

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		
		cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.raaga.android");
		cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.raaga.android.SplashScreen");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.scrollTo("Trending");
		TouchAction t=new TouchAction(driver);
		WebElement abc=driver.findElementById("com.raaga.android:id/music_grid_image");
		//WebElement abc=(WebElement) driver.findElementsByName("Trending");

		
		
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Trending\")").click();
		t.tap(abc).perform();	
		

		
	
	}
	
}


