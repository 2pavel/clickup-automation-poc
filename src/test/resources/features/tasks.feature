# language: en

Feature: tasks

  Background:
    Given I am on base page
    When I click login button
    And I sign in as user "Testerski"

  Scenario: Create a task
    When I click "Add Task" button
    And I complete task creation form
    Then The task is visible on the list