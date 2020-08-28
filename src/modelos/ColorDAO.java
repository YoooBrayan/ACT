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
public class ColorDAO implements DAO{

    Corte corte;
    ConexionMysql objCon;

    public ColorDAO() {
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
        
        String mensaje = "", sentencia = "call eliminarColorCorte(?,?)";
        
        JOptionPane.showMessageDialog(null, "Corte: " + corte.getIdentificacion() + "\nColor: " + corte.getColorId().getIdentificacion());
        
        try {
            objCon.conectar();
            
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, corte.getIdentificacion());
            consulta.setInt(2, corte.getColorId().getIdentificacion());
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
            String sentencia = "call colorCorte(?)";
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, corte.getIdentificacion());
            
            ResultSet datos = consulta.executeQuery();
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
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return plantilla;
    }

    @Override
    public String SeleccionarU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LinkedList listaColores()
    {
        LinkedList<Color> colores = new LinkedList<>();
        
        try {
             
            objCon.conectar();
            String sentencia = "select Color_Id as ID, Color_Nombre as Nombre from color";
            
            Statement consulta = objCon.getConexion().createStatement();
            ResultSet datos = consulta.executeQuery(sentencia);
           
            while(datos.next())
            {
                Color color = new Color();
                
                color.setIdentificacion(datos.getInt("ID"));
                color.setNombre(datos.getString("Nombre"));
                
                colores.add(color);
            }
            
            datos.close();
            consulta.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return colores;
    }

    public ConexionMysql getObjCon() {
        return objCon;
    }

    public void setObjCon(ConexionMysql objCon) {
        this.objCon = objCon;
    }
    
    
}
    