package by.softclub;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import by.softclub.utils.DriverFactory;

public class BaseTest {

	WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void startDriver() {
		driver = DriverFactory.getDriver();
	}
	
	@AfterClass(alwaysRun = true)
	public void stopDriver() {
		driver.close();
	}
	
}
