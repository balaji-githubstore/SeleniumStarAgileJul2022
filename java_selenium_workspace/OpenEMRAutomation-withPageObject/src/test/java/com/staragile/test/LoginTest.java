package com.staragile.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.staragile.base.WebDriverWrapper;
import com.staragile.pages.LoginPage;
import com.staragile.pages.MainPage;
import com.staragile.utilities.DataUtils;
	
public class LoginTest extends WebDriverWrapper {

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void validCredentialTest(String username, String password, String expectedTitle) {

		LoginPage login=new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();
		
		MainPage main=new MainPage(driver);
		main.waitForPresenceOfPatient();

		String actualTitle = main.getMainPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void invalidCredentialTest(String username,String password,String expectedError) {
		LoginPage login=new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();
		
		String actualError =login.getInvalidErrorMessage();

		Assert.assertEquals(actualError, expectedError);
	}

}
