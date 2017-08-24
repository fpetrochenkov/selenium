package by.softclub.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	private static long implicit_wait = Long.parseLong(ConfigUtil.getProperty("implicit_wait"));

	public static WebDriver getDriver() {
		String driverName = ConfigUtil.getProperty("driver");
		WebDriver driver = null;
		switch (driverName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "iexplorer":
			System.setProperty("webdriver.ie.driver", "src\\main\\resources\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		default:
			throw new RuntimeException("Driver is not initialized!");
		}
		setDriverProperty(driver);
		return driver;
	}

	private static void setDriverProperty(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(implicit_wait, TimeUnit.SECONDS);
		DriverStorage.putWebDriver(Thread.currentThread().getId(), driver);
	}

}
