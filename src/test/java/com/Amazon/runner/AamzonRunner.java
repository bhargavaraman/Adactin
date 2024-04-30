package com.Amazon.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src//test//java//com//Amazon//feature",
glue = "com.Amazon.stepdefinition")
public class AamzonRunner {
	
	public static WebDriver driver; //driver-Null
	
	@BeforeClass
	
	public static void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	

}


