import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Uicatalaog {

	public static void main(String[] args) throws MalformedURLException {
		
		File f = new File("/Users/KakuZini/KavinSchool/IntroSelenium/Project/AppiumBasics/bin/UI-Catalog-App.zip");
		  

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "9.2");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6 (9.2) [9B01D256-1756-473F-BD0E-1E879A76B32A]");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, ""); 
		cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
		
		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	
	}

}
