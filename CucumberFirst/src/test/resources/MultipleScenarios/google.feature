Feature: Google Search

  Scenario Outline: Verify search in google
    Given User is in google page
    When User enters search "<word>" word
    Then search word "<word>" is available
    Then close browser

    Examples: 
      | word        |
      | Interesting |
