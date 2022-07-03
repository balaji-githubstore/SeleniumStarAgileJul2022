package com.staragile.pages;

import org.openqa.selenium.By;

import com.staragile.hooks.AutomationHooks;
//methods for all menu handling
public class MainPage {
	private static By patientLocator=By.xpath("//div[text()='Patient']");
	
	public static String getMainPageTitle()
	{
		return AutomationHooks.driver.getTitle();
	}

	public static void clickOnPatient()
	{
		AutomationHooks.driver.findElement(patientLocator).click();
	}
	
}
