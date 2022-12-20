package com.testing.attributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Parsing {

	@DataProvider
	private String[][] data_Values_Login() {
		String[][] values = { { "Prenise", "12345" }, { "Yudhveer", "abcdef" }, { "Suga", "abc123" } };

		return values;
	}

	@Test(dataProvider = "data_Values_Login")
	private void fb_Login(String userName, String password) {
		System.out.println("UserName: " + userName);
		System.out.println("Password: " + password);
	}
	
	@Test(dataProvider = "data_Values_Login")
	private void insta_Login(String userName, String password) {
		System.out.println("UserName: " + userName);
		System.out.println("Password: " + password);
	}	
}