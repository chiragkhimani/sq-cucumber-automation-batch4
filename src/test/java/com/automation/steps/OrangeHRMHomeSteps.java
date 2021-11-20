package com.automation.steps;

import java.util.List;

import com.automation.pages.OrangeHRMHomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class OrangeHRMHomeSteps {

	OrangeHRMHomePage omHomePage = new OrangeHRMHomePage();

	@Then("verify user is navigated to homepage")
	public void verify_user_is_navigated_to_homepage() {
		omHomePage.verifyHomePage();
	}

	@Then("validate job dropdown has below options")
	public void user_validate_dropdown_has_below_options(DataTable dataTable) {
		List<String> expectedItems = dataTable.asList();
		omHomePage.verifyDrodownItems(expectedItems);
	}

	@Then("user clicks on Vacancies menu under recruitment")
	public void user_click_on_vacancies_menu() {
		omHomePage.clickOnVacanciesMenu();
	}

	@Then("verify below vacancies is dispalyed")
	public void verify_vacancies_data(DataTable dataTable) {
		List<List<String>> tableOfData = dataTable.asLists();
		omHomePage.verifyVacanciesData(tableOfData);
	}

}
