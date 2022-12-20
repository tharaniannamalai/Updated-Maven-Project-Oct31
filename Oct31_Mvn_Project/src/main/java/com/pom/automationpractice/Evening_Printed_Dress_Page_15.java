package com.pom.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Evening_Printed_Dress_Page_15 {
	
	public WebDriver driver;
	
	public Evening_Printed_Dress_Page_15(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='icon-plus']") //Evening Dress - Quantity
	private WebElement evening_Dress_Quantity;
	
	@FindBy(xpath = "//select[@id='group_1']") //Evening Dress - Size
	private WebElement evening_Dress_Size;
	
	@FindBy(xpath = "//a[@name='Pink']") //Evening Dress - Colour
	private WebElement evening_Dress_Colour;
	
	@FindBy(xpath = "//button[@name='Submit']") //Evening Dress - Add to cart button
	private WebElement add_To_Cart_Btn;

	public WebElement getEvening_Dress_Quantity() {
		return evening_Dress_Quantity;
	}

	public WebElement getEvening_Dress_Size() {
		return evening_Dress_Size;
	}

	public WebElement getEvening_Dress_Colour() {
		return evening_Dress_Colour;
	}

	public WebElement getAdd_To_Cart_Btn() {
		return add_To_Cart_Btn;
	}
}