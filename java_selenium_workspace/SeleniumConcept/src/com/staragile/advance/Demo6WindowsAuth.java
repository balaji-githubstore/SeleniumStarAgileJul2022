package com.staragile.advance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6WindowsAuth {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.get("http://username:password@softwaretesting.com");
		driver.get("https://softwaretesting.com/");
		
		Robot robot =new Robot();
		
		String username="hello123";
		String password="welcome123";
		
		//robot.keyPress(KeyEvent.VK_C);
		
		for(int i=0;i<username.length();i++)
		{
			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(username.charAt(i)));
			Thread.sleep(500);
		}
		
		robot.keyPress(KeyEvent.VK_TAB);
		
		for(int i=0;i<password.length();i++)
		{
			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(password.charAt(i)));
			Thread.sleep(500);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
	}
}
