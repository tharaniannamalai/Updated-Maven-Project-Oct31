package com.runner.manager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pageobjectmanager.Page_Object_Manager_Automation_Practice;

import com.utilityFiles.Utility_Files;

public class Runner_AfterManager_Automation_Practice extends Utility_Files{

	public static WebDriver driver = browser_Config("chrome");
	
	public static Page_Object_Manager_Automation_Practice managerap = new Page_Object_Manager_Automation_Practice(driver);

	public static void main(String[] args) throws IOException, InterruptedException {

		window_Commands("maximize");

		get_Url("http://automationpractice.com/index.php");

		implicit_Wait("seconds", 1100);

		//------------------------- Mystore_Signin_1 -> Home Page------------------------- 
		
		click_On_Element(managerap.getSigninPage().getSignInBtn()); // SignIn Button in Home Page

		
		//-------------------------Login_Page_2 -> Login Page-------------------------
		
		send_Keys(managerap.getLoginPage().getEmailId(), "tharanimsse5@gmail.com");  // Email
		
		send_Keys(managerap.getLoginPage().getPassword(), "Abcd1234"); // Password

		click_On_Element(managerap.getLoginPage().getLogInBtn()); // SignIn Button to Login
		

		//-------------------------My_Account_Page_3 -> Dresses - Casual Dresses-------------------------

		actions(managerap.getMyAccountPage().getDresses(), "movetoelement"); // Dresses

		actions(managerap.getMyAccountPage().getCasual_Dress(), "movetoelement"); // Casual Dress
		actions(managerap.getMyAccountPage().getCasual_Dress(), "click");
		

		//-------------------------Casual Dresses_Page_4 -> Quickview-------------------------
		
		javascript_Executor_Scroll_Or_Click("scroll", managerap.getCasualDressPage().getCasual_Dress_Quickview()); // QuickView Link -Icon

		javascript_Executor_Scroll_Or_Click("click", managerap.getCasualDressPage().getCasual_Dress_Quickview());

		// sleep(4000);

		
		//-------------------------Casual_Dress_Add_To_Cart_Page_5 -> Quantity, Size, Cart btn-------------------------
		
		click_On_Element(managerap.getCasualDressCart().getCasual_Dress_Quantity());  // Quantity

		select_By_Visibletext(managerap.getCasualDressCart().getCasual_Dress_Size(), "M"); // Size

		click_On_Element(managerap.getCasualDressCart().getAdd_To_Cart_Button());  // Add to cart button
		
		
		//-------------------------Order_Summary_Page_6------------------------- 

		click_On_Element(managerap.getOrderSummary().getProceed_To_Checkout()); // 1st Checkout
		
		
		//-------------------------Order_Signin_Page_7-------------------------

		click_On_Element(managerap.getOrderSignIn().getProceed_To_Checkout()); // 2nd Checkout
		

		//-------------------------Order_Address_Page_8-------------------------
		
		click_On_Element(managerap.getOrderAddress().getProceed_To_Checkout()); // 3rd Checkout

		
		//-------------------------Order_Shipping_Page_9-------------------------
		
		click_On_Element(managerap.getOrderShipping().getTerms_Of_Service_Btn()); // Terms of Service Button

		click_On_Element(managerap.getOrderShipping().getProceed_To_Checkout());  // 4th checkout
		

		//-------------------------Order_Payment_Page_10 -> Payment by Bank Wire, Check-------------------------
		
		click_On_Element(managerap.getOrderPayment().getPay_Bank_Wire()); // Bank Wire

		
		//------------------------- Confirm_My_Order_Page_11----------------------------------
		
		click_On_Element(managerap.getConfirmMyOrder().getConfirm_My_Order_Btn());// I Confirm my order Button
		

		//-------------------------Order_Confirmation_Page_12  ->Scrolling Down the Page-------
		
		javascript_Executor_Scroll_Or_Click("scroll", managerap.getOrderConfirmation().getOrder_Confirmation_Box_Loct()); // Scrolling Down the Page - Order Confirmation Box Location

		// Confirming Order Screenshot
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaCasualDressConfirm.png");
		
		click_On_Element(managerap.getOrderConfirmation().getBack_To_Orders()); // Back to Order Link - Goes to Order History
		

		//-------------------------Order_History_Page_13----------------------------------------------------
		
		System.out.println("Latest Shopping - Casual Dress - Order Id: " + get_Text(managerap.getOrderHistory().getOrder_Id_1())); // WebTable - Print Order Id ALone

		javascript_Executor_Scroll_Or_Click("scroll", managerap.getOrderHistory().getOrder_Reference_Loct()); // Scrolling Down the Page

		// ScreenShot of Casual Dress Shopping History
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaCasualDressOrderHistory.png");

		//Dresses -> Evening Dresses
		
		actions(managerap.getOrderHistory().getDresses(), "movetoelement"); //Dresses again

		actions(managerap.getOrderHistory().getEvening_Dress(), "movetoelement"); //Evening Dress
		actions(managerap.getOrderHistory().getEvening_Dress(), "click");

		//-------------------------Evening_Dress_Page_14----------------------------------------

		javascript_Executor_Scroll_Or_Click("scroll", managerap.getEveningDressPage().getEvening_Dress_Quickview()); // Evening Dress Image -> Quick View
		javascript_Executor_Scroll_Or_Click("click", managerap.getEveningDressPage().getEvening_Dress_Quickview()); //Click on Quick View

		sleep(4000);

		//-------------------------Evening_Printed_Dress_Page_15----------------------------------------
		
		click_On_Element(managerap.getEveningDressCart().getEvening_Dress_Quantity()); //Evening Dress Quantity
		click_On_Element(managerap.getEveningDressCart().getEvening_Dress_Quantity());
		click_On_Element(managerap.getEveningDressCart().getEvening_Dress_Quantity());

		select_By_Visibletext(managerap.getEveningDressCart().getEvening_Dress_Size(), "M");//Evening Dress Size - M
		
		click_On_Element(managerap.getEveningDressCart().getEvening_Dress_Colour()); //Evening Dress Colour - Pink

		click_On_Element(managerap.getEveningDressCart().getAdd_To_Cart_Btn()); // Add to cart Button

		//-------------------------Order_Summary_Page_6----------------------------------------
		
		click_On_Element(managerap.getOrderSummary().getProceed_To_Checkout()); // 1st Checkout


		//-------------------------Order_Signin_Page_7----------------------------------------
		
		click_On_Element(managerap.getOrderSignIn().getProceed_To_Checkout()); // 2nd Checkout
		
		
		//-------------------------Order_Address_Page_8----------------------------------------
		
		click_On_Element(managerap.getOrderAddress().getProceed_To_Checkout()); // 3rd Checkout

		
		//-------------------------Order_Shipping_Page_9-------------------------
		
		click_On_Element(managerap.getOrderShipping().getTerms_Of_Service_Btn()); //terms&conditions

		click_On_Element(managerap.getOrderShipping().getProceed_To_Checkout()); // 4th Checkout

		
		//-------------------------Order_Payment_Page_10 -> Payment by Bank Wire, Check-------------------------
		
		click_On_Element(managerap.getOrderPayment().getPay_Check()); // Payment by Check

		
		//------------------------- Confirm_My_Order_Page_11-----------------------------------
		
		click_On_Element(managerap.getConfirmMyOrder().getConfirm_My_Order_Btn());  // I Confirm My Order Button

		
		// -------------------------Order_Confirmation_Page_12  ->Scroll Down the Page----------------
		
		javascript_Executor_Scroll_Or_Click("scroll", managerap.getOrderConfirmation().getOrder_Confirmation_Box_Loct()); // Scrolling Down - Confirmation Box Location

		// Screenshot of Evening Dress Order Confirmation
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaevenDressOrderConfirm.png");

		click_On_Element(managerap.getOrderConfirmation().getBack_To_Orders()); // Back to Order - History

		
		//-------------------------Order_History_Page_13----------------------------------------------------
		
		System.out.println("Latest Shopping - Evening Dress - Order Id:  " + get_Text(managerap.getOrderHistory().getOrder_Id_1())); //WebTable - Print Order Id ALone

		javascript_Executor_Scroll_Or_Click("scroll", managerap.getOrderHistory().getOrder_Reference_Loct()); //Scrolling Down the Page

		// ScreenShot of Evening Dress Shopping History
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaevenDressOrderHistory.png");

		// Dresses -> Summer Dress

		actions(managerap.getOrderHistory().getDresses(), "movetoelement"); // Dresses

		actions(managerap.getOrderHistory().getSummer_Dress(), "movetoelement"); //Summer Dress
		actions(managerap.getOrderHistory().getSummer_Dress(), "click"); //Summer Dress

		//-----------------summer_Dress_Page_16------------------------------------------------------
		
		javascript_Executor_Scroll_Or_Click("scroll", managerap.getSummerDressPage().getSummer_Dress_Quickview()); //Summer Dress Image- QuickView
		javascript_Executor_Scroll_Or_Click("click", managerap.getSummerDressPage().getSummer_Dress_Quickview());

		sleep(4000);

		//-----------------summer_Printed_Dress_Page_17---------------------------------------------
		
		click_On_Element(managerap.getSummerDressCart().getSummer_Dress_Quantity()); //Summer DressQuantity
		click_On_Element(managerap.getSummerDressCart().getSummer_Dress_Quantity());

		select_By_Visibletext(managerap.getSummerDressCart().getSummer_Dress_Size(), "L"); //Summer Dress Size

		click_On_Element(managerap.getSummerDressCart().getSummer_Dress_Colour());  //Summer Dress Colour - Orange

		click_On_Element(managerap.getSummerDressCart().getAdd_To_Cart_Btn()); // Add to Cart Button

		
		//-------------------------Order_Summary_Page_6----------------------------------------
		
		click_On_Element(managerap.getOrderSummary().getProceed_To_Checkout()); // 1st Checkout

		
		//-------------------------Order_Signin_Page_7----------------------------------------
		
		click_On_Element(managerap.getOrderSignIn().getProceed_To_Checkout()); // 2nd Checkout

		
		//-------------------------Order_Address_Page_8----------------------------------------
		
		click_On_Element(managerap.getOrderAddress().getProceed_To_Checkout()); // 3rd Checkout

		
		//-------------------------Order_Shipping_Page_9-------------------------
		
		click_On_Element(managerap.getOrderShipping().getTerms_Of_Service_Btn()); // Terms of Service Button

		click_On_Element(managerap.getOrderShipping().getProceed_To_Checkout()); // 4th Checkout

		
		//-------------------------Order_Payment_Page_10 -> Payment by Bank Wire, Check-------------------------
		
		click_On_Element(managerap.getOrderPayment().getPay_Bank_Wire());  // // Payment by Bank Wire

		
		//------------------------- Confirm_My_Order_Page_11-----------------------------------

		click_On_Element(managerap.getConfirmMyOrder().getConfirm_My_Order_Btn()); //I confirm my order button
		
		
		// -------------------------Order_Confirmation_Page_12  ->Scrolling Down the Page-------
		
		javascript_Executor_Scroll_Or_Click("scroll", managerap.getOrderConfirmation().getOrder_Confirmation_Box_Loct()); // Scrolling Down the Page - Order Box Location 

		// Screenshot of Summer Dress Order Confirmation
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStasummerDressOrdrConfirm.png");

		click_On_Element(managerap.getOrderConfirmation().getBack_To_Orders()); // Back to Order - History
		
		
		//-------------------------Order_History_Page_13----------------------------------------------------
		
		System.out.println("Latest Shopping - Summer Dress - OrderId:  " + get_Text(managerap.getOrderHistory().getOrder_Id_1())); // WebTable - Print Order Id ALone

		javascript_Executor_Scroll_Or_Click("scroll", managerap.getOrderHistory().getOrder_Reference_Loct()); // Scrolling Down the Page to Order Reference

		// ScreenShot of Casual Dress Shopping History
		takes_Screenshot(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStasummerDressOrderHistory.png");

		sleep(2000);

		// Logout
		click_On_Element(managerap.getOrderHistory().getLogOut_Btn());
	}
}