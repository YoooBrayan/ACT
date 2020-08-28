/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Observable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YO
 */
public class OperacionDAO extends Observable implements DAO{

    ConexionMysql objCon;
    Operacion operacionN;
    Modelo modelo;
    
    public OperacionDAO() throws SQLException {
        this.operacionN = new Operacion();
        objCon = new ConexionMysql();
        modelo = new Modelo();
    }

    public Operacion getOperacionN() {
        return operacionN;
    }

    public void setOperacionN(Operacion operacionN) {
        this.operacionN = operacionN;
        setChanged();
        notifyObservers();
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String insertar() throws SQLException{
        String mensaje = "";
        
        try {
            PreparedStatement consulta = null;
            objCon.conectar();
            objCon.getConexion().setAutoCommit(false);
            String sentencia = "insert into operacion(Operacion_id, Operacion_Descripcion, Operacion_valor) values (?,?,?)";
            
            
            consulta = objCon.getConexion().prepareStatement(sentencia);
            consulta.setInt(1, operacionN.getIdentificacion());
            consulta.setString(2, operacionN.getDescripcion());
            consulta.setInt(3, operacionN.getValor());
            
            consulta.executeUpdate();
            consulta.close();
            
            PreparedStatement consultaM = null;
            String sentenciaM = "insert into Modelo_Operacion(Modelo_id, Operacion_id) values (?,?)";
            consultaM = objCon.getConexion().prepareStatement(sentenciaM);
            consultaM.setInt(1, modelo.getIdentificacion());
            consultaM.setInt(2, operacionN.getIdentificacion());
            consultaM.executeUpdate();
            
            objCon.getConexion().commit();
            mensaje = "Registro Exitoso...";
        } catch (SQLException e) {
            
            objCon.getConexion().rollback();
            mensaje = "Registro Fallido";
            if(e.toString().contains("PRIMARY"))
            {
                JOptionPane.showMessageDialog(null, "Identificacion Ya registrada");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error " + e);
            }
        }
        
        return mensaje;
    }

    @Override
    public String Eliminar() {
        
        String mensaje = "", sentencia = "call eliminarOperacionModelo(?)";
        
        try {
            objCon.conectar();
            
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, operacionN.getIdentificacion());
            consulta.executeUpdate();
            
            mensaje = "Eliminacion Exitosa...";
            
        } catch (SQLException e) {
            mensaje = "Eliminacion Fallida...";
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return mensaje;
    }

    @Override
    public String actualizar() {
        
        String mensaje = "";
        
        try {
            objCon.conectar();
            
            String sentencia = "call actualizarOperacion(?,?,?,?)";
            
            PreparedStatement consulta = null;
            
            consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, operacionN.getIdentificacion());
            consulta.setString(2, operacionN.getDescripcion());
            consulta.setInt(3, operacionN.getValor());
            consulta.setInt(4, modelo.getIdentificacion());
            
            consulta.executeUpdate();
            
            consulta.close();
             
            
            mensaje = "Actualizacion Exitosa...";
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error: " + e);
            mensaje = "Actualizacion Fallida...";
        }
        
        return mensaje;
    }

    @Override
    public DefaultTableModel SeleccionarV() {
        
        DefaultTableModel plantilla = new DefaultTableModel();
        
        try {
            
            objCon.conectar();
            String sentencia = "call operacionesModelo(?)";
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, modelo.getIdentificacion());
            
            ResultSet datos = consulta.executeQuery();
            ResultSetMetaData campos = datos.getMetaData();
            
            for(int i=1; i<=campos.getColumnCount(); i++)
            {
                plantilla.addColumn(campos.getColumnName(i));
            }
            
            while(datos.next())
            {
                Object[] fila = new Object[campos.getColumnCount()];
                for(int i=0; i<campos.getColumnCount(); i++)
                {
                    fila[i] = datos.getObject(i+1);
                }
                plantilla.addRow(fila);
                
            }
            
            datos.close();
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
    
    public LinkedList ListaOperaciones()
    {
        LinkedList<Operacion> operaciones = new LinkedList<>();
        
        try {
            objCon.conectar();
            Statement consulta = objCon.getConexion().createStatement();
            String sentencia = "select Operacion_id, Operacion_Descripcion, Operacion_Valor from Operacion order by Operacion_Descripcion";
            ResultSet datos =  consulta.executeQuery(sentencia);
            
            while(datos.next())
            {
                Operacion operacion = new Operacion();
                
                operacion.setIdentificacion(datos.getInt("Operacion_Id"));
                operacion.setDescripcion(datos.getString("Operacion_Descripcion"));
                operacion.setValor(datos.getInt("Operacion_Valor"));
                
                operaciones.add(operacion);
            }
            
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return operaciones;
        
    }
    
    public LinkedList<Operacion> buscarOperacion(String filtro)
    {
        LinkedList<Operacion> operaciones = new LinkedList<>();
        String sentencia = "select Operacion_id, Operacion_Descripcion, Operacion_Valor from Operacion where Operacion_Descripcion like ?";
        
        try {
            objCon.conectar();
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setString(1, "%"+filtro+"%");
            ResultSet datos = consulta.executeQuery();
            
            while(datos.next())
            {
                Operacion operacion = new Operacion();
                
                operacion.setIdentificacion(datos.getInt("Operacion_Id"));
                operacion.setDescripcion(datos.getString("Operacion_Descripcion"));
                operacion.setValor(datos.getInt("Operacion_Valor"));
                
                operaciones.add(operacion);
            }
            
            datos.close();
            consulta.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        //JOptionPane.showMessageDialog(null, "Filtro: " + filtro + "\nOperaciones: " + operaciones.size());
        return operaciones;
    }
    
    public LinkedList filtrar(int corte, String filtro)
    {
        LinkedList<Tarea> tareas = new LinkedList<>();
        String sentencia = "call filtrarOperacion(?,?)";
        try {
            objCon.conectar();
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, corte);
            consulta.setString(2, "%"+filtro+"%");
            ResultSet datos =  consulta.executeQuery();
            
            while(datos.next())
            {
                Tarea tarea = new Tarea();
                
                tarea.setIdentificacion(datos.getInt("Tarea_ID"));
                tarea.setDescripcion(datos.getString("Operacion_Descripcion"));
                
                tareas.add(tarea);
            }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return tareas;
    }
    
    public Operacion obtenerOperacion()
    {
        Operacion operacionO = new Operacion();
        
        String sentencia = "Select Operacion_Descripcion, Operacion_Valor from Operacion, Modelo, Modelo_Operacion where Modelo.Modelo_Id = Modelo_Operacion.Modelo_Id and Modelo_Operacion.Operacion_Id = Operacion.Operacion_Id and Operacion.Operacion_Id = ? and Modelo.Modelo_Id = ?" ;
        
        try {
            objCon.conectar();
            
            PreparedStatement consulta = null;
            
           consulta = objCon.getConexion().prepareStatement(sentencia);
           consulta.setInt(1, operacionN.getIdentificacion());
           consulta.setInt(2, modelo.getIdentificacion());
           
           ResultSet datos = consulta.executeQuery();
           
           while(datos.next())
           {
               operacionO.setDescripcion(datos.getString("Operacion_Descripcion"));
               operacionO.setValor(datos.getInt("Operacion_Valor"));
           }
                   
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return operacionO;
    }

    public String idNuevaOperacion()
    {
        String sentencia = "select operacion_Id from operacion order by operacion_Id desc limit 1";
        int id = 0;
        
        try {
            objCon.conectar();
            
            Statement consulta = objCon.getConexion().createStatement();
            ResultSet dato = consulta.executeQuery(sentencia);
            
            while(dato.next())
            {
                id = dato.getInt("operacion_Id");
            }
            
            
            id++;
            consulta.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            id = 0;
        }
        
        return String.valueOf(id);
    }
    
    public String OperacionesTotal()
    {
        String mensaje = "", sentencia = "select totalvaloroperaciones(?)";
        
        try {
            objCon.conectar();
            
            PreparedStatement consulta = objCon.getConexion().prepareStatement(sentencia);
            consulta.setInt(1, modelo.getIdentificacion());
            
            ResultSet dato = consulta.executeQuery();
            
            while(dato.next())
            {
                mensaje = String.valueOf(dato.getObject(1));
            }
            
        } catch (SQLException e) {
            mensaje = "Error";
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return mensaje;
    }
    
    public DefaultTableModel EliminarOperacion()
    {
        DefaultTableModel plantilla = new DefaultTableModel();
        String sentencia = "call OperacionesModeloE(?)";
        
        try {
            objCon.conectar();
            
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, modelo.getIdentificacion());
            ResultSet datos = consulta.executeQuery();
            ResultSetMetaData campos = datos.getMetaData();
            
            for(int i=1; i<=campos.getColumnCount(); i++)
            {
                plantilla.addColumn(campos.getColumnLabel(i));
            }
            
            while(datos.next())
            {
                Object[] fila = new Object[campos.getColumnCount()];
                for(int i=0; i<campos.getColumnCount(); i++)
                {
                    fila[i] = datos.getObject(i+1);
                }
                plantilla.addRow(fila);
            }
            
            datos.close();
            consulta.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return plantilla;
    }
    
    public ConexionMysql getObjCon() {
        return objCon;
    }

    public void setObjCon(ConexionMysql objCon) {
        this.objCon = objCon;
    }
    
    
}
