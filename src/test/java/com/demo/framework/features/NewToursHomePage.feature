Feature: New Tours Home Page Feature
  This feature is responsible for testing all the scenarios in in New Tours Home Page

  Scenario: Verify user is able view the Sign-On link in the home page
    Given I access home page
    Then I can see that the SIGN-ON link is displayed

  Scenario: Verify user is able view the Register link in the home page
    Given I access home page
    Then I can see that the REGISTER link is displayed

  Scenario: Verify user is able view the Support link in the home page
    Given I access home page
    Then I can see that the SUPPORT link is displayed

