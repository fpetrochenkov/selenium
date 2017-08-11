package by.softclub.pages.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import by.softclub.pages.BasePage;

public class IssuancePage extends BasePage {
	
	@FindBy(tagName = "h1")
	private WebElement header;

	public IssuancePage(WebDriver driver) {
		super(driver);
	}
	
	public UniversalCalculationPage enterValidData(String summ) {
		Actions builder = new Actions(getDriver());
		builder.click(getDriver().findElement(By.xpath("//div[@id='main-content-form:kind']"))).
		click(getDriver().findElement(By.xpath("//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'][contains(text(),'Доллар США')]")))
		.perform();
		WebElement sum = getDriver().findElement(By.id("main-content-form:amount_input"));
		sum.sendKeys(summ);
		builder.sendKeys(sum, summ).perform();
		getDriver().findElement(By.id("main-content-form:nextButton")).click();
		return PageFactory.initElements(getDriver(), UniversalCalculationPage.class);
	}	
	
	/** 
	 * Проверка открытия формы "Выдача по документам"
	 * */
	public boolean isHeaderDisplayed() {
		if(header.isDisplayed()) {
			return true;
		} else return false;
	}

	

}
