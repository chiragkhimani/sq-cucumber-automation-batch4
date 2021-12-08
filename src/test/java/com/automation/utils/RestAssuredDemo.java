package com.automation.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import io.restassured.RestAssured;

public class RestAssuredDemo {
	public static void main(String[] args) throws IOException {
		
	String data = Files.readString(Paths.get("src//test//java//com//automation//utils//body.txt"));
		
		
//		RestAssured.given().baseUri("https://restful-booker.herokuapp.com/").
//		when().get("/booking").then().statusCode(200);
		
		
	String res =	RestAssured.given().baseUri("https://restful-booker.herokuapp.com/").
		header("Content-Type", "application/json").body(data).
		when().post("/booking").asString();
		
	System.out.println(res);
	}
}
