package by.softclub.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	
	private static long implicit_wait_time = Long.parseLong(ConfigUtil.getProperty("implicit_wait_time"));

	public static WebDriver getDriver() {
		String driverName = ConfigUtil.getProperty("driver");
		WebDriver driver = null;
		switch (driverName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\petrachenkau\\Downloads\\FIREFOXDRIVER\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("Driver is not initialized!");
		}
		setDriverProperty(driver);
		return driver;
	}
	
	public static void setDriverProperty(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(implicit_wait_time, TimeUnit.SECONDS);
		DriverStorage.putWebDriver(Thread.currentThread().getId(), driver);
	}

}