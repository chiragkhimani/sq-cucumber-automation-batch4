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

	@Then("verify invalid login error message is displayed")
	public void verify_invalid_login_error_message_is_displayed() {
		loginPage.verifyInvalidLoginError();
	}

	@Then("verify user is navigate to login page")
	public void verify_user_is_navigate_to_login_page() {
		loginPage.verifyLoginPage();
	}

	@When("user login with username {string} and password {string}")
	public void user_login_with_username_and_password(String username, String password) {
		loginPage.doLogin(username, password);
	}

}
