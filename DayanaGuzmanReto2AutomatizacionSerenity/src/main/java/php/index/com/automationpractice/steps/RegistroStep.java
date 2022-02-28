package php.index.com.automationpractice.steps;

import cucumber.api.java.eo.Se;
import net.thucydides.core.annotations.Step;


import org.openqa.selenium.support.ui.Select;
import php.index.com.automationpractice.pageobjects.RegistroPageObject;

public class RegistroStep {
    RegistroPageObject registroPO;

// se indican los pasos a realizar
    @Step
    public void escribirCorreo(String correo) {
        registroPO.getDriver().findElement(registroPO.getTxt_email_create()).sendKeys(correo);
    }

    @Step
    public void clickSubmitCreate() {
        registroPO.getDriver().findElement(registroPO.getBtn_createAccount()).click();
    }

    @Step
    public void clickTitulo() {
        registroPO.getDriver().findElement(registroPO.getTxt_titulo()).click();
    }

    @Step
    public void escribirNombre(String nombre) {
        registroPO.getDriver().findElement(registroPO.getTxt_nombre()).sendKeys(nombre);
    }

    @Step
    public void escribirApellido(String apellido) {
        registroPO.getDriver().findElement(registroPO.getTxt_apellido()).sendKeys(apellido);
    }

    @Step
    public void escribirContrasena(String clave) {
        registroPO.getDriver().findElement(registroPO.getTxt_clave()).sendKeys(clave);
    }

    @Step
    public void selecionarDia(String diaNaci) {
        Select txt_diaNaci = new Select(registroPO.getDriver().findElement(registroPO.getTxt_diaNaci()));
        txt_diaNaci.selectByValue(diaNaci);
    }

    @Step
    public void seleccionarMes(String mesNaci) {
        Select txt_mesNaci = new Select(registroPO.getDriver().findElement(registroPO.getTxt_mesNaci()));
        txt_mesNaci.selectByValue(mesNaci);
    }

    @Step
    public void seleccionarAnio(String anoNaci) {
        Select txt_anoNaci = new Select(registroPO.getDriver().findElement(registroPO.getTxt_anoNaci()));
        txt_anoNaci.selectByValue(anoNaci);
    }

    @Step
    public void escribirNombre2(String nombre2) {
        registroPO.getDriver().findElement(registroPO.getTxt_nombre2()).sendKeys(nombre2);
    }

    @Step
    public void escribirApellido2(String apellido2) {
        registroPO.getDriver().findElement(registroPO.getTxt_Apellido2()).sendKeys(apellido2);
    }

    @Step
    public void escribirCompania(String compania) {
        registroPO.getDriver().findElement(registroPO.getTxt_compania()).sendKeys(compania);
    }

    @Step
    public void escribirPostal(String postal) {
        registroPO.getDriver().findElement(registroPO.getTxt_postal()).sendKeys(postal);
    }

    @Step
    public void escribirDireccion(String direccion) {
        registroPO.getDriver().findElement(registroPO.getTxt_direccion()).sendKeys(direccion);
    }

    @Step
    public void escribirCiudad(String ciudad) {
        registroPO.getDriver().findElement(registroPO.getTxt_ciudad()).sendKeys(ciudad);
    }

    @Step
    public void seleccionarEstado(String estado) {
        Select txt_estado = new Select(registroPO.getDriver().findElement(registroPO.getTxt_estado()));
        txt_estado.selectByValue(estado);
    }

    @Step
    public void escribirCodPostal(String codPostal) {
        registroPO.getDriver().findElement(registroPO.getTxt_codPostal()).sendKeys(codPostal);
    }

    @Step
    public void seleccionarPais(String pais){
        Select txt_pais = new Select(registroPO.getDriver().findElement(registroPO.getTxt_pais()));
         txt_pais.selectByValue(pais);
    }

    @Step
    public void adicionarInformacion(String informacion){
        registroPO.getDriver().findElement(registroPO.getTxt_informacion()).sendKeys(informacion);
    }

    @Step
    public void escribirTelefono(String telefono){
        registroPO.getDriver().findElement(registroPO.getTxt_telefono()).sendKeys(telefono);
    }

    @Step
    public void escribirCelular(String celular){
        registroPO.getDriver().findElement(registroPO.getTxt_celular()).sendKeys(celular);
    }

    @Step
    public void escribirAlias(String alias){
        registroPO.getDriver().findElement(registroPO.getTxt_alias()).sendKeys(alias);
    }

    @Step
    public void clickBotonRegistrar(){
        registroPO.getDriver().findElement(registroPO.getBtn_submitAccount()).click();
    }


}
