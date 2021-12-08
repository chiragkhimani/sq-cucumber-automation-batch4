#Author: Chirag
@api
Feature: API Automatioon feature file

  Scenario: verify user can able retrive list of users
   		Given user wants to call get api to retrive list of users
   		When user call get request
   		Then verify status code is 200