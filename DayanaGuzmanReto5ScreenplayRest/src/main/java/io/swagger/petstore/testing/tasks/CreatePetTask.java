package io.swagger.petstore.testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static io.swagger.petstore.testing.utils.PetEnum.*;
import static io.swagger.petstore.testing.utils.URLEnum.*;
public class CreatePetTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String body = "{\n" +
                "  \"id\": "+ID_PET.getValue()+",\n" +
                "  \"category\": {\n" +
                "    \"id\": "+ID_CATEGORY.getValue()+",\n" +
                "    \"name\": \""+NAME_CATEGORY.getValue()+"\"\n" +
                "  },\n" +
                "  \"name\": \""+NAME_PET.getValue()+"\",\n" +
                "  \"photoUrls\": [\n" +
                "    \""+PHOTO_URL.getValue()+"\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": "+ID_TAG.getValue()+",\n" +
                "      \"name\": \""+NAME_TAG.getValue()+"\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \""+STATUS.getValue()+"\"\n" +
                "}";

        System.out.println(body);

        actor.attemptsTo(Post.to(URI_POST_PET.getValue()).
                with(requestSpecification -> requestSpecification.
                        header("Content-Type","application/json").
                        body(body)));

    }

    //constructor
    public static CreatePetTask createPet(){
        return Tasks.instrumented(CreatePetTask.class);
    }


}
