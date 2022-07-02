package com.staragile.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.staragile.hooks.AutomationHooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps1 {

	@Given("I have browser with openemr application")
	public void i_have_browser_with_openemr_application() 
	{
		WebDriverManager.chromedriver().setup();
		
		AutomationHooks.driver = new ChromeDriver();
		AutomationHooks.driver.manage().window().maximize();
		AutomationHooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		AutomationHooks.driver.get("https://demo.openemr.io/b/openemr");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) 
	{
		AutomationHooks.driver.findElement(By.id("authUser")).sendKeys(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) 
	{
		AutomationHooks.driver.findElement(By.id("clearPass")).sendKeys(password);
	}

	@When("I click on login")
	public void i_click_on_login() 
	{
		AutomationHooks.driver.findElement(By.id("login-button")).click();
	}

	@Then("I should get access to portal with title as {string}")
	public void i_should_get_access_to_portal_with_title_as(String expectedTitle) 
	{
		String actualTitle = AutomationHooks.driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
