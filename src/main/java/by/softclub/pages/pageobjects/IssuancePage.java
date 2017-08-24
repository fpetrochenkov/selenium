package by.softclub.pages.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import by.softclub.pages.BasePage;

public class IssuancePage extends BasePage {

	@FindBy(xpath = "//h1[contains(text(), 'Выдача по документам')]")
	private WebElement header;

	@FindBy(id = "main-content-form:kind")
	private WebElement selectType;

	@FindBy(xpath = "//ul[li='Белорусский рубль']/li")
	private List<WebElement> cashKinds;

	@FindBy(id = "main-content-form:amount_input")
	private WebElement sum;

	@FindBy(id = "main-content-form:nextButton")
	private WebElement submitButton;

	public IssuancePage(WebDriver driver) {
		super(driver);
	}

	public UniversalCalculationPage fillCorrectData() {		
		selectType.click();
//		for (WebElement cashKind : cashKinds) {
//			if (cashType.equalsIgnoreCase(cashKind.getText())) {				
//				cashKind.click();				
//			}
//		}
//		sum.sendKeys(sumCash);
//		submitButton.click();		
		return PageFactory.initElements(getDriver(), UniversalCalculationPage.class);
	}

	public boolean isHeaderDisplayed() {
		if (header.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

}
