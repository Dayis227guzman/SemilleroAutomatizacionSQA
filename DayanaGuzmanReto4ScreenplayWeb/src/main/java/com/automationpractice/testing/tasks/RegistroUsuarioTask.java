package com.automationpractice.testing.tasks;

import com.automationpractice.testing.models.RegistroUsuarioModel;
import com.automationpractice.testing.userinterfaces.RegistroUsuariosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

public class RegistroUsuarioTask implements Task {
    //atrapamos el valor
    private List<RegistroUsuarioModel> datos;

    public RegistroUsuarioTask(List<RegistroUsuarioModel> datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ClickLoginTask.inLogin(),  //llamamos la tarea click de login
                WaitUntil.the(RegistroUsuariosPage.LBL_CREAR_CORREO, WebElementStateMatchers.isEnabled()),//espera a que el elemento este habilitado
                Enter.theValue(datos.get(0).getCorreo()).into(RegistroUsuariosPage.LBL_CREAR_CORREO),    // copia el correo
                Click.on(RegistroUsuariosPage.BTN_CREATEACCOUNT),  //click en en crear cuenta
                Click.on(RegistroUsuariosPage.RBT_TITULO.of(datos.get(0).getTitulo())),// click en en el radio buton titulo
                Enter.theValue(datos.get(0).getNombre()).into(RegistroUsuariosPage.TXT_NOMBRE), // copia el nombre
                Enter.theValue(datos.get(0).getApellido()).into(RegistroUsuariosPage.TXT_APELLIDO), // copia el apellido
                Enter.theValue(datos.get(0).getContrasena()).into(RegistroUsuariosPage.TXT_CONTRASENA), // copia la contraseña
                SelectFromOptions.byValue(datos.get(0).getDia()).from(RegistroUsuariosPage.LIST_DIA),// selecciona el dia
                SelectFromOptions.byValue(datos.get(0).getMes()).from(RegistroUsuariosPage.LIST_MES),// selecciona el mes
                SelectFromOptions.byValue(datos.get(0).getAnio()).from(RegistroUsuariosPage.LIST_ANIO),// selecciona el año
                Enter.theValue(datos.get(0).getCompania()).into(RegistroUsuariosPage.TXT_COMPANIA),// copia la compañia
                Enter.theValue(datos.get(0).getPostal()).into(RegistroUsuariosPage.TXT_POSTAL),// copia la posta
                Enter.theValue(datos.get(0).getDireccion()).into(RegistroUsuariosPage.TXT_DIRECCION),// copia la direccion
                Enter.theValue(datos.get(0).getCiudad()).into(RegistroUsuariosPage.TXT_CIUDAD),// copia la ciudad
                Scroll.to(RegistroUsuariosPage.LIST_ESTADO),//busco el elemento
                SelectFromOptions.byVisibleText(datos.get(0).getEstado()).from(RegistroUsuariosPage.LIST_ESTADO), // selecciona el estado
                Enter.theValue(datos.get(0).getCodPostal()).into(RegistroUsuariosPage.TXT_CODPOSTAL),// copia el codigo postal
                SelectFromOptions.byValue(datos.get(0).getPais()).from(RegistroUsuariosPage.LIST_PAIS),//selecciona el pais
                Enter.theValue(datos.get(0).getInformacion()).into(RegistroUsuariosPage.TXT_INFORMACION),// copia la informacion
                Enter.theValue(datos.get(0).getTelefono()).into(RegistroUsuariosPage.TXT_TELEFONO),// copia el telefono
                Enter.theValue(datos.get(0).getCelular()).into(RegistroUsuariosPage.TXT_CELULAR),// copia el celular
                Enter.theValue(datos.get(0).getAlias()).into(RegistroUsuariosPage.TXT_ALIAS),// copia el alias
                Click.on(RegistroUsuariosPage.BTN_REGISTRAR) // click en boton registrar

        );
    }

    public static RegistroUsuarioTask conInformacion(List<RegistroUsuarioModel> datos) {
        return Tasks.instrumented(RegistroUsuarioTask.class,datos);
    }


}
