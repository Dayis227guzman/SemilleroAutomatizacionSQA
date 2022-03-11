package com.automationpractice.testing.questions;

import com.automationpractice.testing.userinterfaces.InicioSesionPage;
import com.automationpractice.testing.userinterfaces.RegistroUsuariosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class InicioSesionQuestion implements Question<String> {

    private String cp;

    public InicioSesionQuestion(String cp) {
        this.cp = cp;
    }

    @Override
    public String answeredBy(Actor actor) {

        String resultado = "";

        if (cp.equalsIgnoreCase("Exitoso")){
            resultado= Text.of(RegistroUsuariosPage.TXT_TEXTOFINAL).viewedBy(actor).asString();
        }else{
            resultado= Text.of(InicioSesionPage.TXT_MENSAJE).viewedBy(actor).asString();
        }

        return resultado;
    }

    public static InicioSesionQuestion resultado(String cp){
        return new InicioSesionQuestion(cp);
    }
}
