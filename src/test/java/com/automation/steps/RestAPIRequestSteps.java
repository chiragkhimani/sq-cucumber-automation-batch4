package com.automation.steps;

import com.automation.utils.PropertyReader;
import com.automation.utils.RestAssuredUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RestAPIRequestSteps {

	@Given("user wants to call get api to retrive list of users")
	public void user_wants_to_call_get_api_to_retrive_list_of_users() {
		RestAssuredUtils.setEndPoint(PropertyReader.getProperty("retrieve.all.booking.endpoint"));
	}
	
	@Given("user wants to call api to create new user")
	public void user_wants_to_call_api_to_create_new_user() {
		RestAssuredUtils.setEndPoint("/api/users");
		String body = "{'name': 'morpheus', 'job': 'leader'}";
		RestAssuredUtils.setBody(body);
	}

	@When("user call get request")
	public void user_call_get() {
		RestAssuredUtils.get();
	}
	
	@When("user call post request")
	public void user_call_post() {
		RestAssuredUtils.post();
	}
	
	

}
