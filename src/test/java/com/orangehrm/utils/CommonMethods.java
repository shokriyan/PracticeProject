package com.orangehrm.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonMethods extends BaseClass{
	
	public void sendFieldValue(WebElement element , String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	public void clickOnlinks (String linkText) {
		WebElement element = driver.findElement(By.linkText(linkText));
		clickableWait(element);
		element.click();
	}

}
