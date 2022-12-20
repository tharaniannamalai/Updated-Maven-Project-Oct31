package com.api;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Retrieve_Response {
	
	@Test
	public void response_Body()
	{
		
		RestAssured.baseURI = "https://reqres.in/"; // Giving URI
		
		RequestSpecification request = RestAssured.given(); // sending request
		
		Response response = request.get("/api/users/2"); // Connect with operator - get
		
		System.out.println(response.asPrettyString());
		
		System.out.println(response.getStatusLine());
		
		int code = response.getStatusCode();
		
		Assert.assertEquals(200, code);
		
		System.out.println("Validation");
		
	}
}