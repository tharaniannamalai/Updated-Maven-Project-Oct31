package com.baseWithRunnerSta;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.utilityFiles.Utility_Files;

public class Runner_With_BaseClass_Sta_Adactin extends Utility_Files {

public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver = browser_Config("chrome");
		
		window_Commands("maximize");
		
		get_Url("https://adactinhotelapp.com/");
		
		//Login Page
		WebElement email1 = driver.findElement(By.xpath("//input[@id='username']"));
		send_Keys(email1,"TharaniA");
		
		WebElement pass1 = driver.findElement(By.xpath("//input[@id='password']"));
		send_Keys(pass1, "Abc1234");
		
		WebElement login1 = driver.findElement(By.xpath("//input[@id='login']"));
		click_On_Element(login1);
		
		//Search Hotel
		//Choose Location
		WebElement locat1 = driver.findElement(By.xpath("//select[@name='location']"));
		select_By_Value(locat1, "New York");
		
		//Choose Hotel
		WebElement hotel1 = driver.findElement(By.xpath("//select[@name='hotels']"));
		select_By_Visibletext(hotel1, "Hotel Sunshine");
		
		//Choose Room Type
		WebElement room1 = driver.findElement(By.xpath("//select[@name='room_type']"));
		select_By_Visibletext(room1, "Super Deluxe");
		
		//Choose No of Rooms
		WebElement noOfRooms1 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		select_By_Visibletext(noOfRooms1, "2 - Two");
		
		//Check In Date
		WebElement checkInDate1 = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		send_Keys(checkInDate1, "18/10/2022");
		
		//Check Out Date
		WebElement checkOutDate1 = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		send_Keys(checkOutDate1, "19/10/2022");
		
		//Adults per Room
		WebElement noOfPerson1 = driver.findElement(By.xpath("//select[@id='adult_room']"));
		select_By_Index(noOfPerson1, 2);
		
		//Children per Room
		WebElement noOfKids1 = driver.findElement(By.xpath("//select[@id='child_room']"));
		select_By_Value(noOfKids1, "1");
		
		//Search Button
		WebElement submitBtn1 = driver.findElement(By.xpath("//input[@id='Submit']"));
		click_On_Element(submitBtn1);
		
		//Radio Button1
		WebElement radioBtn1 = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		click_On_Element(radioBtn1);
		
		//Confirm button
		WebElement cBtn1 = driver.findElement(By.xpath("//input[@id='continue']"));
		click_On_Element(cBtn1);
		
		//Personal & Card Details
		//First Name
		WebElement fname1 = driver.findElement(By.xpath("//input[@name='first_name']"));
		send_Keys(fname1, "Tharani");
		
		//Last Name
		WebElement lname1 = driver.findElement(By.xpath("//input[@name='last_name']"));
		send_Keys(lname1, "A");
		
		//Billing Address
		WebElement billAddress1 = driver.findElement(By.xpath("//textarea[@name='address']"));
		send_Keys(billAddress1, "FlameView Place");
		
		//Credit Card No
		WebElement cardNo1 = driver.findElement(By.xpath("//input[@name='cc_num']"));
		send_Keys(cardNo1, "4899309123539920");

		//Credit Card Type
		WebElement cardType1 = driver.findElement(By.xpath("//select[@name='cc_type']"));
		select_By_Visibletext(cardType1, "Master Card");
		
		// Expiry Month
		WebElement expMonth1 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		select_By_Visibletext(expMonth1, "December");
		
		//Expiry Year
		WebElement expYear1 = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		select_By_Visibletext(expYear1, "2022");
		
		// CCV No
		WebElement ccvNo1 = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		send_Keys(ccvNo1, "978");
		
		//Book Now
		WebElement bookBtn1 = driver.findElement(By.xpath("//input[@id='book_now']"));
		click_On_Element(bookBtn1);
		
		WebElement bookingItenary1 = driver.findElement(By.xpath("//a[.='Booked Itinerary']"));
		
		javascript_Executor_Scroll_Or_Click("scroll", bookingItenary1);
		javascript_Executor_Scroll_Or_Click("click", bookingItenary1);
		
		sleep(2000);
		
		//Screenshot of Hotel Booking Confirmation
		takes_Screenshot("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaItenaryHotelBookingConfirmation1.png");
		
		//Logout Button
		WebElement logoutBtn1 = driver.findElement(By.xpath("//a[.='Logout']"));
		click_On_Element(logoutBtn1);
		
		//---------------Login Again----------------------------------------------------------------------------------------------------------
		
		WebElement loginAgain = driver.findElement(By.xpath("//a[contains(.,'login again')]"));
		click_On_Element(loginAgain);
		
		
		//--------------Login Page-------------------------------------------------------------------------------------------------------------

		WebElement email2 = driver.findElement(By.xpath("//input[@id='username']"));
		send_Keys(email2, "TharaniA");
		
		WebElement pass2 = driver.findElement(By.xpath("//input[@id='password']"));
		send_Keys(pass2, "Abc1234");
		
		WebElement login2 = driver.findElement(By.xpath("//input[@id='login']"));
		click_On_Element(login2);
		
		//-------------2nd Hotel Booking Details------------------------------------------------------------------------------------------
		
		//Search Hotel Page
		//Choose Location
		WebElement locat2 = driver.findElement(By.xpath("//select[@name='location']"));
		select_By_Visibletext(locat2, "Los Angeles");
		
		//Choose Hotel
		WebElement hotel2 = driver.findElement(By.xpath("//select[@name='hotels']"));
		select_By_Visibletext(hotel2, "Hotel Cornice");
		
		//Choose Room Type
		WebElement room2 = driver.findElement(By.xpath("//select[@name='room_type']"));
		select_By_Visibletext(room2, "Super Deluxe");
		
		//Choose No of Rooms
		WebElement noOfRooms2 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		select_By_Visibletext(noOfRooms2, "1 - One");
		
		//Check In Date
		WebElement checkInDate2 = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		send_Keys(checkInDate2, "21/11/2022");
		
		//Check Out Date
		WebElement checkOutDate2 = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		send_Keys(checkOutDate2, "24/11/2022");
		
		//Adults per Room
		WebElement noOfPerson2 = driver.findElement(By.xpath("//select[@id='adult_room']"));
		select_By_Visibletext(noOfPerson2, "2 - Two");
		
		//Children per Room
		WebElement noOfKids2 = driver.findElement(By.xpath("//select[@id='child_room']"));
		select_By_Value(noOfKids2, "1");
		
		//Search Button
		WebElement submitBtn = driver.findElement(By.xpath("//input[@id='Submit']"));
		click_On_Element(submitBtn);

		// Click Radio Button 
		WebElement radioBtn2 = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		click_On_Element(radioBtn2);
		
		//Confirm button
		WebElement cBtn2 = driver.findElement(By.xpath("//input[@id='continue']"));
		click_On_Element(cBtn2);

		//Personal & Card Details
		//First Name
		WebElement fname2 = driver.findElement(By.xpath("//input[@name='first_name']"));
		send_Keys(fname2, "Santosh");
		
		//Last Name
		WebElement lname2 = driver.findElement(By.xpath("//input[@name='last_name']"));
		send_Keys(lname2, "Kumar");
		
		//Billing Address
		WebElement billAddress2 = driver.findElement(By.xpath("//textarea[@name='address']"));
		send_Keys(billAddress2, "Alhen Mews");
		
		//Credit Card No
		WebElement cardNo2 = driver.findElement(By.xpath("//input[@name='cc_num']"));
		send_Keys(cardNo2, "4899309123539920");
		
		//Credit Card Type
		WebElement cardType2 = driver.findElement(By.xpath("//select[@name='cc_type']"));
		select_By_Visibletext(cardType2, "Master Card");
		
		// Expiry Month
		WebElement expMonth2 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		select_By_Visibletext(expMonth2, "December");
		
		//Expiry Year
		WebElement expYear2 = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		select_By_Visibletext(expYear2, "2022");
		
		// CCV No
		WebElement ccvNo2 = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		send_Keys(ccvNo2, "256");
		
		//Book Now
		WebElement bookBtn2 = driver.findElement(By.xpath("//input[@id='book_now']"));
		click_On_Element(bookBtn2);
		
		WebElement bookingItenary2 = driver.findElement(By.xpath("//a[.='Booked Itinerary']"));
		
		javascript_Executor_Scroll_Or_Click("scroll", bookingItenary2);
		javascript_Executor_Scroll_Or_Click("click", bookingItenary2);
	
		sleep(2000);
		
		//Screenshot of Casual Dress Order Confirmation
		takes_Screenshot("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaItenaryHotelBookingConfirmation2.png");
		
		//Logout Button
		WebElement logoutBtn2 = driver.findElement(By.xpath("//a[.='Logout']"));
		click_On_Element(logoutBtn2);
	}
}
