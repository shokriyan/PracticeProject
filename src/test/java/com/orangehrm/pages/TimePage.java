package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;

public class TimePage extends BaseClass {

	@FindBy(how = How.ID, using = "employee")
	private WebElement employeeName;

	@FindBy(how = How.ID, using = "btnView")
	private WebElement btnView;

	@FindBy(how = How.XPATH, using = "//div[@class='message warning']")
	private WebElement errorMsg;

	@FindBy(how = How.XPATH, using = "//span[@for='employee']")
	private WebElement requiredMsg;

	public TimePage() {
		PageFactory.initElements(driver, this);
	}

	public void SendEmployeeName(String empName) {
		employeeName.click();
		employeeName.sendKeys(empName);
	}

	public void ClickonView() {
		btnView.click();
	}

	public boolean ErrorMassage() {
		return errorMsg.isDisplayed();
	}

	public boolean RequiredMsg() {
		return requiredMsg.isDisplayed();
	}

}
