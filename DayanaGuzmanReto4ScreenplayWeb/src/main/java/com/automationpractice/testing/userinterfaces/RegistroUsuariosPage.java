package com.automationpractice.testing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuariosPage {
    public static final Target BTN_LOGIN = Target.the("Boton para Login").locatedBy("//a[@class='login']");
    public static final Target LBL_CREAR_CORREO = Target.the("Correo Electronica para registrar").locatedBy("//input[@name='email_create']");
    public static final Target BTN_CREATEACCOUNT = Target.the("Boton para crear").locatedBy("//i[@class='icon-user left']");
    public static final Target RBT_TITULO = Target.the("radio titulo").locatedBy("//input[@name='id_gender' and @value ='{0}']");
    public static final Target TXT_NOMBRE = Target.the("texto Nombre").locatedBy("//input[@name='customer_firstname']");
    public static final Target TXT_APELLIDO = Target.the("texto Apellido").locatedBy("//input[@name='customer_lastname']");
    public static final Target TXT_CONTRASENA = Target.the("texto Contraseña").locatedBy("//input[@name='passwd']");
    public static final Target LIST_DIA = Target.the("Selecciona el día").locatedBy("//select[@id='days']");
    public static final Target LIST_MES = Target.the("Selecciona el mes").locatedBy("//select[@id='months']");
    public static final Target LIST_ANIO = Target.the("Selecciona el año").locatedBy("//select[@id='years']");
    public static final Target TXT_COMPANIA = Target.the("texto compañia").locatedBy("//input[@name='company']");
    public static final Target TXT_POSTAL = Target.the("texto postal").locatedBy("//input[@name='address1']");
    public static final Target TXT_DIRECCION = Target.the("texto direccion").locatedBy("//input[@name='address2']");
    public static final Target TXT_CIUDAD = Target.the("texto ciudad").locatedBy("//input[@name='city']");
    public static final Target LIST_ESTADO = Target.the("Selecciona el estado").locatedBy("//select[@id='id_state']");
    public static final Target TXT_CODPOSTAL = Target.the("texto cod postal").locatedBy("//input[@name='postcode']");
    public static final Target LIST_PAIS = Target.the("Selecciona el pais").locatedBy("//select[@id='id_country']");
    public static final Target TXT_INFORMACION = Target.the("texto información").locatedBy("//textarea[@name='other']");
    public static final Target TXT_TELEFONO = Target.the("texto télefono").locatedBy("//input[@name='phone']");
    public static final Target TXT_CELULAR = Target.the("texto celular").locatedBy("//input[@name='phone_mobile']");
    public static final Target  TXT_ALIAS = Target.the("texto alias").locatedBy("//input[@name='alias']");
    public static final Target  BTN_REGISTRAR = Target.the("Boton registrar").locatedBy("//button[@name='submitAccount']");
    public static final Target  TXT_TEXTOFINAL = Target.the("Texto a validar").locatedBy("//p[@class='info-account']");

}
