package com.testing.attributes;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Runner {
	
	@Test(description = "Checking actual & expected username")
	private void db_UserName()
	{
		String expected_UserName = "Mano";
		
		String actual_UserName = "Mano";
		
		Assert.assertEquals(actual_UserName, expected_UserName);
	}
	
	@Test(priority =1, description = "checking actual & expected password")
	private void db_Password()
	{
		String expected_Password = "12345";
	
		String actual_Password = "abcdef";

		Assert.assertEquals(actual_Password, expected_Password);
	}
}