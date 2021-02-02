package utils.supportlibraries;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;

public class BaseTest {

	protected static AppiumDriver<WebElement> driver;
	protected static ExtentReports extent;
	protected static ExtentTest logger;
	protected static Properties properties;
	protected static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
	protected static DriverUtils utils;
	protected static String previousSkipTest = "";
	protected static DataFactory dataTable;
	protected static ScriptHelper scriptHelper;

	@BeforeSuite
	public void setUp() {
		properties = Settings.getPropertiesInstance();
		DriverFactory.startAppiumServer();
	}

	@BeforeMethod
	public void setup() {
		driver = DriverFactory.getAppiumDriver();
	}

	@AfterMethod
	public void afterMethod() {
		DriverFactory.quitDriver(driver);
	}

	@AfterSuite
	public void afterSuite() {
		DriverFactory.stopAppiumServer();
	}
}
