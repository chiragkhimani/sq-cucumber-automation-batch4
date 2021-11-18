#Author: Chirag
Feature: Login Features Tests
  As user, I should be able to login into the website

  Background: 
    Given user is on website

  @chirag @smoke @login
  Scenario Outline: verify user can able to login with valid
    When user login with username "<username>" and password "<password>"
    Then verify login successful

    Examples: 
      | username                | password     |
      | performance_glitch_user | secret_sauce |
      | standard_user           | secret_sauce |

  @chirag @smoke @login
  Scenario Outline: verify user cannot able to login with invalid cred
    When user login with username "<username>" and password "<password>"
    Then verify invalid login error message is displayed

    Examples: 
      | username        | password     |
      | adminini123     | secret_sauce |
      | standard_user   | secretsauce  |
      | admin123        | secretsauce  |
      |                 | secret_sauce |
      |                 |              |
      | Standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
