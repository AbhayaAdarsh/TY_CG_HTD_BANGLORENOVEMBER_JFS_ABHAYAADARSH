package com.capgemini.seleniumtesting.testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class B {
	static {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	}

	@Test
	public static void demo2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		Reporter.log("from testdemo demo2", true);
	}
}
