#Author: Chirag
@api
Feature: API Automatioon feature file

  Scenario: verify user can able retrive list of users
    Given user wants to call get api to retrive list of users
    When user call get request
    Then verify status code is 200

  Scenario: verify user can able to create new user
    Given user wants to call post api to create new user
    When user call post request
    Then verify status code is 201

  Scenario: verify user can able to delete existing user
    Given user wants to call delete api to delete existing user
    When user call delete request
    Then verify status code is 204

  Scenario: verify user can able to update user information
    Given user wants to call put api to update existing user information
    When user call put request
    Then verify status code is 201
