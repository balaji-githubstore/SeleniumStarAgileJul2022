package com.staragile.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1Excel {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("test_data/OpenEMRData.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(file);

		XSSFSheet sheet = book.getSheet("validCredentialTest");
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] main=new String[rowCount-1][cellCount];
		
		DataFormatter format=new DataFormatter();
	
		for (int r = 1; r < rowCount; r++) 
		{
			for (int c = 0; c < cellCount; c++) 
			{
				String value = format.formatCellValue(sheet.getRow(r).getCell(c));
				System.out.println(value);
				main[r-1][c]=value;
			}
		}

		System.out.println();
	}

}
