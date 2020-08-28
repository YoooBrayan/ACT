package modelos;

import java.util.LinkedList;

/**
 *
 * @author YO
 */
public class Tarea {
    
    private int identificacion, Cantidad;
    private String descripcion;
    private LinkedList<Operacion> OperacionId;
    private Corte corte;

    public Tarea(int identificacion, String descripcion, LinkedList<Operacion> OperacionId) {
        this.identificacion = identificacion;
        this.descripcion = descripcion;
        this.OperacionId = OperacionId;
    }
    
    public Tarea() {
        this.identificacion = 0;
        this.descripcion = "";
        this.OperacionId = new LinkedList<>();
        this.Cantidad = 0;
        this.corte = new Corte();
    }

    public Corte getCorte() {
        return corte;
    }

    public void setCorte(Corte corte) {
        this.corte = corte;
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

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
       return identificacion + " " + descripcion;
        
    }
    
    
    
}
