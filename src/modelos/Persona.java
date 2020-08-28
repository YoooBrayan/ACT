package modelos;

import java.util.LinkedList;

/**
 *
 * @author YO
 */
public abstract class Persona {
    
    private String nombre, correo, contraseña, Identificacion, usuario, tipo;
    

    public Persona(String nombre, String correo, String contraseña, String Identificacion, String usuario, String tipo) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.Identificacion = Identificacion;
        this.usuario = usuario;
        this.tipo = tipo;
    }
    
    public Persona() {
        this.nombre = "";
        this.correo = "";
        this.contraseña = "";
        this.Identificacion = "";
        this.usuario = "";
        this.tipo = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", Identificacion=" + Identificacion + ", usuario=" + usuario + '}';
    }
    
    
}
