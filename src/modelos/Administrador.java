package modelos;

/**
 *
 * @author YO
 */
public class Administrador extends Persona{

    public Administrador(String nombre, String correo, String contraseña, String Identificacion, String usuario, String tipo) {
        super(nombre, correo, contraseña, Identificacion, usuario, tipo);
    }

    public Administrador() {
        
        setTipo("administrador");
    }

    
    
    
}
