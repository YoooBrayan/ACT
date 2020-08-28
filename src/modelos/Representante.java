package modelos;

/**
 *
 * @author YO
 */
public class Representante extends Persona{

    private Proveedor proveedor;
    
    public Representante(String nombre, String correo, String contraseña, String Identificacion, String usuario, String tipo) {
        super(nombre, correo, contraseña, Identificacion, usuario, tipo);
    }

    public Representante() {
        setTipo("Representante");
        this.proveedor = new Proveedor();
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return getIdentificacion() + " " + getNombre();
    }

}
