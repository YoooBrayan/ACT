package modelos;

/**
 *
 * @author YO
 */
public class Usuario {
    
    private int identificacion;
    private String nombre, descripcion;

    public Usuario(int identificacion, String nombre, String descripcion) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public Usuario() {
        this.identificacion = 0;
        this.nombre = "";
        this.descripcion = "";
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
