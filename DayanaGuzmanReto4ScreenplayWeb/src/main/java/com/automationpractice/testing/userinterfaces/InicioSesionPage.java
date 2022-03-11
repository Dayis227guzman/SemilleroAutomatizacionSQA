package com.automationpractice.testing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InicioSesionPage {
    public static final Target TXT_CORREO = Target.the("envio correo").locatedBy("//input[@id='email']");
    public static final Target TXT_CONTRASENA = Target.the("envio contraseña").locatedBy("//input[@id='passwd']");
    public static final Target BTN_INICIO = Target.the("boton iniciar sesion").locatedBy("//i[@class='icon-lock left']");
    public static final Target TXT_MENSAJE = Target.the("mensaje inicio fallido").locatedBy("//p[contains(.,'There is 1 error')]");
}

