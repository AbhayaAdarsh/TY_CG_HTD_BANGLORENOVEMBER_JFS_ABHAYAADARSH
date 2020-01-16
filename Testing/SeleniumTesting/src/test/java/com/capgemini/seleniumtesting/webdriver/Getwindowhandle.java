package com.capgemini.seleniumtesting.webdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandle {
static {
	System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://www.naukri.com/");
	Set<String> whs= driver.getWindowHandles();
	System.out.println("number of windows:"+ whs.size());//here it can open 1 parent & 3 child windows.
	System.out.println(whs);
	driver.quit();
	
}
}