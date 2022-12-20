package com.pom.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casual_Dress_Add_To_Cart_Page_5 {

	public WebDriver driver;
	
	public Casual_Dress_Add_To_Cart_Page_5(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class='icon-plus']") //Casual Dress Quantity
	private WebElement casual_Dress_Quantity;
	
	@FindBy(xpath = "//select[@id='group_1']") //Casual Dress Size
	private WebElement casual_Dress_Size;
	
	@FindBy(xpath = "//button[@name='Submit']") //Add to cart button
	private WebElement add_To_Cart_Button;

	//Getters
	public WebElement getCasual_Dress_Quantity() {
		return casual_Dress_Quantity;
	}

	public WebElement getCasual_Dress_Size() {
		return casual_Dress_Size;
	}

	public WebElement getAdd_To_Cart_Button() {
		return add_To_Cart_Button;
	}	
}