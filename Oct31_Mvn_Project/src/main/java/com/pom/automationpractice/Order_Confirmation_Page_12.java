package com.pom.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Confirmation_Page_12 {
	
	public WebDriver driver;
	
	public Order_Confirmation_Page_12(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='center_column']") //Locating Order Confirmation Box for screenshot
	private WebElement order_Confirmation_Box_Loct;
	
	@FindBy(xpath = "//a[@title='Back to orders']") // Back to orders link - For Order History Page
	private WebElement back_To_Orders;

	//Getters
	public WebElement getOrder_Confirmation_Box_Loct() {
		return order_Confirmation_Box_Loct;
	}

	public WebElement getBack_To_Orders() {
		return back_To_Orders;
	}
}