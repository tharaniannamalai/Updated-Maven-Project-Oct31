package com.pom.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casual_Dresses_Page_4 {
	
	public WebDriver driver;
	
	public Casual_Dresses_Page_4(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='quick-view-mobile']") //Casual Dress Image - Quickview
	private WebElement casual_Dress_Quickview;

	//Getters
	public WebElement getCasual_Dress_Quickview() {
		return casual_Dress_Quickview;
	}
}