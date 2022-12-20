package com.pom.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summer_Dress_Page_16 {

	public WebDriver driver;
	
	public Summer_Dress_Page_16(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@class='quick-view-mobile'])[1]") //Summer Dress - QuickView
	private WebElement summer_Dress_Quickview;
	
	//Getters
		public WebElement getSummer_Dress_Quickview() {
			return summer_Dress_Quickview;
		}
}