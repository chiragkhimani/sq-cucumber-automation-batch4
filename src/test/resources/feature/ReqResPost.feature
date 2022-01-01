#Author: Chirag
@api
Feature: API Automatioon feature file

 
 Scenario: Verify user should able to create new user
 		Given user wants to call api to create new user
 		When user call post request
   	Then verify status code is 201