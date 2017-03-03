import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class App2 {

	@Test
	public void test() throws MalformedURLException, InterruptedException {
		       File appDir = new File("src");
		       File app = new File(appDir, "com.facebook.katana_v78.0.0.16.67-30529819_Android-5.0.apk");

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		//cap.setCapability(MobileCapabilityType.APP_WAIT_ACTIVITY, "MyActivity");
		
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		//cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.facebook.katana");
		
	//	cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.facebook.katana");
	//	cap.setCapability(MobileCapabilityType.APP_WAIT_ACTIVITY, "com.facebook.katana");
		
		
		
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap );
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//Log in to FB
		driver.findElementById("com.facebook.katana:id/login_username").clear();
		driver.findElementById("com.facebook.katana:id/login_username").sendKeys("ooyala.x@gmail.com");
		
		driver.findElementById("com.facebook.katana:id/login_password").click();
		driver.findElementById("com.facebook.katana:id/login_password").sendKeys("ooyala.com");
		
		driver.findElementById("com.facebook.katana:id/login_login").click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		//Skipping Auto-Login
		driver.findElementById("com.facebook.katana:id/set_pin").isDisplayed();
		System.out.println("Log in with one tap");
		driver.findElementById("com.facebook.katana:id/dbl_off").click();	

		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//Navigating to Bookmarks
		driver.findElementById("com.facebook.katana:id/search_edit_text").isDisplayed();
		driver.findElementById("com.facebook.katana:id/bookmarks_tab").click();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		//Searching for a page
		driver.scrollTo("Pages");
		driver.findElementByLinkText("Pages");
		driver.findElementByAndroidUIAutomator("new UiSelector().content-desc(\"Travel Kid, 3 new\")").click();
		
		/*driver.findElementById("com.facebook.katana:id/search_edit_text").clear();
		driver.findElementById("com.facebook.katana:id/search_edit_text").sendKeys("travel kid");
		
		driver.findElementById("com.facebook.katana:id/search_edit_text").sendKeys(Keys.ENTER);
		driver.sendKeyEvent(AndroidKeyCode.ENTER);*/
	
		
		Thread.sleep(6000L);
		
		/*Found our page in results and clicking on it
		
		driver.findElementById("com.facebook.katana:id/simple_typeahead_suggestion_row").isDisplayed();
		System.out.println(driver.findElementById("com.facebook.katana:id/simple_typeahead_suggestion_row").getText());
		driver.findElementById("com.facebook.katana:id/simple_typeahead_suggestion_row").click(); */
		
		
		
		driver.wait();
		
	}

}
