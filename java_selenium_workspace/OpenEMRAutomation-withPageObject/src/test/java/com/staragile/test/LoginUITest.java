package com.staragile.test;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.staragile.base.WebDriverWrapper;

public class LoginUITest extends WebDriverWrapper {
	
	@Test
	public void validateTitleTest() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OpenEMR Login");
	}

	@Test
	public void validateAppDescription() {
		String actualText = driver.findElement(By.xpath("//p[contains(text(),'most')]")).getText();
		Assert.assertEquals(actualText,
				"The most popular open-source Electronic Health Record and Medical Practice Management solution.");
	}
}
