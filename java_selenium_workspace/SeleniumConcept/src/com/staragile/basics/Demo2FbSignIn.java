package com.staragile.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FbSignIn {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("bala1234@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("welcome123");
		
		//click on login
		driver.findElement(By.name("login")).click();
	}

}
