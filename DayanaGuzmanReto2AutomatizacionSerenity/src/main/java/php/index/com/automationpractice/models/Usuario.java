package php.index.com.automationpractice.models;

public class Usuario {
    //variables que se envian para el inicio de seccion
    String correo;
    String clave;

    //constructor

    public Usuario(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    //metodos getters

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }
}
