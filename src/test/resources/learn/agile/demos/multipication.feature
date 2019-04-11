Feature: Multiplication Feature

  Scenario: multiply two positive numbers
    Given I am on the demo page
    When I multiply the numbers 2 and 3
    Then the result is 6
    
    Scenario: multiply a positive  and a negative numbers
    Given I am on the demo page
    When I multiply the numbers 2 and -3
    Then the result is -6
    
    Scenario: multiply a positive  and a negative numbers
    Given I am on the demo page
    When I multiply the numbers -2 and 3
    Then the result is -6
    
    Scenario: multiply a negative  and a negative numbers
    Given I am on the demo page
    When I multiply the numbers -2 and -3
    Then the result is 6