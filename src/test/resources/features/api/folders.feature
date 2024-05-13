# language: en

@api
Feature: Folders

  Scenario: I can create a new folder
    Given there exists a space
    When I send a request to create a folder named "TestFolder"
    Then I receive a HTTP response code 200
    And response body contains newly created folder's data