Feature: Updated User

Scenario: Updated user Sucessfuly

    Given I want Updated a user with service "https://petstore.swagger.io/v2/user/"

        |idUser|userName|firstName|lastName|email|password|phone|userStatus|
        |987654|cindydg|Cindy|Guzman|dayana.guzman@sqasa.co|Todo4321|3003081069|2|

    Then I validate the status code 200