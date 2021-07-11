Feature: Create Facebook Account

  Background: Common facebook login steps
    Given User is on the facebook login page
    When User enters "shobanasathyanathan@gmail.com" firstname

  Scenario: Verify firstname
    Then Verify availability "shobanasathyanathan@gmail.com" of firstname
    Then Close Browser

  Scenario: Verify firstname and blank mobilefield
    And User enters "shobikr@1" password
    Then Verify availability "shobanasathyanathan@gmail.com" of firstname
    But Check password "shobikr@1" is encrytpted
    Then Close Browser
