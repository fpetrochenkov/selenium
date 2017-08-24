package by.softclub.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import by.softclub.pages.pageobjects.LogInPage;
import by.softclub.utils.ConfigUtil;

public abstract class BasePage {

	private WebDriver driver;
	private final static String LOGINPAGE = ConfigUtil.getProperty("url");
	
	@FindBy(id = "header-form:logoutLink")
	private WebElement logout;
    
    public BasePage(WebDriver driver) {
        this.driver = driver;
        driver.get(LOGINPAGE);
    }
	    
    public WebDriver getDriver() {
    	return driver;
    }
    
	public LogInPage quitPage() {
		logout.click();		
		return PageFactory.initElements(getDriver(), LogInPage.class);
	}
    
}
