# language: en

Feature: Spaces

  Background:
    Given I am on base page
    When I click login button
    And I sign in as user "Testerski"

  Scenario: Create space
    Given I am logged in to the application
    When I click Create Space button
    And go through space creation process
    Then Newly created space is visible