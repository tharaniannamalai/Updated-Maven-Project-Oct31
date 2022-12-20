package com.pom.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Address_Page_8 {

	public WebDriver driver;
	
	public Order_Address_Page_8(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@name='processAddress']") //3rd Proceed to Checkout
	private WebElement proceed_To_Checkout;

	//Getters
	public WebElement getProceed_To_Checkout() {
		return proceed_To_Checkout;
	}
}