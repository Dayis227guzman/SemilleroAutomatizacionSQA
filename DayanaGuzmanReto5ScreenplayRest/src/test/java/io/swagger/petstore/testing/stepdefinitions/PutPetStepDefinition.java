package io.swagger.petstore.testing.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.swagger.petstore.testing.tasks.CreatePetTask;
import io.swagger.petstore.testing.tasks.PutPetTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import static io.swagger.petstore.testing.utils.URLEnum.URL_BASE;

public class PutPetStepDefinition {
    private Actor userAutomnation = Actor.named("userAutomnation");

    @Given("^I want Put pet to service$")
    public void iWantPutPetToService() {
        userAutomnation.whoCan(CallAnApi.at(URL_BASE.getValue()));
        //actor intenta hacer una tarea llamada create pet
        userAutomnation.attemptsTo(PutPetTask.putPetTask());
    }


    @Then("^I validate response Put the status code (\\d+)$")
    public void iValidateResponsePutTheStatusCode(int status) {
        userAutomnation.should(ResponseConsequence.seeThatResponse(
                validatableResponse -> validatableResponse.statusCode(status)));
    }
}
