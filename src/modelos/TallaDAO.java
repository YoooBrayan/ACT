package modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YO
 */
public class TallaDAO implements DAO{

    Corte corte;
    private ConexionMysql objCon;

    public TallaDAO() {
        this.corte = new Corte();
        objCon = new ConexionMysql();
    }

    public Corte getCorte() {
        return corte;
    }

    public void setCorte(Corte corte) {
        this.corte = corte;
    }    
    
    @Override
    public String insertar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Eliminar() {
        
        String mensaje = "", sentencia = "call eliminarTallaCorte(?,?)";
        
        try {
              
            objCon.conectar();
            
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, corte.getIdentificacion());
            consulta.setString(2, corte.getTalla().getIdentificacion());
            consulta.executeUpdate();
            
            consulta.close();
             
            
            mensaje = "Eliminacion Exitosa...";
                
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            mensaje = "Eliminacion Fallida...";
        }
        return mensaje;
    }

    @Override
    public String actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultTableModel SeleccionarV() {
        DefaultTableModel plantilla = new DefaultTableModel();
        
        try {
              
            objCon.conectar();
            String sentencia = "call tallaCorte(?)";
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, corte.getIdentificacion());
            
            ResultSet datos = consulta.executeQuery();
            ResultSetMetaData campos = datos.getMetaData();
            
            for(int i=1; i<=campos.getColumnCount(); i++)
            {
                plantilla.addColumn(campos.getColumnLabel(i));
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
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return plantilla;
    }

    @Override
    public String SeleccionarU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public LinkedList listaTallas()
    {
        LinkedList<Talla> tallas = new LinkedList<>();
        
        try {
              
            objCon.conectar();
            
            String sentencia = "Select Talla_Id as Talla from Talla";
            Statement consulta = objCon.getConexion().createStatement();
            ResultSet datos = consulta.executeQuery(sentencia);
            
            while(datos.next())
            {
                Talla talla = new Talla();
                talla.setIdentificacion(datos.getString("Talla"));
                tallas.add(talla);
            }
            datos.close();
            consulta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return tallas;
    }

    public ConexionMysql getObjCon() {
        return objCon;
    }

    public void setObjCon(ConexionMysql objCon) {
        this.objCon = objCon;
    }
       
}
