package com.testing.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.pageobjectmanager.Page_Object_Manager_Fb;
import com.utilityFiles.Utility_Files;

public class Invocation_Count_Task extends Utility_Files{

	public static WebDriver driver = browser_Config("chrome");

	public static Page_Object_Manager_Fb manager = new Page_Object_Manager_Fb(driver);

	@Test(invocationCount = 2)
	private void login()
	{
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		send_Keys(email, "abc@gmail.com");
	}
}