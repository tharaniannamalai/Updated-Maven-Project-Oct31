package com.testing.attributes;

import org.testng.annotations.Test;

public class DP_Runner {

	@Test(priority = -1,dataProvider = "login_Detais", dataProviderClass = DP_Utility.class)
	private void login(String userName, String password)
	{
		System.out.println("Username: " +userName);
		System.out.println("Password: " +password);
	}
	
	@Test(dependsOnMethods = "login", dataProvider = "address_Details", dataProviderClass = DP_Utility.class)
	private void address(String address, String city)
	{
		System.out.println("Address: " +address);
		System.out.println("City: " +city);
	}
}