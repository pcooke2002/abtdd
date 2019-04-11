Feature: subtractition Feature

  Scenario: subtract two positive numbers
    Given I am on the demo page
    When I subtract the numbers 2 and 3
    Then the result is -1
    
   Scenario: subtract positive  and negative numbers
    Given I am on the demo page
    When I subtract the numbers 2 and -3
    Then the result is 5
    
     Scenario: subtract negative  and postive numbers
    Given I am on the demo page
    When I subtract the numbers -2 and 3
    Then the result is -5
    
       Scenario: subtract negative and negative numbers
    Given I am on the demo page
    When I subtract the numbers -2 and -3
    Then the result is 1