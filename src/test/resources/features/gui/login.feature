# language: en

@gui
Feature: Login

  @user_not_logged_in
  Scenario: Navigate to login page
    Given I am on base page
    When I click login button
    And I attempt to log in with no credentials
    Then login form is displayed

  Scenario: Log in
    Given I am on base page
    When I click login button
    And I sign in as user "Testerski"
    Then home page is displayed