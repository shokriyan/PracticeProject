package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;


public class AddEmployeePage extends BaseClass{
	
	@FindBy (how = How.ID , using = "firstName")
	private WebElement firstName; 
	
	@FindBy (how = How.ID, using = "lastName")
	private WebElement lastName; 
	
	@FindBy (how = How.ID, using = "middleName")
	private WebElement middleName; 
	
	@FindBy (how = How.ID, using = "employeeId")
	private WebElement employeeId; 
	
	@FindBy (how = How.ID, using = "btnSave")
	private WebElement btnSave; 
	
	public AddEmployeePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void SendFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	public void SendMiddleName(String midName) {
		middleName.sendKeys(midName);
	}
	
	public void SendLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	
	public void sendemployeeID(String empID) {
		employeeId.clear();
		employeeId.sendKeys(empID);
	}
	
	public String getEmployeeID() {
		return employeeId.getAttribute("value");
	}
	
	public void clickonSave() {
		btnSave.click();
	}

}
