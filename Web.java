import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Web {

	@Test
	public void test() throws MalformedURLException, InterruptedException {
		 File appDir = new File("src");
		   

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		
		
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap );
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		 
		 System.out.println("This is Awesome !!!");
		 
		 driver.get("http://facebook.com");
		 
		 System.out.println("Website Successfully Launched");
		 
		 System.out.println(driver.findElementByCssSelector(".fcl").getText());
		 
		 driver.findElementByXPath("//input[@type='email']").sendKeys("ooyala.x@gmail.com");
		 //tagnam@attribute='value'
		 driver.findElementByXPath("//input[@type='email']").sendKeys(Keys.TAB);
		 
		 driver.findElementByXPath("//input[@type='password']").sendKeys("ooyala.com");
		 
		 driver.findElementByXPath("//input[@type='email']").sendKeys(Keys.TAB);
		 
		 driver.findElementByXPath("//input[@type='email']").sendKeys(Keys.ENTER);
		 
		 driver.findElementByXPath("html/body/div[1]/div/div[2]/div/div/div/div[3]/div[1]/div/a").click();
		 
		 System.out.println(driver.getTitle());
		 
		 driver.findElementByXPath("html/body/div[1]/div[1]/div[3]/div[2]/div/div/div/form/button").click();
		 
		 driver.findElementByXPath("html/body/div[1]/div[1]/div[3]/div/div/ul[1]/li/div/div[1]/a/div/div[2]").click();
		 
		 Thread.sleep(7000);
		
		 
		 driver.findElementByXPath("html/body/div[1]/div[1]/div[3]/div/div[2]/div/div/form/div/div[2]").sendKeys("This is just a sample");
		 
		 Thread.sleep(7000);

		 
		 driver.findElementByXPath("html/body/div[1]/div[1]/div[3]/div[2]/div/form/div[1]/div[1]/div[3]/div/button");
		 
		 
		 
		 
		 
	}
	
}


