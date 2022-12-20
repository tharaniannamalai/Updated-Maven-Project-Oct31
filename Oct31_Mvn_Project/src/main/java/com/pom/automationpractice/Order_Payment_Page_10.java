package com.pom.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Payment_Page_10 {
	
	public WebDriver driver;
	
	public Order_Payment_Page_10(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='bankwire']") //Payment by Bank Wire
	private WebElement pay_Bank_Wire;
	
	@FindBy(xpath = "//a[@title='Pay by check.']") //Payment by Check
	private WebElement pay_Check;

	//Getters
	public WebElement getPay_Bank_Wire() {
		return pay_Bank_Wire;
	}

	public WebElement getPay_Check() {
		return pay_Check;
	}
}