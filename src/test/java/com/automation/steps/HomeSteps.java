package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeSteps {
	HomePage homePage = new HomePage();
	
	@Given("verify login successful")
	public void verify_login_successful() {
		homePage.verifyHomePage();
	}
	
	@Given("verify user can navigates to pdp page for each product")
	public void verify_user_can_navigates_to_pdp_page_for_each_product() {
		homePage.verifyProductDetailPageNavigation();
	}
	
	@When("user selects Sauce Labs Backpack")
	public void user_selects_sauce_labs_backpack() {
		homePage.selectSauceLabsBackpack();
	}
	
	@When("user click on menu icon")
	public void user_click_on_menu_icon() {
		homePage.clickOnMenuIcon();
	}

	@When("clicks on logout button")
	public void clicks_on_logout_button() {
		homePage.clickOnLogoutBtn();
	}
}
