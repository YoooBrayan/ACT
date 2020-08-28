package modelos;

/**
 *
 * @author YO
 */
public class Especializacion {
    
    private int identificacion;
    private String descripcion;

    public Especializacion(int identificacion, String descripcion) {
        this.identificacion = identificacion;
        this.descripcion = descripcion;
    }
    
    public Especializacion() {
        this.identificacion = 0;
        this.descripcion = "";
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return identificacion + " " + descripcion;
    }
    
    
    
}
