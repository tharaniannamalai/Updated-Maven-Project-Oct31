package com.testng.adactin;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.logger.Basic_Config_Adactin;
import com.pageobjectmanager.Page_Object_Manager_Adactin;
import com.reader.File_Reader_Manager;
import com.utilityFiles.Utility_Files;

public class Adactin_With_Testng_Attributes extends Utility_Files{
	
	public static Logger log = Logger.getLogger(Basic_Config_Adactin.class);

    public static WebDriver driver = browser_Config("chrome");
    
    public static Page_Object_Manager_Adactin  manage = new Page_Object_Manager_Adactin(driver);
    
    @BeforeClass(description ="Launching Adactin Hotel Booking Website")
    public void browser_Launch()
    {
        BasicConfigurator.configure();
		
		window_Commands("maximize");
		
		get_Url("https://adactinhotelapp.com/");
		
		implicit_Wait("seconds", 900);
    }
    
    //1st Hotel Booking Details
    @Test(priority=-1, groups="1stHotelBooking")
    public void login_Details_1() throws IOException
    {
    	//Login Page
		
		log.info("Login Page Session Created.");
		
		//Reading properties file using singleton
		String username1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getUsername_1();//Username 

		send_Keys(manage.getLogin().getEmail(),username1);
		
		String password1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getPassword_1();//Password

		send_Keys(manage.getLogin().getPassword(), password1);
		
		click_On_Element(manage.getLogin().getLoginBtn());
		
		log.info("Logged in Successfully.");
		
		//Search Hotel Page 
		
		log.info("1st Hotel Booking Session Created.");
    }
	
    
    @Test(priority=0, dependsOnMethods = "login_Details_1", groups="1stHotelBooking")
    public void search_Hotel_1() throws IOException
    {
    	//Reading data from .properties using singleton 
		
		String location = File_Reader_Manager.getInstanceFRM().getInstanceTD().getLocation_1();//location
		select_By_Value(manage.getSearchHotel().getLocation(), location);
		
		String hotelName1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getHotelName_1();//hotelname
		select_By_Visibletext(manage.getSearchHotel().getHotel(), hotelName1);
		
		String roomType1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getRoomType_1();//roomtype
		select_By_Visibletext(manage.getSearchHotel().getRoomType(), roomType1);
		
		String noOfRoom1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getNoOfRooms_1();//No of Rooms
		select_By_Visibletext(manage.getSearchHotel().getNoOfRooms(), noOfRoom1);
		
		String checkInDate1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getCheckInDate_1();//Checkin Date
		send_Keys(manage.getSearchHotel().getCheckInDate(), checkInDate1);
	
		String checkOutDate1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getCheckOutDate_1();//Checkout Date
		send_Keys(manage.getSearchHotel().getCheckOutDate(), checkOutDate1);
		
		String noOfAdult = File_Reader_Manager.getInstanceFRM().getInstanceTD().getNoOfAdult_1();//No Of Adult
		
		int noOfAdult1 = Integer.parseInt(noOfAdult); //Conveting to int bec of selectByIndex
		
		select_By_Index(manage.getSearchHotel().getNoOfAdult(), noOfAdult1);
		
		String noOfChildren1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getNoOfChildren_1(); //No Of Children
		select_By_Value(manage.getSearchHotel().getNoOfChildren(), noOfChildren1);
		
		click_On_Element(manage.getSearchHotel().getSearchBtn());
    }
    
    @Test(priority=1,groups="1stHotelBooking")
    public void select_Hotel_1()
    {
    	//Select Hotel Page
    	
		click_On_Element(manage.getSlctHotel().getRadioBtn());
		
		click_On_Element(manage.getSlctHotel().getContinuBtn());
    }

    @Test(priority=2,groups="1stHotelBooking")
    public void book_A_Hotel_1() throws IOException
    {
    	//Book A Hotel Page - Personal & Card Details 
		
		String firstName1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getFirstName_1();//First Name
		send_Keys(manage.getBookHotel().getFirstName(), firstName1);
		
		String lastName1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getLastName_1();//Last Name
		send_Keys(manage.getBookHotel().getLastName(), lastName1);
		
		String billingAddress1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getBillingAddress_1();//Billing Address 
		send_Keys(manage.getBookHotel().getBillingAddress(), billingAddress1);
		
		String creditCardNo1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getCreditCardNo_1();//Credit Card No
		send_Keys(manage.getBookHotel().getCreditCardNo(), creditCardNo1);

		String creditCardType1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getCreditCardType_1();//Credit Card Type
		select_By_Visibletext(manage.getBookHotel().getCreditCardType(), creditCardType1);
		
		String expiryMonth1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getExpiryMonth_1();//Expiry Month
		select_By_Visibletext(manage.getBookHotel().getExpiryMonth(), expiryMonth1);
		
		String expiryYear1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getExpiryYear_1();
		select_By_Visibletext(manage.getBookHotel().getExpiryYear(), expiryYear1);
		
		String ccvNo1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getCcvNo_1();
		send_Keys(manage.getBookHotel().getCvvNo(), ccvNo1);
		
		click_On_Element(manage.getBookHotel().getBookNowBtn());
    }
    
    @Test(priority=3,groups="1stHotelBooking")
    public void booking_Confirmation_Page_1() throws IOException, InterruptedException
    {
    	//Hotel Booking Confirmation Page - Booked Itenary 
		
		javascript_Executor_Scroll_Or_Click("scroll", manage.getBookingConfirmation().getBookedItenaryLnk());
		javascript_Executor_Scroll_Or_Click("click", manage.getBookingConfirmation().getBookedItenaryLnk());
		
		sleep(2000);
		
		//Screenshot of Casual Dress Order Confirmation
		takes_Screenshot("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaItenaryHotelBookingConfirmation1.png");
		
		//Booked Itenary - Select Hotel Page - Logout Button
		
		click_On_Element(manage.getBookedItenary().getLogoutLnk());
		
		log.info("1st Hotel Booking Completed Successfully.");
    }
    
    @Test(priority=4,groups="1stHotelBooking")
    public void login_Again()
    {
    	//Logout Page - Login Again
		
    	click_On_Element(manage.getLoginAgain().getLoginAgainLnk());
    	
    	String actual_Title = driver.getTitle();
    	
    	String expected_Title = "Adactin.com - Hotel Reservation System";
    	
    	Assert.assertEquals(actual_Title, expected_Title);
    }
    
    //2nd Hotel Booking Details
    @Test(priority=5, alwaysRun=true, dependsOnMethods="login_Again", groups="2ndHotelBooking")
    public void login_Details_2() throws IOException
    {
    	//Login Page
		
		log.info("Again Login Page Session Created.");
		
		String userName2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getUsername_1();//UserName1 
		send_Keys(manage.getLogin().getEmail(), userName2);
		
		String password2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getPassword_1();//Password1
		send_Keys(manage.getLogin().getPassword(), password2);
		
		click_On_Element(manage.getLogin().getLoginBtn());
		
		log.info("Logged in Successfully.");
    }
    
    @Test(priority=6,dependsOnMethods ="login_Details_2", groups="2ndHotelBooking")
    public void search_Hotel_2() throws IOException
    {
    	//Search Hotel Page
		
		log.info("2nd Hotel Booking Session Created.");
		
		String location2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getLocation_2();//Location2
		select_By_Visibletext(manage.getSearchHotel().getLocation(), location2);
		
		String hotelName2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getHotelName_2();//Hotel Name2
		select_By_Visibletext(manage.getSearchHotel().getHotel(), hotelName2);
		
		String roomType2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getRoomType_2();//RoomType
		select_By_Visibletext(manage.getSearchHotel().getRoomType(), roomType2);
		
		String noOfRoom2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getNoOfRooms_2();//No of Room
		select_By_Visibletext(manage.getSearchHotel().getNoOfRooms(), noOfRoom2);
		
		String checkInDate2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getCheckInDate_2();//CheckInDate
		send_Keys(manage.getSearchHotel().getCheckInDate(), checkInDate2);
		
		String checkOutDate2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getCheckInDate_2();//CheckOutDate
		send_Keys(manage.getSearchHotel().getCheckOutDate(), checkOutDate2);
		
		String noOfAdult2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getNoOfAdult_2();//AdultPerRoom
		select_By_Visibletext(manage.getSearchHotel().getNoOfAdult(), noOfAdult2);
		
		String noOfChildren2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getNoOfChildren_2();//ChildrenPerRoom
		select_By_Value(manage.getSearchHotel().getNoOfChildren(), noOfChildren2);
		
		click_On_Element(manage.getSearchHotel().getSearchBtn());
    }
    
    @Test(priority=7,groups="2ndHotelBooking")
    public void select_Hotel_2()
    {
    	//Select Hotel Page

		click_On_Element(manage.getSlctHotel().getRadioBtn());
		
		click_On_Element(manage.getSlctHotel().getContinuBtn());
    }
    
    @Test(priority=8, groups="2ndHotelBooking")
    public void book_A_Hotel_2() throws IOException
    {
    	//Book A Hotel PagePersonal & Card Details
		
		String firstName2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getFirstName_2();//FirstName
		send_Keys(manage.getBookHotel().getFirstName(), firstName2);
		
		String lastName2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getLastName_2();//LastName
		send_Keys(manage.getBookHotel().getLastName(), lastName2);
		
		String billingAddress2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getBillingAddress_2();//BillingAddress
		send_Keys(manage.getBookHotel().getBillingAddress(), billingAddress2);
		
		String creditCardNo2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getCreditCardNo_2();//CreditCardNo
		send_Keys(manage.getBookHotel().getCreditCardNo(), creditCardNo2);
		
		String creditCardType2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getCreditCardType_2();//CreditCardType
		select_By_Visibletext(manage.getBookHotel().getCreditCardType(), creditCardType2);
		
		String expiryMonth2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getExpiryMonth_2();//ExpiryMonth
		select_By_Visibletext(manage.getBookHotel().getExpiryMonth(), expiryMonth2);
		
		String expiryYear2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getExpiryYear_2();//ExpiryYear
		select_By_Visibletext(manage.getBookHotel().getExpiryYear(), expiryYear2);
	
		String ccvNo2 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getCcvNo_2();//CCVNo
		send_Keys(manage.getBookHotel().getCvvNo(), ccvNo2);
		
		click_On_Element(manage.getBookHotel().getBookNowBtn());
    }
    
    @Test(priority=9, groups="2ndHotelBooking")
    public void booking_Confirmation_Page_2() throws IOException, InterruptedException
    {
    	//Hotel Booking Confirmation Page - Booked Itenary
		
		javascript_Executor_Scroll_Or_Click("scroll", manage.getBookingConfirmation().getBookedItenaryLnk());
		javascript_Executor_Scroll_Or_Click("click", manage.getBookingConfirmation().getBookedItenaryLnk());
	
		sleep(2000);
		
		//Screenshot of Casual Dress Order Confirmation
		takes_Screenshot("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaItenaryHotelBookingConfirmation2.png");
		
		log.info("2nd Hotel Booking Completed Successfully.");
    }
    
    @AfterTest(groups="2ndHotelBooking")
    public void logout2()
    {
    	//Booked Itenary - Select Hotel Page - Logout Button
		click_On_Element(manage.getBookedItenary().getLogoutLnk());
		
		log.info("Logged out from the account.");
    }
}
