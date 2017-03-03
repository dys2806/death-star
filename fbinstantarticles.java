import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class fbinstantarticles {

	@Test
	public void test() throws MalformedURLException, InterruptedException {
		
		File appDir = new File ("src");
		File app = new File (appDir, "/AppiumBasics/src/facebook.apk");
		       
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");	
		//cap.setCapability(MobileCapabilityType.APP, "Facebook");
		// cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.facebook.katana:id/dbl_fragment_layout");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		// driver.scrollTo("Trending");
	//	@SuppressWarnings("unused")
		// TouchAction t=new TouchAction(driver);
		//MobileElement fb=(MobileElement)driver.findElementById("com.facebook.katana:id/login_add_account_group").click();
		
		
/*		driver.findElementById("com.facebook.katana:id/login_add_account_group").click();
		//driver.scrollTo("Sleep Timer");
		//MobileElement abc=(MobileElement)driver.findElementsByClassName("android.widget.Button");
		//fb.swipe(SwipeElementDirection.DOWN, 3000);
		//fb.swipe(SwipeElementDirection.UP, 3000);
		
			
		System.out.println(driver.findElementById("com.raaga.android:id/music_toolbar_language").getText());
		
		//WebElement fb = fb;
		//t.tap(fb).perform();
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		driver.sendKeyEvent(AndroidKeyCode.HOME);
		
		Thread.sleep(5000L);
		driver.sendKeyEvent(AndroidKeyCode.MENU);
		
	*/
	}
	
}


