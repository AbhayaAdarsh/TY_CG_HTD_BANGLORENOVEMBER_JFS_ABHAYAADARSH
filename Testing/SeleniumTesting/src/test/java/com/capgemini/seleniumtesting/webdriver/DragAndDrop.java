package com.capgemini.seleniumtesting.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static {
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		//driver.findElement(By.xpath("//div[@id= 'sidebar']/descendant:ul/li/a[]"));// Instead of this we write below line
		driver.findElement(By.id("sidebar"));
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions action = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		action.dragAndDrop(drag, drop).perform();
		}
}
