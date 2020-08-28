package modelos;

import java.util.LinkedList;

/**
 *
 * @author YO
 */
public class Proveedor {
    
    private int identificacion;
    private String nombre;
    private Usuario usuario;
    private LinkedList<Representante> representantes = new LinkedList<>();

    public Proveedor(int identificacion, String nombre, Usuario usuario) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.usuario = usuario;
    }
    
    public Proveedor() {
        this.identificacion = 0;
        this.nombre = "";
        this.usuario = new Usuario();
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LinkedList<Representante> getRepresentantes() {
        return representantes;
    }

    public void setRepresentantes(LinkedList<Representante> representantes) {
        this.representantes = representantes;
    }

    @Override
    public String toString() {
        return identificacion + " " + nombre;
    }
    
    
    
}
