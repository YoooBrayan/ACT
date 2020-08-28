package modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import javax.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author YO
 */
public class OperarioDAO extends PersonaDAO{

    private Operario objOperario;
    private Tarea tareaN;
    private Especializacion especializacion;

    public OperarioDAO(Operario objOperario) {
        this.objOperario = objOperario;
    }
    
    public OperarioDAO() {
        this.objOperario = new Operario();
        this.especializacion = new Especializacion();
        this.tareaN = new Tarea();
    }

    public Operario getObjOperario() {
        return objOperario;
    }

    public void setObjOperario(Operario objOperario) {
        this.objOperario = objOperario;
    }

    public Especializacion getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(Especializacion especializacion) {
        this.especializacion = especializacion;
    }

    public Tarea getTareaN() {
        return tareaN;
    }

    public void setTareaN(Tarea tareaN) {
        this.tareaN = tareaN;
    }
    
    @Override
    public String insertar() {
        
        String mensaje = "";
        
        try {
            
            PreparedStatement consulta = null;
            
            objCon.conectar();
            String comando = "call insertarOperario(?,?,?,?)";
            
            consulta = objCon.getConexion().prepareStatement(comando);
            consulta.setInt(1, Integer.valueOf(objOperario.getIdentificacion()));
            consulta.setString(2, objOperario.getNombre());
            consulta.setString(3, objOperario.getContraseña());
            consulta.setString(4, objOperario.getCorreo());
            
            consulta.executeUpdate();
            consulta.close();
             
            mensaje = "Registro Exitoso...";
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error: " + e);
            mensaje = "Registro Fallido...";
        }
        return  mensaje;
    }
    
    public String añadirEspecializacion()
    {
        String mensaje = "";
        
        try {
            
            ConexionMysql objC = new ConexionMysql();
            objC.conectar();
            String sentencia = "insert into Operario_Especializacion(Operario_id, Especializacion_id) values (?,?)";
            PreparedStatement consulta = null;
            consulta = objC.getConexion().prepareStatement(sentencia);
            consulta.setInt(1, Integer.parseInt(objOperario.getIdentificacion()));
            consulta.setInt(2, especializacion.getIdentificacion());
            consulta.executeUpdate();
            
            consulta.close();
            objC.getConexion().close();
            
            mensaje = "Registro Exitoso...";
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error: " + e);
            mensaje = "Registro Fallido...";
        }
        
        return mensaje;
    }
    
    public int validarOperario()
    {
        int id = 0;
        
        try {
             
            objCon.conectar();
            String sentencia = "Select validarOperario(?)";
            
            PreparedStatement consulta = objCon.getConexion().prepareStatement(sentencia);
            JOptionPane.showMessageDialog(null, objOperario.getIdentificacion());
            consulta.setInt(1, Integer.parseInt(objOperario.getIdentificacion()));
            
            ResultSet dato = consulta.executeQuery();
            ResultSetMetaData campos = dato.getMetaData();
            
            while(dato.next())
            {
                for(int i=0; i<campos.getColumnCount(); i++)
                {
                    id += dato.getInt(i+1);
                }
            }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error:  " +  e);
        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese ID Valido");
        }
        
        return id;
    }
    
    public DefaultTableModel Tareas()
    {
        DefaultTableModel plantilla = new DefaultTableModel();
        
        
        try {
             
            objCon.conectar();
            String sentencia = "call tareasOperario(?,?)";
            
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, tareaN.getCorte().getIdentificacion());
            consulta.setInt(2, Integer.parseInt(objOperario.getIdentificacion()));
            
            ResultSet dato =  consulta.executeQuery();
            ResultSetMetaData campos = dato.getMetaData();
            for(int i=1; i<=campos.getColumnCount(); i++)
            {
                plantilla.addColumn(campos.getColumnLabel(i));
            }
            
            while(dato.next())
            {
                Object[] fila = new Object[campos.getColumnCount()];
                for(int i=0; i<campos.getColumnCount(); i++)
                {
                    fila[i] = dato.getObject(i+1);
                }
                plantilla.addRow(fila);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return plantilla;
    }
    
    public String PagoCorte()
    {
        String mensaje = "";
        
        try {
             
            objCon.conectar();
            
            String sentencia = "select salarioOperarioCorte(?,?)";
            PreparedStatement consulta = objCon.getConexion().prepareStatement(sentencia);
            consulta.setInt(1, tareaN.getCorte().getIdentificacion());
            consulta.setInt(2, Integer.parseInt(objOperario.getIdentificacion()));
            ResultSet dato = consulta.executeQuery();
            
            while(dato.next())
            {
                mensaje =  dato.getObject(1).toString();
            }
            
            dato.close();
            consulta.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            mensaje = "0";
        } catch(NullPointerException n)
        {
            JOptionPane.showMessageDialog(null, "Error: " + n);
            mensaje = "0";
        }
        
        return  mensaje;
    }
    
    public String asignarTarea()
    {
        String mensaje = "";
        
        try {
            objCon.conectar();
            String sentencia = "call asignarTarea(?, ?, ?, ?)";
            PreparedStatement consulta = null;
            
            consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, tareaN.getIdentificacion());
            consulta.setInt(4, Integer.parseInt(objOperario.getIdentificacion()));
            consulta.setInt(2, tareaN.getCantidad());
            consulta.setInt(3, tareaN.getCorte().getIdentificacion());
            
            ResultSet dato = consulta.executeQuery();
            
            while(dato.next())
            {
                mensaje = String.valueOf(dato.getObject(1));
            }
            
            //consulta.executeUpdate();
            //consulta.close();
            
             
            
            //mensaje = "Registro Exitoso...";
            
        } catch (SQLException e) {
            
            //mensaje = "Registro Fallido...";
            JOptionPane.showMessageDialog(null, "ErrorRRRRRRRRR: " + e);
        }
        
        return mensaje;
    }
    
    public DefaultTableModel tareasAsignadasOperario()
    {
        DefaultTableModel plantilla = new DefaultTableModel();
        
        try {
            objCon.conectar();
            String sentencia = "call tareasAsignadasOperario(?,?)";
            
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, tareaN.getCorte().getIdentificacion());
            consulta.setInt(2, Integer.parseInt(objOperario.getIdentificacion()));
            
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
            
            datos.close();
            consulta.close();
             
            
        } catch (SQLException e) {            
            JOptionPane.showMessageDialog(null,  "Error "+ e);
        }
        
        return plantilla;
            
    }

   
    public DefaultTableModel seleccionarV() {
        
        DefaultTableModel plantilla = new DefaultTableModel();
        
        String sentencia = "Select * From operarios";
        
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
            
            consulta.close();
             
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return plantilla;
    }

    public String seleccionarU() {
        
        String mensaje = "", sentencia = "call validarOperario(?)";
        
        try {
            objCon.conectar();
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, Integer.parseInt(objOperario.getIdentificacion()));
            
            ResultSet datos  = consulta.executeQuery();
            ResultSetMetaData campos = datos.getMetaData();
            
            if(campos.getColumnCount() == 1)
            {
                while(datos.next())
                {
                    mensaje = datos.getObject(1).toString();
                }
            }
            else
            {
                while(datos.next())
                {
                    for(int i=0; i<campos.getColumnCount(); i++)
                    {
                        mensaje += datos.getObject(i+1).toString() + " ";
                    }
                }
            }
            consulta.close();
             
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return mensaje;
        
    }

    public String eliminar() {
        
        String sentencia = "call eliminarOperario(?)", mensaje = "";
        
        try {
            objCon.conectar();
            PreparedStatement consulta = objCon.getConexion().prepareStatement(sentencia);
            consulta.setInt(1, Integer.parseInt(objOperario.getIdentificacion()));
            
            consulta.executeUpdate();
            
            consulta.close();
             
            
            mensaje = "Eliminancion Exitosa...";
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            mensaje = "Eliminancion Fallida...";
        }
        return mensaje;
    }
    
    public LinkedList<Operario> listaOperarios()
    {
        LinkedList<Operario> operarios = new LinkedList<>();
        
        try {
            objCon.conectar();
            Statement consulta = objCon.getConexion().createStatement();
            ResultSet datos = consulta.executeQuery("Select Operario_Id, Operario_Nombre from Operario");
            
            while(datos.next())
            {
                Operario operario = new Operario();
                operario.setIdentificacion(datos.getString("Operario_ID"));
                operario.setNombre(datos.getString("Operario_Nombre"));
                operarios.add(operario);
            }
            
            datos.close();
            consulta.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return operarios;
    }
    
}

