package com.staragile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

	private By usernameLocator = By.id("authUser");
	private By passwordLocator = By.id("clearPass");
	private By loginLocator = By.id("login-button");
	private By ackLicCerLocator = By.partialLinkText("Cert");
	private By errorLocator = By.xpath("//div[contains(text(),'Invalid')]");
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enterUsername(String username) {
		driver.findElement(usernameLocator).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}

	public void clickOnLogin() {
		driver.findElement(loginLocator).click();
	}

	public void clickOnAckLicCert() {
		driver.findElement(ackLicCerLocator).click();
	}

	public String getInvalidErrorMessage() {
		return driver.findElement(errorLocator).getText();
	}

}
