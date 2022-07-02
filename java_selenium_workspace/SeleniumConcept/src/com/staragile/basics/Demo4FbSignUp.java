package com.staragile.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4FbSignUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		

		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Balaji");
		driver.findElement(By.name("lastname")).sendKeys("Dinakaran");
		driver.findElement(By.name("reg_email__")).sendKeys("7887878");
		
		//20 Dec 2000
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		Select selectMon=new Select(driver.findElement(By.id("month")));
		selectMon.selectByVisibleText("Dec");
		
		//year as 2000
		Select selectYear=new Select(driver.findElement(By.id("year")));
		selectYear.selectByValue("2000");
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//click on submit
		driver.findElement(By.name("websubmit")).click();
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.gmail.com/");
		
		//read mail using java program
//		https://docs.oracle.com/cd/E18930_01/html/821-2418/fwfiy.html
		
		
	}

}
