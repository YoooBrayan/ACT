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
public class EspecializacionDAO implements DAO{

    ConexionMysql objCon;
    Operario operario;

    public EspecializacionDAO() {
        this.objCon = new ConexionMysql();
        this.operario = new Operario();
    }

    public ConexionMysql getobjCon() {
        return objCon;
    }

    public void setobjCon(ConexionMysql objCon) {
        this.objCon = objCon;
    }

    public Operario getOperario() {
        return operario;
    }

    public void setOperario(Operario operario) {
        this.operario = operario;
    }
       
    @Override
    public String insertar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultTableModel SeleccionarV() {
        
        DefaultTableModel plantilla = new DefaultTableModel();
        String sentencia = "call especializacionesOperario(?)";
        
        try {
            
            objCon.conectar();
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, Integer.parseInt(operario.getIdentificacion()));
            
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
            
            consulta.close();
             
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return plantilla;
    }

    @Override
    public String SeleccionarU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public LinkedList ListaEspecializaciones()
    {
        LinkedList<Especializacion> especializaciones = new LinkedList<>();
        
        try {
            objCon.conectar();
            Statement consulta = objCon.getConexion().createStatement();
            String sentencia = "select Especial_id, Especial_Descripcion from Especializacion";
            ResultSet datos =  consulta.executeQuery(sentencia);
            
            while(datos.next())
            {
                Especializacion especial = new Especializacion();
                
                especial.setIdentificacion(datos.getInt("Especial_Id"));
                especial.setDescripcion(datos.getString("Especial_Descripcion"));
                
                especializaciones.add(especial);
            }
            
/*            for(int i=0; i<especializaciones.size(); i++)
            {
                JOptionPane.showMessageDialog(null, especializaciones.get(i).toString());
            }*/
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return especializaciones
                ;
        
    }

    public ConexionMysql getObjCon() {
        return objCon;
    }

    public void setObjCon(ConexionMysql objCon) {
        this.objCon = objCon;
    }

    
}
