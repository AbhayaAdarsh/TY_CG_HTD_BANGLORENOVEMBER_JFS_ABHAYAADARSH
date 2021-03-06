package com.capgemini.seleniumtesting.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	static {
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	}
	@Test
	public void test1() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String actual=driver.getTitle();
		String expected="actiTIME";//here it stop the program it won't allow code to run further 
		Assert.assertEquals(actual, expected);//assert terminate the program and not allow execution .
		driver.close();
	}
	
	@Test
	public void test2() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String actual=driver.getTitle();
		String expected="actiTIME";
		SoftAssert s = new SoftAssert();// After failing it will execute by using softassert
		s.assertEquals(actual, expected);//it is mandatory to write after softassert ,it is call at last to check whether method is running or not
		driver.close();
		s.assertAll();
	}
}
