package com.baseWithRunner;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

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

public class Runner_With_BaseClass_Adactin  extends Utility_Files{
	
public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		//First Booking 
		//Login Page
		WebElement userName1 = driver.findElement(By.xpath("//form[@id='login_form']//following::input[@id='username']")); //Username
		send_Keys(userName1,"TharaniA");
		
		WebElement pass1 = driver.findElement(By.xpath("//form[@id='login_form']//following::input[@id='password']")); //Password
		send_Keys(pass1,"Abc1234");
		
		WebElement loginBtn1 = driver.findElement(By.xpath("//form[@id='login_form']//following::input[@id='login']")); //Login Button
		click_On_Element(loginBtn1);
		
		
		//Search Hotel Form
		WebElement lct1 = driver.findElement(By.xpath("//form[@id='search_form']//following::select[@id='location']")); //Location
		
		Select slct1 = new Select(lct1);
		slct1.selectByVisibleText("Sydney");
		
		WebElement hotel1  = driver.findElement(By.xpath("//form[@id='search_form']//following::select[@id='hotels']")); //Choose Hotel
		
		Select shotel1 = new Select(hotel1);
		shotel1.selectByVisibleText("Hotel Hervey");
	
		WebElement room1 = driver.findElement(By.xpath("//form[@id='search_form']//following::select[@id='room_type']")); //Choose Room
		
		Select sroom1 = new Select(room1);
		sroom1.selectByVisibleText("Deluxe");

		WebElement noOfRoom1 = driver.findElement(By.xpath("//form[@id='search_form']//following::select[@id='room_nos']")); //Choose No of Room
		
		Select snoOfRoom1 = new Select (noOfRoom1);
		snoOfRoom1.selectByVisibleText("4 - Four");
		
		WebElement checkInDate1 = driver.findElement(By.xpath("//form[@id='search_form']//following::input[@id='datepick_in']")); //Check in Date
		send_Keys(checkInDate1, "15/11/2022");
		
		WebElement checkOutDate1 = driver.findElement(By.xpath("//form[@id='search_form']//following::input[@id='datepick_out']"));//Check Out Date
		send_Keys(checkOutDate1, "21/11/2022");
		
		WebElement adultPerRoom1 = driver.findElement(By.xpath("//form[@id='search_form']//following::select[@id='adult_room']")); //Adult Per Room
		
		Select sadultPerRoom1 = new Select(adultPerRoom1);
		sadultPerRoom1.selectByVisibleText("2 - Two");
		
		
		WebElement childPerRoom1 = driver.findElement(By.xpath("//form[@id='search_form']//following::select[@id='child_room']")); //Child Per Room
		
		Select schildPerRoom1 = new Select(childPerRoom1);
		schildPerRoom1.selectByVisibleText("1 - One");
		
		WebElement search_Btn1 = driver.findElement(By.xpath("//form[@id='search_form']//following::input[@id='Submit']")); //Search Button
		click_On_Element(search_Btn1);
		
		WebElement rd_Btn1 = driver.findElement(By.xpath("//form[@id='select_form']//following::input[@id='radiobutton_0']")); //Radio Button
		click_On_Element(rd_Btn1);
		
		WebElement cnt1 = driver.findElement(By.xpath("//form[@id='select_form']//following::input[@id='continue']")); //Continue Button
		click_On_Element(cnt1);
		
		//Book Hotel Form
		WebElement firstName1 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::input[@id='first_name']")); //FirstName
		send_Keys(firstName1,"Santosh");
		
		WebElement lastName1 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::input[@id='last_name']")); //LastName
		send_Keys(lastName1,"Kumar");
		
		WebElement billAddress1 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::textarea[@id='address']")); //Billing Address
		send_Keys(billAddress1, "Alphen Mews");
		
		WebElement creditCardNo1 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::input[@id='cc_num']")); //Credit Card No
		send_Keys(creditCardNo1, "2341567890123456");
		
		WebElement cardTyp1 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::select[@id='cc_type']")); //Credit Card Type
		
		Select scardTyp1 = new Select(cardTyp1);
		scardTyp1.selectByVisibleText("American Express");
		
		WebElement expMonth1 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::select[@id='cc_exp_month']")); //Expiry Month
		
		Select sexpMonth1 = new Select(expMonth1);
		sexpMonth1.selectByVisibleText("December");
		
		WebElement expYear1 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::select[@id='cc_exp_year']")); //Expiry Year
		
		Select sexpYear1= new Select(expYear1);
		sexpYear1.selectByVisibleText("2022");
		
		WebElement ccvNo1 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::input[@id='cc_cvv']")); //CCV Number
		send_Keys(ccvNo1, "396");
		
		WebElement bookBtn1 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::input[@id='book_now']"));
		click_On_Element(bookBtn1);
		
		//Booked Itenary
		WebElement bkItineraryBtn1 = driver.findElement(By.xpath("//a[text()='Search Hotel']//following-sibling::a[text()='Booked Itinerary']"));//Booked Itenary Link
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView()", bkItineraryBtn1);
		js.executeScript("arguments[0].click()",bkItineraryBtn1);
		
		Thread.sleep(2000);
		
		//Screenshot of Casual Dress Order Confirmation
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File f1 = ts1.getScreenshotAs(OutputType.FILE);
		File desc1 = new File("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseDynHotelBookingConfirmation1.png");
		FileUtils.copyFile(f1, desc1);
		
		//Booked Form -> Logout
		WebElement logoutBtn1 = driver.findElement(By.xpath("//form[@id='booked_form']//following::input[@id='logout']")); //Logout Button
		click_On_Element(logoutBtn1);
		
		//--------------------------Second Hotel Booking---------------------------------------------------------------------------------------
		
		//Click here to login again Page
		WebElement loginLk1 = driver.findElement(By.xpath("//td[@class='reg_success']//child::a[text()='Click here to login again']")); //Login Again Link
		click_On_Element(loginLk1);
		
		//Login Page
		WebElement userName2 = driver.findElement(By.xpath("//form[@id='login_form']//following::input[@id='username']")); //Username
		send_Keys(userName2, "TharaniA");
		
		WebElement pass2 = driver.findElement(By.xpath("//form[@id='login_form']//following::input[@id='password']")); //Password
		send_Keys(pass2, "Abc1234");
		
		WebElement loginBtn2 = driver.findElement(By.xpath("//form[@id='login_form']//following::input[@id='login']")); //Login Button
		click_On_Element(loginBtn2);
		
		//Search Hotel Form
		WebElement lct2 = driver.findElement(By.xpath("//form[@id='search_form']//following::select[@id='location']")); //Location
		
		Select slct2 = new Select(lct2);
		slct2.selectByVisibleText("Paris");
		
		WebElement hotel2  = driver.findElement(By.xpath("//form[@id='search_form']//following::select[@id='hotels']")); //Choose Hotel
		
		Select shotel2 = new Select(hotel2);
		shotel2.selectByVisibleText("Hotel Creek");
	
		WebElement room2 = driver.findElement(By.xpath("//form[@id='search_form']//following::select[@id='room_type']")); //Choose Room
		
		Select sroom2 = new Select(room2);
		sroom2.selectByVisibleText("Super Deluxe");

		WebElement noOfRoom2 = driver.findElement(By.xpath("//form[@id='search_form']//following::select[@id='room_nos']")); //Choose No of Room
		
		Select snoOfRoom2 = new Select (noOfRoom2);
		snoOfRoom2.selectByVisibleText("2 - Two");
		
		WebElement checkInDate2 = driver.findElement(By.xpath("//form[@id='search_form']//following::input[@id='datepick_in']")); //Check in Date
		send_Keys(checkInDate2, "26/11/2022");
		
		WebElement checkOutDate2 = driver.findElement(By.xpath("//form[@id='search_form']//following::input[@id='datepick_out']"));//Check Out Date
		send_Keys(checkOutDate2, "30/11/2022");
		
		WebElement adultPerRoom2 = driver.findElement(By.xpath("//form[@id='search_form']//following::select[@id='adult_room']")); //Adult Per Room
		
		Select sadultPerRoom2 = new Select(adultPerRoom2);
		sadultPerRoom2.selectByVisibleText("2 - Two");
		
		
		WebElement childPerRoom2 = driver.findElement(By.xpath("//form[@id='search_form']//following::select[@id='child_room']")); //Child Per Room
		
		Select schildPerRoom2 = new Select(childPerRoom2);
		schildPerRoom2.selectByVisibleText("1 - One");
		
		WebElement search_Btn2 = driver.findElement(By.xpath("//form[@id='search_form']//following::input[@id='Submit']")); //Search Button
		click_On_Element(search_Btn2);
		
		WebElement rd_Btn2 = driver.findElement(By.xpath("//form[@id='select_form']//following::input[@id='radiobutton_0']")); //Radio Button
		click_On_Element(rd_Btn2);
		
		WebElement cnt2 = driver.findElement(By.xpath("//form[@id='select_form']//following::input[@id='continue']")); //Continue Button
		click_On_Element(cnt2);
		
		//Book Hotel Form
		WebElement firstName2 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::input[@id='first_name']")); //FirstName
		send_Keys(firstName2, "Srihari");
		
		WebElement lastName2 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::input[@id='last_name']")); //LastName
		send_Keys(lastName2, "S");
		
		WebElement billAddress2 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::textarea[@id='address']")); //Billing Address
		send_Keys(billAddress2, "Hiedi Ave");
		
		WebElement creditCardNo2 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::input[@id='cc_num']")); //Credit Card No
		send_Keys(creditCardNo2, "7634592834567286");
		
		WebElement cardTyp2 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::select[@id='cc_type']")); //Credit Card Type
		
		Select scardTyp2 = new Select(cardTyp2);
		scardTyp2.selectByVisibleText("American Express");
		
		WebElement expMonth2 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::select[@id='cc_exp_month']")); //Expiry Month
		
		Select sexpMonth2 = new Select(expMonth2);
		sexpMonth2.selectByVisibleText("December");
		
		WebElement expYear2 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::select[@id='cc_exp_year']")); //Expiry Year
		
		Select sexpYear2= new Select(expYear2);
		sexpYear2.selectByVisibleText("2022");
		
		WebElement ccvNo2 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::input[@id='cc_cvv']")); //CCV Number
		send_Keys(ccvNo2, "486");
		
		WebElement bookBtn2 = driver.findElement(By.xpath("//form[@id='book_hotel_form']//following::input[@id='book_now']"));
		click_On_Element(bookBtn2);
	
		//Booked Itenary
		WebElement bkItineraryBtn2 = driver.findElement(By.xpath("//a[text()='Search Hotel']//following-sibling::a[text()='Booked Itinerary']"));//Booked Itenary Link
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView()", bkItineraryBtn2);
		js.executeScript("arguments[0].click()",bkItineraryBtn2);
		
		Thread.sleep(2000);
		
		//Screenshot of Casual Dress Order Confirmation
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File f2 = ts2.getScreenshotAs(OutputType.FILE);
		File desc2 = new File("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseDynHotelBookingConfirmation2.png");
		FileUtils.copyFile(f2, desc2);
		
		//Booked Form -> Logout
		WebElement logoutBtn2 = driver.findElement(By.xpath("//form[@id='booked_form']//following::input[@id='logout']")); //Logout Button
		click_On_Element(logoutBtn2);
	}
}
