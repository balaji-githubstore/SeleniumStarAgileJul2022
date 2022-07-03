package com.staragile.advance;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6FindElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://google.com/");
		
		//click on present otherwise ignore 
		
		//element is present if size >0 
		if(driver.findElements(By.xpath("//a[text()='Images']")).size()>0)
		{
			driver.findElement(By.xpath("//a[text()='Images']")).click();
		}
		
		
	}
}
