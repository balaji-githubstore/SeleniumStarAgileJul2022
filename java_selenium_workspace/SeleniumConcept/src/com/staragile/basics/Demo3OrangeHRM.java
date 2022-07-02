package com.staragile.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); //no time limit 
		

		WebElement element= driver.findElement(By.id("txtUsername")); //takes only 0.5s to check for presence of element
		element.sendKeys("Admin");

		//enter password as admin123
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//click on login 
		driver.findElement(By.id("btnLogin")).click();
		
		//click on welcome
		driver.findElement(By.id("welcome")).click();
	    
		//click on logout
		driver.findElement(By.linkText("Logout")).click();

		driver.quit();
	}
}
