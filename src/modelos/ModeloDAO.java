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
public class ModeloDAO implements DAO{

    Modelo modeloN;
    Operacion operacionN;
    Representante representante;
    Proveedor proveedor;
    ConexionMysql objCon;

    public Modelo getModeloN() {
        return modeloN;
    }

    public void setModeloN(Modelo modeloN) {
        this.modeloN = modeloN;
    }

    public ModeloDAO(Modelo modeloN) {
        this.modeloN = modeloN;
    }
    
    public ModeloDAO() {
        this.modeloN = new Modelo();
        this.operacionN = new Operacion();
        this.representante = new Representante();
        objCon = new ConexionMysql();
    }

    public Operacion getOperacionN() {
        return operacionN;
    }

    public void setOperacionN(Operacion operacionN) {
        this.operacionN = operacionN;
    }

    public Representante getAsesor() {
        return representante;
    }

    public void setAsesor(Representante representante) {
        this.representante = representante;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    @Override
    public String insertar() {
        
        String mensaje = "";
        
        try {
            
            objCon.conectar();
            PreparedStatement consulta = null;
            
            String sentencia = "call insertarModelo(?,?,?,?)";
            consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, modeloN.getIdentificacion());
            consulta.setString(2, modeloN.getNombre());
            consulta.setInt(3, modeloN.getValor());
            consulta.setInt(4, modeloN.getProveedor().getIdentificacion());            
            
            consulta.executeUpdate();
           
            consulta.close();
             
            
            mensaje = "Registro Exitoso...";
                    
            
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
        
        String mensaje = "";
        
        try {
            objCon.conectar();
            
            PreparedStatement consulta = null;
            String sentencia = "call actualizarModelo(?,?)";
            
            consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, modeloN.getIdentificacion());
            consulta.setInt(2, modeloN.getValor());
            
            consulta.executeUpdate();
            consulta.close();
             
            
            mensaje = "Actualizacion Exitosa...";
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error: " + e);
            mensaje = "Actualizacion Fallida...";
        }
        
        return mensaje;
        
    }

    public String añadirOperacion()
    {
        String mensaje = "";
        
        //JOptionPane.showMessageDialog(null, operacionN.getIdentificacion());
        try {
            objCon.conectar();
            
            PreparedStatement consulta = null;
            String sentencia = "insert into Modelo_Operacion(Modelo_id, Operacion_id) values (?,?)";
            consulta = objCon.getConexion().prepareStatement(sentencia);
            consulta.setInt(1, modeloN.getIdentificacion());
            consulta.setInt(2, operacionN.getIdentificacion());
            
            consulta.executeUpdate();
            consulta.close();
            
            mensaje = "Registro Exitoso...";
                    
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error: " + e);
            mensaje = "Registro Fallido...";
        }
        
        return mensaje;
    }
    
    public String ModeloValor(int modelo)
    {
        String valor = "";
        String sql = "select Modelo_Valor from modelo where modelo_ID = ?";
        try {
            
            objCon.conectar();
            PreparedStatement consulta = objCon.getConexion().prepareStatement(sql);
            consulta.setInt(1, modelo);
            ResultSet dato = consulta.executeQuery();
            
            while(dato.next())
            {
                valor = dato.getString("Modelo_Valor");
            }
            dato.close();
            consulta.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener Valor de modelo: "+ e);
        }
        return valor;
    }
    
    
    @Override
    public DefaultTableModel SeleccionarV() {
        
        DefaultTableModel plantilla = new DefaultTableModel();
        try {
            objCon.conectar();
            
            String sentencia = "call modelosProveedor(?)";
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, proveedor.getIdentificacion());
            
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
            JOptionPane.showMessageDialog(null, "Error aca: " + e);
        }
        return plantilla;
    }

    @Override
    public String SeleccionarU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public LinkedList listaModelos()
    {
        LinkedList<Modelo> modelos = new LinkedList<>();
        
        try {
            objCon.conectar();
            String sentencia = "call modelosProveedor(?)";
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, modeloN.getProveedor().getIdentificacion());
            ResultSet datos = consulta.executeQuery();
            
            while(datos.next())
            {
                Modelo modelo = new Modelo();
                
                modelo.setIdentificacion(datos.getInt("ID"));
                modelo.setNombre(datos.getString("Nombre"));
                
                modelos.add(modelo);
            }
            
            datos.close();
            consulta.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return modelos;
    }
    
    public Modelo obtenerModelo()
    {
        Modelo modeloD = new Modelo();
        
        try {
            objCon.conectar();
        
            String sentencia = "Select Modelo_Nombre, Modelo_Valor from Modelo, Representante, Proveedor where representante_Proveedor = Proveedor_Id and Modelo_Proveedor = Proveedor_Id and Modelo_id = ?";

            PreparedStatement consulta = null;

            consulta = objCon.getConexion().prepareStatement(sentencia);
            consulta.setInt(1, modeloN.getIdentificacion());
            
            ResultSet datos = consulta.executeQuery();
            
            while(datos.next())
            {
                
                modeloD.setNombre(datos.getString("Modelo_Nombre"));
                modeloD.setValor(datos.getInt("Modelo_Valor"));
            }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
       
        return modeloD;
    }

    public void cortesModeloActualizado()
    {
        LinkedList<Corte> cortes = new LinkedList<>();
        LinkedList<Operacion> operaciones = new LinkedList<>();
        
        String sentenciaCMA  = "call cortesModeloActualizado(?)", sentenciaNO = "call nuevasOperaciones(?)", sentenciaI = "call insertarTarea(?,?)";
        
        try {
            objCon.conectar();
            
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentenciaCMA);
            consulta.setInt(1, modeloN.getIdentificacion());
            ResultSet datos = consulta.executeQuery();
            
            while(datos.next())
            {
                Corte corte = new Corte();
                
                corte.setIdentificacion(datos.getInt("Corte_ID"));
                
                cortes.add(corte);
            }
            
            datos.close();
            consulta.close();
            
            if(!(cortes.isEmpty()))
            {
                PreparedStatement consultaNO = objCon.getConexion().prepareCall(sentenciaNO);
                consultaNO.setInt(1, modeloN.getIdentificacion());
                ResultSet datosNO = consultaNO.executeQuery();
                
                while(datosNO.next())
                {
                    Operacion operacion = new Operacion();
                    operacion.setIdentificacion(datosNO.getInt("Operacion_ID"));
                    operaciones.add(operacion);
                }
                
                datosNO.close();
                consultaNO.close();
                
                for(int i=0; i<cortes.size(); i++)
                {
                    for(int j=0; j<operaciones.size(); j++)
                    {
                        PreparedStatement insercion = objCon.getConexion().prepareCall(sentenciaI);
                        insercion.setInt(1, cortes.get(i).getIdentificacion());
                        insercion.setInt(2, operaciones.get(j).getIdentificacion());
                        insercion.executeUpdate();
                        insercion.close();
                    }
                }
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
    }
    
    public String idNuevoModelo()
    {
        String sentencia = "select Modelo_Id from Modelo order by Modelo_Id desc limit 1";
        int id = 0;
        
        try {
            objCon.conectar();
            
            Statement consulta = objCon.getConexion().createStatement();
            ResultSet dato = consulta.executeQuery(sentencia);
            
            while(dato.next())
            {
                id = dato.getInt("Modelo_Id");
            }
            
            id++;
            consulta.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            id = 0;
        }
        
        return String.valueOf(id);
    }
    
    
    public ConexionMysql getObjCon() {
        return objCon;
    }

    public void setObjCon(ConexionMysql objCon) {
        this.objCon = objCon;
    }

    
}
