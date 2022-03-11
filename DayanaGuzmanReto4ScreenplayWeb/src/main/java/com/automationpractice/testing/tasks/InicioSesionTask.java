package com.automationpractice.testing.tasks;

import com.automationpractice.testing.models.InicioSesionModel;
import com.automationpractice.testing.userinterfaces.InicioSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InicioSesionTask implements Task {

    private String correo;
    private String contrasena;

    public InicioSesionTask(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickLoginTask.inLogin(),
                Enter.theValue(correo).into(InicioSesionPage.TXT_CORREO),
                Enter.theValue(contrasena).into(InicioSesionPage.TXT_CONTRASENA),
                Click.on(InicioSesionPage.BTN_INICIO));

    }
    public static InicioSesionTask conInformacion(String correo, String contrasena){
        return Tasks.instrumented(InicioSesionTask.class, correo,contrasena);

    }
}
