
Feature: To check the OrangeHRM application

  Scenario: To verify thelogin functionality
    Given user launch the broswer
    When User on the login page
    And User Enter the username as "Admin"
    And User Enter the password as "admin123"
    When user click on the login button
    Then user should navigative to the dashboard page
