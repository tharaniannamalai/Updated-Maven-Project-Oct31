package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

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

public class Page_Object_Manager_Automation_Practice {

	public WebDriver driver;
	
    private Mystore_Signin_1 signinPage;
	
	private Login_Page_2 loginPage;
	
	private My_Account_Page_3 myAccountPage;
	
	private Casual_Dresses_Page_4 casualDressPage;
	
	private Casual_Dress_Add_To_Cart_Page_5 casualDressCart;
	
	private Order_Summary_Page_6 orderSummary;
	
	private Order_Signin_Page_7 orderSignIn;
	
	private Order_Address_Page_8 orderAddress;
	
	private Order_Shipping_Page_9 orderShipping;
	
	private Order_Payment_Page_10 orderPayment;
	
	private Confirm_My_Order_Page_11 confirmMyOrder;
	
	private Order_Confirmation_Page_12  orderConfirmation;
	
	private Order_History_Page_13 orderHistory;
	
	private Evening_Dress_Page_14 eveningDressPage;
	
	private Evening_Printed_Dress_Page_15 eveningDressCart;
	
	private Summer_Dress_Page_16 summerDressPage;
	
	private Summer_Printed_Dress_17 summerDressCart;

	public Page_Object_Manager_Automation_Practice(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Getters
	public Mystore_Signin_1 getSigninPage() {
		
		if(signinPage == null)
		{
			signinPage = new Mystore_Signin_1(driver);
		}
		
		return signinPage;
	}

	public Login_Page_2 getLoginPage() {
		
		if(loginPage == null)
		{
			loginPage = new Login_Page_2(driver);
		}
		
		return loginPage;
	}

	public My_Account_Page_3 getMyAccountPage() {
		
		if(myAccountPage == null)
		{
			myAccountPage = new My_Account_Page_3(driver);
		}
		
		return myAccountPage;
	}

	public Casual_Dresses_Page_4 getCasualDressPage() {
		
		if(casualDressPage == null)
		{
			casualDressPage = new Casual_Dresses_Page_4(driver);
		}
		
		return casualDressPage;
	}

	public Casual_Dress_Add_To_Cart_Page_5 getCasualDressCart() {
		
		if(casualDressCart == null)
		{
			casualDressCart = new Casual_Dress_Add_To_Cart_Page_5(driver);
		}
		
		return casualDressCart;
	}

	public Order_Summary_Page_6 getOrderSummary() {
		
		if(orderSummary == null)
		{
			orderSummary = new Order_Summary_Page_6(driver);
		}
		
		return orderSummary;
	}

	public Order_Signin_Page_7 getOrderSignIn() {
		
		if(orderSignIn == null)
		{
			orderSignIn = new Order_Signin_Page_7(driver);
		}

		return orderSignIn;
	}

	public Order_Address_Page_8 getOrderAddress() {
		
		if(orderAddress == null)
		{
			orderAddress = new Order_Address_Page_8(driver);
		}
		
		return orderAddress;
	}

	public Order_Shipping_Page_9 getOrderShipping() {
		
		if(orderShipping == null)
		{
			orderShipping = new Order_Shipping_Page_9(driver);
		}
		
		return orderShipping;
	}

	public Order_Payment_Page_10 getOrderPayment() {
		
		if(orderPayment == null)
		{
			orderPayment = new Order_Payment_Page_10(driver);
		}
		
		return orderPayment;
	}

	public Confirm_My_Order_Page_11 getConfirmMyOrder() {
		
		if(confirmMyOrder == null)
		{
			confirmMyOrder = new Confirm_My_Order_Page_11(driver);
		}
		
		return confirmMyOrder;
	}

	public Order_Confirmation_Page_12 getOrderConfirmation() {
		
		if(orderConfirmation == null)
		{
			orderConfirmation = new Order_Confirmation_Page_12(driver);
		}
		
		return orderConfirmation;
	}

	public Order_History_Page_13 getOrderHistory() {
		
		if(orderHistory == null)
		{
			orderHistory = new Order_History_Page_13(driver);
		}
		
		return orderHistory;
	}

	public Evening_Dress_Page_14 getEveningDressPage() {
		
		if(eveningDressPage == null)
		{
			eveningDressPage = new Evening_Dress_Page_14(driver);
		}
		
		return eveningDressPage;
	}

	public Evening_Printed_Dress_Page_15 getEveningDressCart() {
		
		if(eveningDressCart == null)
		{
			eveningDressCart = new Evening_Printed_Dress_Page_15(driver);
		}
		
		return eveningDressCart;
	}

	public Summer_Dress_Page_16 getSummerDressPage() {
		
		if(summerDressPage == null)
		{
			summerDressPage = new Summer_Dress_Page_16(driver);
		}
		
		return summerDressPage;
	}

	public Summer_Printed_Dress_17 getSummerDressCart() {
		
		if(summerDressCart == null)
		{
			summerDressCart = new Summer_Printed_Dress_17(driver);
		}
		
		return summerDressCart;
	}
}