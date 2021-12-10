Feature: Microsoft purchase

  @microsoft
  Scenario: visual studio purchase and price comparison
    Given that a user accesses the microsoft web site
    And navigates on the web site
    When the user searches for visual studio
    And compares its prices
    Then verifies that the prices are as indicated and makes the purchase.
