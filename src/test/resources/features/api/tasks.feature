# language: en

@api
Feature: Tasks

  Scenario: Update a task
    Given a task that can be edited exists
    When I send a request to update the task
    Then I receive a HTTP response code 200
    And response contains updated task data