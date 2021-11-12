#Author: Chirag
Feature: Login Features Tests
  As user, I should be able to login into the website

  Scenario: verify user can able to login
    Given user is on website
    When user login with valid cred
    Then verify login successful

  Scenario: verify user cannot login with invalid cred
    Given user is on website
    When user login with invalid cred
    Then verify invalid login error message is displayed
