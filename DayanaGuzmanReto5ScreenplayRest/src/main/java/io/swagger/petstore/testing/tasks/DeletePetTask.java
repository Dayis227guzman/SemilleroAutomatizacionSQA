package io.swagger.petstore.testing.tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static io.swagger.petstore.testing.utils.PetEnum.ID_PET;
import static io.swagger.petstore.testing.utils.URLEnum.URI_DELETE_PET;
import static io.swagger.petstore.testing.utils.URLEnum.URI_GET_PET;

public class DeletePetTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Delete.from(URI_DELETE_PET.getValue()+ID_PET.getValue()).with(requestSpecification -> requestSpecification.
                        header("Content-Type","application/json")));
        System.out.print(SerenityRest.lastResponse().getStatusCode());
    }

    public static DeletePetTask deletePetTask() {
        return Tasks.instrumented(DeletePetTask.class);
    }
}
