package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.pages.OrangeHRMLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class OrangeHRMLoginSteps {

	OrangeHRMLoginPage omLoginPage = new OrangeHRMLoginPage();

	@Given("user is on orange hrm website")
	public void user_is_on_orange_hrm_website() {
		omLoginPage.openOrangeHRMWebsite();
	}

	@When("user login with username {string} and password {string} in orange HRM website")
	public void user_login_with_username_and_password_in_orange_hrm_website(String username, String password) {
		omLoginPage.doLogin(username, password);
	}

}
