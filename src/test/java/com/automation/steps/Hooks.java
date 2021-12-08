package com.automation.steps;

import com.automation.utils.DriverUtils;
import com.automation.utils.ExcelUtils;
import com.automation.utils.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class Hooks {

	@Before("@ui")
	public void setUp() {
		DriverUtils.initDriver();

		PropertyReader.initProperties();

		ExcelUtils.initExcelData();
	}

	@Before("@api")
	public void setUpAPI() {
		PropertyReader.initProperties();
		RestAssured.baseURI = PropertyReader.getProperty("api.base.url");
	}

	@After("@ui")
	public void cleanUp() {
		DriverUtils.getDriver().close();
	}
}
