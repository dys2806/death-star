import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppRaagaActions {

	@Test
	public void test() throws MalformedURLException, InterruptedException {
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
		MobileElement abc=(MobileElement)driver.findElementById("com.raaga.android:id/music_grid_image");
		
		
		//driver.findElementById("com.raaga.android:id/footer_music_menu").click();
		//driver.scrollTo("Sleep Timer");
		//MobileElement abc=(MobileElement)driver.findElementsByClassName("android.widget.Button");
		abc.swipe(SwipeElementDirection.DOWN, 3000);
		abc.swipe(SwipeElementDirection.UP, 3000);
		
			
		System.out.println(driver.findElementById("com.raaga.android:id/music_toolbar_language").getText());
		
		t.tap(abc).perform();
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		driver.sendKeyEvent(AndroidKeyCode.HOME);
		
		Thread.sleep(5000L);
		driver.sendKeyEvent(AndroidKeyCode.MENU);
		
	
	}
	
}


