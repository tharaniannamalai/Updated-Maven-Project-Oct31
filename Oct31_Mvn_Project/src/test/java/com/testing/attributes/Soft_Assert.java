package com.testing.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.utilityFiles.Utility_Files;

public class Soft_Assert {

public static WebDriver driver = Utility_Files.browser_Config("chrome");
	
	@Test(description = "Both urls are not equal checking for exception")
	private void launch_Url() {
		driver.get("https://www.facebook.com/"); // Go to Facebook login page

		driver.findElement(By.xpath("//a[.='Forgotten password?']")).click(); // Click on Forgotten Password

		// Forgetten Password Page Url
		String expectedUrl = "https://www.facebook.com/";

		SoftAssert soft = new SoftAssert();
		
		//soft.assertNotEquals(driver.getCurrentUrl(), expectedUrl);
		soft.assertEquals(driver.getCurrentUrl(), expectedUrl);

		soft.assertAll();
		
		System.out.println("Verification Success");
	}
}
