package com.testing.attributes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.utilityFiles.Utility_Files;

public class Hard_Assert {

	public static WebDriver driver = Utility_Files.browser_Config("chrome");
	
	@Test(description = "Both urls are equal but checking for assertNotEquals")
	private void launch_Url() {
		driver.get("https://www.facebook.com/"); // Go to Facebook login page

		driver.findElement(By.xpath("//a[.='Forgotten password?']")).click(); // Click on Forgotten Password

		// Forgetten Password Page Url
		String expectedUrl = "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0";

		Assert.assertNotEquals(driver.getCurrentUrl(), expectedUrl);
		
		//Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

		System.out.println("Validation Success");

	}

}
