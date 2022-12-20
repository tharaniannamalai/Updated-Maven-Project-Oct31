package com.baseWithRunnerAndPom;

import org.openqa.selenium.WebDriver;

import com.pom.fb.Fb_Login_Page;
import com.utilityFiles.Utility_Files;

public class Runner_With_Base_And_Pom_Fb extends Utility_Files{
	
	public static WebDriver driver = browser_Config("chrome");

	public static Fb_Login_Page fb = new Fb_Login_Page(driver);
	
	public static void main(String[] args) {
		
		window_Commands("maximize");
		
		get_Url("https://www.facebook.com/");
		
		send_Keys(fb.getEmail(), "abc@gmail.com"); 
		
		send_Keys(fb.getPassword(), "abc1234");
		
		click_On_Element(fb.getLogin());
	}
}
