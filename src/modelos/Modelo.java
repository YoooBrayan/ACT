package modelos;

import java.util.LinkedList;

/**
 *
 * @author YO
 */
public class Modelo {
    
    private int identificacion, valor;
    private String nombre;
    private Proveedor proveedor;
    private LinkedList<Operacion> operacionId = new LinkedList<>();

    public Modelo(int identificacion, int valor, String nombre) {
        this.identificacion = identificacion;
        this.valor = valor;
        this.nombre = nombre;
    }
    
    public Modelo() {
        this.identificacion = 0;
        this.valor = 0;
        this.nombre = "";
        this.proveedor = new Proveedor();
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Operacion> getOperacionId() {
        return operacionId;
    }

    public void setOperacionId(LinkedList<Operacion> operacionId) {
        this.operacionId = operacionId;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return identificacion + " " + nombre;
    }
    
    
}
