package com.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestData_Reader_Fb {

	public static Properties p;
	
	public TestData_Reader_Fb() throws IOException
	{
		File f = new File(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\src\\main\\java\\com\\properties\\Fb_Test_Data.properties");
		
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String getEmail()
	{
		String email = p.getProperty("email");
		return email;
	}
	
	public String getPassword()
	{
		String password = p.getProperty("password");
		return password;
	}
}
