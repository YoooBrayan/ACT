package modelos;

import java.sql.Date;
import java.util.LinkedList;

/**
 *
 * @author YO
 */
public class Corte {
    
    private int identificacion, cantidad;
    private Representante representanteId;
    private Modelo modeloId;
    private Talla talla;
    private Color color;
    private LinkedList<Insumo> insumoId = new LinkedList<>();
    private LinkedList<Tarea> tareaId = new LinkedList<>();
    private Fecha fechaEnvio, fechaEntrega;
    private String fechaE, fechaEn;
    private String Observaciones;

    public Corte(int identificacion, Representante representanteId, Modelo modeloId) {
        this.identificacion = identificacion;
        this.representanteId = representanteId;
        this.modeloId = modeloId;
    }
    
    public Corte() {
        this.identificacion = 0;
        this.representanteId = new Representante();
        this.modeloId = new Modelo();
        this.fechaEnvio = new Fecha();
        this.fechaEntrega = new Fecha();
        this.cantidad = 0;
        this.talla = new Talla();
        this.color = new Color();
        this.Observaciones = "";
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Fecha getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Fecha fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public Representante getRepresentanteId() {
        return representanteId;
    }

    public void setRepresentanteId(Representante representanteId) {
        this.representanteId = representanteId;
    }

    public Modelo getModeloId() {
        return modeloId;
    }

    public void setModeloId(Modelo modeloId) {
        this.modeloId = modeloId;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public Color getColorId() {
        return color;
    }

    public void setColorId(Color color) {
        this.color = color;
    }

    public LinkedList<Insumo> getInsumoId() {
        return insumoId;
    }

    public void setInsumoId(LinkedList<Insumo> insumoId) {
        this.insumoId = insumoId;
    }

    public LinkedList<Tarea> getTareaId() {
        return tareaId;
    }

    public void setTareaId(LinkedList<Tarea> tareaId) {
        this.tareaId = tareaId;
    }

    public Fecha getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Fecha fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }
    
    @Override
    public String toString() {
        return "Id " + identificacion + " " + " Modelo: " + modeloId + " Cantidad: " + cantidad + " Fecha: " + fechaEnvio;
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }

    public String getFechaEn() {
        return fechaEn;
    }

    public void setFechaEn(String fechaEn) {
        this.fechaEn = fechaEn;
    }
    
    

}
