Feature: New Tours Register Feature

  Scenario: Verify user is able to Register home page
    Given I access home page
    And I click REGISTER link
    When I register on the site
    Then I can see that the SIGN-OFF link is displayed

