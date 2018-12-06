package com.orangehrm.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.BaseClass;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.ConfigReader;

public class LoginPageTest {
	
	BaseClass base; 
	
	@BeforeMethod
	@Parameters ({"browser"})
	public void lunchTest(String browser) {
		base = new BaseClass(); 
		BaseClass.initialSetup(browser);
	}
	
	@Test
	public void VerifyLogoInMainPage() {
		LoginPage login = new LoginPage(); 
		boolean exists = login.VerifyLogo();
		
		Assert.assertTrue(exists);
	}
	
	@Test
	public void LoginWithAdminUser() {
		LoginPage login = new LoginPage(); 
		ConfigReader config = new ConfigReader(); 
		String uname = config.getUserName(); 
		String pass = config.getPassword();
		
		CommonMethods.sendFieldValue(login.username, uname);
		CommonMethods.sendFieldValue(login.password, pass);
		CommonMethods.clickOnButtons(login.btnLogin);
		
		String actualUSer = login.loggedUser();
		Assert.assertEquals(actualUSer, uname);
		
	}
	
	@AfterMethod
	public void closingWindows() {
		base = new BaseClass(); 
		base.teardown(); 
	}
	


}
