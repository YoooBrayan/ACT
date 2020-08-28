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
public class CorteDAO  implements DAO{

    ConexionMysql objCon;
    Corte corteid;
    Tarea tarea;
    Modelo modelo;
   

    public CorteDAO() {
        this.objCon = new ConexionMysql();
        this.corteid = new Corte();
        this.modelo = new Modelo();
       
    }

    public Corte getCorteid() {
        return corteid;
    }

    public void setCorteid(Corte corteid) {
        this.corteid = corteid;
    }
    
    
    public LinkedList ListaTareas()
    {
        LinkedList<Tarea> tareas = new LinkedList<>();
         
        try {
            objCon.conectar();
            PreparedStatement consulta = null;
            String sentencia = "call TareasCorte(?)";
            consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, corteid.getIdentificacion());
            ResultSet datos =  consulta.executeQuery();
            
            while(datos.next())
            {
                 Tarea tareaN =  new Tarea();
                
                tareaN.setIdentificacion(datos.getInt("Tarea_Id"));
                tareaN.setDescripcion(datos.getString("Operacion_Descripcion"));
                
                tareas.add(tareaN);
            }            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return tareas;
        
    }        
    
    
    @Override
    public String insertar() {
        String mensaje = "";
        
        try {
            
            objCon.conectar();
            
            String sentencia = "call NuevoCorte(?,?,?,?,?,?)";
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, corteid.getIdentificacion());
            consulta.setInt(2, Integer.parseInt(corteid.getRepresentanteId().getIdentificacion()));
            consulta.setInt(3, corteid.getModeloId().getIdentificacion());
            consulta.setString(4, corteid.getFechaE());
            consulta.setString(5, corteid.getFechaEn());
            consulta.setString(6, corteid.getObservaciones());
            
            consulta.executeUpdate();
            consulta.close();
            
            mensaje = "Registro Exitoso...";
            
        } catch (SQLException e) {
            
            if(e.toString().contains("PRIMARY"))
            {
                mensaje = "Corte ya Registrado...";
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error: " + e);
                mensaje = "Registro Fallido...";
            }
            
        }
        
        return mensaje;
    }

    @Override
    public String Eliminar() {
        
        String mensaje = "", sentencia = "call EliminarCorte(?)";
        
        try {
            objCon.conectar();
            
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, corteid.getIdentificacion());
            ResultSet dato = consulta.executeQuery();
            
            while(dato.next())
            {
                mensaje = dato.getObject(1).toString();
            }
            
            consulta.close();
            
            //mensaje = "Eliminacion Exitosa...";
                     
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
        String sentencia = "select * from CortesAdmi";
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
    
    public DefaultTableModel tareasAsignadas()
    {
        DefaultTableModel plantilla = new DefaultTableModel();
        
        try {
            objCon.conectar();
            String sentencia = "call tareasAsignadas(?)";
            
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, corteid.getIdentificacion());
            
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
            JOptionPane.showMessageDialog(null,  "Aqui\n Error "+ e);
        }
        
        return plantilla;
            
    }
    
    public DefaultTableModel SeleccionarTallas(int corte1, int corte2) {
       
        DefaultTableModel plantilla = new DefaultTableModel();
        PreparedStatement consulta = null;
        String sentencia = "call tallasCortes(?,?)";
        try {
            
            objCon.conectar();
            consulta = objCon.getConexion().prepareStatement(sentencia);    
            consulta.setInt(1, corte1);
            consulta.setInt(2, corte2);
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
            
            datos.close();
            consulta.close();
             
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,  "Aqui\n Error "+ e);
        }
        return plantilla;
    }
    
    public DefaultTableModel SeleccionarTallasC(LinkedList<Corte> cortes) {
       
        DefaultTableModel plantilla = new DefaultTableModel();
        PreparedStatement consulta = null;
        String sentencia = "call tallasCortesC(?)";
        try {
            
            objCon.conectar();
            
            for(int l=0; l<cortes.size(); l++)
            {
                consulta = objCon.getConexion().prepareStatement(sentencia);    
                consulta.setInt(1, cortes.get(l).getIdentificacion());
                ResultSet datos = consulta.executeQuery();
                ResultSetMetaData campos = datos.getMetaData();

                if(l<1)
                {
                    for(int i=1; i<=campos.getColumnCount(); i++)
                    {
                        plantilla.addColumn(campos.getColumnName(i));
                    }
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
            }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,  "Error "+ e);
        }
        return plantilla;
    }
    
    public DefaultTableModel SeleccionarGeneral() {
       
        DefaultTableModel plantilla = new DefaultTableModel();
        PreparedStatement consulta = null;
        String sentencia = "call generalCorte(?)";
        try {
            
            objCon.conectar();
            consulta = objCon.getConexion().prepareStatement(sentencia);    
            consulta.setInt(1, corteid.getIdentificacion());
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
            
            datos.close();
            consulta.close();
             
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,  "Aqui\n Error "+ e);
        }
        return plantilla;
    }

    public DefaultTableModel SeleccionarColores(int corte1) {
       
        DefaultTableModel plantilla = new DefaultTableModel();
        PreparedStatement consulta = null;
        String sentencia = "call coloresCortes(?)";
        try {
            
            objCon.conectar();
            consulta = objCon.getConexion().prepareStatement(sentencia);    
            consulta.setInt(1, corte1);
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
            
            datos.close();
            consulta.close();
             
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,  "Aqui\n Error "+ e);
        }
        return plantilla;
    }
    
    public DefaultTableModel SeleccionarColoresC(LinkedList<Corte> cortes) {
       
        DefaultTableModel plantilla = new DefaultTableModel();
        PreparedStatement consulta = null;
        String sentencia = "call coloresCortes(?)";
        try {
            
            objCon.conectar();
            
            for(int l=0; l<cortes.size(); l++)
            {
                consulta = objCon.getConexion().prepareStatement(sentencia);    
                consulta.setInt(1, cortes.get(l).getIdentificacion());
                ResultSet datos = consulta.executeQuery();
                ResultSetMetaData campos = datos.getMetaData();

                if(l<1)
                {
                    for(int i=1; i<=campos.getColumnCount(); i++)
                    {
                        plantilla.addColumn(campos.getColumnName(i));
                    }
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
            }

        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,  "Aqui\n Error "+ e);
        }
        return plantilla;
    }
    
    public DefaultTableModel SeleccionarTareasC(LinkedList<Corte> cortes) {
       
        DefaultTableModel plantilla = new DefaultTableModel();
        PreparedStatement consulta = null;
        String sentencia = "call tareasCortesC(?)";
        try {
            
            objCon.conectar();
            
            for(int l=0; l<cortes.size(); l++)
            {
                consulta = objCon.getConexion().prepareStatement(sentencia);    
                consulta.setInt(1, cortes.get(l).getIdentificacion());
                ResultSet datos = consulta.executeQuery();
                ResultSetMetaData campos = datos.getMetaData();

                if(l<1)
                {
                    for(int i=1; i<=campos.getColumnCount(); i++)
                    {
                        plantilla.addColumn(campos.getColumnLabel(i));
                    }
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
            }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,  "Error "+ e);
        }
        return plantilla;
    }
    
    public DefaultTableModel SeleccionarTareas(int corte1, int corte2) {
       
        DefaultTableModel plantilla = new DefaultTableModel();
        PreparedStatement consulta = null;
        String sentencia = "call tareasCortes(?,?)";
        try {
            
            objCon.conectar();
            consulta = objCon.getConexion().prepareStatement(sentencia);    
            consulta.setInt(1, corte1);
            consulta.setInt(2, corte2);
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
            
            JOptionPane.showMessageDialog(null,  "Aqui\n Error "+ e);
        }
        return plantilla;
    }
    
    public DefaultTableModel SeleccionarInsumos(int corte1, int corte2) {
       
        DefaultTableModel plantilla = new DefaultTableModel();
        PreparedStatement consulta = null;
        String sentencia = "call insumosCortes(?,?)";
        try {
            
            objCon.conectar();
            consulta = objCon.getConexion().prepareStatement(sentencia);    
            consulta.setInt(1, corte1);
            consulta.setInt(2, corte2);
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
            
            datos.close();
            consulta.close();
             
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,  "Aqui\n Error "+ e);
        }
        return plantilla;
    }
    
    public DefaultTableModel SeleccionarInsumosF(String corte1, String corte2) {
       
        DefaultTableModel plantilla = new DefaultTableModel();
        PreparedStatement consulta = null;
        String sentencia = "call insumosCortesF(?,?)";
        try {
            
            objCon.conectar();
            consulta = objCon.getConexion().prepareStatement(sentencia);    
            consulta.setString(1, corte1);
            consulta.setString(2, corte2);
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
            
            datos.close();
            consulta.close();
             
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,  "Error "+ e);
        }
        return plantilla;
    }
    
    public DefaultTableModel SeleccionarGananciasF(String fecha1, String fecha2, int insumos) {
       
        DefaultTableModel plantilla = new DefaultTableModel();
        PreparedStatement consulta = null;
        String sentencia = "select GananciasF(?,?,?)";
        try {
            
            objCon.conectar();
            consulta = objCon.getConexion().prepareStatement(sentencia);    
            consulta.setString(1, fecha1);
            consulta.setString(2, fecha2);
            consulta.setInt(3, insumos);
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
            
            datos.close();
            consulta.close();
             
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,  "Aqui\n Error "+ e);
        }
        return plantilla;
    }
    
    public DefaultTableModel SeleccionarGanancias(int corte1, int corte2, int insumos) {
       
        DefaultTableModel plantilla = new DefaultTableModel();
        PreparedStatement consulta = null;
        String sentencia = "select Ganancias(?,?,?)";
        try {
            
            objCon.conectar();
            consulta = objCon.getConexion().prepareStatement(sentencia);    
            consulta.setInt(1, corte1);
            consulta.setInt(2, corte2);
            consulta.setInt(3, insumos);
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
            
            JOptionPane.showMessageDialog(null,  "Aqui\n Error "+ e);
        }
        return plantilla;
    }
    
    public int gananciasC(LinkedList<Corte> cortes)
    {
        PreparedStatement consulta = null;
        String sentencia = "select GananciasC(?)";
        int ganancias = 0;
        
        try {
            
            objCon.conectar();
            
            for(int l=0; l<cortes.size(); l++)
            {
                consulta = objCon.getConexion().prepareStatement(sentencia);    
                consulta.setInt(1, cortes.get(l).getIdentificacion());
                ResultSet datos = consulta.executeQuery();

                while(datos.next())
                {
                    ganancias += Integer.parseInt(String.valueOf(datos.getObject(1)));
                }

                datos.close();
                consulta.close();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return ganancias;
    }
    
    public DefaultTableModel SeleccionarGananciasC(LinkedList<Corte> cortes, int insumos) {
       
        DefaultTableModel plantilla = new DefaultTableModel();
        PreparedStatement consulta = null;
        String sentencia = "select GananciasC(?)", sentenciaC = "call cuentas(?,?,?,?)";
        int ganancias = 0, pagoT = 0, pagoN = 0;
        
        try {
            
            objCon.conectar();
            
            for(int l=0; l<cortes.size(); l++)
            {
                consulta = objCon.getConexion().prepareStatement(sentencia);    
                consulta.setInt(1, cortes.get(l).getIdentificacion());
                ResultSet datos = consulta.executeQuery();

                while(datos.next())
                {
                    ganancias += Integer.parseInt(String.valueOf(datos.getObject(1)));
                    //JOptionPane.showMessageDialog(null, ganancias);
                }

                datos.close();
                consulta.close();
            }
            
            
                
            pagoT = pagoTotal(cortes);
            pagoN = totalPagos(cortes);
            
            PreparedStatement consultaC = objCon.getConexion().prepareCall(sentenciaC);
            consultaC.setInt(1, pagoT);
            consultaC.setInt(2, pagoN);
            consultaC.setInt(3, insumos);
            consultaC.setInt(4, ganancias-insumos);
            ResultSet datos = consultaC.executeQuery();
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
            
            JOptionPane.showMessageDialog(null,  "Error "+ e);
        }
        return plantilla;
    }
    
    
    
    @Override
    public String SeleccionarU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int ObtenerCantidad(int idCorte)
    {
        int cantidad = 0;
        
        try {
            objCon.conectar();
            PreparedStatement consulta = objCon.getConexion().prepareStatement("Select obtenerCantidadPrendasT(?)");
            consulta.setInt(1, idCorte);
            ResultSet dato = consulta.executeQuery();
            
            while(dato.next())
            {
                cantidad = Integer.parseInt(String.valueOf(dato.getObject(1)));
            }
                    
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error: "  + e);
        }
        return cantidad;
    }

    public String agregarColor()
    {
        String mensaje = "";
        
        try {
            objCon.conectar();
            
            PreparedStatement consulta = objCon.getConexion().prepareCall("call agregarColorCorte(?,?,?)");
            consulta.setInt(1, corteid.getIdentificacion());
            consulta.setInt(2, corteid.getColorId().getIdentificacion());
            consulta.setInt(3, corteid.getColorId().getCantidad());
            consulta.executeUpdate();
            
            consulta.close();
            mensaje = "Registro Exitoso...";
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            mensaje = "Registro Fallido...";
        }
        
        return mensaje;
    }
    
    public String agregarTalla()
    {
        String mensaje = "";
        try {
            objCon.conectar();
            
            PreparedStatement consulta = objCon.getConexion().prepareCall("call agregarTallaCorte(?,?,?)");
            consulta.setInt(1, corteid.getIdentificacion());
            consulta.setString(2, corteid.getTalla().getIdentificacion());
            consulta.setInt(3, corteid.getTalla().getCantidad());
            consulta.executeUpdate();
            
            consulta.close();
            mensaje = "Registro Exitoso...";
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            mensaje = "Registro Exitoso...";
        }
        
        return mensaje;
    }
    
    public DefaultTableModel GeneralNomina(int idOpeario, int idCorte1, int idCorte2)
    {
        DefaultTableModel plantilla = new DefaultTableModel();
        
        try {
            objCon.conectar();
            String sentecia = "call tareasOperarioCortes(?,?,?)";
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentecia);
            consulta.setInt(1, idOpeario);
            consulta.setInt(2, idCorte1);
            consulta.setInt(3, idCorte2);
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
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return plantilla;
    }
    
    public DefaultTableModel GeneralNominaC(int idOpeario, LinkedList<Corte> cortes)
    {
        
        boolean bandera = true;
        DefaultTableModel plantilla = new DefaultTableModel();
        
        try {
            
            objCon.conectar();
            String sentecia = "call tareasOperario(?,?)";
            
            for(int l=0; l<cortes.size(); l++)
            {
                PreparedStatement consulta = objCon.getConexion().prepareCall(sentecia);
                consulta.setInt(1, cortes.get(l).getIdentificacion());
                consulta.setInt(2, idOpeario);
                ResultSet datos = consulta.executeQuery();
                ResultSetMetaData campos = datos.getMetaData();

                if(l<1)
                {
                    for(int i=1; i<=campos.getColumnCount(); i++)
                    {
                        plantilla.addColumn(campos.getColumnLabel(i));
                    }
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
            }
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return plantilla;
    }
    
    public String pagoNeto(int idOpeario, int idCorte1, int idCorte2)
    {
        String mensaje = "";
        
        try {
            objCon.conectar();
            String sentencia = "select pagoNeto(?,?,?)";
            PreparedStatement consulta = objCon.getConexion().prepareStatement(sentencia);
            consulta.setInt(1, idOpeario);
            consulta.setInt(2, idCorte1);
            consulta.setInt(3, idCorte2);
            ResultSet datos = consulta.executeQuery();
            
            while(datos.next())
            {
                mensaje = datos.getObject(1).toString();
            }
            datos.close();
            consulta.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return mensaje;
    }
    
    public String pagoNeto(int idOpeario, LinkedList<Corte> cortes)
    {
        int mensaje = 0;
        
        try {
            objCon.conectar();
            String sentencia = "select pagoNetoC(?,?)";
            
            for(int i=0; i<cortes.size(); i++)
            {
                PreparedStatement consulta = objCon.getConexion().prepareStatement(sentencia);
                consulta.setInt(1, idOpeario);
                consulta.setInt(2, cortes.get(i).getIdentificacion());
                ResultSet datos = consulta.executeQuery();

                while(datos.next())
                {
                    mensaje += datos.getInt(1);
                }
                datos.close();
                consulta.close();
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return String.valueOf(mensaje);
    }
    
    public String EntregarCorte()
    {
        String mensaje = "";
        String setencia = "call entregarCorte(?,?,?)";
        
        try {
            
            objCon.conectar();
            
            PreparedStatement consulta = objCon.getConexion().prepareCall(setencia);
            consulta.setInt(1, corteid.getIdentificacion());
            consulta.setInt(2, corteid.getCantidad());
            consulta.setString(3, corteid.getFechaEntrega().toStringDate());
            
            ResultSet dato = consulta.executeQuery();
            
            while (dato.next())
            {                
                mensaje = String.valueOf(dato.getObject(1));
            }
            
            consulta.close();
            
        } catch (SQLException e) {
            if(!(e.toString().contains("Result")))
            {
                JOptionPane.showMessageDialog(null, "Error: " + e);
                mensaje = "Registro Fallido...";
            }
        }
        return mensaje;
    }
    
    public String EntregarCortePendiente()
    {
        String mensaje = "";
        
        
        try {
            
            objCon.conectar();
            String setencia = "call entregarCortePendiente(?,?,?)";
            PreparedStatement consulta = objCon.getConexion().prepareCall(setencia);
            consulta.setInt(1, corteid.getIdentificacion());
            consulta.setInt(2, corteid.getCantidad());
            consulta.setString(3, corteid.getFechaEntrega().toStringDate());
            
            ResultSet datos = consulta.executeQuery();
            
            while(datos.next()){
                mensaje = ""+datos.getObject(1);
            }
            
            consulta.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            mensaje = "Registro Fallido...";
        }
        return mensaje;
    }
    
    public DefaultTableModel cortePendiente()
    {
        DefaultTableModel plantilla = new DefaultTableModel();
        
        String sentencia = "select Corte_Cantidad_entregada as 'Cantidad Entregada', Corte_Fecha_Entrega as 'Fecha de Entrega', estado_Descripcion as 'Estado' from  corte_Pendiente, Estado where corte_id = ? and Corte_Estado = estado_Id;";
        
        try {
            objCon.conectar();
            PreparedStatement consulta = null;
            consulta = objCon.getConexion().prepareStatement(sentencia);
            consulta.setInt(1, corteid.getIdentificacion());
            
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
            
            consulta.close();
             
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return plantilla;
    }
    
    public DefaultTableModel cortePendienteGeneral()
    {
        DefaultTableModel plantilla = new DefaultTableModel();
        
        String sentencia = "call cortePendienteGeneral(?)";
        
        try {
            objCon.conectar();
            
            PreparedStatement consulta = null;
            consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, corteid.getIdentificacion());
            
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
            
            consulta.close();
             
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return plantilla;
    }
    
    public String pagarCorte()
    {
        String mensaje = "";
        
        try {
            
            objCon.conectar();
            
            String sentencia = "call pagarCorte(?,?)";
            PreparedStatement consulta = null;
            consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, corteid.getIdentificacion());
            consulta.setString(2, corteid.getFechaEntrega().toStringDate());
            ResultSet datos = consulta.executeQuery();
            
            while(datos.next())
            {
                mensaje = "" + datos.getObject(1);
            }
            
            consulta.close();
             
            
        } catch (SQLException e) {
            mensaje = "Pago Fallido...";
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return mensaje;
    }
    
    public String EntregaryPagar() throws SQLException
    {
        String mensaje = "", setenciaE = "call entregarCorte(?,?,?)", sentenciaP = "call pagarCorte(?,?)";
        
        try {
            
            objCon.conectar();
            objCon.getConexion().setAutoCommit(false);
            PreparedStatement consulta = objCon.getConexion().prepareCall(setenciaE);
            consulta.setInt(1, corteid.getIdentificacion());
            consulta.setInt(2, corteid.getCantidad());
            consulta.setString(3, corteid.getFechaEntrega().toStringDate());
            
            ResultSet dato = consulta.executeQuery();
            
            while (dato.next())
            {                
                mensaje = String.valueOf(dato.getObject(1));
            }
            
            consulta.close();
            
            PreparedStatement consultaP = null;
            consultaP = objCon.getConexion().prepareCall(sentenciaP);
            consultaP.setInt(1, corteid.getIdentificacion());
            consultaP.setString(2, corteid.getFechaEntrega().toStringDate());
          
            consultaP.executeUpdate();
            
            consultaP.close();
            objCon.getConexion().commit();
             
            
        } catch (SQLException e) {
            
            objCon.getConexion().rollback();
            JOptionPane.showMessageDialog(null, "Error: " + e);
            mensaje = "Registro Fallido";
        }
        
        return mensaje;
    }
    
    public String EntregaryPagarPendiente() throws SQLException
    {
        String mensaje = "", setenciaE = "call entregarCortePendiente(?,?,?)", sentenciaP = "call pagarCorte(?,?)";
        
        try {
            
            objCon.conectar();
            objCon.getConexion().setAutoCommit(false);
            PreparedStatement consulta = objCon.getConexion().prepareCall(setenciaE);
            consulta.setInt(1, corteid.getIdentificacion());
            consulta.setInt(2, corteid.getCantidad());
            consulta.setString(3, corteid.getFechaEntrega().toStringDate());
            
            ResultSet datos = consulta.executeQuery();
            
            while(datos.next())
            {
                mensaje = ""+datos.getObject(1);
            }
            
            consulta.close();
            
            if(!(mensaje.equalsIgnoreCase("Cantidad Invalida")))
            {
                PreparedStatement consultaP = null;
                consultaP = objCon.getConexion().prepareCall(sentenciaP);
                consultaP.setInt(1, corteid.getIdentificacion());
                consultaP.setString(2, corteid.getFechaEntrega().toStringDate());

                consultaP.executeUpdate();

                consultaP.close();
                objCon.getConexion().commit();
                 
            }
            
            //mensaje = "Registro Exitoso...";
            
        } catch (SQLException e) {
            
            objCon.getConexion().rollback();
            JOptionPane.showMessageDialog(null, "Error: " + e);
            mensaje = "Registro Fallido";
        }
        
        return mensaje;
    }
    
    public int cantidadPendientes()
    {
        String sentencia = "select cantidadPendientes(?)";
        int cantidad = 0;
        
        try {
            objCon.conectar();
            PreparedStatement consulta = objCon.getConexion().prepareStatement(sentencia);
            consulta.setInt(1, corteid.getIdentificacion());
            
            ResultSet dato = consulta.executeQuery();
            
            while(dato.next())
            {
                cantidad = Integer.parseInt(String.valueOf(dato.getObject(1)));
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return cantidad;
    }
    
    public int obtenerCantidadTotal()
    {
        String sentencia = "select obtenerCantidadPrendasT(?)";
        int cantidad = 0;
        
        try {
            
            objCon.conectar();
            
            PreparedStatement consulta = objCon.getConexion().prepareStatement(sentencia);
            consulta.setInt(1, corteid.getIdentificacion());
            
            ResultSet dato = consulta.executeQuery();
            
            while(dato.next())
            {
                cantidad = Integer.parseInt(dato.getObject(1).toString());
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return  cantidad;
    }
    
    public String OperariosNomina(int corteA, int corteB)
    {   
        String mensaje = "", sentencia = "Call operariosNomina(?,?)";
        
        try {
            objCon.conectar();
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, corteA);
            consulta.setInt(2, corteB);
            
            ResultSet datos = consulta.executeQuery();
            ResultSetMetaData campos = datos.getMetaData();
            
            while(datos.next())
            {
                for(int i=0; i<campos.getColumnCount(); i++)
                {
                    mensaje += datos.getObject(i+1) + " ";
                }
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return  mensaje;
    }
    
    public String OperariosNominaC(int corte)
    {   
        String mensaje = "", sentencia = "Call operariosNominaC(?)";
        
        try {
            objCon.conectar();
            PreparedStatement consulta = objCon.getConexion().prepareCall(sentencia);
            consulta.setInt(1, corte);
            
            ResultSet datos = consulta.executeQuery();
            ResultSetMetaData campos = datos.getMetaData();
            
            while(datos.next())
            {
                for(int i=0; i<campos.getColumnCount(); i++)
                {
                    mensaje += datos.getObject(i+1) + " ";
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        return  mensaje;
    }
    
    public String validarCortesEntregados(int corte)
    {
        String mensaje = "", sentencia = "select validarCorteEntregado(?)";
        
        try {
            objCon.conectar();
            PreparedStatement consulta = objCon.getConexion().prepareStatement(sentencia);
            consulta.setInt(1, corte);
            
            ResultSet dato = consulta.executeQuery();
            
            
            while(dato.next())
            {
                mensaje = dato.getObject(1).toString();
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
        return mensaje;
    }
    
    public String idCorteNuevo()
    {
        String mensaje = "", sentencia = "select (Corte_Id + 1) from Corte order by Corte_Id desc limit 1";
        
        try {
            
            objCon.conectar();
            
            Statement consulta = objCon.getConexion().createStatement();
            ResultSet dato = consulta.executeQuery(sentencia);
            
            while(dato.next())
            {
                mensaje = String.valueOf(dato.getInt(1));
            }
                    
        } catch (SQLException e) {
            
            mensaje = "Error...";
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return mensaje;
    }
    
    public int pagoTotal(LinkedList<Corte> cortes)
    {
        String sentencia = "select ObtenerPagoCorteTC(?)";
        int pago = 0;
        
        try {
            objCon.conectar();
            
            
            for(int i=0; i<cortes.size(); i++)
            {
                PreparedStatement consulta = objCon.getConexion().prepareStatement(sentencia);
                consulta.setInt(1, cortes.get(i).getIdentificacion());
                ResultSet dato = consulta.executeQuery();

                while(dato.next())
                {
                    pago +=  Integer.parseInt(String.valueOf(dato.getObject(1)));
                }
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: + " + e);
        }
        
        return pago;
    }

    public int totalPagos(LinkedList<Corte> cortes)
    {
        String sentencia = "select ObtenerTotalPagosC(?)";
        int pago = 0;
        
        try {
            objCon.conectar();
            
            
            for(int i=0; i<cortes.size(); i++)
            {
                PreparedStatement consulta = objCon.getConexion().prepareStatement(sentencia);
                consulta.setInt(1, cortes.get(i).getIdentificacion());
                ResultSet dato = consulta.executeQuery();

                while(dato.next())
                {
                    pago +=  Integer.parseInt(String.valueOf(dato.getObject(1)));
                }
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: + " + e);
        }
        
        return pago;
    }
    
    public LinkedList<Corte> cortes()
    {
        String sentecia = "select * from cortesporasignar order by ID";
        LinkedList<Corte> cortes = new LinkedList<>();
        
        try {
            objCon.conectar();
            
            Statement consulta = objCon.getConexion().createStatement();
            ResultSet datos = consulta.executeQuery(sentecia);
            
            while(datos.next())
            {
                Corte corte = new Corte();
                Modelo modelo = new Modelo();
                
                Fecha fecha = new Fecha();
                
                corte.setIdentificacion(datos.getInt("ID"));
                modelo.setNombre(datos.getString("Modelo"));
                corte.setModeloId(modelo);
                String fechaS[] = datos.getString("Fecha").split("-");
                fecha.setAño(Integer.parseInt(fechaS[0]));
                fecha.setMes(Integer.parseInt(fechaS[1]));
                fecha.setDia(Integer.parseInt(fechaS[2]));
                corte.setFechaEnvio(fecha);
                
                cortes.add(corte);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return cortes;
    }
    
    public void corteModelo()
    {
        String sentencia = "select modelo_Id from modelo m join  Corte c on c.corte_modelo = m.modelo_Id  where c.Corte_Id = ?";
        
        try {
            
            objCon.conectar();
            PreparedStatement consulta = objCon.getConexion().prepareStatement(sentencia);
            consulta.setInt(1, corteid.getIdentificacion());
            
            ResultSet datos = consulta.executeQuery();
            
            while(datos.next())
            {
                modelo.setIdentificacion(Integer.parseInt(String.valueOf(datos.getObject(1))));
            }

            datos.close();
            consulta.close();

            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar modelo de Corte: " + e);
        }
    }
    
    public ConexionMysql getObjCon() {
        return objCon;
    }

    public void setObjCon(ConexionMysql objCon) {
        this.objCon = objCon;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
    
    
}