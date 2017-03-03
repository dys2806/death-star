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

public class desiredcapab {

	@Test
	public void test() throws MalformedURLException {
		       File appDir = new File("src");
		   
		    File app = new File(appDir, "BookMyShow–Movie Tickets.apk");

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElementById("com.bt.bms:id/btnLogin").click();
		driver.findElementById("com.bt.bms:id/signUp").click();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElementById("com.bt.bms:id/edtFirstName").sendKeys("Appium");
		driver.findElementById("com.bt.bms:id/edtLastName").sendKeys("Mobile");
		driver.findElementById("com.bt.bms:id/edtEmailId").sendKeys("appium@training");
		driver.findElementById("com.bt.bms:id/edtPassword").sendKeys("password@1");
		driver.findElementById("com.bt.bms:id/etMobile").sendKeys("7203363316");
		
		driver.findElementById("com.bt.bms:id/action_icon").click();
		
		/*int s=driver.findElementsByClassName("android.widget.EditText").size();
		System.out.println(s);
		
		List<WebElement>a=driver.findElementsByClassName("android.widget.EditText");
		a.get(0).sendKeys("Appium");
		a.get(1).sendKeys("Mobile");
		a.get(2).sendKeys("appium@training");
		a.get(0).sendKeys("password@1");
		a.get(6).sendKeys("7203363316"); */
		
	
	}

}
