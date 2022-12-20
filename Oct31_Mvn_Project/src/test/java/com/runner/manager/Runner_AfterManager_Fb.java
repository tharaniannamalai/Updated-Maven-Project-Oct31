package com.runner.manager;

import org.openqa.selenium.WebDriver;

import com.pageobjectmanager.Page_Object_Manager_Fb;
import com.utilityFiles.Utility_Files;

public class Runner_AfterManager_Fb extends Utility_Files{
	
	public static WebDriver driver = browser_Config("chrome");
	
	public static Page_Object_Manager_Fb manager= new Page_Object_Manager_Fb(driver);
	
	public static void main(String[] args) {
		
		window_Commands("maximize");
		
		get_Url("https://www.facebook.com/");
		
		send_Keys(manager.getLogin().getEmail(), "abc@gmail.com"); 
		
		send_Keys(manager.getLogin().getPassword(), "abc1234");
		
		click_On_Element(manager.getLogin().getLogin());
	}
}
