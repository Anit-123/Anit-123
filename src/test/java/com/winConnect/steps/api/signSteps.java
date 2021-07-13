//package com.winConnect.steps.api;
//
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//
//public class signSteps {
//	
//	@When("I perform POST request for {string} endpoint")
//	public void i_perform_POST_request_for_endpoint(String baseUri) {
//		
//		RestAssured.baseURI=baseUri;
//		String payload = "{\r\n" + 
//				"  \"userName\": \"admin\",\r\n" + 
//				"  \"password\": \"qwerty6\"\r\n" + 
//				"}";
//		
//		
//		RequestSpecification httpRequest = RestAssured.given();
//		httpRequest.header("Content-Type","application/json");
//		Response response = httpRequest.body(payload).post();
//		System.err.println(	response.getStatusCode());
//	   
//	}
//
//	@Then("I get a {int} http satus code")
//	public void i_get_a_http_satus_code(Integer int1) {
//	
//
//	    
//	}
//
//}
