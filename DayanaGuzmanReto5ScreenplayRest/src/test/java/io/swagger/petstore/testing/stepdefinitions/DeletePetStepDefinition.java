package io.swagger.petstore.testing.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.swagger.petstore.testing.tasks.CreatePetTask;
import io.swagger.petstore.testing.tasks.DeletePetTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import static io.swagger.petstore.testing.utils.URLEnum.URL_BASE;

public class DeletePetStepDefinition {
    private Actor userAutomnation = Actor.named("userAutomnation");
    @Given("^I want Delete  pet to service$")
    public void iWantDeletePetToService() {
        userAutomnation.whoCan(CallAnApi.at(URL_BASE.getValue()));

        userAutomnation.attemptsTo(DeletePetTask.deletePetTask());
    }

    @Then("^I validate response Delete the status code (\\d+)$")
    public void iValidateResponseDeleteTheStatusCode(int status) {
        //Actor deberia ver la respuesta tiene un codido status 200
        userAutomnation.should(ResponseConsequence.seeThatResponse(
                validatableResponse -> validatableResponse.statusCode(status)));
    }
}
