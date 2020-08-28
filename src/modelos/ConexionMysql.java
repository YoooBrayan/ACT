package modelos;

import java.sql.*;

/**
 *
 * @author YO
 */
public class ConexionMysql {
    
    private Connection conexion;
    private String mensaje, BD, usuario;
    private String contraseña;

    public ConexionMysql(Connection conexion, String mensaje, String BD, String usuario, String contraseña) {
        this.conexion = conexion;
        this.mensaje = mensaje;
        this.BD = BD;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    public ConexionMysql() {
        this.conexion = null;
        this.mensaje = "";
        this.BD = "ACT";
        this.usuario = "root";
        this.contraseña = "";
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getBD() {
        return BD;
    }

    public void setBD(String BD) {
        this.BD = BD;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    public boolean conectar() throws SQLException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            String ruta = "jdbc:mysql://localhost/"+ BD;
            conexion = DriverManager.getConnection(ruta, usuario, contraseña);
            mensaje = "Conexion Exitosa...";
            return true;
            
        }catch(ClassNotFoundException e)
        {
            mensaje = "Driver No Encontrado";
            return false;
        }catch(SQLException e)
        {
            mensaje = "Error al conectar Base de Datos:  aqui" + e; 
            return false;
        }
        
    }
    
}

