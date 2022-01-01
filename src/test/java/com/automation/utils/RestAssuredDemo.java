package com.automation.utils;

import java.io.FileNotFoundException;

import io.restassured.RestAssured;

public class RestAssuredDemo {
	public static void main(String[] args) throws FileNotFoundException {
		
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com/").
		when().get("/booking").then().statusCode(200);
		
		
	}
}
