Feature: Integer Multiplication Feature

  Scenario: multiply two positive real numbers
    Given I am on the demo page
    When I multiply the numbers 2.3 and 3.45345
    Then the result is 7.942935
    
    Scenario: multiply a positive  and a negative real numbers
    Given I am on the demo page
    When I multiply the numbers 2.2222 and -3.345
    Then the result is -7.433259
    
    Scenario: multiply a positive  and a negative real numbers
    Given I am on the demo page
    When I multiply the numbers -2.2345 and 3.2
    Then the result is -7.1503997
    
    Scenario: multiply a negative  and a negative ral numbers
    Given I am on the demo page
    When I multiply the numbers -2.2 and -3.33
    Then the result is 7.326