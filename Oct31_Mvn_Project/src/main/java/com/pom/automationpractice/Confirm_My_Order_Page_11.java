package com.pom.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_My_Order_Page_11 {
	
	public WebDriver driver;
	
	public Confirm_My_Order_Page_11(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[starts-with(@class,'button btn')]") //I confirm my order button
	private WebElement confirm_My_Order_Btn;

	//Getters
	public WebElement getConfirm_My_Order_Btn() {
		return confirm_My_Order_Btn;
	}
}