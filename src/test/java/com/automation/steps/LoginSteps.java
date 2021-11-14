package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	LoginPage loginPage = new LoginPage();

	@Given("user is on website")
	public void user_is_on_website() {
		loginPage.openWebsite();
	}

	@When("user login with valid cred")
	public void user_login_with_valid_cred() {
		loginPage.doLogin("standard_user", "secret_sauce");
	}

	@When("user login with invalid cred")
	public void user_login_with_invalid_cred() {
		loginPage.doLogin("standard_user", "secret_sauce123");
	}

	@Then("verify invalid login error message is displayed")
	public void verify_invalid_login_error_message_is_displayed() {
		loginPage.verifyInvalidLoginError();
	}
	
	@Then("verify user is navigate to login page")
	public void verify_user_is_navigate_to_login_page() {
		loginPage.verifyLoginPage();
	}
}
