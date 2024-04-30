$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking in Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Login in the Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User Lanch the Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Enter the \"jivita04\" in Username Filed",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Enter the \"12345\" in Password Filed",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Click on  the Login Button and it Navigates to Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Lanch_the_Adactin_Application()"
});
formatter.result({
  "duration": 8411209294,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jivita04",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_Enter_the_in_Username_Filed(String)"
});
formatter.result({
  "duration": 322091961,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_Enter_the_in_Password_Filed(String)"
});
formatter.result({
  "duration": 191910751,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_on_the_Login_Button_and_it_Navigates_to_Search_Hotel_Page()"
});
formatter.result({
  "duration": 2405419961,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User Entering the Booking Details in the Search Hotel Booking Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-entering-the-booking-details-in-the-search-hotel-booking-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User Select the Location in  Select Location Dropdown Menu",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User Select the Hotel in Select Hotel Dropdown Menu",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Select the Room Type in Select Room Type Dropdown Menu",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Select the Number of Rooms in Number of Rooms Dropdown Menu",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User Enter the Check in Date in Check in Date Menu",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User Enter the Check Out Date in Check Out Date Menu",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User Select the Number of Adults in Adults Per Room Dropdown Menu",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Selcet the Number of Childrens in Children per Room Dropdown Menu",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User Clicks on  the Search Button and it Navigates to Book a Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Select_the_Location_in_Select_Location_Dropdown_Menu()"
});
formatter.result({
  "duration": 2361736426,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_the_Hotel_in_Select_Hotel_Dropdown_Menu()"
});
formatter.result({
  "duration": 1229881026,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_the_Room_Type_in_Select_Room_Type_Dropdown_Menu()"
});
formatter.result({
  "duration": 1210592505,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_the_Number_of_Rooms_in_Number_of_Rooms_Dropdown_Menu()"
});
formatter.result({
  "duration": 1315045021,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_the_Check_in_Date_in_Check_in_Date_Menu()"
});
formatter.result({
  "duration": 198275457,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_the_Check_Out_Date_in_Check_Out_Date_Menu()"
});
formatter.result({
  "duration": 183933438,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_the_Number_of_Adults_in_Adults_Per_Room_Dropdown_Menu()"
});
formatter.result({
  "duration": 296886113,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Selcet_the_Number_of_Childrens_in_Children_per_Room_Dropdown_Menu()"
});
formatter.result({
  "duration": 245447443,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Clicks_on_the_Search_Button_and_it_Navigates_to_Book_a_Hotel_Page()"
});
formatter.result({
  "duration": 1474329870,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User Select the Hotel in Select Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-the-hotel-in-select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "User clicks Radiobutton to Select the Hotel from the list of hotels shown in the page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User Clicks on the Continue Button It will Navigates to Book a Hotel Page",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_clicks_Radiobutton_to_Select_the_Hotel_from_the_list_of_hotels_shown_in_the_page()"
});
formatter.result({
  "duration": 183461911,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Clicks_on_the_Continue_Button_It_will_Navigates_to_Book_a_Hotel_Page()"
});
formatter.result({
  "duration": 1163566625,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User Fills the Required Detalis for Booking in Book a Hotal Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-fills-the-required-detalis-for-booking-in-book-a-hotal-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "User Check the Hotel Details and Billing Price",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User Enter their First Name in First Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User Enter their Last Name in Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User Enter their Address Details in Billing Address Filed",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User Enter their Bank Credit Card Number in Credit Card Number Filed",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User Select the Credit Card Type in Credit Card type Dropdown Menu",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User Select the Credit Card Expiry Month in Select Month Dropdown Menu",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User Select the Credit Card Expiry Year in Select Year Dropdown Menu",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User Enter the Credit Card CVV Nuber in CVV Number Filed",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User Clicks the Book Now Button it Navigates to Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Check_the_Hotel_Details_and_Billing_Price()"
});
formatter.result({
  "duration": 4052276670,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_their_First_Name_in_First_Name_Field()"
});
formatter.result({
  "duration": 239708221,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_their_Last_Name_in_Last_Name_Field()"
});
formatter.result({
  "duration": 234438714,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_their_Address_Details_in_Billing_Address_Filed()"
});
formatter.result({
  "duration": 320385167,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_their_Bank_Credit_Card_Number_in_Credit_Card_Number_Filed()"
});
formatter.result({
  "duration": 319209067,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_the_Credit_Card_Type_in_Credit_Card_type_Dropdown_Menu()"
});
formatter.result({
  "duration": 288509722,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_the_Credit_Card_Expiry_Month_in_Select_Month_Dropdown_Menu()"
});
formatter.result({
  "duration": 334203736,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_the_Credit_Card_Expiry_Year_in_Select_Year_Dropdown_Menu()"
});
formatter.result({
  "duration": 475976290,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_the_Credit_Card_CVV_Nuber_in_CVV_Number_Filed()"
});
formatter.result({
  "duration": 201402867,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Clicks_the_Book_Now_Button_it_Navigates_to_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 165854828,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "User Verify the Booking Confirmation page and Logout",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-verify-the-booking-confirmation-page-and-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "User Verify The Booking Confirmation Details and Bookinge is Successfull",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "User Clicks Logout Button it Navigates to Return Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_Verify_The_Booking_Confirmation_Details_and_Bookinge_is_Successfull()"
});
formatter.result({
  "duration": 123768,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Clicks_Logout_Button_it_Navigates_to_Return_Home_Page()"
});
formatter.result({
  "duration": 990901528,
  "status": "passed"
});
});