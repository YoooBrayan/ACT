package modelos;

/**
 *
 * @author YO
 */
public class Color {
    
    
    private int identificacion, cantidad;
    private String nombre;

    public Color(int identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }
    
    public Color() {
        this.identificacion = 0;
        this.nombre = "";
        this.cantidad = 0;
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

    @Override
    public String toString() {
        return identificacion + " " + nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
