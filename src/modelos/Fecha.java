package modelos;

import java.util.Calendar;
import java.util.Observable;
import vistas.frmNuevoCorte;

/**
 *
 * @author YO
 */
public class Fecha extends Observable{
    
    private int año, mes, dia, hora, minuto, segundo;
    private Calendar calendario;
    private frmNuevoCorte VNC;

    public Fecha(int año, int mes, int dia, int hora, int minuto, int segundo, Calendar calendario) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.calendario = calendario;
    }
    
    public Fecha()
    {
        Calendar actual = Calendar.getInstance();
        this.año = actual.get(Calendar.YEAR);
        this.mes = actual.get(Calendar.MONTH) + 1;
        this.dia = actual.get(Calendar.DAY_OF_MONTH);
        this.hora = actual.get(Calendar.HOUR_OF_DAY);
        this.minuto = actual.get(Calendar.MINUTE);
        this.segundo = actual.get(Calendar.SECOND);
        this.VNC = new frmNuevoCorte();
    }

    public int getAño() {
        return año;
    }

    
    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
        setChanged();
        notifyObservers();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public Calendar getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendar calendario) {
        this.calendario = calendario;
    }

    public frmNuevoCorte getVNC() {
        return VNC;
    }

    public void setVNC(frmNuevoCorte VNC) {
        this.VNC = VNC;
    }
    
    
    
    public void reloj()
    {
        segundo++;
        if(segundo>59)
        {
            segundo = 0;
            minuto++;
        }
        if(minuto>59)
        {
            minuto = 0;
            hora++;
        }
        if(hora>23)
        {
            hora= 0;
            dia++;
        }
        if(dia>29 || dia>30 || dia>31 || dia>28)
        {
            dia=0;
            mes++;
        }
        if(mes>12)
        {
            mes = 1;
            año++;
        }
        /*if(segundo<10)
        {
            segundo = 0 + segundo;
        }*/
    }

    @Override
    public String toString() {
        
        return año + "-" + (mes) + "-" + dia + " " + hora + ":" + minuto + ":" + segundo;
    }
    
    public String toStringDate() {
        
        return año + "-" + (mes) + "-" + dia;
    }
    
    /*public void FechaEntrega()
    {
        VNC.getCmbDia().removeAllItems();
        if(mes == 2)
        {
            for(int i=1; i<=28; i++)
            {
                VNC.getCmbDia().addItem(String.valueOf(i));
            }
        }
        else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
        {
                for(int i=1; i<=31; i++)
                {
                    VNC.getCmbDia().addItem(String.valueOf(i));
                }
        }
        else if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
        {
            for (int i = 1; i <= 30; i++) 
            {
                VNC.getCmbDia().addItem(String.valueOf(i));
            }

        }
    }
    
    public void FechaEnvio()
    {
        VNC.getCmbDiaFEnvio().removeAllItems();
        if(mes == 2)
        {
            for(int i=1; i<=28; i++)
            {
                VNC.getCmbDiaFEnvio().addItem(String.valueOf(i));
            }
        }
        else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
        {
                for(int i=1; i<=31; i++)
                {
                    VNC.getCmbDiaFEnvio().addItem(String.valueOf(i));
                }
        }
        else if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
        {
            for (int i = 1; i <= 30; i++) 
            {
                VNC.getCmbDiaFEnvio().addItem(String.valueOf(i));
            }

        }
    }*/
        
}
