package com.testing.attributes;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilityFiles.Utility_Files;

public class Parallel_Runner {
	
	public static WebDriver driver ;
	
	@BeforeClass
	private void launch()
	{
		driver = Utility_Files.browser_Config("chrome");
		driver = Utility_Files.browser_Config("edge");
	}

	@Test
	private void fb()
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	private void insta()
	{
		driver.get("https://www.instagram.com/");
	}
}
