# language: en

Feature: Login

  @user_not_logged_in # TODO: fix persisting browser instances, issue only without headless mode
  Scenario: Navigate to login page
    Given I am on base page
    When I click login button
    Then login form is displayed

  Scenario: Log in
    Given I am on base page
    When I click login button
    And I sign in as user "Testerski"
    Then home page is displayed