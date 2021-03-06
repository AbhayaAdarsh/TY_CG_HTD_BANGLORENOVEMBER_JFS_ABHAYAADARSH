package com.capgemini.seleniumtesting.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti {
	static {
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		//TO OPEN LOGIN PAGE WITH USERNAME AND PASSWORD
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

}
