# language: en

@api
Feature: Workspaces

  Scenario: User can download a list of existing workspaces
    When I send a request to get all workspaces
    Then I receive a HTTP response code 200
    And response body contains all created workspaces and their data