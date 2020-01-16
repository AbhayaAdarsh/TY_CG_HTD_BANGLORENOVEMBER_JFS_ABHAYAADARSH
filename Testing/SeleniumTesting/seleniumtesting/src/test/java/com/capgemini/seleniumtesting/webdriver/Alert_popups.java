package com.capgemini.seleniumtesting.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popups {
	static {
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/v1/index.php");
		driver.findElement(By.name("btnLogin")).submit();
		Alert alert =driver.switchTo().alert();
		String msg =alert.getText();
		System.out.println(msg);
		alert.accept();
	}
}
