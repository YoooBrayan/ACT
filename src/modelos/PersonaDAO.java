package modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YO
 */
public class PersonaDAO implements DAO{

    Persona objPersona;
    ConexionMysql objCon;
   
    public PersonaDAO(Persona objPersona) {
        this.objPersona = objPersona;
    }
    
    public PersonaDAO() {
        this.objPersona = new Administrador();
        this.objPersona = new Representante();
        this.objPersona = new Operario();
        objCon = new ConexionMysql();
    }

    public Persona getObjPersona() {
        return objPersona;
    }

    public void setObjPersona(Persona objPersona) {
        this.objPersona = objPersona;
    }
    
   
    
    @Override
    public String insertar() {
        String mensaje = "";
        
        try {
            
 
            PreparedStatement consulta = null;
            
            objCon.conectar();
            
            String comando = "call insertar"+objPersona.getTipo()+"(?,?,?,?)";
            
            consulta = objCon.getConexion().prepareStatement(comando);
            consulta.setInt(1, Integer.valueOf(objPersona.getIdentificacion()));
            consulta.setString(2, objPersona.getNombre());
            consulta.setString(3, objPersona.getContraseña());
           
            
        } catch (SQLException e) {
        }
        return  mensaje;
    }

    public ConexionMysql getObjCon() {
        return objCon;
    }

    public void setObjCon(ConexionMysql objCon) {
        this.objCon = objCon;
    }

    @Override
    public String Eliminar() {
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

    @Override
    public String actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
