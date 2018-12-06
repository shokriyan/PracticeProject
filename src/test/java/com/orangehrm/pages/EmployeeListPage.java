package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;


public class EmployeeListPage extends BaseClass{
	
	@FindBy (how = How.XPATH, using = "//div[@id='profile-pic']/h1")
	private WebElement employeeName;
	
	public EmployeeListPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getEmployeeName() {
		return employeeName.getText();
	}

}
