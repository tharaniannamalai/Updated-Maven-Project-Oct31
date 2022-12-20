package com.testing.attributes;

import org.testng.annotations.DataProvider;

public class DP_Utility {

	@DataProvider
	private String[][] login_Detais()
	{
		String[][] login_Values = {
				{"Prenise","12345"},{"Yudhveer", "abcde"},{"Yadhav", "654321"}
		};
		
		return login_Values;
	}
	
	@DataProvider
	private String[][] address_Details()
	{
		String[][] address_Values = {
				{"Alphen Mews","Kloof"}, {"Oceanic","Hillcrest"},{"Mathew Garderns", "Bellair"}
		};
		return address_Values;
	}
}
