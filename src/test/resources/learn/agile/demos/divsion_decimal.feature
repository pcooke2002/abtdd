Feature: Division of decimal Feature

  Scenario: divide positive integer by postive decimal
    Given I am on the demo page
    When I divide 9 by 3.232
    Then the result is 2.7846534

  Scenario: divide positive integer by negative decimal
    Given I am on the demo page
    When I divide 9 by -3.232
    Then the result is -2.7846534

  Scenario: divide postive decimal by postivie decimal
    Given I am on the demo page
    When I divide 9.4443 by 3.232
    Then the result is 2.9221222

  Scenario: divide postive decimal by netative decimal
    Given I am on the demo page
    When I divide 9.4443 by -3.232
    Then the result is -2.9221222

  Scenario: divide negative decimal by postivie decimal
    Given I am on the demo page
    When I divide -9.4443 by 3.232
    Then the result is -2.9221222

  Scenario: divide negative decimal by negative decimal
    Given I am on the demo page
    When I divide -9.4443 by -3.232
    Then the result is 2.9221222
