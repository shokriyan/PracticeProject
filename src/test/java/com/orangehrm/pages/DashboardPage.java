package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;


public class DashboardPage extends BaseClass{
	
	@FindBy (how = How.ID, using = "welcome")
	private WebElement welcomeLink; 
	
	@FindBy (how = How.XPATH, using = "//img[contains(@src,'Timesheet')]")
	private WebElement timeSheetBtn;
	
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyLoginUser() {
		
		String userText = (welcomeLink.getText()).substring(8); 
		return userText;
	}
	
	public void ClickonTimesheet() {
		timeSheetBtn.click();
	}
	

}
