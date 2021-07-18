Feature: Facebook login

  Scenario Outline: Verify facebook login for valid credentials
    Given User is on the facebook page
    When User enters "<email>" email
    And User enters "<password>" password
    Then Verify login
    Then Close

    Examples: 
      | email                         | password |
      | shobanasathyanathan@gmail.com | jishob@1 |
