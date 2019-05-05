Feature: Login Feature
  This feature is responsible for testing all the scenarios for Login of application

  Scenario: Verify user is able to login with correct username and password
    Given I am at the login page
    When I Login as a registered user
      | Email                | Password |
      | fuadfb1234@gmail.com | Password123456   |
    Then I should be logged in my home page