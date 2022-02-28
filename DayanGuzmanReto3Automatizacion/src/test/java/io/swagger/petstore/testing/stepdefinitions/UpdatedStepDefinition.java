package io.swagger.petstore.testing.stepdefinitions;

import cucumber.api.java.en.Given;
import io.swagger.petstore.testing.models.User;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class UpdatedStepDefinition {
    @Given("^I want Updated a user with service \"([^\"]*)\"$")
    public void iWantUpdatedAUserWithService(String url, List<User> userList) {
        // se envia parametro en url para la edicion
        url = url+userList.get(0).getUserName();

        System.out.printf(url);
// se envia body los datos a editar
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
// se envian los heder
        SerenityRest.given().body(body).baseUri(url).header("Content-Type","application/json").put();


    }
}
