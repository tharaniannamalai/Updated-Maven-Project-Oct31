package com.pom.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Signin_Page_7 {

	public WebDriver driver;

	public Order_Signin_Page_7(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]") // 2nd Proceed to Checkout
	private WebElement proceed_To_Checkout;

	// Getters
	public WebElement getProceed_To_Checkout() {
		return proceed_To_Checkout;
	}
}