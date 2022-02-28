package php.index.com.automationpractice.steps;

import net.thucydides.core.annotations.Step;
import php.index.com.automationpractice.pageobjects.InicioSesionPageObject;

public class InicioSesionStep {
    InicioSesionPageObject inicioPO;
// se indican los pasos a realizar
    @Step
    public void clickLogin1(){
        inicioPO.getDriver().findElement(inicioPO.getBtn_login1()).click();
    }

    @Step
    public void abrirAplicacion(){
        inicioPO.open();
    }

    @Step
    public void escribirCorreo(String correo){
        inicioPO.getDriver().findElement(inicioPO.getTxt_Correo()).sendKeys(correo);
    }

    @Step
    public void escribirClave(String clave){
        inicioPO.getDriver().findElement(inicioPO.getTxt_Clave()).sendKeys(clave);
    }

    @Step
    public void clickLogin2(){

        inicioPO.getDriver().findElement(inicioPO.getBtn_login2()).click();
    }

    @Step
    public String obtenerTexto(String cp){
        String resultado = "";
        if (cp.equalsIgnoreCase("Exitoso")){
       resultado = inicioPO.getDriver().findElement(inicioPO.getTxt_texto()).getText();
        }else {
            resultado = inicioPO.getDriver().findElement(inicioPO.getTxt_Error()).getText();
        }
        return resultado;
    }

}
