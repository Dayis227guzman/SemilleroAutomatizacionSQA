# language:en

  Feature: Create Pet

    Scenario: Create Pet Successfully

      Given I want create pet to service
      Then I validate the status code 200