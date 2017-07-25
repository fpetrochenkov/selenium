package by.softclub;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import by.softclub.pages.IssuancePage;
import by.softclub.pages.LogInPage;
import by.softclub.pages.MainPage;
import by.softclub.pages.UniversalCalculationPage;
import by.softclub.utils.ConfigUtil;


public class IssuanceTests extends BaseTest {
	
	private IssuancePage openIssuancePage() {
		LogInPage loginPage = new LogInPage(driver).getLogInPage();
	    MainPage mainPage = loginPage.logIn(ConfigUtil.getProperty("user"), ConfigUtil.getProperty("password"));
	    IssuancePage issuancePage = mainPage.openIssuancePage();	    
	    return issuancePage;
	}
	
	@Test
	public void testOpenIssuancePage() {
		openIssuancePage();	  
		Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed());
		openIssuancePage().quitPage();
	    driver.close();
	}
	
	@Test
	public void testIssuancePageWithValidData() {
		openIssuancePage();
	    UniversalCalculationPage universalPage = openIssuancePage().enterValidData("10");
	    Assert.assertTrue(driver.findElement(By.tagName("legend")).isDisplayed());
	    universalPage.quitPage();
	    driver.close();	    
	}
	
	@Test
	public void testMinCashValueControl() {
		openIssuancePage();
		openIssuancePage().enterValidData("10");
		Assert.assertTrue(driver.findElement(By.className("ui-messages-error-summary")).isDisplayed());
	}

}
