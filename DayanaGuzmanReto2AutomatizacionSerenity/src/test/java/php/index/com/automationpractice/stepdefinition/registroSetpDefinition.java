package php.index.com.automationpractice.stepdefinition;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import php.index.com.automationpractice.models.UsuarioRegistro;
import php.index.com.automationpractice.steps.InicioSesionStep;
import php.index.com.automationpractice.steps.RegistroStep;

import java.util.List;

public class registroSetpDefinition {
//gherkin, lo que espero obtener con la automatizacion, en este caso , no se invocan el dado y entonces ya que del runner anterior nos sirven

    @Steps
    RegistroStep registroStep;


    @Cuando("^ingreso mis los datos de Registro$")
    public void ingresoMisLosDatosDeRegistro(List<UsuarioRegistro> listaRegistro) {
        registroStep.escribirCorreo(listaRegistro.get(0).getCorreo());
        registroStep.clickSubmitCreate();
        registroStep.clickTitulo();
        registroStep.escribirNombre(listaRegistro.get(0).getNombre());
        registroStep.escribirApellido(listaRegistro.get(0).getApellido());
        registroStep.escribirContrasena(listaRegistro.get(0).getClave());
        registroStep.selecionarDia(listaRegistro.get(0).getDiaNaci());
        registroStep.seleccionarMes(listaRegistro.get(0).getMesNaci());
        registroStep.seleccionarAnio(listaRegistro.get(0).getAnoNaci());
        registroStep.escribirNombre2(listaRegistro.get(0).getNombre2());
        registroStep.escribirApellido2(listaRegistro.get(0).getApellido2());
        registroStep.escribirCompania(listaRegistro.get(0).getCompania());
        registroStep.escribirPostal(listaRegistro.get(0).getPostal());
        registroStep.escribirDireccion(listaRegistro.get(0).getDireccion());
        registroStep.escribirCiudad(listaRegistro.get(0).getCiudad());
        registroStep.seleccionarEstado(listaRegistro.get(0).getEstado());
        registroStep.escribirCodPostal(listaRegistro.get(0).getCodPostal());
        registroStep.seleccionarPais(listaRegistro.get(0).getPais());
        registroStep.adicionarInformacion(listaRegistro.get(0).getInformacion());
        registroStep.escribirTelefono(listaRegistro.get(0).getTelefono());
        registroStep.escribirCelular(listaRegistro.get(0).getCelular());
        registroStep.escribirAlias(listaRegistro.get(0).getAlias());
        registroStep.clickBotonRegistrar();

    }

}
