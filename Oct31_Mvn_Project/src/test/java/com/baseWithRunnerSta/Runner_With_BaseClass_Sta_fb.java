package com.baseWithRunnerSta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilityFiles.Utility_Files;

public class Runner_With_BaseClass_Sta_fb extends Utility_Files {
	
	public static WebDriver driver = browser_Config("chrome");
	
	public static void main(String[] args){
		
		window_Commands("maximize");
		
		get_Url("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		send_Keys(email, "abc@gmail.com"); 
		
		WebElement password = driver.findElement(By.id("pass"));
		send_Keys(password, "abc1234");
		
		WebElement login = driver.findElement(By.name("login"));
		click_On_Element(login);
	}

}
