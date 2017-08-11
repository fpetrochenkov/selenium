package by.softclub.pages.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import by.softclub.pages.BasePage;
import by.softclub.utils.ConfigUtil;

public class LogInPage extends BasePage {	
		
	@FindBy(id = "j_username")
	private WebElement user;
	
	@FindBy(id = "j_password")
	private WebElement password;
	
	@FindBy(id = "loginButton")
    private WebElement loginButton;
	
	public LogInPage(WebDriver driver) {
		super(driver);
		
	}
	
	public MainPage logIn() {
		user.sendKeys(ConfigUtil.getProperty("user"));
		password.sendKeys(ConfigUtil.getProperty("password"));
		loginButton.click();
		return PageFactory.initElements(getDriver(), MainPage.class);
	}

}
