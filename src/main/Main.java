package main;


import java.sql.SQLException;
import controlador.Controlador;
import javax.swing.JOptionPane;

/**
 *
 * @author YO
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        
        Controlador controlador = new Controlador();
        controlador.iniciar();
        
    }
    
}
