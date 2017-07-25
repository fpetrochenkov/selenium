package by.softclub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import by.softclub.utils.ConfigUtil;

public class BasePage {

	private WebDriver driver;
//    private final String url;
    
    public BasePage(WebDriver driver) {
        this.driver = driver;
//        this.url = ConfigUtil.getProperty("url");
    }
    
//    public void openPage() {
//    	driver.get(url);
//    } 
	
    public WebDriver getDriver() {
    	return driver;
    }
    
	public LogInPage quitPage() {
		getDriver().findElement(By.id("header-form:logoutLink")).click();
		return new LogInPage(getDriver());
	}
    
}
