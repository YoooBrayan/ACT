package modelos;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YO
 */
public class TareaDAO implements DAO{
    
    private ConexionMysql objCon;
    private Tarea tareaA;
    private Operario OperarioT;

    public TareaDAO() {
        this.objCon = new ConexionMysql();
        this.tareaA = new Tarea();
        this.OperarioT = new Operario();
    }

    @Override
    public String insertar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Eliminar() {
        
        String mensaje = "", sentencia = "call eliminarTarea(?)";
        
        try {
            objCon.conectar();
            
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, tareaA.getIdentificacion());
            consulta.executeUpdate();
            
            consulta.close();
             
            
            mensaje = "Tarea Eliminada...";
        } catch (SQLException e) {
            mensaje = "Eliminancion Fallida...";
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return mensaje;
    }

    @Override
    public String actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultTableModel SeleccionarV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String SeleccionarU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Tarea getTareaA() {
        return tareaA;
    }

    public void setTareaA(Tarea tareaA) {
        this.tareaA = tareaA;
    }

    public ConexionMysql getObjCon() {
        return objCon;
    }

    public void setObjCon(ConexionMysql objCon) {
        this.objCon = objCon;
    }
    
    
    
}
