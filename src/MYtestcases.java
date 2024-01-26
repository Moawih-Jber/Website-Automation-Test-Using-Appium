import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.URL;

public class MYtestcases {
	// this is what we do in selenium - for the web testing

	// WebDriver driver = new ChromeDriver();

	// this is what we do for the appium for mobile testing
	// we will use them always
	DesiredCapabilities caps = new DesiredCapabilities();
	AndroidDriver driver;

	@BeforeTest
	public void TheSetUp() {
//we will use them always
//import java.net.URL;
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Moawih");
//we use them only when we need to interact with browsers
		caps.setCapability("chromedriverExecutable", "D:\\chromedriver_win32\\chromedriver.exe");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	}

	@Test(priority = 1)
	public void TestTheBrowser() throws MalformedURLException, InterruptedException {
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

//		==========================================================================================
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

	}

//	@Test()
//	public void myTest() {
//
//	}

	@AfterTest
	public void MyPostTest() {

	}

}
