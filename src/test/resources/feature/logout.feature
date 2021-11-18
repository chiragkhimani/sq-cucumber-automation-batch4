Feature: This feature will test logout test cases


	@chirag @smoke @logout
  Scenario: verify user can able to logout
    When user login with valid cred
    Then verify login successful
    When user click on menu icon
    And clicks on logout button
    Then verify user is navigate to login page