package com.pom.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mystore_Signin_1 {
	
	public WebDriver driver;
	
	public Mystore_Signin_1(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this); //To access all elements in signIn page
	}
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signInBtn;

	//Getters
	public WebElement getSignInBtn() {
		return signInBtn;
	}
}