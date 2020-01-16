package com.capgemini.seleniumtesting.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	}

	@Test
	public static void demo1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Reporter.log("from testdemo demo1", true);
	}

}
