# language: en

Feature: Tasks

  Background:
    Given I am on base page
    When I click login button
    And I sign in as user "Testerski"

  Scenario: Create a task
    When I click Add Task button
    And I complete task creation form
    Then The task is visible on the list

  Scenario: Delete a task
    Given I am on a project page with created task "TestTask"
    When I click delete in the "TestTask" context menu
    Then The task is removed
    And Toast notification informing about removed task appears

  Scenario: Rename a task
    Given I am on a project page with created task "TaskToRename"
    When I click rename button in the "TaskToRename" row
    And I type "_text" into the row input field
    Then The task name is changed


