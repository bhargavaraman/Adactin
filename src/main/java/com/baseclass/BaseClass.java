package com.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String type) {
		
		if(type.equalsIgnoreCase("chrome")){
			
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
				
		driver.manage().window().maximize();
	}
		else if (type.equalsIgnoreCase("firefox")){
			
			WebDriverManager.firefoxdriver().setup();
			
			driver= new FirefoxDriver();
						
			driver.manage().window().maximize();
		}
		return driver;
	}
public static  void getMethod(String url) {

	driver.get(url);
}
public void clickMethod(WebElement element) {

	element.click();
}
public void sendKeysMethod(WebElement element,String input) {

	element.sendKeys(input);
}
}
