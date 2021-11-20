Feature: This feature we are using to pass collection of data from the single step

  Background: 
    Given user is on orange hrm website

  @chirag @smoke @login
  Scenario: Pass list of data
    When user login with username "Admin" and password "admin123" in orange HRM website
    Then verify user is navigated to homepage
    And validate job dropdown has below options
      | Job Titles        |
      | Pay Grades        |
      | Employment Status |
      | Job Categories    |
      | Work Shifts       |

  @chirag @smoke @login
  Scenario: Validate Vacancies table data
    When user login with username "Admin" and password "admin123" in orange HRM website
    Then verify user is navigated to homepage
    When user clicks on Vacancies menu under recruitment
    Then verify below vacancies is dispalyed
      | Associate IT Manager      | IT Manager            | Odis Adalwin        | Active |
      | Junior Account Assistant  | Account Assistant     | Kevin Mathews       | Active |
      | Payroll Administrator     | Payroll Administrator | Paul Collings       | Active |
      | Sales Representative      | Sales Representative  | Linda Jane Anderson | Active |
      | Senior QA Lead            | QA Lead               | Odis Adalwin        | Active |
      | Senior Support Specialist | Support Specialist    | Dominic Chase       | Active |
      | Software Engineer         | Software Engineer     | Odis Adalwin        | Active |
