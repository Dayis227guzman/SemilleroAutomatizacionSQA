package com.automationpractice.testing.tasks;

import com.automationpractice.testing.userinterfaces.RegistroUsuariosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickLoginTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //presionamos click en el boton login
        actor.attemptsTo(Click.on(RegistroUsuariosPage.BTN_LOGIN));
    }

    public static ClickLoginTask inLogin(){
        return Tasks.instrumented(ClickLoginTask.class);
    }
}
