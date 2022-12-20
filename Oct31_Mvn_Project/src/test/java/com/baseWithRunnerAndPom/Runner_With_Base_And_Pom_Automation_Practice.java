package com.baseWithRunnerAndPom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pom.automationpractice.Casual_Dress_Add_To_Cart_Page_5;
import com.pom.automationpractice.Casual_Dresses_Page_4;
import com.pom.automationpractice.Confirm_My_Order_Page_11;
import com.pom.automationpractice.Evening_Dress_Page_14;
import com.pom.automationpractice.Evening_Printed_Dress_Page_15;
import com.pom.automationpractice.Login_Page_2;
import com.pom.automationpractice.My_Account_Page_3;
import com.pom.automationpractice.Mystore_Signin_1;
import com.pom.automationpractice.Order_Address_Page_8;
import com.pom.automationpractice.Order_Confirmation_Page_12;
import com.pom.automationpractice.Order_History_Page_13;
import com.pom.automationpractice.Order_Payment_Page_10;
import com.pom.automationpractice.Order_Shipping_Page_9;
import com.pom.automationpractice.Order_Signin_Page_7;
import com.pom.automationpractice.Order_Summary_Page_6;
import com.pom.automationpractice.Summer_Dress_Page_16;
import com.pom.automationpractice.Summer_Printed_Dress_17;
import com.utilityFiles.Utility_Files;

public class Runner_With_Base_And_Pom_Automation_Practice extends Utility_Files {

	public static WebDriver driver = browser_Config("chrome");

	public static Mystore_Signin_1 signinPage = new Mystore_Signin_1(driver);
	
	public static Login_Page_2 loginPage = new Login_Page_2(driver);
	
	public static My_Account_Page_3 myAccountPage = new My_Account_Page_3(driver);
	
	public static Casual_Dresses_Page_4 casualDressPage = new  Casual_Dresses_Page_4(driver);
	
	public static Casual_Dress_Add_To_Cart_Page_5 casualDressCart = new Casual_Dress_Add_To_Cart_Page_5(driver);
	
	public static Order_Summary_Page_6 orderSummary = new Order_Summary_Page_6(driver);
	
	public static Order_Signin_Page_7 orderSignIn = new Order_Signin_Page_7(driver);
	
	public static Order_Address_Page_8 orderAddress = new Order_Address_Page_8(driver);
	
	public static Order_Shipping_Page_9 orderShipping = new Order_Shipping_Page_9(driver);
	
	public static Order_Payment_Page_10 orderPayment = new Order_Payment_Page_10(driver);
	
	public static Confirm_My_Order_Page_11 confirmMyOrder = new Confirm_My_Order_Page_11(driver);
	
	public static Order_Confirmation_Page_12  orderConfirmation = new Order_Confirmation_Page_12(driver);
	
	public static Order_History_Page_13 orderHistory = new Order_History_Page_13(driver);
	
	public static Evening_Dress_Page_14 eveningDressPage = new Evening_Dress_Page_14(driver);
	
	public static Evening_Printed_Dress_Page_15 eveningDressCart = new Evening_Printed_Dress_Page_15(driver);
	
	public static Summer_Dress_Page_16 summerDressPage = new Summer_Dress_Page_16(driver);
	
	public static Summer_Printed_Dress_17 summerDressCart = new Summer_Printed_Dress_17(driver);
	
	
	public static void main(String[] args) throws IOException, InterruptedException {

		window_Commands("maximize");

		get_Url("http://automationpractice.com/index.php");

		implicit_Wait("seconds", 1100);

		//------------------------- Mystore_Signin_1 -> Home Page------------------------- 
		
		click_On_Element(signinPage.getSignInBtn()); // SignIn Button in Home Page

		
		//-------------------------Login_Page_2 -> Login Page-------------------------
		
		send_Keys(loginPage.getEmailId(), "tharanimsse5@gmail.com");  // Email
		
		send_Keys(loginPage.getPassword(), "Abcd1234"); // Password

		click_On_Element(loginPage.getLogInBtn()); // SignIn Button to Login
		

		//-------------------------My_Account_Page_3 -> Dresses - Casual Dresses-------------------------

		actions(myAccountPage.getDresses(), "movetoelement"); // Dresses

		actions(myAccountPage.getCasual_Dress(), "movetoelement"); // Casual Dress
		actions(myAccountPage.getCasual_Dress(), "click");
		

		//-------------------------Casual Dresses_Page_4 -> Quickview-------------------------
		
		javascript_Executor_Scroll_Or_Click("scroll", casualDressPage.getCasual_Dress_Quickview()); // QuickView Link -Icon

		javascript_Executor_Scroll_Or_Click("click", casualDressPage.getCasual_Dress_Quickview());

		// sleep(4000);

		
		//-------------------------Casual_Dress_Add_To_Cart_Page_5 -> Quantity, Size, Cart btn-------------------------
		
		click_On_Element(casualDressCart.getCasual_Dress_Quantity());  // Quantity

		select_By_Visibletext(casualDressCart.getCasual_Dress_Size(), "M"); // Size

		click_On_Element(casualDressCart.getAdd_To_Cart_Button());  // Add to cart button
		
		
		//-------------------------Order_Summary_Page_6------------------------- 

		click_On_Element(orderSummary.getProceed_To_Checkout()); // 1st Checkout
		
		
		//-------------------------Order_Signin_Page_7-------------------------

		click_On_Element(orderSignIn.getProceed_To_Checkout()); // 2nd Checkout
		

		//-------------------------Order_Address_Page_8-------------------------
		
		click_On_Element(orderAddress.getProceed_To_Checkout()); // 3rd Checkout

		
		//-------------------------Order_Shipping_Page_9-------------------------
		
		click_On_Element(orderShipping.getTerms_Of_Service_Btn()); // Terms of Service Button

		click_On_Element(orderShipping.getProceed_To_Checkout());  // 4th checkout
		

		//-------------------------Order_Payment_Page_10 -> Payment by Bank Wire, Check-------------------------
		
		click_On_Element(orderPayment.getPay_Bank_Wire()); // Bank Wire

		
		//------------------------- Confirm_My_Order_Page_11----------------------------------
		
		click_On_Element(confirmMyOrder.getConfirm_My_Order_Btn());// I Confirm my order Button
		

		//-------------------------Order_Confirmation_Page_12  ->Scrolling Down the Page-------
		
		javascript_Executor_Scroll_Or_Click("scroll", orderConfirmation.getOrder_Confirmation_Box_Loct()); // Scrolling Down the Page - Order Confirmation Box Location

		// Confirming Order Screenshot
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaCasualDressConfirm.png");
		
		click_On_Element(orderConfirmation.getBack_To_Orders()); // Back to Order Link - Goes to Order History
		

		//-------------------------Order_History_Page_13----------------------------------------------------
		
		System.out.println("Latest Shopping - Casual Dress - Order Id: " + get_Text(orderHistory.getOrder_Id_1())); // WebTable - Print Order Id ALone

		javascript_Executor_Scroll_Or_Click("scroll", orderHistory.getOrder_Reference_Loct()); // Scrolling Down the Page

		// ScreenShot of Casual Dress Shopping History
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaCasualDressOrderHistory.png");

		//Dresses -> Evening Dresses
		
		actions(orderHistory.getDresses(), "movetoelement"); //Dresses again

		actions(orderHistory.getEvening_Dress(), "movetoelement"); //Evening Dress
		actions(orderHistory.getEvening_Dress(), "click");

		//-------------------------Evening_Dress_Page_14----------------------------------------

		javascript_Executor_Scroll_Or_Click("scroll", eveningDressPage.getEvening_Dress_Quickview()); // Evening Dress Image -> Quick View
		javascript_Executor_Scroll_Or_Click("click", eveningDressPage.getEvening_Dress_Quickview()); //Click on Quick View

		sleep(4000);

		//-------------------------Evening_Printed_Dress_Page_15----------------------------------------
		
		click_On_Element(eveningDressCart.getEvening_Dress_Quantity()); //Evening Dress Quantity
		click_On_Element(eveningDressCart.getEvening_Dress_Quantity());
		click_On_Element(eveningDressCart.getEvening_Dress_Quantity());

		select_By_Visibletext(eveningDressCart.getEvening_Dress_Size(), "M");//Evening Dress Size - M
		
		click_On_Element(eveningDressCart.getEvening_Dress_Colour()); //Evening Dress Colour - Pink

		click_On_Element(eveningDressCart.getAdd_To_Cart_Btn()); // Add to cart Button

		//-------------------------Order_Summary_Page_6----------------------------------------
		
		click_On_Element(orderSummary.getProceed_To_Checkout()); // 1st Checkout


		//-------------------------Order_Signin_Page_7----------------------------------------
		
		click_On_Element(orderSignIn.getProceed_To_Checkout()); // 2nd Checkout
		
		
		//-------------------------Order_Address_Page_8----------------------------------------
		
		click_On_Element(orderAddress.getProceed_To_Checkout()); // 3rd Checkout

		
		//-------------------------Order_Shipping_Page_9-------------------------
		
		click_On_Element(orderShipping.getTerms_Of_Service_Btn()); //terms&conditions

		click_On_Element(orderShipping.getProceed_To_Checkout()); // 4th Checkout

		
		//-------------------------Order_Payment_Page_10 -> Payment by Bank Wire, Check-------------------------
		
		click_On_Element(orderPayment.getPay_Check()); // Payment by Check

		
		//------------------------- Confirm_My_Order_Page_11-----------------------------------
		
		click_On_Element(confirmMyOrder.getConfirm_My_Order_Btn());  // I Confirm My Order Button

		
		// -------------------------Order_Confirmation_Page_12  ->Scroll Down the Page----------------
		
		javascript_Executor_Scroll_Or_Click("scroll", orderConfirmation.getOrder_Confirmation_Box_Loct()); // Scrolling Down - Confirmation Box Location

		// Screenshot of Evening Dress Order Confirmation
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaevenDressOrderConfirm.png");

		click_On_Element(orderConfirmation.getBack_To_Orders()); // Back to Order - History

		
		//-------------------------Order_History_Page_13----------------------------------------------------
		
		System.out.println("Latest Shopping - Evening Dress - Order Id:  " + get_Text(orderHistory.getOrder_Id_1())); //WebTable - Print Order Id ALone

		javascript_Executor_Scroll_Or_Click("scroll", orderHistory.getOrder_Reference_Loct()); //Scrolling Down the Page

		// ScreenShot of Evening Dress Shopping History
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaevenDressOrderHistory.png");

		// Dresses -> Summer Dress

		actions(orderHistory.getDresses(), "movetoelement"); // Dresses

		actions(orderHistory.getSummer_Dress(), "movetoelement"); //Summer Dress
		actions(orderHistory.getSummer_Dress(), "click"); //Summer Dress

		//-----------------summer_Dress_Page_16------------------------------------------------------
		
		javascript_Executor_Scroll_Or_Click("scroll", summerDressPage.getSummer_Dress_Quickview()); //Summer Dress Image- QuickView
		javascript_Executor_Scroll_Or_Click("click", summerDressPage.getSummer_Dress_Quickview());

		sleep(4000);

		//-----------------summer_Printed_Dress_Page_17---------------------------------------------
		
		click_On_Element(summerDressCart.getSummer_Dress_Quantity()); //Summer DressQuantity
		click_On_Element(summerDressCart.getSummer_Dress_Quantity());

		select_By_Visibletext(summerDressCart.getSummer_Dress_Size(), "L"); //Summer Dress Size

		click_On_Element(summerDressCart.getSummer_Dress_Colour());  //Summer Dress Colour - Orange

		click_On_Element(summerDressCart.getAdd_To_Cart_Btn()); // Add to Cart Button

		
		//-------------------------Order_Summary_Page_6----------------------------------------
		
		click_On_Element(orderSummary.getProceed_To_Checkout()); // 1st Checkout

		
		//-------------------------Order_Signin_Page_7----------------------------------------
		
		click_On_Element(orderSignIn.getProceed_To_Checkout()); // 2nd Checkout

		
		//-------------------------Order_Address_Page_8----------------------------------------
		
		click_On_Element(orderAddress.getProceed_To_Checkout()); // 3rd Checkout

		
		//-------------------------Order_Shipping_Page_9-------------------------
		
		click_On_Element(orderShipping.getTerms_Of_Service_Btn()); // Terms of Service Button

		click_On_Element(orderShipping.getProceed_To_Checkout()); // 4th Checkout

		
		//-------------------------Order_Payment_Page_10 -> Payment by Bank Wire, Check-------------------------
		
		click_On_Element(orderPayment.getPay_Bank_Wire());  // // Payment by Bank Wire

		
		//------------------------- Confirm_My_Order_Page_11-----------------------------------

		click_On_Element(confirmMyOrder.getConfirm_My_Order_Btn()); //I confirm my order button
		
		
		// -------------------------Order_Confirmation_Page_12  ->Scrolling Down the Page-------
		
		javascript_Executor_Scroll_Or_Click("scroll", orderConfirmation.getOrder_Confirmation_Box_Loct()); // Scrolling Down the Page - Order Box Location 

		// Screenshot of Summer Dress Order Confirmation
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStasummerDressOrdrConfirm.png");

		click_On_Element(orderConfirmation.getBack_To_Orders()); // Back to Order - History
		
		
		//-------------------------Order_History_Page_13----------------------------------------------------
		
		System.out.println("Latest Shopping - Summer Dress - OrderId:  " + get_Text(orderHistory.getOrder_Id_1())); // WebTable - Print Order Id ALone

		javascript_Executor_Scroll_Or_Click("scroll", orderHistory.getOrder_Reference_Loct()); // Scrolling Down the Page to Order Reference

		// ScreenShot of Casual Dress Shopping History
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStasummerDressOrderHistory.png");

		sleep(2000);

		// Logout
		click_On_Element(orderHistory.getLogOut_Btn());
	}
}
