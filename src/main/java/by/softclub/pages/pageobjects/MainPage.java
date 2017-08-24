package by.softclub.pages.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import by.softclub.pages.BasePage;

public class MainPage extends BasePage {

	/**
	 * ����� ���� "��������"
	 */
	@FindBy(xpath = "//span[strong = '��������']")
	private WebElement rootOperations;

	/**
	 * ����� ���� "�����/�������� ��������� �� ����������"
	 */
	// @FindBy(id = "left-menu-form:tabView:left-menu-main-tree:0_1")
	@FindBy(xpath = "//li[@id='left-menu-form:tabView:left-menu-main-tree:0_1']")
	private WebElement reception_and_issuance_operations;

	/**
	 * ������ �� ����������
	 */
	// @FindBy(id = "left-menu-form:tabView:left-menu-main-tree:0_1_0")
	@FindBy(xpath = "//span[contains(text(), '������ �� ����������')]")
	private WebElement issuanceOperation;

	@FindBy(css = "i.logo")
	private WebElement logo;

	public MainPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * �������� ������ ���� "������ �� ����������"
	 */
	public IssuancePage openIssuancePage() {
		rootOperations.click();
		reception_and_issuance_operations.click();
		issuanceOperation.click();
		return PageFactory.initElements(getDriver(), IssuancePage.class);
	}

	public boolean isLogoDisplayed() {
		if (logo.isDisplayed()) {
			return true;
		} else
			return false;
	}

}
