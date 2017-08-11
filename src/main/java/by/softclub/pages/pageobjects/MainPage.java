package by.softclub.pages.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import by.softclub.pages.BasePage;

public class MainPage extends BasePage {

	/**
	 *  ����� ���� "��������" 
	 *  */
	@FindBy(xpath = "//*[@id='left-menu-form:tabView:left-menu-main-tree:0']/span/span[3]/span")
	private WebElement rootOperations;

	/** 
	 * ����� ���� "�����/�������� ��������� �� ����������" 
	 * */
	@FindBy(id = "left-menu-form:tabView:left-menu-main-tree:0_1")
	private WebElement reception_and_issuance_operations;

	/** 
	 * ������ �� ���������� 
	 * */
	@FindBy(id = "left-menu-form:tabView:left-menu-main-tree:0_1_0")
	private WebElement issuanceOperation;

	public MainPage(WebDriver driver) {
		super(driver);
	}

	/** 
	 * �������� ������ ���� "������ �� ����������" 
	 * */
	public IssuancePage openIssuancePage() {
		Actions builder = new Actions(getDriver());
		builder.click(rootOperations).click(reception_and_issuance_operations).click(issuanceOperation).perform();
		return PageFactory.initElements(getDriver(), IssuancePage.class);
	}

}
