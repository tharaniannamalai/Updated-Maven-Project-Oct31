package com.testing.attributes;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pageobjectmanager.Page_Object_Manager_Fb;
import com.reader.File_Reader_Manager_Fb;
import com.singleton.runner.Runner_Aftermanager_Singleton_Fb;
import com.utilityFiles.Utility_Files;

public class Expected_Excep_Fb extends Utility_Files{
	
	public static WebDriver driver = browser_Config("chrome");

	public static Page_Object_Manager_Fb manager = new Page_Object_Manager_Fb(driver);

	public static Logger log = Logger.getLogger(Runner_Aftermanager_Singleton_Fb.class);

	@BeforeClass
	private void browser_Launch() {
		BasicConfigurator.configure();
		window_Commands("maximize");
		get_Url("https://www.facebook.com/");
		log.info("Url Launched");
	}

	@Test(priority = -1, expectedExceptions = NoSuchElementException.class)
	public void email() throws IOException {
		String email = File_Reader_Manager_Fb.getFRM_FB().getTD_FB().getEmail();
		send_Keys(manager.getLogin().getEmail(), email);
		log.info("Emailid data passed");
	}

	@Test(priority = 0)
	public void password() throws IOException {
		String password = File_Reader_Manager_Fb.getFRM_FB().getTD_FB().getPassword();
		send_Keys(manager.getLogin().getPassword(), password);
		log.info("Password data passed");
	}

	@Test(priority = 1)
	public void loginBtn() {
		click_On_Element(manager.getLogin().getLogin());

		log.info("Clicked Login Button");
	}
}
