package com.automation.steps;

import org.junit.Assert;

import com.automation.utils.RestAssuredUtils;

import io.cucumber.java.en.Then;

public class ReqResRestAPIResponseSteps2 {
	@Then("verify status code is 200")
	public void verify_status_code_is() {
		Assert.assertTrue("Reponse code is not 200 but it is -->" + RestAssuredUtils.getResponseCode(),
				RestAssuredUtils.getResponseCode() == 200);
	}
	
	@Then("verify status code is 201")
	public void verify_status_code_is_201() {
		Assert.assertTrue("Reponse code is not 201 but it is -->" + RestAssuredUtils.getResponseCode(),
				RestAssuredUtils.getResponseCode() == 201);
	}
	
	
	
}


//verify status code is 201