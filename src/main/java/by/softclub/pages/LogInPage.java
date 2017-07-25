package by.softclub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import by.softclub.utils.ConfigUtil;

public class LogInPage extends BasePage {
	
	private final static String loginPage = ConfigUtil.getProperty("url");

	public LogInPage(WebDriver driver) {
		super(driver);
	}
	
	public MainPage logIn(String user, String password) {
		getDriver().findElement(By.id("j_username")).sendKeys(user);
		getDriver().findElement(By.id("j_password")).sendKeys(password);
		getDriver().findElement(By.id("loginButton")).click();
		return new MainPage(getDriver());
	}
	
	public LogInPage getLogInPage() {
		getDriver().get(loginPage);
		return new LogInPage(getDriver());
	}

}
