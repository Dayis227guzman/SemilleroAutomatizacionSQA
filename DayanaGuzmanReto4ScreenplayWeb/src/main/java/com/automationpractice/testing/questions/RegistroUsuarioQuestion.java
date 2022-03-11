package com.automationpractice.testing.questions;

import com.automationpractice.testing.userinterfaces.RegistroUsuariosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RegistroUsuarioQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        //captura el texto
        return Text.of(RegistroUsuariosPage.TXT_TEXTOFINAL).viewedBy(actor).asString();
    }
    public static RegistroUsuarioQuestion resultado(){
        // resultado, instanciamos la clases de registro usuario question
        return  new RegistroUsuarioQuestion();
    }
}
