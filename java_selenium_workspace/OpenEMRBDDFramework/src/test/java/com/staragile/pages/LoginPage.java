package com.staragile.pages;

import org.openqa.selenium.By;

import com.staragile.hooks.AutomationHooks;

public class LoginPage {
	
	private static By usernameLocator = By.id("authUser");
	private static By passwordLocator = By.id("clearPass");
	private static By loginLocator = By.id("login-button");
	private static By ackLicCerLocator = By.partialLinkText("Cert");
	private static By errorLocator = By.xpath("//div[contains(text(),'Invalid')]");

	public static void enterUsername(String username) {
		AutomationHooks.driver.findElement(usernameLocator).sendKeys(username);
	}

	public static void enterPassword(String password) {
		AutomationHooks.driver.findElement(passwordLocator).sendKeys(password);
	}

	public static void clickOnLogin() {
		AutomationHooks.driver.findElement(loginLocator).click();
	}

	public static void clickOnAckLicCert() {
		AutomationHooks.driver.findElement(ackLicCerLocator).click();
	}

	public static String getInvalidErrorMessage() {
		return AutomationHooks.driver.findElement(errorLocator).getText();
	}

}
