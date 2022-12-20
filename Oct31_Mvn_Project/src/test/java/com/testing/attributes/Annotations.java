package com.testing.attributes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	private void setProperty()
	{
		System.out.println("Set Property");
	}
	
	@BeforeTest
	private void browser_Launch()
	{
		System.out.println("Browser Launced");
	}
	
	@BeforeClass
	private void launch_Url()
	{
		System.out.println("Url Launched");
	}
	
	@BeforeMethod
	private void Login()
	{
		System.out.println("Login");
	}
	
	@Test
	private void casualDress() {
		System.out.println("Casual Dress");
	}

	@Test
	private void eveningDress()
	{
		System.out.println("Evening Dress");
	}
	
	@Test
	private void summerDress()
	{
		System.out.println("Summer Dress");
	}
	
	@AfterMethod
	private void Logout()
	{
		System.out.println("Logout");
	}
	
	@AfterClass
	private void verify_Homepage()
	{
		System.out.println("In Homepage");
	}
	
	@AfterTest
	private void browser_Close()
	{
		System.out.println("Browser Closed");
	}
	
	@AfterSuite
	private void deleteCookies()
	{
		System.out.println("Cookies deleted");
	}
}
