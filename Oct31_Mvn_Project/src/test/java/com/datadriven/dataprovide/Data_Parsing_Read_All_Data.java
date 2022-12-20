package com.datadriven.dataprovide;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utilityFiles.Utility_Files;

public class Data_Parsing_Read_All_Data extends Utility_Files{

	@DataProvider
	private Object[][] data_Values_Login() throws IOException
	{
	    Object[][] readAllData = read_All_Data("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\DataDrivenDataProviderReadAllData.xlsx", 0);
	   
	    return readAllData;
	}

	@Test(alwaysRun = true, dataProvider = "data_Values_Login")
	private void adactin(String loginDetails[])
	{
		System.out.println("UserName: " +loginDetails[0]);
		System.out.println("Password: "+ loginDetails[1]);
	}
}
