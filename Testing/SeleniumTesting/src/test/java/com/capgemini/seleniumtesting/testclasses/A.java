package com.capgemini.seleniumtesting.testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
	static {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	}

	@Test
	public static void demo3() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotstar.com");
		Reporter.log("from testdemo demo3", true);
	}
	//make these 2 in one class to run it parllel
	@Test
	public static void demo4() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		Reporter.log("from testdemo demo4", true);
	}
	
	@Test
	public static void demo5() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		Reporter.log("from testdemo demo5", true);
	}
}
