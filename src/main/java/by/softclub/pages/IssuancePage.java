package by.softclub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class IssuancePage extends BasePage {

	public IssuancePage(WebDriver driver) {
		super(driver);
	}
	
	public UniversalCalculationPage enterValidData(String summ) {
		Actions builder = new Actions(getDriver());
		builder.click(getDriver().findElement(By.xpath("//div[@id='main-content-form:kind']"))).
		click(getDriver().findElement(By.xpath("//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'][contains(text(),'Äמככאנ ÑØÀ')]")))
		.perform();
		WebElement sum = getDriver().findElement(By.id("main-content-form:amount_input"));
		sum.sendKeys(summ);
		builder.sendKeys(sum, summ).perform();
		getDriver().findElement(By.id("main-content-form:nextButton")).click();
		return new UniversalCalculationPage(getDriver());
	}	

	

}
