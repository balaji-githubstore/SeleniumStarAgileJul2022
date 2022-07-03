package com.staragile.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3Javascript2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://phptravels.net/");  	

		//driver.findElement(By.id("checkin")).sendKeys("21-07-2022");

		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement ele1= driver.findElement(By.xpath("//input[@id='checkin']"));
		js.executeScript("arguments[0].value='28-07-2022'",ele1);
		
		WebElement ele2= driver.findElement(By.xpath("//input[@id='checkout']"));
		js.executeScript("arguments[0].value='28-08-2022'",ele2);
		
		WebElement ele3= driver.findElement(By.xpath("//a[text()='Tours']"));
		js.executeScript("arguments[0].click()",ele3);
		
		//scroll top to bottom
		js.executeScript("window.scrollBy(0,100)");
		
	}

}
