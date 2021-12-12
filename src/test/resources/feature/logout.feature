@ui
Feature: This feature will test logout test cases

Background: 
    Given user is on sauce website

	@chirag @smoke @logout
  Scenario: verify user can able to logout
    When user login with username "standard_user" and password "secret_sauce"
    Then verify login successful
    When user click on menu icon
    And clicks on logout button
    Then verify user is navigate to login page