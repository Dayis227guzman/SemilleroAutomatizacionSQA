package io.swagger.petstore.testing.tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import static io.swagger.petstore.testing.utils.URLEnum.*;
import static io.swagger.petstore.testing.utils.PetEnum.*;

public class GetPetTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Get.resource(URI_GET_PET.getValue()+ID_PET.getValue()).with(requestSpecification -> requestSpecification.
                        header("Content-Type","application/json")));
        System.out.print(SerenityRest.lastResponse().getStatusCode());
    }

    //CONSTRUCTOR
    public static GetPetTask getPet(){
        return Tasks.instrumented(GetPetTask.class);
    }

}
