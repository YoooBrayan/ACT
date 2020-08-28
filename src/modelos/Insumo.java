package modelos;

/**
 *
 * @author YO
 */
public class Insumo {
    
    private int identificacion, valor;
    private String descripcion;

    public Insumo(int identificacion, int valor, String descripcion) {
        this.identificacion = identificacion;
        this.valor = valor;
        this.descripcion = descripcion;
    }
    
    public Insumo() {
        this.identificacion = 0;
        this.valor = 0;
        this.descripcion = "";
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
