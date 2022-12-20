package com.baseWithRunnerAndPom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pom.adactin.Book_A_Hotel_4;
import com.pom.adactin.Booked_Itenary_Slct_Hotel_6;
import com.pom.adactin.Hotel_Booking_Confirmation_5;
import com.pom.adactin.Login_Page_1;
import com.pom.adactin.Logout_Page_7;
import com.pom.adactin.Search_Hotel_2;
import com.pom.adactin.Slct_Hotel_3;
import com.utilityFiles.Utility_Files;

public class Runner_With_Base_And_Pom_Adactin extends Utility_Files {
	
	public static WebDriver driver = browser_Config("chrome");
	
	public static Login_Page_1 login = new Login_Page_1(driver);
	
	public static Search_Hotel_2 searchHotel = new Search_Hotel_2(driver);
	
	public static Slct_Hotel_3 slctHotel = new Slct_Hotel_3(driver);
	
	public static Book_A_Hotel_4 bookHotel = new Book_A_Hotel_4(driver);
	
	public static Hotel_Booking_Confirmation_5 bookingConfirmation = new Hotel_Booking_Confirmation_5(driver);
	
	public static Booked_Itenary_Slct_Hotel_6 bookedItenary = new Booked_Itenary_Slct_Hotel_6(driver);
	
	public static Logout_Page_7 loginAgain = new Logout_Page_7(driver);
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		window_Commands("maximize");
		
		get_Url("https://adactinhotelapp.com/");
		
		implicit_Wait("seconds", 900);
	
		//-------------2nd Hotel Booking Details------------------------------------------------------------------------------------------
		
		//Login Page

		send_Keys(login.getEmail(),"TharaniA");

		send_Keys(login.getPassword(), "Abc1234");
		
		click_On_Element(login.getLoginBtn());
		
		//Search Hotel Page 
		
		select_By_Value(searchHotel.getLocation(), "New York");
		
		select_By_Visibletext(searchHotel.getHotel(), "Hotel Sunshine");
		
		select_By_Visibletext(searchHotel.getRoomType(), "Super Deluxe");
		
		select_By_Visibletext(searchHotel.getNoOfRooms(), "2 - Two");
		
		send_Keys(searchHotel.getCheckInDate(), "18/11/2022");
	
		send_Keys(searchHotel.getCheckOutDate(), "19/11/2022");
		
		select_By_Index(searchHotel.getNoOfAdult(), 2);
		
		select_By_Value(searchHotel.getNoOfChildren(), "1");
		
		click_On_Element(searchHotel.getSearchBtn());
		
		
		//Select Hotel Page
	
		click_On_Element(slctHotel.getRadioBtn());
		
		click_On_Element(slctHotel.getContinuBtn());
		
		
		//Book A Hotel Page - Personal & Card Details 
		
		send_Keys(bookHotel.getFirstName(), "Srihari");
	
		send_Keys(bookHotel.getLastName(), "S");
		
		send_Keys(bookHotel.getBillingAddress(), "FlameView Place");
		
		send_Keys(bookHotel.getCreditCardNo(), "4899309123539920");

		select_By_Visibletext(bookHotel.getCreditCardType(), "Master Card");
		
		select_By_Visibletext(bookHotel.getExpiryMonth(), "December");
		
		select_By_Visibletext(bookHotel.getExpiryYear(), "2022");
		
		send_Keys(bookHotel.getCvvNo(), "978");
		
		click_On_Element(bookHotel.getBookNowBtn());
		
		
		//Hotel Booking Confirmation Page - Booked Itenary 
		
		javascript_Executor_Scroll_Or_Click("scroll", bookingConfirmation.getBookedItenaryLnk());
		javascript_Executor_Scroll_Or_Click("click", bookingConfirmation.getBookedItenaryLnk());
		
		sleep(2000);
		
		//Screenshot of Casual Dress Order Confirmation
		takes_Screenshot("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaItenaryHotelBookingConfirmation1.png");
		
		
		//Booked Itenary - Select Hotel Page - Logout Button
		
		click_On_Element(bookedItenary.getLogoutLnk());
		
		
		//Logout Page - Login Again
		
		click_On_Element(loginAgain.getLoginAgainLnk());
		
		
		//-------------2nd Hotel Booking Details------------------------------------------------------------------------------------------
		
		//Login Page
		
		send_Keys(login.getEmail(), "TharaniA");
		
		send_Keys(login.getPassword(), "Abc1234");
		
		click_On_Element(login.getLoginBtn());
		
		
		//Search Hotel Page
		
		select_By_Visibletext(searchHotel.getLocation(), "Los Angeles");
		
		select_By_Visibletext(searchHotel.getHotel(), "Hotel Cornice");
		
		select_By_Visibletext(searchHotel.getRoomType(), "Super Deluxe");
		
		select_By_Visibletext(searchHotel.getNoOfRooms(), "1 - One");
		
		send_Keys(searchHotel.getCheckInDate(), "21/11/2022");
		
		send_Keys(searchHotel.getCheckOutDate(), "24/11/2022");
		
		select_By_Visibletext(searchHotel.getNoOfAdult(), "2 - Two");
		
		select_By_Value(searchHotel.getNoOfChildren(), "1");
		
		click_On_Element(searchHotel.getSearchBtn());
		
		
		//Select Hotel Page

		click_On_Element(slctHotel.getRadioBtn());
		
		click_On_Element(slctHotel.getContinuBtn());

		
		//Book A Hotel PagePersonal & Card Details
		
		send_Keys(bookHotel.getFirstName(), "Santosh");
		
		send_Keys(bookHotel.getLastName(), "Kumar");
		
		send_Keys(bookHotel.getBillingAddress(), "Alphen Mews");
		
		send_Keys(bookHotel.getCreditCardNo(), "4899309123539920");
		
		select_By_Visibletext(bookHotel.getCreditCardType(), "Master Card");
		
		select_By_Visibletext(bookHotel.getExpiryMonth(), "December");
		
		select_By_Visibletext(bookHotel.getExpiryYear(), "2022");
	
		send_Keys(bookHotel.getCvvNo(), "256");
		
		click_On_Element(bookHotel.getBookNowBtn());
		
		
		//Hotel Booking Confirmation Page - Booked Itenary
		
		javascript_Executor_Scroll_Or_Click("scroll", bookingConfirmation.getBookedItenaryLnk());
		javascript_Executor_Scroll_Or_Click("click", bookingConfirmation.getBookedItenaryLnk());
	
		sleep(2000);
		
		//Screenshot of Casual Dress Order Confirmation
		takes_Screenshot("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaItenaryHotelBookingConfirmation2.png");
		
		
		//Booked Itenary - Select Hotel Page - Logout Button
		click_On_Element(bookedItenary.getLogoutLnk());
	}
}
