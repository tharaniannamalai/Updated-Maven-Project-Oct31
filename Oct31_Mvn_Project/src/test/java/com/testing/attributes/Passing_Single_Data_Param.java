package com.testing.attributes;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Passing_Single_Data_Param {
	
	@Parameters({"uname" ,"pass"})
	@Test
	public static void credentials_Login(String username, String password)
	{
		System.out.println("Username: " +username);
		System.out.println("Password: " +password);
	}

	@Parameters({"fnameeeee", "lname"})
	@Test
	public static void surNames(@Optional("Mano")String firstName, String lastName)
	{
		System.out.println("FirstName: " +firstName);
		System.out.print("LastName: " +lastName);
	}
}