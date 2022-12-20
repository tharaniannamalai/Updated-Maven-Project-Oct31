package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class sample {
	
	@BeforeClass
	public static void urlLaunch()
	{
		System.out.println("Automation Practice");
	}
	
	@Before
	public void Login()
	{
		System.out.println("Login");
	}
	
	@Test
	public void casual_Dresses_1()
	{
		System.out.println("Casual Dress");
	}
	
	@Test
	public void evening_Dress_3()
	{
		System.out.println("Evening Dress");
		
	}
	
	@Test
	public void summer_Dress_5()
	{
		System.out.println("Summer Summer Dress");
	}
	
	@After
	public void checkout()
	{
		System.out.println("Logout");
	}
}
