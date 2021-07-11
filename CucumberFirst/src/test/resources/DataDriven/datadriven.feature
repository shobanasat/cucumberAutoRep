Feature: Create Facebook Account

  Scenario Outline: Verify firstname and blank mobilefield
    Given User is on the facebook login page
    When User enters "<email>" firstname
    And User enters "<password>" password
    Then Verify availability "<email>" of firstname
    But Check password "<password>" is encrytpted
    Then Close Browser

    Examples: 
      | email                         | password  |
      | shobanasathyanathan@gmail.com | shobikr@1 |
      | shobana.elango@gmail.com      | shobikr@1 |
