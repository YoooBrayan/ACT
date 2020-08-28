package modelos;

/**
 *
 * @author YO
 */
public class Operacion {
    
    private int identificacion, valor;
    private String Descripcion;

    public Operacion(int identificacion, int valor, String Descripcion) {
        this.identificacion = identificacion;
        this.valor = valor;
        this.Descripcion = Descripcion;
    }
    
    public Operacion() {
        this.identificacion = 0;
        this.valor = 0;
        this.Descripcion = "";
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
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        
        return identificacion + " " + Descripcion + " " + valor;
        
    }
    
    
    
    
    
}
