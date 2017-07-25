package by.softclub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends BasePage {

	public MainPage(WebDriver driver) {
		super(driver);
	}
	
	public IssuancePage openIssuancePage() {
		Actions builder = new Actions(getDriver());
		builder.click(getDriver().findElement(By.xpath("//*[@id='left-menu-form:tabView:left-menu-main-tree:0']/span/span[3]/span")))
		.click(getDriver().findElement(By.id("left-menu-form:tabView:left-menu-main-tree:0_1")))
		.click(getDriver().findElement(By.id("left-menu-form:tabView:left-menu-main-tree:0_1_0"))).perform();
		return new IssuancePage(getDriver());
	}
	


}
