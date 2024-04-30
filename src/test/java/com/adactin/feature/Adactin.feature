Feature: Hotel Booking in Adactin Application
@smokeTest
Scenario: User Login in the Web Application
Given User Lanch the Adactin Application
When User Enter the "jivita04" in Username Filed
And User Enter the "12345" in Password Filed
Then User Click on  the Login Button and it Navigates to Search Hotel Page
@smokeTest
Scenario: User Entering the Booking Details in the Search Hotel Booking Page
When User Select the Location in  Select Location Dropdown Menu
And User Select the Hotel in Select Hotel Dropdown Menu
And User Select the Room Type in Select Room Type Dropdown Menu
And User Select the Number of Rooms in Number of Rooms Dropdown Menu
And User Enter the Check in Date in Check in Date Menu
And User Enter the Check Out Date in Check Out Date Menu
And User Select the Number of Adults in Adults Per Room Dropdown Menu
And User Selcet the Number of Childrens in Children per Room Dropdown Menu
Then User Clicks on  the Search Button and it Navigates to Book a Hotel Page

Scenario: User Select the Hotel in Select Hotel Page
When User clicks Radiobutton to Select the Hotel from the list of hotels shown in the page
And User Clicks on the Continue Button It will Navigates to Book a Hotel Page


Scenario: User Fills the Required Detalis for Booking in Book a Hotal Page
When User Check the Hotel Details and Billing Price 
And User Enter their First Name in First Name Field
And User Enter their Last Name in Last Name Field
And User Enter their Address Details in Billing Address Filed
And User Enter their Bank Credit Card Number in Credit Card Number Filed
And User Select the Credit Card Type in Credit Card type Dropdown Menu
And User Select the Credit Card Expiry Month in Select Month Dropdown Menu
And User Select the Credit Card Expiry Year in Select Year Dropdown Menu
And User Enter the Credit Card CVV Nuber in CVV Number Filed
Then User Clicks the Book Now Button it Navigates to Booking Confirmation Page

Scenario: User Verify the Booking Confirmation page and Logout
When User Verify The Booking Confirmation Details and Bookinge is Successfull
And User Clicks Logout Button it Navigates to Return Home Page










