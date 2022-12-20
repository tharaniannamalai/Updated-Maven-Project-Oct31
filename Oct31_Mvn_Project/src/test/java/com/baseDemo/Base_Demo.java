package com.baseDemo;

public class Base_Demo {

	public static int student_Id(int id)
	{
		return id;	
	}
	
	public static String student_Name(String name)
	{
		String upperCase = name.toUpperCase();
		
		return upperCase;
	}
	
	public static boolean contains_Check(String name, String value)
	{
		boolean contains = name.contains(value);
		
		return contains;
	}
	
}
