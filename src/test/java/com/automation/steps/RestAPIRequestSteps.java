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

	@When("user call get request")
	public void user_call_get() {
		RestAssuredUtils.get();
	}

}
