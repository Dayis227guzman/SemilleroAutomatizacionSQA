package com.automationpractice.testing.stepdefinitions;

import com.automationpractice.testing.exceptions.RegistroUsuarioException;
import com.automationpractice.testing.models.InicioSesionModel;
import com.automationpractice.testing.questions.InicioSesionQuestion;
import com.automationpractice.testing.questions.RegistroUsuarioQuestion;
import com.automationpractice.testing.tasks.InicioSesionTask;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.CoreMatchers;

import java.util.List;

public class InicioSesionStepDefinition {
    @Cuando("^ingresa usuario y contrasena$")
    public void ingresaUsuarioYContrasena(List<InicioSesionModel> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(InicioSesionTask.conInformacion(datos.get(0).getCorreo(),datos.get(0).getContrasena()));


    }

    @Entonces("^queda logeado (.*),(.*)$")
    public void quedaLogeado(String resultado,String cp) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(InicioSesionQuestion.resultado(cp), CoreMatchers.equalTo(resultado)).orComplainWith(RegistroUsuarioException.class));


    }
}
