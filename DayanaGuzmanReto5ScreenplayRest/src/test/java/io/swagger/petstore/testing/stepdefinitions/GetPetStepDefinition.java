package io.swagger.petstore.testing.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.swagger.petstore.testing.tasks.GetPetTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import static io.swagger.petstore.testing.utils.URLEnum.URL_BASE;

public class GetPetStepDefinition {
    private Actor userAutomnation = Actor.named("userAutomnation");

    @Given("^I want get pet to service$")
    public void iWantGetPetToService() {
        userAutomnation.whoCan(CallAnApi.at(URL_BASE.getValue()));
        userAutomnation.attemptsTo(GetPetTask.getPet());
    }

    @Then("^I validate response the status code (\\d+)$")
    public void iValidateResponseTheStatusCode(int status) {
        //Actor deberia ver la respuesta tiene un codido status 200
        userAutomnation.should(ResponseConsequence.seeThatResponse(
                validatableResponse -> validatableResponse.statusCode(status)));
    }
}
