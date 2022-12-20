package com.pom.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summer_Printed_Dress_17 {
	
	public WebDriver driver;
	
	public Summer_Printed_Dress_17(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='icon-plus']") //Summer Dress - Quantity
	private WebElement summer_Dress_Quantity;
	
	@FindBy(xpath = "//select[@id='group_1']") //Summer Dress - Size
	private WebElement summer_Dress_Size;
	
	@FindBy(xpath = "//a[@title='Orange']") //Summer Dress - Colour
	private WebElement summer_Dress_Colour;
	
	@FindBy(xpath = "//button[@name='Submit']") //Summer Dress - Add to cart button
	private WebElement add_To_Cart_Btn;

	public WebElement getSummer_Dress_Quantity() {
		return summer_Dress_Quantity;
	}

	public WebElement getSummer_Dress_Size() {
		return summer_Dress_Size;
	}

	public WebElement getSummer_Dress_Colour() {
		return summer_Dress_Colour;
	}

	public WebElement getAdd_To_Cart_Btn() {
		return add_To_Cart_Btn;
	}
}