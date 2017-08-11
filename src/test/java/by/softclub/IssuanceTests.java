package by.softclub;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import by.softclub.pages.pageobjects.IssuancePage;
import by.softclub.pages.pageobjects.LogInPage;
import by.softclub.pages.pageobjects.MainPage;
import by.softclub.pages.pageobjects.UniversalCalculationPage;


public class IssuanceTests extends BaseTest {

	/*
	@Test
	private IssuancePage openIssuancePage() {
		LogInPage loginPage = new LogInPage(driver).getLogInPage();
	    MainPage mainPage = loginPage.logIn(ConfigUtil.getProperty("user"), ConfigUtil.getProperty("password"));
	    IssuancePage issuancePage = mainPage.openIssuancePage();	    
	    return issuancePage;
	}
	*/
	
	@Test
	public void testOpenIssuancePage() {
		LogInPage loginPage = PageFactory.initElements(driver, LogInPage.class);
		MainPage mainPage = loginPage.logIn();
		IssuancePage issuancePage = mainPage.openIssuancePage();
		assertTrue(issuancePage.isHeaderDisplayed(), "The Issuance by order page isn't opened");
	}
	
	/*	
	@Test
	public void testOpenIssuancePage() {
		openIssuancePage();	  
		Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed());
		openIssuancePage().quitPage();
	}
	
	@Test
	public void testIssuancePageWithValidData() {
		openIssuancePage();
	    UniversalCalculationPage universalPage = openIssuancePage().enterValidData("10");
	    Assert.assertTrue(driver.findElement(By.tagName("legend")).isDisplayed());
	    universalPage.quitPage();
	}
	
	@Test
	public void testMinCashValueControl() {
		openIssuancePage();
		openIssuancePage().enterValidData("10");
		Assert.assertTrue(driver.findElement(By.className("ui-messages-error-summary")).isDisplayed());
	}
*/

}
