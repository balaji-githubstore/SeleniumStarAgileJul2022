package com.staragile.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2OrangeHRMCSS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");  	

		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");

		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();

		driver.quit();
	}

}
