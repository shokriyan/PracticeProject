package com.orangehrm.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.BaseClass;

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
	
	@AfterMethod
	public void closingWindows() {
		base = new BaseClass(); 
		base.teardown(); 
	}

}
