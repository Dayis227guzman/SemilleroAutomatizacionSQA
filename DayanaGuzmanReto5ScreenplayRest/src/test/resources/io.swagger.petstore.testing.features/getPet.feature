# language:en

Feature: Get Pet

  Scenario: Get Pet Successfully

    Given I want get pet to service
    Then I validate response the status code 200