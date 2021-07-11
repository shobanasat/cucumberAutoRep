Feature: Create Facebook Account

  Scenario: Validate multiple user table
    Given User is on the facebook login page
    When User enters following data
      | userName                      | Password  |
      | shobanasathyanathan@gmail.com | shobikr@1 |
      | shobana.elango@gmail.com      | shobikr@1 |
