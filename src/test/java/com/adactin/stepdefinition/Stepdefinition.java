package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adacitn.runner.RunnerClass;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	
	public static WebDriver driver=RunnerClass.driver;
	
	@Given("^User Lanch the Adactin Application$")
	public void user_Lanch_the_Adactin_Application() throws Throwable {
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	}
	@When("^User Enter the \"([^\"]*)\" in Username Filed$")
	public void user_Enter_the_in_Username_Filed(String Uname) throws Throwable {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("jivita04");  
	}

	@When("^User Enter the \"([^\"]*)\" in Password Filed$")
	public void user_Enter_the_in_Password_Filed(String Pass) throws Throwable {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
	}

/*
	@When("^User Enter the Username in Username Filed$")
	public void user_Enter_the_Username_in_Username_Filed() throws Throwable {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("jivita04");
	}

	@When("^User Enter the invalid  Password in Password Filed$")
	public void user_Enter_the_invalid_Password_in_Password_Filed() throws Throwable {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
	    throw new PendingException();
	}

	@When("^user Click on the Login Button$")
	public void user_Click_on_the_Login_Button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	    throw new PendingException();
	}

	@Then("^Error Message Should be Displayed indicates Invalid Login Details$")
	public void error_Message_Should_be_Displayed_indicates_Invalid_Login_Details() throws Throwable {
		
	    throw new PendingException();
	}

	@When("^User Clicks on Forgot Password Link and it Navigates to Forgot Password Page$")
	public void user_Clicks_on_Forgot_Password_Link_and_it_Navigates_to_Forgot_Password_Page() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
	    throw new PendingException();
	}

	@When("^User Enter their Registerd Email Address in Email Filed$")
	public void user_Enter_their_Registerd_Email_Address_in_Email_Filed() throws Throwable {

		throw new PendingException();
	}

	@When("^Enter the Email Password Button Email is Sent to User Email Address$")
	public void enter_the_Email_Password_Button_Email_is_Sent_to_User_Email_Address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User Clicks Click Hear to Login page Link and it Navigates To Login Page$")
	public void user_Clicks_Click_Hear_to_Login_page_Link_and_it_Navigates_To_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User Enter the Password in Password Filed$")
	public void user_Enter_the_Password_in_Password_Filed() throws Throwable {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
	}*/

	@Then("^User Click on  the Login Button and it Navigates to Search Hotel Page$")
	public void user_Click_on_the_Login_Button_and_it_Navigates_to_Search_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@When("^User Select the Location in  Select Location Dropdown Menu$")
	public void user_Select_the_Location_in_Select_Location_Dropdown_Menu() throws Throwable {
		WebElement location=driver.findElement(By.xpath("//select[@id='location']"));
		Thread.sleep(1000);
		Select s=new Select(location);
		s.selectByIndex(3);
		
	}

	@When("^User Select the Hotel in Select Hotel Dropdown Menu$")
	public void user_Select_the_Hotel_in_Select_Hotel_Dropdown_Menu() throws Throwable {
		WebElement hotel=driver.findElement(By.xpath("//select[@id='hotels']"));
		Thread.sleep(1000);
		Select s1=new Select(hotel);
		s1.selectByValue("Hotel Cornice");
	}

	@When("^User Select the Room Type in Select Room Type Dropdown Menu$")
	public void user_Select_the_Room_Type_in_Select_Room_Type_Dropdown_Menu() throws Throwable {
		WebElement roomtype=driver.findElement(By.xpath("//select[@name='room_type']"));
		Thread.sleep(1000);
		Select s3=new Select(roomtype);
		s3.selectByVisibleText("Super Deluxe");
	}

	@When("^User Select the Number of Rooms in Number of Rooms Dropdown Menu$")
	public void user_Select_the_Number_of_Rooms_in_Number_of_Rooms_Dropdown_Menu() throws Throwable {
		WebElement numberOfRooms=driver.findElement(By.xpath("//select[@name='room_nos']"));
		Thread.sleep(1000);
		Select s4=new Select(numberOfRooms);
		s4.selectByIndex(3);
	}

	@When("^User Enter the Check in Date in Check in Date Menu$")
	public void user_Enter_the_Check_in_Date_in_Check_in_Date_Menu() throws Throwable {
		driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("27/04/2024");
	}

	@When("^User Enter the Check Out Date in Check Out Date Menu$")
	public void user_Enter_the_Check_Out_Date_in_Check_Out_Date_Menu() throws Throwable {
		driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("28/04/2024");
	}

	@When("^User Select the Number of Adults in Adults Per Room Dropdown Menu$")
	public void user_Select_the_Number_of_Adults_in_Adults_Per_Room_Dropdown_Menu() throws Throwable {
		WebElement adultRooms=driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s5=new Select(adultRooms);
		s5.selectByIndex(2);
	}

	@When("^User Selcet the Number of Childrens in Children per Room Dropdown Menu$")
	public void user_Selcet_the_Number_of_Childrens_in_Children_per_Room_Dropdown_Menu() throws Throwable {
		WebElement childRooms=driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s6=new Select(childRooms);
		s6.selectByIndex(1);
	}

	@Then("^User Clicks on  the Search Button and it Navigates to Book a Hotel Page$")
	public void user_Clicks_on_the_Search_Button_and_it_Navigates_to_Book_a_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@When("^User clicks Radiobutton to Select the Hotel from the list of hotels shown in the page$")
	public void user_clicks_Radiobutton_to_Select_the_Hotel_from_the_list_of_hotels_shown_in_the_page() throws Throwable {
		WebElement radiobutton = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		radiobutton.click();
	}
	@When("^User Clicks on the Continue Button It will Navigates to Book a Hotel Page$")
	public void user_Clicks_on_the_Continue_Button_It_will_Navigates_to_Book_a_Hotel_Page() throws Throwable {
	
		driver.findElement(By.xpath("//input[@name='continue']")).click();
	}
/*
	@Then("^It will Navigates to Book a Hotel Page$")
	public void it_will_Navigates_to_Book_a_Hotel_Page() throws Throwable {

		throw new PendingException();
	}

	}
*/
	@When("^User Check the Hotel Details and Billing Price$")
	public void user_Check_the_Hotel_Details_and_Billing_Price() throws Throwable {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");//Scroll down
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-2000)");//scroll up
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,3000)");	}
	
	@When("^User Enter their First Name in First Name Field$")
	public void user_Enter_their_First_Name_in_First_Name_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Bhargav");
	}

	@When("^User Enter their Last Name in Last Name Field$")
	public void user_Enter_their_Last_Name_in_Last_Name_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Krishna");
	}

	@When("^User Enter their Address Details in Billing Address Filed$")
	public void user_Enter_their_Address_Details_in_Billing_Address_Filed() throws Throwable {
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("No.20,AnnaStreet,Anna Nagar,chennai"); 
	}

	@When("^User Enter their Bank Credit Card Number in Credit Card Number Filed$")
	public void user_Enter_their_Bank_Credit_Card_Number_in_Credit_Card_Number_Filed() throws Throwable {
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("9898747456563232");
	}

	@When("^User Select the Credit Card Type in Credit Card type Dropdown Menu$")
	public void user_Select_the_Credit_Card_Type_in_Credit_Card_type_Dropdown_Menu() throws Throwable {
		WebElement cardtype=driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select s7=new Select(cardtype);
		s7.selectByIndex(2);
	}

	@When("^User Select the Credit Card Expiry Month in Select Month Dropdown Menu$")
	public void user_Select_the_Credit_Card_Expiry_Month_in_Select_Month_Dropdown_Menu() throws Throwable {
		WebElement month=driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s8=new Select(month);
		s8.selectByIndex(3);
	}

	@When("^User Select the Credit Card Expiry Year in Select Year Dropdown Menu$")
	public void user_Select_the_Credit_Card_Expiry_Year_in_Select_Year_Dropdown_Menu() throws Throwable {
		WebElement year=driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s9=new Select(year);
		s9.selectByIndex(12);
	}

	@When("^User Enter the Credit Card CVV Nuber in CVV Number Filed$")
	public void user_Enter_the_Credit_Card_CVV_Nuber_in_CVV_Number_Filed() throws Throwable {
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("225");
	}
	@Then("^User Clicks the Book Now Button it Navigates to Booking Confirmation Page$")
	public void user_Clicks_the_Book_Now_Button_it_Navigates_to_Booking_Confirmation_Page() throws Throwable {
	
		driver.findElement(By.xpath("//input[@type='button']")).click();
	}


	@When("^User Verify The Booking Confirmation Details and Bookinge is Successfull$")
	public void user_Verify_The_Booking_Confirmation_Details_and_Bookinge_is_Successfull() throws Throwable {
	}

	@When("^User Clicks Logout Button it Navigates to Return Home Page$")
	public void user_Clicks_Logout_Button_it_Navigates_to_Return_Home_Page() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	


}
