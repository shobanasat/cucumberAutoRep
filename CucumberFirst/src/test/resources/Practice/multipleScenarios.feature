Feature: Create Facebook Account

  Scenario: Verify firstname
    Given User is on the facebook login page
    When User enters firstname
    Then Verify availability of firstname
    Then Close Browser

  Scenario: Verify firstname and blank mobilefield
    Given User is on the facebook login page
    When User enters firstname
    And User enters password
    Then Verify availability of firstname
    But Check password is encrytpted
    Then Close Browser
