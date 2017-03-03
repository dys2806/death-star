import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Web2 {

	@Test
	public void test() throws MalformedURLException, InterruptedException {
		 File appDir = new File("src");
		   

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
	
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		
		cap.setCapability(MobileCapabilityType.APP_PACKAGE, "net.one97.paytm");
		cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "net.one97.paytm.AJRJarvisSplash");
		
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElementById("net.one97.paytm:id/smart_list_root").click();
		
		driver.findElementById("net.one97.paytm:id/edit_no").sendKeys("98464");
		
         Thread.sleep(3000L);	
         
		driver.findElementById("net.one97.paytm:id/text_mob_op").click();
		
		driver.scrollTo("Vodafone").click();
		
		driver.scrollTo("Kerala").click();
		
		driver.findElementById("net.one97.paytm:id/edit_amount").sendKeys("500");
		
		driver.findElementById("net.one97.paytm:id/radio_postpaid").click();
		
		 Thread.sleep(3000L);
		 
		 System.out.println(driver.findElementByClassName("android.widget.Button").getText());
		 
		 driver.findElementByClassName("android.widget.CheckBox").click();
		 
		 System.out.println(driver.findElementByClassName("android.widget.Button").getText());
		 
		 driver.findElementByClassName("android.widget.Button").click();
		 
		 System.out.println(driver.findElementById("net.one97.paytm:id/w_custom_dialog_message").getText());
		 
	
	}
	
}


