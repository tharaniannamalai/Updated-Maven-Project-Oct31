package com.pom.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Evening_Dress_Page_14 {
	
	public WebDriver driver;
	
	public Evening_Dress_Page_14(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='quick-view-mobile']") //Evening Dress - QuickView
	private WebElement evening_Dress_Quickview;

	//Getters
	public WebElement getEvening_Dress_Quickview() {
		return evening_Dress_Quickview;
	}
}