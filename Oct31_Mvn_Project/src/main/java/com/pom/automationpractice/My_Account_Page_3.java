package com.pom.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Account_Page_3 {
	
	public WebDriver driver;
	
	public My_Account_Page_3(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@title='Dresses'])[2]") //Dresses
	private WebElement dresses;
	
	@FindBy(xpath = "(//a[@title='Casual Dresses'])[2]") //Casual Dress
	private WebElement casual_Dress;

	//Getters
	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getCasual_Dress() {
		return casual_Dress;
	}
}