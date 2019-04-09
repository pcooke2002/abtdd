Feature: subtractition decimals Feature

  Scenario: subtract two positive numbers
    Given I am on the demo page
    When I subtract the numbers 2.35 and 3.45
    Then the result is -1.1000001

  Scenario: subtract positive and negative numbers
    Given I am on the demo page
    When I subtract the numbers 2.35 and -3.45
    Then the result is 5.8

  Scenario: subtract negative and postive numbers
    Given I am on the demo page
    When I subtract the numbers -2.35 and 3.45
    Then the result is -5.8

  Scenario: subtract two negative numbers
    Given I am on the demo page
    When I subtract the numbers -2.35 and 3.45
    Then the result is -5.8
