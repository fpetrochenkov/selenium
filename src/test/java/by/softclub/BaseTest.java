package by.softclub;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import by.softclub.utils.DriverFactory;

public class BaseTest {

	protected WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void startDriver() {
		driver = DriverFactory.getDriver();
	}
	
<<<<<<< HEAD
	@AfterMethod(alwaysRun = true)
	public void stopDriver() {
		driver.quit();
=======
	@AfterClass(alwaysRun = true)
	public void stopDriver() {
		driver.close();
>>>>>>> 0971c5b62edc448c7117f9a9a70d0917cadcae09
	}
	
}
