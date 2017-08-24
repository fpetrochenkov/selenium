package by.softclub;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import by.softclub.pages.pageobjects.IssuancePage;
import by.softclub.pages.pageobjects.LogInPage;
import by.softclub.pages.pageobjects.MainPage;
import by.softclub.pages.pageobjects.UniversalCalculationPage;


public class IssuanceTests extends BaseTest {
	

/*	@Test
	public void testLogin() {
		MainPage mainPage = login();
		assertTrue(mainPage.isLogoDisplayed(), "Main page isn't opened");
		mainPage.quitPage();
	} */
	
//	@Test
//	public void testOpenIssuancePage() {
//		MainPage mainPage = login();
//		IssuancePage issuancePage = mainPage.openIssuancePage();
//		assertTrue(issuancePage.isHeaderDisplayed(), "Issuance page is not opened");
//		issuancePage.quitPage();
//	} 
	
	@Test
	public void testFillingCorrectData() {
		MainPage mainPage = login();
		IssuancePage isPage = mainPage.openIssuancePage();
		UniversalCalculationPage uniPage = isPage.fillCorrectData();
//		assertTrue(uniPage.isUniversalPageOpened(), "Universal page is not opened");
//		uniPage.quitPage();
	}
	


}
