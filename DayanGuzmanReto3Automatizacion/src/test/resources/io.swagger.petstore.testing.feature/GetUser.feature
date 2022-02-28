Feature: Get User

Scenario: Get user Sucessfuly

    Given I want get a user with service "https://petstore.swagger.io/v2/user/"

    |userName|
    |cindydg|

    Then I validate the status code 200