# language: en

@api
Feature: Goals

  Scenario: Add a goal
    When I send a request to create a goal named "TestGoal"
    Then I receive a HTTP response code 200
    And the goal is created