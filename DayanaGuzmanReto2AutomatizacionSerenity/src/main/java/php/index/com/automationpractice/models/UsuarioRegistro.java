package php.index.com.automationpractice.models;

public class UsuarioRegistro {
//variable que se envian para diligenciar el formulario de Registro

    String titulo ;
    String nombre ;
    String apellido ;
    String correo ;
    String clave ;
    String diaNaci ;
    String mesNaci ;
    String anoNaci ;
    String compania ;
    String postal;
    String direccion ;
    String ciudad ;
    String estado;
    String codPostal;
    String pais;
    String informacion ;
    String telefono ;
    String celular ;
    String alias;
    String nombre2;
    String apellido2;

    // constructor
    public UsuarioRegistro(String nombre2,String apellido2,String titulo, String nombre, String apellido, String correo, String clave, String diaNaci, String mesNaci, String anoNaci, String compania, String postal, String direccion, String ciudad, String estado, String codPostal, String pais, String informacion, String telefono, String celular, String alias) {
        this.nombre2 = nombre2;
        this.apellido2 = apellido2;
        this.titulo = titulo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.clave = clave;
        this.diaNaci = diaNaci;
        this.mesNaci = mesNaci;
        this.anoNaci = anoNaci;
        this.compania = compania;
        this.postal = postal;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codPostal = codPostal;
        this.pais = pais;
        this.informacion = informacion;
        this.telefono = telefono;
        this.celular = celular;
        this.alias = alias;
    }


//getter
    public String getTitulo() {
        return titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }

    public String getDiaNaci() {
        return diaNaci;
    }

    public String getMesNaci() {
        return mesNaci;
    }

    public String getAnoNaci() {
        return anoNaci;
    }

    public String getCompania() {
        return compania;
    }

    public String getPostal() {
        return postal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public String getPais() {
        return pais;
    }

    public String getInformacion() {
        return informacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCelular() {
        return celular;
    }

    public String getAlias() {
        return alias;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getApellido2() {
        return apellido2;
    }
}
