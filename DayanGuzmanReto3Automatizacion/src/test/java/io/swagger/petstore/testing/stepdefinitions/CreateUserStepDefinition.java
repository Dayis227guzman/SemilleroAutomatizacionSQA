package io.swagger.petstore.testing.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.swagger.petstore.testing.models.User;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class CreateUserStepDefinition {

    @Given("^I want create a user with service \"([^\"]*)\"$")
    public void iWantCreateAUserWithService(String url, List<User> userList) {
    //variable de body para la creacion
        String body = "{\n" +
                "  \"id\": "+userList.get(0).getIdUser()+",\n" +
                "  \"username\": \""+userList.get(0).getUserName()+"\",\n" +
                "  \"firstName\": \""+userList.get(0).getFirstName()+"\",\n" +
                "  \"lastName\": \""+userList.get(0).getLastName()+"\",\n" +
                "  \"email\": \""+userList.get(0).getEmail()+"\",\n" +
                "  \"password\": \""+userList.get(0).getPassword()+"\",\n" +
                "  \"phone\": \""+userList.get(0).getPhone()+"\",\n" +
                "  \"userStatus\": "+userList.get(0).getUserStatus()+"\n" +
                "}";
// se envia url y headers requeridos
        SerenityRest.given().body(body).baseUri(url).header("Content-Type","application/json").post();
    }

    @Then("^I validate the status code (\\d+)$")
    public void iValidateTheStatusCode(int status) {
        //respuesta esperda
        SerenityRest.lastResponse().then().statusCode(status);
        System.out.printf(SerenityRest.lastResponse().prettyPrint());
        System.out.printf("The status code is: "+SerenityRest.lastResponse().getStatusCode());

    }
}
