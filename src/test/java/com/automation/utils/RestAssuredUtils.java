package com.automation.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredUtils {
	static RequestSpecification reqSpec = RestAssured.given();
	static Response res;
	static String endPoint;

	public static void setEndPoint(String endPointFromUser) {
		endPoint = endPointFromUser;
	}

	public static void setBody(String body) {
		reqSpec = reqSpec.body(body);
	}

	public static void setHeader(String headerName, String headerValue) {
		reqSpec = reqSpec.header(headerName, headerValue);
	}

	public static void post() {
		res = reqSpec.post(endPoint);
	}

	public static void get() {
		res = reqSpec.get(endPoint);
	}

	public static int getResponseCode() {
		return res.getStatusCode();
	}

	public static String getResponseBody() {
		return res.asString();
	}

}
