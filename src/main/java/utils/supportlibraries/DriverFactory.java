package utils.supportlibraries;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;

public class DriverFactory {
	private static Properties prop = Settings.getPropertiesInstance();
	static AppiumDriverLocalService appiumService;
	static String appiumServiceUrl;

	public static void startAppiumServer() {
		appiumService = AppiumDriverLocalService.buildDefaultService();
		appiumService.start();
		if (appiumService == null || !appiumService.isRunning()) {
			throw new AppiumServerHasNotBeenStartedLocallyException("Appium Server node is not started!");
		}
		appiumServiceUrl = appiumService.getUrl().toString();
		System.out.println("Appium Service Address : - " + appiumServiceUrl);
	}

	public static void stopAppiumServer() {
		System.out.println("Stop appium service");

		if (appiumService != null) {
			appiumService.stop();
		}
	}

	public static AppiumDriver<WebElement> getAppiumDriver() {
		URL url = null;
		AndroidDriver<WebElement> driver = null;
		final String APP = System.getProperty("user.dir") + "\\apk\\" + prop.getProperty("Application");

		try {
			url = new URL(prop.getProperty("AppiumUrl"));
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		caps.setCapability("avd", "TestAVD");
		caps.setCapability("appPackage", "com.cepapp");
		caps.setCapability("appActivity", ".MainActivity");
		caps.setCapability("ensureWebviewsHavePages", true);
		caps.setCapability("noReset", true);
		caps.setCapability("fullReset", false);
		caps.setCapability(MobileCapabilityType.APP, APP);
		driver = new AndroidDriver<WebElement>(url, caps);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}

	public static void quitDriver(AppiumDriver<WebElement> driver) {
		if (driver != null) {
			driver.quit();
		}
	}
}
