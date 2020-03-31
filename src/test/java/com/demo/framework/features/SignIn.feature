Feature: New Tours SigIn Feature

  Scenario: Verify user is able view the Login from the home page
    Given I access home page
    When I put user name abdi_4 and password Password123
    Then I can see that the SIGN-OFF link is displayed

  Scenario: Verify user is able view the login from SignOn page
    Given I access home page
    And I click SIGN-ON link
    When I put user name abdi_4 and password Password123
    Then I can see that the SIGN-OFF link is displayed

