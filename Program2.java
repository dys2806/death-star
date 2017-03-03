import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Program2 {

	@Test
	public void test() throws MalformedURLException {
		       File appDir = new File("src");
		   
		    File app = new File(appDir, "apiDemos.apk");

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "30");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.scrollTo("Views").click();
		List <WebElement>b=driver.findElementsById("android:id/text1");
		System.out.println(b.get(6).getText());
		System.out.println(b.get(5).getText());
		System.out.println(b.get(4).getText());
		System.out.println(b.get(3).getText());
		System.out.println(b.get(2).getText());
		
	
	}

}
