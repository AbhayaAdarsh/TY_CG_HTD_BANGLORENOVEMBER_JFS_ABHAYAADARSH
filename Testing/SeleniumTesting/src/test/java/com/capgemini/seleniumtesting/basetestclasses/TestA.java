package com.capgemini.seleniumtesting.basetestclasses;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestA extends BaseTestA{
	static {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	}
	@Test
	public void test1() {
		Reporter.log("testA1",true);
	}
	
	@Test
	public void test2() {
		Reporter.log("testA2",true);
	}
}
