/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


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
public class AdministradorDAO extends PersonaDAO{

        
    public DefaultTableModel mostrarCortes(String Tipo) {
        
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
    
}

