package com.api;


import org.junit.Test;

import com.utility_Files.api.Utility_Files_Api;

public class Runner_Retrive_Response_With_Utility extends Utility_Files_Api {
	
	@Test //Retrieve Response Body
	public void response_Body()
	{
		//Retrieve Response Body
		String responseBody = retrieve_Response_Body("https://reqres.in/","/api/users/2");
		
		System.err.println("\nRetrieve Response Body\n");
		
		System.out.println(responseBody);
	
		//Retrieve Response Code
		int responseCode = retrieve_Response_Code("https://reqres.in/","/api/users/2",200);
		
		System.err.println("\nRetrieve Response Code\n");
		
		System.out.println(responseCode);
		
		//Retrieve Response Line
		String responseLine = retrieve_Response_Line("https://reqres.in/","/api/users/2");
		
		System.err.println("\nRetrieve Response Line\n");
		
		System.out.println(responseLine);
		
		//Retrieve Response Session Id
		String responseSessionId = retrieve_Response_Session_Id("https://reqres.in/","/api/users/2");
		
		System.err.println("\nRetrieve Response Session Id\n");
		
		System.out.println(responseSessionId);
		
		//Retrieve Response Content Type
		String responseContentType = retrieve_Response_Content_Type("https://reqres.in/","/api/users/2");
		
		System.err.println("\nRetrieve Response Session Content Type\n");
		
		System.out.println(responseContentType);		
	}
}