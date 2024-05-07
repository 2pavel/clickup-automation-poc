# language: en

@gui @settings
Feature: User settings

  Scenario: View user settings page
    When I click on settings button in user context menu
    Then All preference toggles are displayed