package io.swagger.petstore.testing.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.swagger.petstore.testing.tasks.CreatePetTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;
import org.junit.Before;
import static io.swagger.petstore.testing.utils.URLEnum.*;

public class CreatePetStepDefinition {

    private Actor userAutomnation = Actor.named("userAutomnation");

    //Preparar el actor
    @Before
    public void prepateActorStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^I want create pet to service$")
    public void iWantCreatePetToService() {
        // Actor llama una API hacia mi URL base
        userAutomnation.whoCan(CallAnApi.at(URL_BASE.getValue()));
        //actor intenta hacer una tarea llamada create pet
        userAutomnation.attemptsTo(CreatePetTask.createPet());
    }

    @Then("^I validate the status code (\\d+)$")
    public void iValidateTheStatusCode(int status) {
        //Actor deberia ver la respuesta tiene un codido status 200
        userAutomnation.should(ResponseConsequence.seeThatResponse(
                validatableResponse -> validatableResponse.statusCode(status)));
    }
}
