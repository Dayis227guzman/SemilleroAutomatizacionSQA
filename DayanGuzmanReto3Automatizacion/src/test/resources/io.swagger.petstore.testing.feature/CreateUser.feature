Feature: Create User

Scenario: Create user Sucessfuly

    Given I want create a user with service "https://petstore.swagger.io/v2/user"

        |idUser|userName|firstName|lastName|email|password|phone|userStatus|
        |1254|cindydg|Nombre|Apellido|dayana.guzman@sqasa.co|Todo1234|3123081069|1|

    Then I validate the status code 200
