package by.softclub.utils;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
<<<<<<< HEAD
	
	private static long implicit_wait = Long.parseLong(ConfigUtil.getProperty("implicit_wait"));
=======

	private static long implicit_wait_time = Long.parseLong(ConfigUtil.getProperty("implicit_wait_time"));
>>>>>>> 0971c5b62edc448c7117f9a9a70d0917cadcae09

	public static WebDriver getDriver() {
		String driverName = ConfigUtil.getProperty("driver");
		WebDriver driver = null;
		switch (driverName) {
		case "chrome":
<<<<<<< HEAD
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
=======
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\petrachenkau\\Downloads\\FIREFOXDRIVER\\chromedriver.exe");
>>>>>>> 0971c5b62edc448c7117f9a9a70d0917cadcae09
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "iexplorer":
<<<<<<< HEAD
			System.setProperty("webdriver.ie.driver", "src\\main\\resources\\IEDriverServer.exe");
=======
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\petrachenkau\\Downloads\\FIREFOXDRIVER\\geckodriver.exe");
>>>>>>> 0971c5b62edc448c7117f9a9a70d0917cadcae09
			driver = new InternetExplorerDriver();
		default:
			throw new RuntimeException("Driver is not initialized!");
		}
		setDriverProperty(driver);
		return driver;
	}
<<<<<<< HEAD
	
	private static void setDriverProperty(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(implicit_wait, TimeUnit.SECONDS);
        DriverStorage.putWebDriver(Thread.currentThread().getId(), driver);
=======

	public static void setDriverProperty(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(implicit_wait_time, TimeUnit.SECONDS);
		DriverStorage.putWebDriver(Thread.currentThread().getId(), driver);
>>>>>>> 0971c5b62edc448c7117f9a9a70d0917cadcae09
	}

}
