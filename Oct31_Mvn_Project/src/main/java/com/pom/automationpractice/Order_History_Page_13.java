package com.pom.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_History_Page_13 {
	
	public WebDriver driver;
	
	public Order_History_Page_13(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//table[@id='order-list']/tbody/tr[1]/td[1]") //Web Table
	private WebElement order_Id_1;
	
	@FindBy(xpath = "//th[.='Order reference']") //Order Reference
	private WebElement order_Reference_Loct;

	@FindBy(xpath = "(//a[@title='Dresses'])[2]") //Dresses
	private WebElement dresses;
	
	@FindBy(xpath = "(//a[text()='Evening Dresses'])[2]") //Evening Dress
	private WebElement evening_Dress;
	
	@FindBy(xpath = "(//a[text()='Summer Dresses'])[2]") //Summer Dress
	private WebElement summer_Dress;
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logOut_Btn;
	
	//Getters
	public WebElement getOrder_Id_1() {
		return order_Id_1;
	}

	public WebElement getOrder_Reference_Loct() {
		return order_Reference_Loct;
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getEvening_Dress() {
		return evening_Dress;
	}

	public WebElement getSummer_Dress() {
		return summer_Dress;
	}

	public WebElement getLogOut_Btn() {
		return logOut_Btn;
	}
}