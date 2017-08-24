package by.softclub.pages.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import by.softclub.pages.BasePage;

public class UniversalCalculationPage extends BasePage {
	
	@FindBy(xpath = "//legend[contains(text(),'Расчет с клиентом')]")
	private WebElement logo;
	
	public UniversalCalculationPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean isUniversalPageOpened() {
		if(logo.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

}
