package com.staragile.test;

import org.testng.annotations.Test;

import com.staragile.utilities.DataUtils;

public class PatientTest {
	
	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void addPatientTest(String username,String password,String firstname,String lastname,String dob)
	{
		System.out.println(username);
		System.out.println(password);
	}

	
//	@Test
//	public void addPatientTest(String username,String password,String firstname,String lastname,String dob,String gender,String expectedAlert,String expectedPatientName)
//	{
//		
//	}

}
