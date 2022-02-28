package php.index.com.automationpractice.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")// se envia la url
public class InicioSesionPageObject extends PageObject {
// se obtienen los objetos
    By btn_login1 = By.className("login");
    By txt_Correo = By.name("email");
    By txt_Clave = By.name("passwd");
    By btn_login2 = By.name("SubmitLogin");
    By txt_texto = By.className("info-account");
    By txt_Error = By.xpath("//div[@class='alert alert-danger']/p");

// getter de los objetos
    public By getTxt_Error() {
        return txt_Error;
    }

    public By getBtn_login1() { return btn_login1; }

    public By getTxt_Correo() {
        return txt_Correo;
    }

    public By getTxt_Clave() {
        return txt_Clave;
    }

    public By getBtn_login2() {
        return btn_login2;
    }

    public By getTxt_texto() { return txt_texto; }
}
