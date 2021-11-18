package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src//test//resources//feature",
			glue = "com.automation.steps", 
			tags = "@regression", 
			dryRun = true,
			plugin = {"json:target/cucumber.json", "html:report/cucumber.html" })
public class TestRunner {

}
