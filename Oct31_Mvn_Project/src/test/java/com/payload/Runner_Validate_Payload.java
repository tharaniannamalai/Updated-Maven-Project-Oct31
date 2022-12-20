package com.payload;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.junit.Test;

import com.utility_Files.api.Utility_Files_Api;

public class Runner_Validate_Payload extends Utility_Files_Api {
	
	@Test
	public void validate_Payload() throws IOException, ParseException {
		
		String validate_Payload_Value = Validate_Payload("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\src\\test\\java\\com\\payload\\Payload.json",
						"email", "janet.weaver@reqres.in");
		
		System.out.println("Validated Key's Value : " +validate_Payload_Value);
	}
}
