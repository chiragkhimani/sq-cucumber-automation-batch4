package com.automation.steps;

import com.automation.pages.CartPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Then;

public class CartSteps {
	
	CartPage cartPage = new CartPage();
	
	@Then("verify user can see product added into cart")
	public void verify_user_can_see_product_added_into_cart() {
		cartPage.verifyItemDetailsOnCartPage();
	}

}
