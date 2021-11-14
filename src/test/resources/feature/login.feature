#Author: Chirag
Feature: Login Features Tests
  As user, I should be able to login into the website

	@chirag @smoke @login
  Scenario: verify user can able to login with valid
    Given user is on website
    When user login with valid cred
    Then verify login successful

	@shyam @regression
  Scenario: verify user cannot login with invalid cred
    Given user is on website
    When user login with invalid cred
    Then verify invalid login error message is displayed

	@chirag @smoke @logout
  Scenario: verify user can able to logout
    Given user is on website
    When user login with valid cred
    Then verify login successful
    When user click on menu icon
    And clicks on logout button
    Then verify user is navigate to login page

    
    
    
    
    
    
    
    
    