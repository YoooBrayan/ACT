package modelos;

import java.util.LinkedList;

/**
 *
 * @author YO
 */
public class Operario extends Persona{
    
    private LinkedList<Especializacion> especializacionId;
    private int sueldo;

    public Operario(LinkedList<Especializacion> especializacionId, String nombre, String correo, String contraseña, String Identificacion, String usuario, String tipo) {
        super(nombre, correo, contraseña, Identificacion, usuario, tipo);
        this.especializacionId = especializacionId;
    }

    public Operario() {
        this.especializacionId = new LinkedList<>();
        setTipo("operario");
        this.sueldo = 0;
    }
    
    public LinkedList<Especializacion> getEspecializacionId() {
        return especializacionId;
    }

    public void setEspecializacionId(LinkedList<Especializacion> especializacionId) {
        this.especializacionId = especializacionId;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return getIdentificacion() + " " + getNombre();
    }
    
    

}
