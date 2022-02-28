Feature: Delete User

Scenario: Delete user Sucessfuly

    Given I want Delete a user with service "https://petstore.swagger.io/v2/user/"

    |userName|
    |cindydg|

    Then I validate the status code 200