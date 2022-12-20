package com.pom.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Shipping_Page_9 {
	
	public WebDriver driver;
	
	public Order_Shipping_Page_9(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='cgv']") //Terms and service radio button
	private WebElement terms_Of_Service_Btn;
	
	@FindBy(xpath = "//button[@name='processCarrier']") //4th Proceed to checkout button
	private WebElement proceed_To_Checkout;

	//Getters
	public WebElement getTerms_Of_Service_Btn() {
		return terms_Of_Service_Btn;
	}

	public WebElement getProceed_To_Checkout() {
		return proceed_To_Checkout;
	}
}