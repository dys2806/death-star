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
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class DesiredCapabRough {

	@Test
	public void test() throws MalformedURLException {
		       File appDir = new File("src");
		   
		    File app = new File(appDir, "BookMyShow–Movie Tickets.apk");

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "200");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElementById("com.bt.bms:id/btnNoThanks").click();
		driver.findElementById("com.bt.bms:id/dismiss").click();
		
		MobileElement abc=(MobileElement)driver.findElement(By.className("android.widget.CheckedTextView"));
		abc.swipe(SwipeElementDirection.UP, 6000);
	//	abc.tap(fingers, duration);
		
	
	}

}
