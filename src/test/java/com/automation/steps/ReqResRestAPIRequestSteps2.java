package com.automation.steps;

import com.automation.utils.PropertyReader;
import com.automation.utils.RestAssuredUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ReqResRestAPIRequestSteps2 {

	@Given("user wants to call get api to retrive list of users for ReqRes")
	public void user_wants_to_call_get_api_to_retrive_list_of_users_for_ReqRes() {
		RestAssuredUtils.setEndPoint(PropertyReader.getProperty("/api/users"));
	}
	
	@Given("user wants to call post api to to create new user")
	public void user_wants_to_call_post_api_to_to_create_new_user() {
		RestAssuredUtils.setEndPoint(PropertyReader.getProperty("/api/users"));
	}

	@When("user call get request for ReqRes")
	public void user_call_get_for_ReqRes() {
		RestAssuredUtils.get();
	}
	
	@When("user call post request")
	public void user_call_post_request() {
		RestAssuredUtils.get();
	}

}
