package com.pom.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_2 {
	
	public WebDriver driver;
	
	public Login_Page_2(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this); // To access all elements in Login Page
	}
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailId;
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement logInBtn;

	//Getters
	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogInBtn() {
		return logInBtn;
	}
}
