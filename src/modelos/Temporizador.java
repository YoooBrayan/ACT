package modelos;

import javax.swing.JInternalFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author YO
 */
public class Temporizador implements Runnable{
    
    private JLabel label;
    private String mensaje;
    private JInternalFrame ventana;
    private JFrame ventanaPrincipal;
    int tiempo;
    boolean bandera;
    Thread hilo;

    public Temporizador() {
        this.tiempo = 0;
        this.bandera = true;
        this.mensaje = "";
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public JInternalFrame getVentana() {
        return ventana;
    }

    public void setVentana(JInternalFrame ventana) {
        this.ventana = ventana;
    }

    public JFrame getVentanaPrincipal() {
        return ventanaPrincipal;
    }

    public void setVentanaPrincipal(JFrame ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }
    
    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }
           
    public void tempo(JInternalFrame frame, JLabel label, String mensaje)
    {
        label.setText(mensaje);
        tiempo++;
        if(tiempo>3.5)
        {
            label.setText("");
            setBandera(false);
            tiempo=0;
        }
    }
    
    @Override
    public void run() {
        
        while(bandera)
        {
            tempo(ventana, label, mensaje);
            try {
                hilo.sleep(1000);
            } catch (InterruptedException e) {

                JOptionPane.showMessageDialog(null, "Error Run: " + e);
            }
        }
        setBandera(true);
    }
    
}
