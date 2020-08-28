package modelos;

/**
 *
 * @author YO
 */
public class Talla {
    
    private String Descripcion, identificacion;
    private int cantidad;

    public Talla(String identificacion, String Descripcion) {
        this.identificacion = identificacion;
        this.Descripcion = Descripcion;
    }
    
    public Talla() {
        this.identificacion = "";
        this.Descripcion = "";
        this.cantidad = 0;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return ""+identificacion;
    }
    
    
    
}
