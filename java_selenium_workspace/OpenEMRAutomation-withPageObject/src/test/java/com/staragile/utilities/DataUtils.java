package com.staragile.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider
	public String[][] commonDataProvider(Method method) throws IOException 
	{
		//@Test method name and sheetname will be same
		
		String testMethodName=method.getName();
		System.out.println(testMethodName);
		
		
		String[][] main = ExcelUtils.getSheetIntoTwoDimArray("test_data/OpenEMRData.xlsx", testMethodName);
		return main;
	}
	

//	@DataProvider
//	public String[][] validCredentialData() throws IOException 
//	{
//		String[][] main = ExcelUtils.getSheetIntoTwoDimArray("test_data/OpenEMRData.xlsx", "validCredentialTest");
//		return main;
//	}
//
//	@DataProvider
//	public String[][] invalidCredentialData() throws IOException 
//	{
//		String[][] main = ExcelUtils.getSheetIntoTwoDimArray("test_data/OpenEMRData.xlsx", "invalidCredentialTest");
//		return main;
//	}

//	@DataProvider
//	public String[][] invalidCredentialData() {
//		String[][] main = new String[2][3];
//
//		main[0][0] = "peter";
//		main[0][1] = "peter123";
//		main[0][2] = "Invalid username or password";
//
//		main[1][0] = "paul";
//		main[1][1] = "paul123";
//		main[1][2] = "Invalid username or password";
//
//		return main;
//	}
}
