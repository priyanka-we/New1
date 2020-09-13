package com.we.admit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrialTest {
	public static void main(String[] args)
	{
		
		
	System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftwares\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://app-dev.weadmit.io/");
	driver.findElement(By.id("username")).sendKeys("wstudent");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Cheryl123@");
	driver.findElement(By.xpath("//span[text()='SIGN IN']")).click();
	}
	

}
