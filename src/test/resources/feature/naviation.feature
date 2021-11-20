Feature: This feature will validate navigation between the page

  Background: 
    Given user is on sauce website
   	When user login with username "standard_user" and password "secret_sauce"
    Then verify login successful

  @smoke @hatice
  Scenario: verify navigation between homepage and pdp page
    And verify user can navigates to pdp page for each product

  @regression @sumeyra
  Scenario: verify user can add product into cart
    When user selects Sauce Labs Backpack
    Then verify user is on product detail page
    When user click on add to cart button
    And click on cart icon
    Then verify user can see product added into cart
