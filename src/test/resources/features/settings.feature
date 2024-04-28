# language: en

Feature: User settings

  # TODO: CHANGE BACKGROUND TO HOOKS HERE
  Background:
    Given I am on base page
    When I click login button
    And I sign in as user "Testerski"

  Scenario: View user settings page
    When I click on settings button in user context menu
    Then All preference toggles are displayed