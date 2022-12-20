package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.fb.Fb_Login_Page;

public class Page_Object_Manager_Fb {

	public WebDriver driver;
	
	private Fb_Login_Page fb;
	
	public Page_Object_Manager_Fb(WebDriver driver)
	{
		this.driver = driver;
	}

	public Fb_Login_Page getLogin() {
		
		if(fb == null) {
			
			fb = new Fb_Login_Page(driver);
		}
		return fb;
	}
}
