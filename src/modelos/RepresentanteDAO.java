package modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YO
 */
public class RepresentanteDAO extends PersonaDAO {

    private Representante objRepresentante;

    public RepresentanteDAO(Representante objRepresentante) {
        this.objRepresentante = objRepresentante;
    }
    
    public RepresentanteDAO() {
        this.objRepresentante = new
         Representante();
    }

    public Representante getObjRepresentante() {
        return objRepresentante;
    }

    public void setObjRepresentante(Representante objRepresentante) {
        this.objRepresentante = objRepresentante;
    }
    
    
    public DefaultTableModel MostrarCortes(String Tipo) {
        
        
        DefaultTableModel plantilla = new DefaultTableModel();
        String sentencia = "select * From " + Tipo;
        try {
            objCon.conectar();
            Statement consulta = objCon.getConexion().prepareStatement(sentencia);
            ResultSet datos = consulta.executeQuery(sentencia);
            ResultSetMetaData campos = datos.getMetaData();
            
            for(int i=1; i<=campos.getColumnCount(); i++)
            {
                plantilla.addColumn(campos.getColumnName(i));
            }
            
            while(datos.next())
            {
                Object fila[] = new Object[campos.getColumnCount()];
                for(int i=0; i<campos.getColumnCount(); i++)
                {
                    fila[i] = datos.getObject(i+1);
                }
                plantilla.addRow(fila);
            }
            
            datos.close();
            consulta.close();
             
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,  "Aqui\n Error "+ e);
        }
        return plantilla;
    }
    
    @Override
    public String insertar() {
        
        String mensaje = "";
        
        try {
                 
            PreparedStatement consulta = null;
            
            objCon.conectar();
            
            String comando = "call insertarRepresentante(?,?,?,?,?)";
            
            consulta = objCon.getConexion().prepareStatement(comando);
            consulta.setInt(1, Integer.parseInt(objPersona.getIdentificacion()));
            consulta.setString(2, objPersona.getNombre());
            consulta.setString(3, objPersona.getContraseña());
            consulta.setInt(4, objRepresentante.getProveedor().getIdentificacion());
            consulta.setString(5, objRepresentante.getCorreo());
            
            consulta.executeUpdate();
            
            consulta.close();
             
            mensaje = "Registro Exitoso...";
           
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            mensaje = "Registro Fallido...";
        }
        return  mensaje;
        
    }

    public String seleccionarU() {
        
        String mensaje = "", sentencia = "Call validarRepresentante(?)";
        
        try {
            
             
            objCon.conectar();
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, Integer.parseInt(objRepresentante.getIdentificacion()));
            ResultSet datos = consulta.executeQuery();
            
            while(datos.next())
            {
                mensaje = datos.getObject(1) + " " + datos.getObject(2) + " " + datos.getObject(3);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return mensaje;
    }

    public DefaultTableModel seleccionarV() {
         
        DefaultTableModel plantilla = new DefaultTableModel();
        
         
        String sentencia = "call cortesRepresentante(?)";
        try {
            objCon.conectar();
            PreparedStatement consulta = null;
            consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, Integer.parseInt(objRepresentante.getIdentificacion()));
            ResultSet datos = consulta.executeQuery();
            ResultSetMetaData campos = datos.getMetaData();
            
            for(int i=1; i<=campos.getColumnCount(); i++)
            {
                plantilla.addColumn(campos.getColumnName(i));
            }
            
            while(datos.next())
            {
                Object fila[]  = new Object[campos.getColumnCount()];
                for(int i=0; i<campos.getColumnCount(); i++)
                {
                    fila[i] = datos.getObject(i+1);
                }
                plantilla.addRow(fila);
            }
            datos.close();
            consulta.close();
             
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,  " ErrorRR "+ e);
        }
        
        return plantilla;
    }
        
}
