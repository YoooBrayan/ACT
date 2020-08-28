/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class ProveedorDAO implements DAO{

    private  Proveedor objProv;
    private ConexionMysql objCon;

    public ProveedorDAO(Proveedor objProv) {
        this.objProv = objProv;
    }
    
    public ProveedorDAO() {
        this.objProv = new Proveedor();
        this.objCon = new ConexionMysql();
    }

    public Proveedor getObjProv() {
        return objProv;
    }

    public void setObjProv(Proveedor objProv) {
        this.objProv = objProv;
    }
    
    
    @Override
    public String insertar() {
        String mensaje = "";
        
        try {
            
            PreparedStatement consulta = null;
            objCon.conectar();
            
            String comando = "call insertarProveedor(?,?)";
            consulta = objCon.getConexion().prepareCall(comando);
            consulta.setInt(1, objProv.getIdentificacion());
            consulta.setString(2, objProv.getNombre());
            consulta.executeUpdate();
            mensaje = "Registro Exitoso...";
            
            consulta.close();
             
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error: " + e);
                    
            mensaje = "Registro Fallido...";
        }
        
        return mensaje;
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
        
        String sentencia = "call representantesProveedor(?)";
        DefaultTableModel plantilla = new DefaultTableModel();
        
        try {
            
            objCon.conectar();
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, objProv.getIdentificacion());
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
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return plantilla;
    }

    @Override
    public String SeleccionarU() {
        
        String mensaje = "", sentencia = "call validarProveedor(?)";
        
        try {
            
            objCon.conectar();
            
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, objProv.getIdentificacion());
            
            ResultSet datos = consulta.executeQuery();
            
            while (datos.next())
            {                
                mensaje = datos.getObject(1) + " " + datos.getObject(2);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return mensaje;
    }

    public LinkedList<Representante> listaRepresentantes()
    {
        String sentencia = "call listaRepresentantes(?)";
        LinkedList<Representante> representantes = new LinkedList<>();
        
        try {
            objCon.conectar();
            
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, objProv.getIdentificacion());
            
            ResultSet datos = consulta.executeQuery();
            
            while(datos.next())
            {
                Representante representante = new Representante();
                representante.setIdentificacion(datos.getString("Representante_Id"));
                representante.setNombre(datos.getString("Representante_Nombre"));
                
                representantes.add(representante);
            }
            
            consulta.close();
                    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return representantes;       
    }
    
    public LinkedList<Proveedor> listaProveedores()
    {
        LinkedList<Proveedor> proveedores = new LinkedList<>();
        
        String sentencia = "select * from Proveedor";
        
        try {
            objCon.conectar();
            
            Statement consulta = objCon.getConexion().createStatement();
            ResultSet datos = consulta.executeQuery(sentencia);
            
            while(datos.next())
            {
                Proveedor proveedor = new Proveedor();
                
                proveedor.setIdentificacion(Integer.parseInt(datos.getString("Proveedor_ID")));
                proveedor.setNombre(datos.getString("Proveedor_Nombre"));
                
                proveedores.add(proveedor);
            }
            
            consulta.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return proveedores;
    }
    
    public ConexionMysql getObjCon() {
        return objCon;
    }

    public void setObjCon(ConexionMysql objCon) {
        this.objCon = objCon;
    }

    
}
