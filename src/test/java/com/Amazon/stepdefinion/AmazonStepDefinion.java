package com.Amazon.stepdefinion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Amazon.runner.AamzonRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class AmazonStepDefinion {
	public static WebDriver driver=AamzonRunner.driver;
	@Given("^the user is on the Amazon homepage$")
	public void the_user_is_on_the_Amazon_homepage() throws Throwable {
		driver.get("https://www.amazon.in/");
	}
	@When("^the user enters HardDisk into the search bar$")
	public void the_user_enters_HardDisk_into_the_search_bar() throws Throwable {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("HardDisk");
	}

	@When("^the user clicks on the search button$")
	public void the_user_clicks_on_the_search_button() throws Throwable {
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}

	@Then("^the search results page should be displayed$")
	public void the_search_results_page_should_be_displayed() throws Throwable {
		
	}



}
