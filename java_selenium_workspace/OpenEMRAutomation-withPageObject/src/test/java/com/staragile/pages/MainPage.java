package com.staragile.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//methods for all menu handling
public class MainPage {
	private By patientLocator = By.xpath("//div[text()='Patient']");

	private WebDriver driver;
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getMainPageTitle() {
		return driver.getTitle();
	}
	
	public void waitForPresenceOfPatient()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(patientLocator));
	}

	public void clickOnPatient() {
		driver.findElement(patientLocator).click();
	}

}
