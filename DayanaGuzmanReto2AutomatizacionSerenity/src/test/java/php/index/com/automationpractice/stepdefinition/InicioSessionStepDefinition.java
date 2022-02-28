package php.index.com.automationpractice.stepdefinition;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import jxl.biff.ConditionalFormatRangeRecord;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import php.index.com.automationpractice.models.Usuario;
import php.index.com.automationpractice.steps.InicioSesionStep;

import java.util.List;

public class InicioSessionStepDefinition {

    @Steps
    InicioSesionStep inicioStep;
//gherkin, lo que espero obtener con la automatizacion
    @Dado("^que estoy en la pagina de inio de automationpractice$")
    public void queEstoyEnLaPaginaDeInioDeAutomationpractice() {
        inicioStep.abrirAplicacion();
        inicioStep.clickLogin1();

    }

    @Cuando("^ingreso mis credenciales$")
    public void ingresoMisCredenciales(List<Usuario> ListaCorreo) {
        inicioStep.escribirCorreo(ListaCorreo.get(0).getCorreo());
        inicioStep.escribirClave(ListaCorreo.get(0).getClave());
        inicioStep.clickLogin2();

    }

    @Entonces("^inicio Sesion (.*),(.*)$")
    public void inicioSesion(String resultado,String cp) {
        Assert.assertEquals(resultado,inicioStep.obtenerTexto(cp));

    }
}
