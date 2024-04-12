# language: en

Feature: Login

  Scenario: Navigate to login page
    Given I am on base page
    When I click login button
    Then login form is displayed