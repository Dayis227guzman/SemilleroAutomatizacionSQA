# language:en

Feature: Delete Pet

  Scenario: Delete Pet Successfully

    Given I want Delete  pet to service
    Then I validate response Delete the status code 200