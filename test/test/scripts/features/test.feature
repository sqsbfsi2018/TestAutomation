Feature: Test Feature

  Scenario: Test Scenario
    Given I have opened the portal
    When I login page with
      | Username | admin |
      | Password | admin |
    Then I should see the home screen