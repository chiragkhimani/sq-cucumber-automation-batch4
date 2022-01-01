#Author: Chirag
@api
Feature: API Automatioon feature file

  Scenario: user wants to call get api to retrive list of users for ReqRes
    Given user wants to call get api to retrive list of users for ReqRes
    When user call get request for ReqRes
    Then verify status code is 200

  Scenario: verify user can able to create new user
    Given user wants to call post api to to create new user
    When user call post request
    Then verify status code is 200

#Scenario: verify user can able to update the existing user information
    #Given user wants to call put api to update the existing user information
    #When user call put request
    #Then verify status code is 200
#
  #Scenario: verify user can able to delete the existing user
    #Given user wants to call delete api to delete the existing user
    #When user call delete request
    #Then verify status code is 204
