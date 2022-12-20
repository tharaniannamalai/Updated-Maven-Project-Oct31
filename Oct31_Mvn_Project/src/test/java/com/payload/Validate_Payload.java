package com.payload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;



public class Validate_Payload {
	
	@Test
	public void validate_Json() throws IOException, ParseException 
	{
		File f = new File("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\src\\test\\java\\com\\payload\\Payload.json");
		
		FileReader reader = new FileReader(f); //Passing the file
		
		JSONParser json = new JSONParser();
		
		Object parser = json.parse(reader); //Passing the reader
		
		JSONObject jsonObj = (JSONObject)parser; //converting object into JSONObject - Narrow Typecasting - Implements Unordered -HashMap
		
		Object emailObj = jsonObj.get("email");
		
		String emailValue = emailObj.toString();
		
		System.out.println("Email Id :" + emailValue);
		
		Assert.assertEquals("janet.weaver@reqres.in", emailValue);
		
		System.out.println("Validation Done");
	}

}
