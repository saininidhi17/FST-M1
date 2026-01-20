package activities;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity2 {
	
	
	AppiumDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() throws Exception, URISyntaxException {
		//set the app file
		//File file = new File("src/main/resources/Calculator.apk");
		
		// desired capabilities
		UiAutomator2Options caps = new UiAutomator2Options();
		caps.setPlatformName("android");
		caps.setAutomationName("UiAutomator2");
		caps.setAppPackage("com.android.chrome");
		caps.setAppActivity("com.google.android.apps.chrome.Main");
	//	caps.setApp(file.getAbsolutePath());
		caps.noReset();
		
		//set appium server url
		URL serverURL = new URI("http://localhost:4723").toURL();
		
		//initalize driver
		driver = new AndroidDriver(serverURL,caps);
		
	}
	
	@Test
	public void testMethod() {
	driver.get("https://training-support.net");
	String pageHeading = driver.findElement(AppiumBy.className("android.widget.TextView")).getText();
	Assert.assertEquals(pageHeading, "Training Support");
    driver.findElement(AppiumBy.accessibilityId("About Us")).click();
    
	pageHeading = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"About Us\"]")).getText();
	Assert.assertEquals(pageHeading,"About Us");
	}
	
	@AfterClass
	public void afterTest() {
		driver.quit();
	}

}
