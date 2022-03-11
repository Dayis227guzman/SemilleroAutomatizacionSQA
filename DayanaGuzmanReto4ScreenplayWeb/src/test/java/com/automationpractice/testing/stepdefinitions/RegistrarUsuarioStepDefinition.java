package com.automationpractice.testing.stepdefinitions;

import com.automationpractice.testing.exceptions.RegistroUsuarioException;
import com.automationpractice.testing.models.RegistroUsuarioModel;
import com.automationpractice.testing.questions.RegistroUsuarioQuestion;
import com.automationpractice.testing.tasks.RegistroUsuarioTask;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.CoreMatchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegistrarUsuarioStepDefinition {

    private String actor = "usuarioDayana";

    @Before
    public static void prepararActor(){
        //inicializamos el actor
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario abre la aplicacion$")
    public void queElUsuarioAbreLaAplicacion() {
        //el usuario esta abriendo la pagina
        OnStage.theActorCalled(actor).wasAbleTo(Open.url("http://automationpractice.com/index.php"));

    }

    @Cuando("^ingresa los requisitos$")
    public void ingresaLosRequisitos(List<RegistroUsuarioModel> datosRegistroUsuario) {
        //recuperamos la informacion que fue seteada en el modelo
        OnStage.theActorInTheSpotlight().attemptsTo(RegistroUsuarioTask.conInformacion(datosRegistroUsuario));


    }

    @Entonces("^queda registrado exitosamente (.*)$")
    public void quedaRegistradoExitosamente(String resultado) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(RegistroUsuarioQuestion.resultado(), CoreMatchers.equalTo(resultado)).orComplainWith(RegistroUsuarioException.class));
    }
}
