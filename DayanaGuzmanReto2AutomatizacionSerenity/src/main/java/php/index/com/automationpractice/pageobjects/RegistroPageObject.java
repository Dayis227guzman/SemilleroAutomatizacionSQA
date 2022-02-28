package php.index.com.automationpractice.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("http://automationpractice.com/index.php") // se envia la url
public class RegistroPageObject extends PageObject {
    // se obtienen  los los onjetos

    By btn_login1 = By.xpath("//a[@class='login']");
    By txt_email_create = By.xpath("//input[@name='email_create']");
    By btn_createAccount = By.xpath("//i[@class='icon-user left']");
    By txt_titulo = By.xpath("//input[@name='id_gender' and @value ='2']");
    By txt_nombre = By.xpath("//input[@name='customer_firstname']");
    By txt_apellido = By.xpath("//input[@name='customer_lastname']");
    By txt_clave = By.xpath("//input[@name='passwd']");

    By txt_diaNaci = By.name("days");
    By txt_mesNaci = By.name("months");
    By txt_anoNaci = By.name("years");


    By txt_nombre2 = By.xpath("//input[@name='firstname']");
    By txt_Apellido2 = By.xpath("//input[@name='lastname']");

    By txt_compania = By.xpath("//input[@name='company']");
    By txt_postal = By.xpath("//input[@name='address1']");
    By txt_direccion = By.xpath("//input[@name='address2']");
    By txt_ciudad = By.xpath("//input[@name='city']");

    By txt_estado = By.name("id_state");

   By txt_codPostal = By.xpath("//input[@name='postcode']");

   By txt_pais = By.name("id_country");

    By txt_informacion = By.xpath("//textarea[@name='other']");
    By txt_telefono = By.xpath("//input[@name='phone']");
    By txt_celular = By.xpath("//input[@name='phone_mobile']");
    By txt_alias = By.xpath("//input[@name='alias']");

    By btn_submitAccount = By.xpath("//button[@name='submitAccount']");


    // getters
    public By getBtn_login1() {
        return btn_login1;
    }

    public By getTxt_email_create() {
        return txt_email_create;
    }

    public By getBtn_createAccount() {
        return btn_createAccount;
    }

    public By getTxt_titulo() {
        return txt_titulo;
    }

    public By getTxt_nombre() {
        return txt_nombre;
    }

    public By getTxt_apellido() {
        return txt_apellido;
    }


    public By getTxt_clave() {
        return txt_clave;
    }

    public By getTxt_diaNaci() {
        return txt_diaNaci;
    }


    public By getTxt_mesNaci() {
       return txt_mesNaci;
    }

    public By getTxt_anoNaci() {
        return txt_anoNaci;
   }

    public By getTxt_nombre2() {
        return txt_nombre2;
    }

    public By getTxt_Apellido2() {
        return txt_Apellido2;
    }

    public By getTxt_compania() {
        return txt_compania;
    }

    public By getTxt_postal() {
        return txt_postal;
    }

    public By getTxt_direccion() {
        return txt_direccion;
    }

    public By getTxt_ciudad() {
        return txt_ciudad;
    }

    public By getTxt_estado() {
      return txt_estado;
    }

    public By getTxt_codPostal() {
        return txt_codPostal;
    }

    public By getTxt_pais() {
        return txt_pais;
    }

    public By getTxt_informacion() {
        return txt_informacion;
    }

    public By getTxt_telefono() {
        return txt_telefono;
    }

    public By getTxt_celular() {
        return txt_celular;
    }

    public By getTxt_alias() {
        return txt_alias;
    }

    public By getBtn_submitAccount() {
        return btn_submitAccount;
    }
}
