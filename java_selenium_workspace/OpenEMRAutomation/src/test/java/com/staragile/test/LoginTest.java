package com.staragile.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.staragile.base.WebDriverWrapper;
import com.staragile.utilities.DataUtils;
	
public class LoginTest extends WebDriverWrapper {

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void validCredentialTest(String username, String password, String expectedTitle) {
		driver.findElement(By.id("authUser")).sendKeys(username);
		driver.findElement(By.id("clearPass")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Patient']")));

		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void invalidCredentialTest(String username,String password,String expectedError) {
		driver.findElement(By.id("authUser")).sendKeys(username);
		driver.findElement(By.id("clearPass")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();

		String actualError = driver.findElement(By.xpath("//div[contains(text(),'Invalid')]")).getText();

		Assert.assertEquals(actualError, expectedError);
	}

}
