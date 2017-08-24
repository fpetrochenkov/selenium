package by.softclub;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import by.softclub.pages.pageobjects.LogInPage;
import by.softclub.pages.pageobjects.MainPage;
import by.softclub.utils.DriverFactory;

public abstract class BaseTest {

	protected WebDriver driver;
	
	protected MainPage login() {
		LogInPage loginPage = PageFactory.initElements(driver, LogInPage.class);
	    loginPage.logIn();
		return PageFactory.initElements(driver, MainPage.class);
	}

	@BeforeTest
	public void startDriver() {
		driver = DriverFactory.getDriver();
	}

	@AfterClass(alwaysRun = true)
	public void stopDriver() {
		driver.quit();
	}
}