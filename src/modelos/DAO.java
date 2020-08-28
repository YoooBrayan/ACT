package modelos;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YO
 */
public interface DAO {
    
    public String insertar() throws SQLException;
    
    public String Eliminar();
    
    public String actualizar();
    
    public DefaultTableModel SeleccionarV();
    
    public String SeleccionarU();
    
}
