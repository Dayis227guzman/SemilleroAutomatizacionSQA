package io.swagger.petstore.testing.stepdefinitions;

import cucumber.api.java.en.Given;
import io.swagger.petstore.testing.models.User;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class GetUserStepDefinition {

    @Given("^I want get a user with service \"([^\"]*)\"$")
    public void iWantGetAUserWithService(String url, List<User> userList) {
        // se envia parametro en url para la consulta
        url = url+userList.get(0).getUserName();

        System.out.printf(url);
// se envia url y headers requeridos
        SerenityRest.given().baseUri(url).header("accept","application/json").get();

    }

}
