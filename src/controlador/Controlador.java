package controlador;

import modelos.Color;
import modelos.ProveedorDAO;
import modelos.ModeloDAO;
import modelos.ConexionMysql;
import modelos.Representante;
import modelos.Tarea;
import modelos.TareaDAO;
import modelos.Modelo;
import modelos.ArchPdf;
import modelos.Talla;
import modelos.Fecha;
import modelos.Temporizador;
import modelos.Proveedor;
import modelos.Operacion;
import modelos.Especializacion;
import modelos.Corte;
import modelos.PersonaDAO;
import modelos.OperacionDAO;
import modelos.InsumoDAO;
import modelos.TallaDAO;
import modelos.EspecializacionDAO;
import com.itextpdf.text.BadElementException;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import modelos.AdministradorDAO;
import modelos.ColorDAO;
import modelos.CorteDAO;
import modelos.Operario;
import modelos.OperarioDAO;
import modelos.RepresentanteDAO;
import vistas.frmAdministrador;
import vistas.frmCortes;
import vistas.frmEntregarCorte;
import vistas.frmEntregarCortePendiente;
import vistas.frmModelo;
import vistas.frmNuevoCorte;
import vistas.frmPrincipal;
import vistas.frmRegOperario;
import vistas.frmRegProveedor;
import vistas.frmTareasAsignadas;
import vistas.frmAsignarTareas;
import vistas.frmNomina;
import vistas.frmVerProveedor;
import vistas.frmCorte;
import vistas.frmNominaCompleta;
import vistas.frmPedidos;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import vistas.frmProveedor;

/**
 *
 * @author YO
 */
public class Controlador implements ActionListener, Runnable, MouseListener, KeyListener{
    
    frmPrincipal VPrincipal;
    frmAdministrador VAdmi;
    frmRegOperario VRegOperario;
    frmRegProveedor VRegProveedor;
    frmCorte VCorte;
    frmNuevoCorte VNuevoCorte;
    frmModelo VModelo;
    frmAsignarTareas VTareas;
    frmTareasAsignadas VAsignadas;
    frmCortes VCortes;
    frmNomina VNomina;
    frmNominaCompleta VNominaC;
    frmEntregarCorte VEntregarCorte;
    frmEntregarCortePendiente VEntregarCortePendiente;
    frmVerProveedor VVerProveedor;
    frmProveedor VProveedor;
    frmPedidos Vpedidos;
    OperarioDAO operarioDAO;
    AdministradorDAO admiDAO;
    CorteDAO corteDAO;
    RepresentanteDAO representanteDAO;    
    
    ColorDAO colorDAO;
    TallaDAO tallaDAO;
    InsumoDAO insumoDAO;
    ModeloDAO modeloDAO;
    ProveedorDAO proveedorDAO;
    OperacionDAO operacionDAO;
    TareaDAO tareaDAO;
    EspecializacionDAO especializacionDAO;
    Corte Corteid, corteN;
    int cont = 0;        
    int bandera = 0; 
    int f = 0;
    Fecha fechaEntrega;
    ArchPdf pdf;
    Temporizador tempo;
    Fecha fecha;
    Thread hilo;
    ConexionMysql conector;
    PersonaDAO personaDAO;
    DefaultListModel lista, lista1;
    int pedidos = 0, NumeroPedidos = 0;
    LinkedList<Corte> cortes = new LinkedList<>();
    
    
    public Controlador() throws SQLException {
        this.VPrincipal = new frmPrincipal();
        this.VAdmi = new frmAdministrador();
        this.Corteid = new Corte();
        this.corteN = new Corte();
        this.VRegOperario = new frmRegOperario();
        this.VRegProveedor = new frmRegProveedor();
        this.VCorte = new frmCorte();
        this.fechaEntrega = new Fecha();
        this.VNuevoCorte = new frmNuevoCorte(fechaEntrega);
        this.VModelo = new frmModelo();
        this.VTareas = new frmAsignarTareas();
        this.VAsignadas = new frmTareasAsignadas();
        this.VCortes = new frmCortes();
        this.VNomina = new frmNomina();
        this.VNominaC = new frmNominaCompleta();
        this.VEntregarCorte = new frmEntregarCorte();
        this.VEntregarCortePendiente = new frmEntregarCortePendiente();
        this.VVerProveedor = new frmVerProveedor();
        this.VProveedor = new frmProveedor();
        this.Vpedidos = new frmPedidos();
        VAdmi.getBtnEntregar().addActionListener(this);
        VAdmi.getBtnEntregarP().addActionListener(this);
        VAdmi.getBtnPagarCorte().addActionListener(this);
        VAdmi.getTblCorteXPagar().addMouseListener(this);
        VAdmi.getTxtEliminarCorte().addActionListener(this);
        VAdmi.getTblCorteXEntregar().addMouseListener(this);
        VPrincipal.getjMenu6().addActionListener(this);
        VPrincipal.getOpmRegOperario().addActionListener(this);
        VPrincipal.getOpmRegProveedor().addActionListener(this);
        VPrincipal.getOpmAsignarTareas().addActionListener(this);
        VPrincipal.getOpmConsultar().addActionListener(this);
        VPrincipal.getOpmProveedor().addActionListener(this);
        VPrincipal.getOpmNominaC().addActionListener(this);
        VPrincipal.getOpmNominaU().addActionListener(this);
        VPrincipal.getOpmNuevo().addActionListener(this);
        VPrincipal.getOpmSalir().addActionListener(this);
        VTareas.getBtnAsignar().addActionListener(this);
        VTareas.getBtnBuscarCorte().addActionListener(this);
        VTareas.getBtnSalir().addActionListener(this);
        VTareas.getTxtFiltro().addKeyListener(this);
        VCorte.getBtnConsColores().addActionListener(this);
        VCorte.getBtnConsGanancias().addActionListener(this);
        VCorte.getBtnConsTallas().addActionListener(this);
        VCorte.getBtnConsTareas().addActionListener(this);
        VCorte.getBtnRegresar().addActionListener(this);
        VCorte.getBtnEliminarColor().addActionListener(this);
        VCorte.getBtnEliminarTalla().addActionListener(this);
        VCorte.getTblCortes().addMouseListener(this);
        VCorte.getListaCortes().addMouseListener(this);
        VModelo.getCmbOperacionExi().addActionListener(this);
        VModelo.getCmbOperacionExiME().addActionListener(this);
        VModelo.getBtnOperaciones().addActionListener(this);
        VModelo.getBtnAgrModelo().addActionListener(this);
        VModelo.getBtnActualizarGeneral().addActionListener(this);
        VModelo.getBtnActualizarOper().addActionListener(this);
        VModelo.getBtnAgrOperacion().addActionListener(this);
        VModelo.getBtnAgrOperacionME().addActionListener(this);
        VModelo.getBtnNuevaOperacion().addActionListener(this);
        VModelo.getBtnNuevaOperacionME().addActionListener(this);
        VModelo.getBtnAgrOperacionE().addActionListener(this);
        VModelo.getPnlNuevaOper().setVisible(false);
        VModelo.getTxtIdAct().addActionListener(this);
        VModelo.getBtnAgrOperacionNueva().addActionListener(this);
        VModelo.getTxtIdOperAct().addActionListener(this);
        VModelo.getPnlNuevaOperacionAct().addAncestorListener(null);
        VModelo.getBtnModeloNListo().addActionListener(this);
        VModelo.getPnlNuevaOperAct().setVisible(false);
        VModelo.getBtnRegAdmi().addActionListener(this);
        VModelo.getTxtNuevaOperPrecioME().addActionListener(this);
        VModelo.getBtnEliminarOperacion().addActionListener(this);
        VModelo.getTxtNuevaOperPrecio().addActionListener(this);
        VModelo.getTxtConsultarOper().addActionListener(this);
        VModelo.getTxtFiltrarOperacionA().addKeyListener(this);
        VModelo.getTxtFiltrarOperacionN().addKeyListener(this);
        VModelo.getTblModelos().addMouseListener(this);
        VModelo.getTblModelos().addKeyListener(this);
        Vpedidos.getBtnSiguiente().addActionListener(this);
        Vpedidos.getTxtNumeroCortes().addActionListener(this);
        Vpedidos.getBtnCancelar().addActionListener(this);
        VNuevoCorte.getBtnAgrColor().addActionListener(this);
        VNuevoCorte.getBtnAgrTalla().addActionListener(this);
        VNuevoCorte.getBtnRegistrarCorte().addActionListener(this);
        VNuevoCorte.getCmbAgrColor().addActionListener(this);
        VNuevoCorte.getCmbAgrTalla().addActionListener(this);
        VNuevoCorte.getCmbModelos().addActionListener(this);
        VNuevoCorte.getCmbFechaEntrega().addActionListener(this);
        VNuevoCorte.getCmbFechaEnvio().addActionListener(this);
        VNuevoCorte.getBtnSalir().addActionListener(this);
        VNuevoCorte.getBtnGuardarSalir().addActionListener(this);
        VNuevoCorte.getBtnGuardar().addActionListener(this);
        VNuevoCorte.getBtnEliminarTalla().addActionListener(this);
        VNuevoCorte.getBtnEliminarColor().addActionListener(this);
        VVerProveedor.getBtnModelos().addActionListener(this);
        VVerProveedor.getTxtIdRepresentante().addActionListener(this);
        VVerProveedor.getBtnRegresar().addActionListener(this);
        VRegOperario.getBtnAgrEspecializacion().addActionListener(this);
        VRegOperario.getBtnRegOperario().addActionListener(this);
        VRegOperario.getBtnRegresarOper().addActionListener(this);
        VRegOperario.getCmbEspecializaciones().addActionListener(this);
        VRegProveedor.getBtnActualizarGeneral().addActionListener(this);
        VRegProveedor.getBtnActualizarOper().addActionListener(this);
        VRegProveedor.getBtnAgrModelo().addActionListener(this);
        VRegProveedor.getBtnAgrOperacion().addActionListener(this);
        VRegProveedor.getBtnNuevaOperacion().addActionListener(this);
        VRegProveedor.getBtnRegProveedor().addActionListener(this);
        VRegProveedor.getBtnAgrRepresentante().addActionListener(this);
        VRegProveedor.getBtnRegresarProv().addActionListener(this);
        VRegProveedor.getCmbOperacionExi().addActionListener(this);
        VRegProveedor.getTxtIdModAct().addActionListener(this);
        VRegProveedor.getTxtIdOperAct().addActionListener(this);
        VNomina.getBtnBuscar().addActionListener(this);
        VNomina.getBtnSalir().addActionListener(this);
        VNominaC.getBtnGenerar().addActionListener(this);
        VNominaC.getBtnSalir().addActionListener(this);
        VNominaC.getTblCortes().addMouseListener(this);
        VNominaC.getListaCortes().addMouseListener(this);
        VCortes.getBtlSalir().addActionListener(this);
        VAsignadas.getBtnFiltrar().addActionListener(this);
        VAsignadas.getBtnEliminarTarea().addActionListener(this);
        VEntregarCorte.getBtnEntregar().addActionListener(this);
        VEntregarCorte.getBtnSalir().addActionListener(this);
        VEntregarCorte.getBtnEntregarPagar().addActionListener(this);
        VEntregarCortePendiente.getBtnEntregar().addActionListener(this);
        VEntregarCortePendiente.getBtnSalir().addActionListener(this);
        VEntregarCortePendiente.getTxtIdCorte().addActionListener(this);
        VEntregarCortePendiente.getBtnEntregarPagar().addActionListener(this);
        VEntregarCortePendiente.getBtnPagar().addActionListener(this);
        VProveedor.getBtnSiguiente().addActionListener(this);
        VProveedor.getBtnCancelar().addActionListener(this);
        VPrincipal.getJdpEscritorio().add(VAdmi);
        VPrincipal.getJdpEscritorio().add(VRegOperario);
        VPrincipal.getJdpEscritorio().add(VRegProveedor);
        VPrincipal.getJdpEscritorio().add(VCorte);
        VPrincipal.getJdpEscritorio().add(VNuevoCorte);
        VPrincipal.getJdpEscritorio().add(VModelo);
        VPrincipal.getJdpEscritorio().add(VTareas);
        VPrincipal.getJdpEscritorio().add(VAsignadas);
        VPrincipal.getJdpEscritorio().add(VNomina);
        VPrincipal.getJdpEscritorio().add(VNominaC);
        VPrincipal.getJdpEscritorio().add(VCortes);
        VPrincipal.getJdpEscritorio().add(VEntregarCorte);
        VPrincipal.getJdpEscritorio().add(VEntregarCortePendiente);
        VPrincipal.getJdpEscritorio().add(VVerProveedor);
        VPrincipal.getJdpEscritorio().add(Vpedidos);
        VPrincipal.getJdpEscritorio().add(VProveedor);
        VAsignadas.setLocation(900, 0);
        operarioDAO = new OperarioDAO();
        admiDAO = new AdministradorDAO();
        corteDAO = new CorteDAO();
        modeloDAO = new ModeloDAO();
        representanteDAO = new RepresentanteDAO();
        colorDAO = new ColorDAO();
        proveedorDAO = new ProveedorDAO();
        operacionDAO = new OperacionDAO();
        insumoDAO = new InsumoDAO();
        tallaDAO = new TallaDAO();
        tareaDAO = new TareaDAO();
        especializacionDAO = new EspecializacionDAO();
        VCortes.setLocation(550, 0);
        VEntregarCorte.setLocation(620, 0);
        VEntregarCortePendiente.setLocation(620, 0);
        fechaEntrega.addObserver(VNuevoCorte);
        pdf = new ArchPdf();
        tempo = new Temporizador();
        fecha = new Fecha();
        hilo = new Thread(this);
        hilo.start();
        conector = new ConexionMysql();
        personaDAO = new PersonaDAO();
        VCorte.getBtnEliminarColor().setVisible(false);
        VCorte.getBtnEliminarTalla().setVisible(false);
        VCortes.getBtnMostrar().addActionListener(this);
        lista = new DefaultListModel();
        lista1 = new DefaultListModel();
        VTareas.getCmbTareasD().setEnabled(false);
        VTareas.getTxtFiltro().setEnabled(false);
        VTareas.getSpnCantidad().setEnabled(false);
        VTareas.getBtnAsignar().setEnabled(false);
        
    }
    
    public void iniciar() throws SQLException
    {
        while(!(conector.conectar()))
        {
            JOptionPane.showMessageDialog(null, conector.getMensaje());
            conector.setContraseña(JOptionPane.showInputDialog("Ingrese Contraseña: "));
        }
        
        personaDAO.setObjCon(conector);
        admiDAO.setObjCon(conector);
        representanteDAO.setObjCon(conector);
        colorDAO.setObjCon(conector);
        corteDAO.setObjCon(conector);
        especializacionDAO.setObjCon(conector);
        modeloDAO.setObjCon(conector);
        operacionDAO.setObjCon(conector);
        operarioDAO.setObjCon(conector);
        proveedorDAO.setObjCon(conector);
        tallaDAO.setObjCon(conector);
        tareaDAO.setObjCon(conector);
        
        VAdmi.getLblAdmi().setText("JESSICA");
        
        VAdmi.getTblCorteXEntregar().setModel(admiDAO.mostrarCortes("CortesPorEntregar"));
        VAdmi.getTblCorteXPagar().setModel(admiDAO.mostrarCortes("CortesEntregadosSinPagar"));
        VAdmi.getTblCortesEntregados().setModel(admiDAO.mostrarCortes("CortesEntregados"));
        VAdmi.getTblCortesPendientes().setModel(admiDAO.mostrarCortes("CortesPendientes"));
        
        VPrincipal.setVisible(true);
        VAdmi.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        
        if(VAdmi.getBtnPagarCorte() == ae.getSource())
        {
            try {
                Corteid.setIdentificacion(Integer.parseInt(VAdmi.getTxtPagar().getText()));
                corteDAO.setCorteid(Corteid);
                
                tempo.setLabel(VAdmi.getLblPagar());
                tempo.setMensaje(corteDAO.pagarCorte());
                Thread lblpagar = new Thread(tempo);
                lblpagar.start();
                
                VAdmi.getTblCorteXPagar().setModel(admiDAO.mostrarCortes("cortesentregadossinpagar"));
                VAdmi.getTblCortesEntregados().setModel(admiDAO.mostrarCortes("cortesentregados"));
                
            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Error: Ingrese un ID Valido o Seleccione Corte" );
                VAdmi.getTxtPagar().setBackground(java.awt.Color.GRAY);
                VAdmi.getTblCorteXPagar().setBackground(java.awt.Color.gray);
                
            }    
        }
        
        if(ae.getSource() == VEntregarCorte.getBtnEntregarPagar())
        {
            try {
                Corteid.setIdentificacion(Integer.parseInt(VEntregarCorte.getTxtIdCorte().getText()));
                Corteid.setCantidad(Integer.parseInt(VEntregarCorte.getTxtCantidad().getText()));
                corteDAO.setCorteid(Corteid);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese valores validos...");
            }
            
            try {
                
                tempo.setLabel(VEntregarCorte.getLblMensaje());
                tempo.setMensaje(corteDAO.EntregaryPagar());
                Thread lblRegistro = new Thread(tempo);
                lblRegistro.start();
                
                VAdmi.getTblCorteXPagar().setModel(admiDAO.mostrarCortes("cortesentregadossinpagar"));
                VAdmi.getTblCorteXEntregar().setModel(admiDAO.mostrarCortes("cortesporentregar"));
                VAdmi.getTblCortesPendientes().setModel(admiDAO.mostrarCortes("cortespendientes"));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error: rollBack" + e);
            }
            
           VEntregarCorte.getTxtIdCorte().setText("");
           VEntregarCorte.getTxtCantidad().setText("");
        }
        
        if(ae.getSource() == VPrincipal.getOpmAsignarTareas())
        {
            VAdmi.setVisible(false);
            VPrincipal.getMenu().setVisible(false);
            VTareas.setVisible(true);

            
            LinkedList<Operario> operarios = operarioDAO.listaOperarios();
            
            for(int i=0; i<operarios.size(); i++)
            {
                VTareas.getCmbOperarios().addItem(operarios.get(i).toString());
            }
            
            LinkedList<Corte> cortes = corteDAO.cortes();
            
            for(int i=0; i<cortes.size(); i++)
            {
                VTareas.getCmbCortes().addItem(cortes.get(i).getIdentificacion() + " " + cortes.get(i).getModeloId().getNombre() + " " + cortes.get(i).getFechaEnvio().toStringDate());
            }
            
            
            if(VTareas.getCmbCortes().getItemCount()>2)
            {
                VTareas.getCmbCortes().setSelectedIndex(VTareas.getCmbCortes().getItemCount()-3);
            }
        }
        
        if(ae.getSource() == VTareas.getBtnBuscarCorte())
        {
            Operario operarioV = new Operario();
            
            String idO[] = VTareas.getCmbOperarios().getSelectedItem().toString().split(" ");
            
            String corte[] = VTareas.getCmbCortes().getSelectedItem().toString().split(" ");
            
            if(!(idO[0].equalsIgnoreCase("seleccione")) && !(corte[0].equalsIgnoreCase("seleccione")))
            {
                operarioV.setIdentificacion(idO[0]);
                operarioDAO.setObjOperario(operarioV);
                VTareas.getCmbTareasD().removeAllItems();
                SpinnerModel model = new SpinnerNumberModel(0, 0, corteDAO.ObtenerCantidad(Integer.parseInt(corte[0])), 1);
                VTareas.getSpnCantidad().setModel(model);
                VTareas.getSpnCantidad().getModel().setValue(corteDAO.ObtenerCantidad(Integer.parseInt(corte[0])));
                Corteid.setIdentificacion(Integer.parseInt(corte[0]));
                corteDAO.setCorteid(Corteid);
                LinkedList tareas = corteDAO.ListaTareas();
                for(int i=0; i<tareas.size(); i++)
                {
                    VTareas.getCmbTareasD().addItem(tareas.get(i).toString());
                }
                VAsignadas.getLblCorte().setText(""+Corteid.getIdentificacion());
                
                LinkedList<Operario> operarios = operarioDAO.listaOperarios();
                
                for(int i=0; i<operarios.size(); i++)
                {
                    VAsignadas.getCmbOperarios().addItem(operarios.get(i).toString());
                }
                
                VAsignadas.setVisible(true);
                VAsignadas.getTblTareas().setModel(corteDAO.tareasAsignadas());
                VTareas.getSpnCantidad().setEnabled(true);
                VTareas.getBtnAsignar().setEnabled(true);
                VTareas.getCmbTareasD().setEnabled(true);
                VTareas.getTxtFiltro().setEnabled(true);
                
                corteDAO.corteModelo();
                operacionDAO.setModelo(corteDAO.getModelo());
                VTareas.getTblOperacionesModelo().setModel(operacionDAO.SeleccionarV());
                
            }
            else if(idO[0].equalsIgnoreCase("seleccione"))
            {
                JOptionPane.showMessageDialog(null, "Seleccione Operario");
                VTareas.getSpnCantidad().setEnabled(false);
                VTareas.getBtnAsignar().setEnabled(false);
                VTareas.getCmbTareasD().setEnabled(false);
                VTareas.getTxtFiltro().setEnabled(false);
            }
            else if(corte[0].equalsIgnoreCase("seleccione"))
            {
                JOptionPane.showMessageDialog(null, "Seleccione Corte");
                VTareas.getSpnCantidad().setEnabled(false);
                VTareas.getBtnAsignar().setEnabled(false);
                VTareas.getCmbTareasD().setEnabled(false);
                VTareas.getTxtFiltro().setEnabled(false);
            }
        }
        
        if(ae.getSource() == VTareas.getBtnSalir())
        {
            VTareas.setVisible(false);
            VAsignadas.setVisible(false);
            VTareas.getTblTareasAsignadas().setModel(new DefaultTableModel());
            VTareas.getCmbOperarios().setSelectedIndex(0);
            VTareas.getCmbCortes().setSelectedIndex(0);
            VTareas.getSpnCantidad().setValue(0);
            VTareas.getCmbTareasD().removeAllItems();
            VTareas.getLblPago().setText("");
            VAdmi.setVisible(true);
            VPrincipal.getMenu().setVisible(true);
            
        }
        
        if(ae.getSource() == VTareas.getBtnAsignar())
        {
            boolean b = true;
            
            String corte[] = VTareas.getCmbCortes().getSelectedItem().toString().split(" ");
            Tarea tareaN = new Tarea();
            Operario operarioT = new Operario();
            Corteid.setIdentificacion(Integer.parseInt(corte[0]));
            try
            {
                String dato = VTareas.getCmbTareasD().getSelectedItem().toString();
                String id[] = dato.split(" ");
                
                tareaN.setCorte(Corteid);
                tareaN.setIdentificacion(Integer.parseInt(id[0]));
                tareaN.setCantidad(Integer.parseInt(String.valueOf(VTareas.getSpnCantidad().getValue())));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(VTareas, "Ingrese Cantidad");
                b = false;
            }catch(NullPointerException ex){
                JOptionPane.showMessageDialog(null, "Seleccione Tarea");
                b = false;
            }
            
            if(b)
            {
                String idO[] = VTareas.getCmbOperarios().getSelectedItem().toString().split(" ");
                operarioT.setIdentificacion(idO[0]);

                if(tareaN.getCantidad() == 0)
                {
                    JOptionPane.showMessageDialog(null, "Cantidad Invalida");
                    VTareas.getSpnCantidad().setBackground(java.awt.Color.gray);
                }
                else
                {
                    operarioDAO.setObjOperario(operarioT);
                    operarioDAO.setTareaN(tareaN);
                    JOptionPane.showMessageDialog(VTareas, operarioDAO.asignarTarea());

                    if(tareaN.getCantidad() == corteDAO.ObtenerCantidad(tareaN.getCorte().getIdentificacion()))
                    {
                        VTareas.getCmbTareasD().removeItem(VTareas.getCmbTareasD().getSelectedItem());
                    }
                    VTareas.getTblTareasAsignadas().setModel(operarioDAO.Tareas());
                    VTareas.getLblPago().setText(operarioDAO.PagoCorte());
                    
                    VTareas.getTxtFiltro().setText("");
                    VTareas.getTxtFiltro().isEnabled();
                    VTareas.getTxtFiltro().requestFocusInWindow();
                    //VTareas.getTxtFiltro().requestFocus();
                }
            }
            
            
        }
        
        if(ae.getSource() == VAsignadas.getBtnFiltrar())
        {
            Operario operarioF = new Operario();
            Tarea tareaF = new Tarea();
            
            String idO[] = VAsignadas.getCmbOperarios().getSelectedItem().toString().split(" ");
            
            Corteid.setIdentificacion(Integer.parseInt(VAsignadas.getLblCorte().getText()));
            operarioF.setIdentificacion(idO[0]);
            tareaF.setCorte(Corteid);
            operarioDAO.setObjOperario(operarioF);
            operarioDAO.setTareaN(tareaF);
            VAsignadas.getTblTareas().setModel(operarioDAO.tareasAsignadasOperario());
        }
        
        if(ae.getSource() == VAsignadas.getBtnEliminarTarea())
        {
            
            Tarea tareaE = new Tarea();
            Operario operarioF = new Operario();
            
            String idO[] = VTareas.getCmbOperarios().getSelectedItem().toString().split(" ");
            
            String idOA[] = VAsignadas.getCmbOperarios().getSelectedItem().toString().split(" ");
            
            tareaE.setIdentificacion(Integer.parseInt(String.valueOf(VAsignadas.getTblTareas().getValueAt(VAsignadas.getTblTareas().getSelectedRow(), VAsignadas.getTblTareas().getSelectedColumn()))));
            tareaDAO.setTareaA(tareaE);
            
            JOptionPane.showMessageDialog(null, tareaDAO.Eliminar());
            Corteid.setIdentificacion(Integer.parseInt(VAsignadas.getLblCorte().getText()));
            operarioF.setIdentificacion(idO[0]);
            operarioDAO.setObjOperario(operarioF);
            corteDAO.setCorteid(Corteid);
            if(operarioF.getIdentificacion().equals(""))
            {
                VAsignadas.getTblTareas().setModel(corteDAO.tareasAsignadas());
            }
            else if(idOA[0].equals(idO[0]))
            {
                tareaE.setCorte(Corteid);
                operarioDAO.setTareaN(tareaE);
                VAsignadas.getTblTareas().setModel(operarioDAO.tareasAsignadasOperario());
                VTareas.getTblTareasAsignadas().setModel(operarioDAO.Tareas());
            }
            else
            {
                tareaE.setCorte(Corteid);
                operarioDAO.setTareaN(tareaE);
                VAsignadas.getTblTareas().setModel(operarioDAO.tareasAsignadasOperario());
            }
            
        }
        
        if(ae.getSource() == VNuevoCorte.getBtnRegistrarCorte())
        {
            boolean bandera = true; 
            
            Representante representanteN = new Representante();
            Modelo modeloR = new Modelo();
                    
            corteN.setIdentificacion(Integer.parseInt(VNuevoCorte.getTxtCodigo().getText()));
            
            String IdR[] = VNuevoCorte.getCmbRepresentantes().getSelectedItem().toString().split(" ");
            representanteN.setIdentificacion(IdR[0]);
            
            if(IdR[0].equals("Seleccione"))
            {
                JOptionPane.showMessageDialog(null, "Seleccione Representante");
            }
            else
            {
                corteN.setIdentificacion(Integer.parseInt(VNuevoCorte.getTxtCodigo().getText()));
                
                String dato = VNuevoCorte.getCmbModelos().getSelectedItem().toString();
                String id[] = dato.split(" ");
                String nombre = "";

                for(int i=1; i<id.length; i++)
                {
                    nombre += id[i] + " ";
                }

                try {
                    modeloR.setIdentificacion(Integer.parseInt(id[0]));
                    modeloR.setNombre(nombre);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Seleccione Modelo");
                    bandera = false;
                }
                
                corteN.setRepresentanteId(representanteN);
                corteN.setModeloId(modeloR);

                Calendar cals = Calendar.getInstance();
                SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
                formater.format(VNuevoCorte.getCmbFechaEnvio().getDate());
                formater.format(VNuevoCorte.getCmbFechaEntrega().getDate());

                corteN.setFechaE(formater.format(VNuevoCorte.getCmbFechaEnvio().getDate()));
                corteN.setFechaEn(formater.format(VNuevoCorte.getCmbFechaEntrega().getDate()));

                corteN.setObservaciones(VNuevoCorte.getTxtObservaciones().getText());

                corteDAO.setCorteid(corteN);

                if(!(bandera==false))
                {
                    tempo.setVentana(VNuevoCorte);
                    tempo.setLabel(VNuevoCorte.getLblRegistro());
                    tempo.setMensaje(corteDAO.insertar());
                    Thread lblError = new Thread(tempo);
                    lblError.start();
                }
                

                if(!(tempo.getMensaje().equals("Registro Fallido...")) && !(tempo.getMensaje().equals("Corte ya Registrado...")) && bandera != false && !(tempo.getMensaje().equals("")))
                {
                    VNuevoCorte.getCmbAgrColor().removeAllItems();
                    VNuevoCorte.getCmbAgrTalla().removeAllItems();
                    
                    LinkedList colores = colorDAO.listaColores();

                    for (int i = 0; i < colores.size(); i++) {
                        VNuevoCorte.getCmbAgrColor().addItem(colores.get(i).toString());
                    }

                    LinkedList tallas = tallaDAO.listaTallas();

                    for (int i = 0; i < tallas.size(); i++) {
                        VNuevoCorte.getCmbAgrTalla().addItem(tallas.get(i).toString());
                    }
                    
                    Corte corteF = new Corte();
                    corteF.setIdentificacion(Integer.parseInt(VNuevoCorte.getTxtCodigo().getText()));
                    corteF.setModeloId(modeloR);
                    corteF.setFechaEntrega(fechaEntrega);
                    cortes.add(corteF);
                    
                    VNuevoCorte.getPnlAdicionales().setVisible(true);
                    VNuevoCorte.getOpmNuevo().setSelectedIndex(1);
                }
            }
            
            f = 0;
            //corteN.setModeloId(modeloId);
        }
        
        if(VNuevoCorte.getBtnEliminarTalla() == ae.getSource())
        {
            Talla talla = new Talla();
            
            corteN.setIdentificacion(Integer.parseInt(VNuevoCorte.getTxtCodigo().getText()));
            talla.setIdentificacion(VNuevoCorte.getCmbAgrTalla().getSelectedItem().toString());
            
            corteN.setTalla(talla);
            tallaDAO.setCorte(corteN);
            
            tempo.setVentana(VNuevoCorte);
            tempo.setLabel(VNuevoCorte.getLblRegistro());
            tempo.setMensaje(tallaDAO.Eliminar());
            Thread lblError = new Thread(tempo);
            lblError.start();
            
            VNuevoCorte.getTblTallas().setModel(tallaDAO.SeleccionarV());
            corteN.setCantidad(corteDAO.ObtenerCantidad(corteN.getIdentificacion()));
        }
        
        if(VNuevoCorte.getBtnEliminarColor() == ae.getSource())
        {
            Color color = new Color();
            
            corteN.setIdentificacion(Integer.parseInt(VNuevoCorte.getTxtCodigo().getText()));
            String idColor[] = VNuevoCorte.getCmbAgrColor().getSelectedItem().toString().split(" ");
            color.setIdentificacion(Integer.parseInt(idColor[0]));
            
            corteN.setColorId(color);
            
            colorDAO.setCorte(corteN);
            
            tempo.setVentana(VNuevoCorte);
            tempo.setLabel(VNuevoCorte.getLblRegistro());
            tempo.setMensaje(colorDAO.Eliminar());
            Thread lblError = new Thread(tempo);
            lblError.start();
            
            VNuevoCorte.getTblColores().setModel(colorDAO.SeleccionarV());
        }
        
        if(ae.getSource() == VNuevoCorte.getBtnAgrColor())
        {
            Color ColorA = new Color();
            String dato = VNuevoCorte.getCmbAgrColor().getSelectedItem().toString();
            String id[] = dato.split(" ");
            
            ColorA.setIdentificacion(Integer.parseInt(id[0]));
            ColorA.setCantidad(Integer.parseInt(VNuevoCorte.getTxtCantidadColor().getText()));
            corteN.setIdentificacion(Integer.parseInt(VNuevoCorte.getTxtCodigo().getText()));
            corteN.setColorId(ColorA);
            corteDAO.setCorteid(corteN);
            colorDAO.setCorte(corteN);
            
            tempo.setVentana(VNuevoCorte);
            tempo.setLabel(VNuevoCorte.getLblRegistro());
            tempo.setMensaje(corteDAO.agregarColor());
            Thread lblError = new Thread(tempo);
            lblError.start();
            
            VNuevoCorte.getTblColores().setModel(colorDAO.SeleccionarV());
        }
        
        if(ae.getSource() == VNuevoCorte.getBtnAgrTalla())
        {
            Talla TallaA = new Talla();
            String dato = VNuevoCorte.getCmbAgrTalla().getSelectedItem().toString();
            
            TallaA.setIdentificacion(dato);
            TallaA.setCantidad(Integer.parseInt(VNuevoCorte.getTxtCantidadTalla().getText()));
            corteN.setIdentificacion(Integer.parseInt(VNuevoCorte.getTxtCodigo().getText()));
            corteN.setTalla(TallaA);
            corteDAO.setCorteid(corteN);
            tallaDAO.setCorte(corteN);
            
            tempo.setVentana(VNuevoCorte);
            tempo.setLabel(VNuevoCorte.getLblRegistro());
            tempo.setMensaje(corteDAO.agregarTalla());
            Thread lblError = new Thread(tempo);
            lblError.start();
            
            VNuevoCorte.getTblTallas().setModel(tallaDAO.SeleccionarV());
            corteN.setCantidad(corteDAO.obtenerCantidadTotal());
        }
        
        if(ae.getSource() == VPrincipal.getOpmNuevo())
        {
            LinkedList<Proveedor> proveedor = proveedorDAO.listaProveedores();
            
            for(int i=0; i<proveedor.size(); i++)
            {
                Vpedidos.getCmbProveedores().addItem(proveedor.get(i).toString());
            }
            
            VAdmi.setVisible(false);
            VPrincipal.getMenu().setVisible(false);
            Vpedidos.setVisible(true);
           
        }
        
        if(Vpedidos.getBtnSiguiente() == ae.getSource() || Vpedidos.getTxtNumeroCortes() == ae.getSource())
        {
            try {
                NumeroPedidos = Integer.parseInt(Vpedidos.getTxtNumeroCortes().getText());
                
                if(!(Vpedidos.getCmbProveedores().getSelectedItem().equals("Seleccione")) && NumeroPedidos>0)
                {
                    Vpedidos.getTxtNumeroCortes().setText("");
                    String proveedorS[] = Vpedidos.getCmbProveedores().getSelectedItem().toString().split(" ");
                    VNuevoCorte.getLblIDProveedor().setText(proveedorS[0]);
                    VNuevoCorte.setTitle(proveedorS[1]);
                    VNuevoCorte.getLblcorte().setText(String.valueOf(pedidos+1));
                    Vpedidos.getCmbProveedores().setSelectedIndex(0);
                    Vpedidos.getCmbProveedores().removeAllItems();
                    VNuevoCorte.setVisible(true);
                    
                    Modelo modeloR = new Modelo();
                    Proveedor proveedor = new Proveedor();

                    proveedor.setIdentificacion(Integer.parseInt(VNuevoCorte.getLblIDProveedor().getText()));
                    proveedorDAO.setObjProv(proveedor);

                        VNuevoCorte.getTxtCodigo().setText(corteDAO.idCorteNuevo());

                        LinkedList<Representante> representantes = proveedorDAO.listaRepresentantes();

                        for (int i = 0; i < representantes.size(); i++) 
                        {
                            VNuevoCorte.getCmbRepresentantes().addItem(representantes.get(i).toString());
                        }

                        VNuevoCorte.getCmbRepresentantes().setSelectedIndex(1);

                        VNuevoCorte.getLblIDProveedor().setText(String.valueOf(proveedor.getIdentificacion()));
                        //proveedor.getRepresentantes().add(representanteN);
                        modeloR.setProveedor(proveedor);
                        modeloDAO.setModeloN(modeloR);
                        LinkedList modelos = modeloDAO.listaModelos();

                        if (cont == 0) 
                        {
                            for (int i = 0; i < modelos.size(); i++) 
                            {
                                VNuevoCorte.getCmbModelos().addItem(modelos.get(i).toString());
                            }
                        }
                        cont++;
                        Vpedidos.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Datos Invalidos");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error en Numero de pedidos");
            }
            
        }
        
        if(ae.getSource() == Vpedidos.getBtnCancelar())
        {
            Vpedidos.getCmbProveedores().removeAllItems();
            Vpedidos.getTxtNumeroCortes().setText("");
            Vpedidos.setVisible(false);
            VPrincipal.getMenu().setVisible(true);
            VAdmi.setVisible(true);
        }
        
        if(ae.getSource() == VNuevoCorte.getBtnGuardar())
        {
               
            if(corteN.getCantidad() == 0)
            {
                if(bandera==3)
                {
                    corteDAO.Eliminar();
                    JOptionPane.showMessageDialog(null, "Corte no creado...");
                    VNuevoCorte.getTxtCodigo().setText("");
                    VNuevoCorte.getTxtCantidadColor().setText("");
                    VNuevoCorte.getTxtCantidadTalla().setText("");
                    VNuevoCorte.getTxtObservaciones().setText("");
                    VNuevoCorte.getCmbModelos().setSelectedIndex(0);
                    VNuevoCorte.getTblColores().setModel(new DefaultTableModel());
                    VNuevoCorte.getTblTallas().setModel(new DefaultTableModel());
                    VNuevoCorte.setVisible(false);
                    VNuevoCorte.getCmbAgrTalla().removeAllItems();
                    VNuevoCorte.getCmbAgrColor().removeAllItems();
                    bandera = 0;
                    VAdmi.setVisible(true);
                    VPrincipal.getMenu().setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Ingrese Alguna Talla", "Obligatorio " + bandera, JOptionPane.ERROR_MESSAGE);
                    bandera++;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Colores y Tallas Registrados");
                VNuevoCorte.getTxtCantidadColor().setText("");
                VNuevoCorte.getTxtCantidadTalla().setText("");
                
                VNuevoCorte.getTblColores().setModel(new DefaultTableModel());
                VNuevoCorte.getTblTallas().setModel(new DefaultTableModel());
                VNuevoCorte.getCmbAgrTalla().removeAllItems();
                VNuevoCorte.getCmbAgrColor().removeAllItems();
                pedidos++;
                VNuevoCorte.getPnlAdicionales().setVisible(false);
                VAdmi.getTblCorteXEntregar().setModel(admiDAO.mostrarCortes("cortesporEntregar"));
                VNuevoCorte.getLblcorte().setText(String.valueOf(pedidos+1));
                VNuevoCorte.getTxtCodigo().setText(corteDAO.idCorteNuevo());
                VNuevoCorte.getTxtObservaciones().setText("");
                VNuevoCorte.getCmbModelos().setSelectedIndex(0);
                VNuevoCorte.getPnlNuevo().setVisible(true);
                VNuevoCorte.getOpmNuevo().setSelectedIndex(0);
                
                 
                 if(pedidos==NumeroPedidos)
                 {
                     pdf.fichaTecnica(cortes);
                     try {
                        pdf.abrirA();
                     } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, "Error al abrir Archivo: " + e);
                     }
                     VNuevoCorte.setVisible(false);
                     VAdmi.setVisible(true);
                     VPrincipal.getMenu().setVisible(true);
                     pedidos=0;
                     cortes.clear();
                 }
                
                
            }
        }
        
        if(ae.getSource() == VPrincipal.getOpmRegProveedor())
        {   
            VRegProveedor.setVisible(true);
            VRegOperario.setVisible(false);
            VCorte.setVisible(false);
            VPrincipal.getMenu().setVisible(false);
            VAdmi.setVisible(false);
        }
        
        if(ae.getSource() == VRegProveedor.getBtnRegProveedor())
        {
            Proveedor proveedorN = new Proveedor();
            
            proveedorN.setIdentificacion(Integer.parseInt(VRegProveedor.getTxtId().getText()));
            proveedorN.setNombre(VRegProveedor.getTxtNombre().getText());
            
            
            proveedorDAO.setObjProv(proveedorN);
            
            tempo.setLabel(VRegProveedor.getLblRegProveedor());
            tempo.setMensaje(proveedorDAO.insertar());
            Thread lblRegistrar = new Thread(tempo);
            lblRegistrar.start();
            
            VRegProveedor.getLblIdProveedor().setText(String.valueOf(proveedorN.getIdentificacion()));
            VRegProveedor.getTxtIdProveedor().setText(String.valueOf(proveedorN.getIdentificacion()));
            
        }
        
        if(ae.getSource() == VRegProveedor.getBtnAgrRepresentante())
        {
            Representante representanteN = new Representante();
            Proveedor proveedorN = new Proveedor();
            proveedorN.setIdentificacion(Integer.parseInt(VRegProveedor.getTxtIdProveedor().getText()));
            representanteN.setIdentificacion(VRegProveedor.getTxtIdRepresentante().getText());
            representanteN.setNombre(VRegProveedor.getTxtNombreRepresentante().getText());
            representanteN.setContraseña(VRegProveedor.getTxtContraseñaRepresentante().getText());
            representanteN.setCorreo(VRegProveedor.getTxtCorreoRepresentante().getText());
         
            representanteN.setProveedor(proveedorN);
            
            representanteDAO.setObjRepresentante(representanteN);
            representanteDAO.setObjPersona(representanteN);
            
            tempo.setLabel(VRegProveedor.getLblRegRepresentante());
            tempo.setMensaje(representanteDAO.insertar());
            Thread lblRegistrar = new Thread(tempo);
            lblRegistrar.start();
            
            VRegProveedor.getTxtNombreRepresentante().setText("");
            VRegProveedor.getTxtIdRepresentante().setText("");
            VRegProveedor.getTxtNumeroRepresentante().setText("");
            VRegProveedor.getTxtContraseñaRepresentante().setText("");
            VRegProveedor.getTxtOperadorTel().setText("");
            VRegProveedor.getTxtCorreoRepresentante().setText("");
        }
        
        if(ae.getSource() == VRegProveedor.getBtnAgrModelo())
        {
            Modelo modelo = new Modelo();
            Proveedor proveedor  = new Proveedor();
            
            modelo.setIdentificacion(Integer.parseInt(VRegProveedor.getTxtIdMod().getText()));
            modelo.setNombre(VRegProveedor.getTxtNombreMod().getText());
            modelo.setValor(Integer.parseInt(VRegProveedor.getTxtPrecioMod().getText()));
            proveedor.setIdentificacion(Integer.parseInt(VRegProveedor.getTxtIdProveedor().getText()));
            modelo.setProveedor(proveedor);
            modeloDAO.setModeloN(modelo);
            
            
            tempo.setLabel(VRegProveedor.getLblRegModelo());
            tempo.setMensaje(modeloDAO.insertar());
            Thread lblRegistrar = new Thread(tempo);
            lblRegistrar.start();
            
            LinkedList operaciones = operacionDAO.ListaOperaciones();
            for(int i=0; i<operaciones.size(); i++)
            {
                VRegProveedor.getCmbOperacionExi().addItem(operaciones.get(i).toString());
            }
        }
        
        if(ae.getSource() == VRegProveedor.getBtnAgrOperacion())
        {
            Modelo modelo = new Modelo();
            Operacion operacion = new Operacion();
            
            String dato = VRegProveedor.getCmbOperacionExi().getSelectedItem().toString();
            String id[] = dato.split(" ");
            
            modelo.setIdentificacion(Integer.parseInt(VRegProveedor.getTxtIdMod().getText()));
            operacion.setIdentificacion(Integer.parseInt(id[0]));
            
            modeloDAO.setModeloN(modelo);
            modeloDAO.setOperacionN(operacion);
            
            tempo.setLabel(VRegProveedor.getLblRegOperacionExis());
            tempo.setMensaje(modeloDAO.añadirOperacion());
            Thread lblRegistrar = new Thread(tempo);
            lblRegistrar.start();
            
            int r = JOptionPane.showConfirmDialog(VAdmi, "¿Desea agregar otra  Operacion?");
            if(r==JOptionPane.NO_OPTION)
            {
                VRegProveedor.getTxtIdMod().setText("");
                VRegProveedor.getTxtNombreMod().setText("");
                VRegProveedor.getTxtPrecioMod().setText("");
                VRegProveedor.getTxtIdProveedor().setText("");
                VRegProveedor.getLblIdProveedor().setText("");
                VRegProveedor.getTxtId().setText("");
                VRegProveedor.getTxtNombre().setText("");
                
            }
            VRegProveedor.getCmbOperacionExi().setSelectedIndex(0);
            
        }
        
        if(ae.getSource() == VRegProveedor.getBtnNuevaOperacion())
        {
            Modelo modelo = new Modelo();
            Operacion operacionN = new Operacion();
            
            modelo.setIdentificacion(Integer.parseInt(VRegProveedor.getTxtIdMod().getText()));
            operacionN.setIdentificacion(Integer.parseInt(VRegProveedor.getTxtNuevaOperId().getText()));
            operacionN.setDescripcion(VRegProveedor.getTxtNuevaOperDesc().getText());
            operacionN.setValor(Integer.parseInt(VRegProveedor.getTxtNuevaOperPrecio().getText()));
            operacionDAO.setOperacionN(operacionN);
            operacionDAO.setModelo(modelo);
            try {
                tempo.setLabel(VRegProveedor.getLblRegOperacionNueva());
                tempo.setMensaje(operacionDAO.insertar());
                Thread lblRegistrar = new Thread(tempo);
                lblRegistrar.start();
                
                int r = JOptionPane.showConfirmDialog(VAdmi, "¿Desea agregar otra Operacion?" + JOptionPane.YES_NO_OPTION);
                if(r==JOptionPane.NO_OPTION)
                {
                    VRegProveedor.getTxtIdMod().setText("");
                    VRegProveedor.getTxtNombreMod().setText("");
                    VRegProveedor.getTxtPrecioMod().setText("");
                    VRegProveedor.getTxtNuevaOperId().setText("");
                    VRegProveedor.getTxtNuevaOperDesc().setText("");
                    VRegProveedor.getTxtNuevaOperPrecio().setText("");
                    VRegProveedor.getTxtIdProveedor().setText("");
                    VRegProveedor.getLblIdProveedor().setText("");
                }
                
                VRegProveedor.getTxtNuevaOperId().setText("");
                VRegProveedor.getTxtNuevaOperDesc().setText("");
                VRegProveedor.getTxtNuevaOperPrecio().setText("");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);
            }
        }
        
        if(ae.getSource() == VRegProveedor.getBtnActualizarGeneral())
        {
            Modelo modeloA = new Modelo();
            
            modeloA.setIdentificacion(Integer.parseInt(VRegProveedor.getTxtIdModAct().getText()));
            modeloA.setNombre(VRegProveedor.getTxtNombreModAct().getText());
            modeloA.setValor(Integer.parseInt(VRegProveedor.getTxtPrecioModAct().getText()));
            
            modeloDAO.setModeloN(modeloA);
            
            tempo.setLabel(VRegProveedor.getLblActModeloGeneral());
            tempo.setMensaje(modeloDAO.actualizar());
            Thread lblRegistrar = new Thread(tempo);
            lblRegistrar.start();
            
            operacionDAO.setModelo(modeloA);
        }
        
        if(ae.getSource() == VRegProveedor.getTxtIdModAct())
        {
            Modelo modeloA = new Modelo();
            modeloA.setIdentificacion(Integer.parseInt(VRegProveedor.getTxtIdModAct().getText()));
            modeloDAO.setModeloN(modeloA);
            operacionDAO.setModelo(modeloA);
            
            modeloA = modeloDAO.obtenerModelo();
            
            VRegProveedor.getTxtNombreModAct().setText(modeloA.getNombre());
            VRegProveedor.getTxtPrecioModAct().setText(String.valueOf(modeloA.getValor()));
            VRegProveedor.getTblOperaciones().setModel(operacionDAO.SeleccionarV());
        }
        
        if(ae.getSource() == VRegProveedor.getBtnActualizarOper())
        {
            Modelo modeloA = new Modelo();
            Operacion operacionA = new Operacion();
            
            modeloA.setIdentificacion(Integer.parseInt(VRegProveedor.getTxtIdModAct().getText()));
            modeloDAO.setModeloN(modeloA);
            
            operacionA.setIdentificacion(Integer.parseInt(VRegProveedor.getTxtIdOperAct().getText()));
            operacionA.setDescripcion(VRegProveedor.getTxtNombreOperAct().getText());
            operacionA.setValor(Integer.parseInt(VRegProveedor.getTxtPrecioOperAct().getText()));
            operacionDAO.setOperacionN(operacionA);
            operacionDAO.setModelo(modeloA);
            
            JOptionPane.showMessageDialog(null, operacionDAO.actualizar());
            
            tempo.setLabel(VRegProveedor.getLblActOperaciones());
            tempo.setMensaje(operacionDAO.actualizar());
            Thread lblRegistrar = new Thread(tempo);
            lblRegistrar.start();
        }
        
        if(ae.getSource() == VRegProveedor.getTxtIdOperAct())
        {
            Operacion operacionA = new Operacion();
            Modelo modelo = new Modelo();
            modelo.setIdentificacion(Integer.parseInt(VRegProveedor.getTxtIdModAct().getText()));
            operacionA.setIdentificacion(Integer.parseInt(VRegProveedor.getTxtIdOperAct().getText()));
            operacionDAO.setOperacionN(operacionA);
            operacionDAO.setModelo(modelo);
            
            operacionA = operacionDAO.obtenerOperacion();
            
            VRegProveedor.getTxtNombreOperAct().setText(operacionA.getDescripcion());
            VRegProveedor.getTxtPrecioOperAct().setText(String.valueOf(operacionA.getValor()));
        }
        
        if(ae.getSource() == VPrincipal.getOpmRegOperario())
        {
            VRegProveedor.setVisible(false);
            VRegOperario.setVisible(true);
            VCorte.setVisible(false);
            VPrincipal.getMenu().setVisible(false);
            VAdmi.setVisible(false);
        }
        
        if(ae.getSource() == VRegOperario.getBtnRegOperario())
        {
            Operario operarioN = new Operario();
            operarioN.setIdentificacion(VRegOperario.getTxtId().getText());
            operarioN.setNombre(VRegOperario.getTxtNombre().getText());
            operarioN.setContraseña(VRegOperario.getTxtContraseña().getText());
            operarioN.setCorreo(VRegOperario.getTxtCorreo().getText());
            
            operarioDAO.setObjOperario(operarioN);
            
            LinkedList especializaciones = especializacionDAO.ListaEspecializaciones();
            for(int i=0; i<especializaciones.size(); i++)
            {
                VRegOperario.getCmbEspecializaciones().addItem(especializaciones.get(i).toString());
            }
            
            tempo.setLabel(VRegOperario.getLblRegOperario());
            tempo.setMensaje(operarioDAO.insertar());
            Thread lblRegistrar = new Thread(tempo);
            lblRegistrar.start();
            
        }
        
        if(ae.getSource() == VRegOperario.getBtnAgrEspecializacion())
        {
            Operario operario = new Operario();
            Especializacion especializacion = new Especializacion();
            
            String dato = VRegOperario.getCmbEspecializaciones().getSelectedItem().toString();
            String id[] = dato.split(" ");
            
            operario.setIdentificacion(VRegOperario.getTxtId().getText());
            especializacion.setIdentificacion(Integer.parseInt(id[0]));

            operarioDAO.setObjOperario(operario);
            operarioDAO.setEspecializacion(especializacion);
            
            tempo.setLabel(VRegOperario.getLblRegEspecializacion());
            tempo.setMensaje(operarioDAO.añadirEspecializacion());
            Thread lblRegistrar = new Thread(tempo);
            lblRegistrar.start();
            
            int r = JOptionPane.showConfirmDialog(VAdmi, "Desea agregar otra Especilizacion?");
            if(r==JOptionPane.NO_OPTION)
            {
                VRegOperario.getTxtId().setText("");
                VRegOperario.getTxtNombre().setText("");
                VRegOperario.getTxtContraseña().setText("");
                VRegOperario.getTxtCorreo().setText("");
                VRegOperario.getLblRegOperario().setText("");
                VRegOperario.getTxtTel().setText("");
                VRegOperario.getCmbEspecializaciones().removeAllItems();
            }
        }
        
        if(ae.getSource() == VPrincipal.getOpmConsultar())
        {
            VRegProveedor.setVisible(false);
            VRegOperario.setVisible(false);
            VCorte.setVisible(true);
            VCorte.getBtnConsGanancias().setVisible(true);
            VCorte.getTblCortes().setModel(corteDAO.SeleccionarV());
            VAdmi.setVisible(false);
            VPrincipal.getMenu().setVisible(false);
        }
        
        /*if(ae.getSource() == VCorte.getBtnConsTallas() && VCorte.getRbtnID().isSelected())
        {
            try {
                   int corte1 = Integer.parseInt(VCorte.getTxtIdCorte().getText());
                   int corte2 = Integer.parseInt(VCorte.getTxtIdCorte2().getText());
                   this.Corteid.setIdentificacion(Integer.parseInt(VCorte.getTxtIdCorte().getText())); 
                   corteDAO.setCorteid(Corteid);
                   VCorte.getTblConsultas().setModel(corteDAO.SeleccionarTallas(corte1, corte2));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un Corte Valido");
                VCorte.getTxtIdCorte().setBackground(java.awt.Color.LIGHT_GRAY);
            }
            
        }*/
        
        if(ae.getSource() == VCorte.getBtnConsTallas())
        {
            VCorte.getBtnEliminarColor().setVisible(false);
            VCorte.getBtnEliminarTalla().setVisible(true);
                        
            /*for(int i=1; i<cor.length; i++)
            {
                Corte corte = new Corte();
                corte.setIdentificacion(Integer.parseInt(lista1.get(i).toString()));
                cortes.add(cor[i]);
            }*/
                
            VCorte.getTblConsultas().setModel(corteDAO.SeleccionarTallasC(listaCortes()));
        }
        
        if(ae.getSource() == VCorte.getBtnEliminarTalla())
        {
            Corteid.setIdentificacion(Integer.parseInt(String.valueOf(VCorte.getTblConsultas().getValueAt(VCorte.getTblConsultas().getSelectedRow(), 0))));
            
            Talla talla = new Talla();
            
            talla.setIdentificacion(String.valueOf(VCorte.getTblConsultas().getValueAt(VCorte.getTblConsultas().getSelectedRow(), 1)));
            Corteid.setTalla(talla);
            
            tallaDAO.setCorte(Corteid);
            
            JOptionPane.showMessageDialog(null, tallaDAO.Eliminar());
            
            VCorte.getTblConsultas().setModel(corteDAO.SeleccionarTallasC(listaCortes()));
            VCorte.getTblCortes().setModel(corteDAO.SeleccionarV());
        }
        
        if(ae.getSource() == VCorte.getBtnEliminarColor())
        {
            Corteid.setIdentificacion(Integer.parseInt(String.valueOf(VCorte.getTblConsultas().getValueAt(VCorte.getTblConsultas().getSelectedRow(), 0))));
            
            Color color = new Color();
            
            color.setIdentificacion(Integer.parseInt(String.valueOf(VCorte.getTblConsultas().getValueAt(VCorte.getTblConsultas().getSelectedRow(), 1))));
            Corteid.setColorId(color);
            
            colorDAO.setCorte(Corteid);
            
            JOptionPane.showMessageDialog(null, colorDAO.Eliminar());
            
            //VCorte.getTblConsultas().setModel(corteDAO.SeleccionarColores(Integer.parseInt(VCorte.getTxtIdCorte().getText()), Integer.parseInt(VCorte.getTxtIdCorte2().getText())));
            VCorte.getTblCortes().setModel(corteDAO.SeleccionarV());
        }
        
        if(ae.getSource() == VCorte.getBtnConsTareas())
        {
            VCorte.getBtnEliminarColor().setVisible(false);
            VCorte.getBtnEliminarTalla().setVisible(false);
            
            VCorte.getTblConsultas().setModel(corteDAO.SeleccionarTareasC(listaCortes()));
        }
        
        if(ae.getSource() == VCorte.getBtnConsColores())
        {
            VCorte.getBtnEliminarTalla().setVisible(false);
            VCorte.getBtnEliminarColor().setVisible(true);
            
            VCorte.getTblConsultas().setModel(corteDAO.SeleccionarColoresC(listaCortes()));
        }
        
        if(ae.getSource() == VCorte.getBtnConsGanancias())
        {
            VCorte.getBtnEliminarColor().setVisible(false);
            VCorte.getBtnEliminarTalla().setVisible(false);
            
            VCorte.getTxtInsumos().setVisible(true);
            VCorte.getLblInsumos().setVisible(true);
         
            if(!(VCorte.getTxtInsumos().getText().equals("")))
            {
                VCorte.getTblConsultas().setModel(corteDAO.SeleccionarGananciasC(listaCortes(), Integer.parseInt(VCorte.getTxtInsumos().getText())));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Ingrese Valor de Insumos");
            }
        }
        
        if(ae.getSource() == VPrincipal.getOpmProveedor())
        {   
            VRegProveedor.setVisible(false);
            VRegOperario.setVisible(false);
            VPrincipal.getMenu().setVisible(false);
            VAdmi.setVisible(false);
            VCorte.setVisible(false);
            VProveedor.getCmbProveedores().removeAllItems();
            VProveedor.setVisible(true);
                        
            for(int i=0; i<proveedorDAO.listaProveedores().size(); i++)
            {
                VProveedor.getCmbProveedores().addItem(proveedorDAO.listaProveedores().get(i).toString());
            }
            
            //JOptionPane.showOptionDialog(null, "Seleccione Proveedor",/*Pregunta*/ "Proveedores",/*titulo*/ JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, proveedorDAO.listaProveedores().toArray(), proveedorDAO.listaProveedores());
            
        }
        
        if(ae.getSource() == VProveedor.getBtnSiguiente())
        {
            
            int idA = 0;
            Proveedor proveedor = new Proveedor();
            
            try {
                //idA = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese ID de Proveedor"));
                String ids[] = VProveedor.getCmbProveedores().getSelectedItem().toString().split(" ");
                idA = Integer.parseInt(ids[0]);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese Solo Numeros...");
            }
            proveedor.setIdentificacion(idA);
            proveedorDAO.setObjProv(proveedor);
            String datos = proveedorDAO.SeleccionarU();
            if(datos.equals(""))
            {
                JOptionPane.showMessageDialog(null, "ID Invalido..");
                VPrincipal.getMenu().setVisible(true);
                VAdmi.setVisible(true);
            }
            else
            {
                VVerProveedor.setVisible(true);
                String dato[] = datos.split(" ");
                VVerProveedor.getLblNombreProv().setText(dato[1]);
                VVerProveedor.getLblIDProv().setText(dato[0]);
                VVerProveedor.getTblRepresentantes().setModel(proveedorDAO.SeleccionarV());
            }
        }
        
        if(ae.getSource() == VProveedor.getBtnCancelar())
        {
            VProveedor.setVisible(false);
            VPrincipal.getMenu().setVisible(true);
            VAdmi.setVisible(true);
        }
        
        if(VVerProveedor.getTxtIdRepresentante()== ae.getSource())
        {
            Representante representante = new Representante();
            
            representante.setIdentificacion(VVerProveedor.getTxtIdRepresentante().getText());
            representanteDAO.setObjRepresentante(representante);
            String datos[] = representanteDAO.seleccionarU().split(" ");
            if(datos[0].equals(""))
            {
                tempo.setLabel(VVerProveedor.getLblMensaje());
                tempo.setMensaje("ID Invalido");
                Thread lblError = new Thread(tempo);
                lblError.start();
                
                
                VVerProveedor.getLblNombreRepresentante().setText("");
                VVerProveedor.getLblIdRepresentante().setText("");
                VVerProveedor.getLblCorreoRepresentante().setText("");
            }
            else if(datos.length==3)
            {
                VVerProveedor.getLblNombreRepresentante().setText(datos[1]);
                VVerProveedor.getLblIdRepresentante().setText(datos[0]);
                VVerProveedor.getLblCorreoRepresentante().setText(datos[2]);
            }
            else
            {
                VVerProveedor.getLblNombreRepresentante().setText(datos[1] + " " + datos[2]);
                VVerProveedor.getLblIdRepresentante().setText(datos[0]);
                VVerProveedor.getLblCorreoRepresentante().setText(datos[3]);
            }
        }
        
        if(VVerProveedor.getBtnModelos() == ae.getSource())
        {
            VPrincipal.setMinimumSize(new Dimension(1372, 700));
            Proveedor proveedorM = new Proveedor();
            proveedorM.setIdentificacion(Integer.parseInt(VVerProveedor.getLblIDProv().getText()));
            modeloDAO.setProveedor(proveedorM);
            VModelo.getTblModelos().setModel(modeloDAO.SeleccionarV());
            VVerProveedor.setVisible(false);
            VModelo.getBtnRegAdmi().setVisible(true);
            VVerProveedor.getLblNombreRepresentante().setText("");
            VVerProveedor.getLblIdRepresentante().setText("");
            VVerProveedor.getLblCorreoRepresentante().setText("");
            VModelo.setVisible(true);
            VModelo.setSize(new Dimension(1356, 640));
            VModelo.getLblNM().setVisible(true);
            VModelo.getLblAM().setVisible(true);
            VModelo.getPnlNuevoModelo().setVisible(true);
            VModelo.getPnlActModelo().setVisible(true);
            VModelo.getLblTotal().setText("");
            VModelo.getBtnActualizarOper().setEnabled(true);
            VModelo.getBtnNuevaOperacionME().setEnabled(true);
            VModelo.getBtnAgrOperacionNueva().setEnabled(true);
            VModelo.getTxtId().setText(modeloDAO.idNuevoModelo());
        }
        
        if(VModelo.getBtnRegAdmi() == ae.getSource())
        {
            VPrincipal.setSize(new Dimension(800, 640));
            VModelo.setVisible(false);
            VVerProveedor.setVisible(true);
            VModelo.getTblModelos().setModel(new DefaultTableModel());
            VModelo.getTblOperaciones().setModel(new DefaultTableModel());
            VModelo.getTblOperacionesAct().setModel(new DefaultTableModel());
            VModelo.getTxtConsultarOper().setText("");
            VModelo.getTxtId().setText("");
            VModelo.getTxtIdAct().setText("");
            VModelo.getTxtIdOperAct().setText("");
            VModelo.getTxtNombre().setText("");
            VModelo.getTxtNombreAct().setText("");
            VModelo.getTxtNombreOperAct().setText("");
            VModelo.getTxtNombreOperAct().setText("");
            VModelo.getTxtNuevaOperDesc().setText("");
            VModelo.getTxtNuevaOperDescME().setText(""); 
            VModelo.getTxtNuevaOperId().setText("");
            VModelo.getTxtNuevaOperIdME().setText("");
            VModelo.getTxtNuevaOperPrecio().setText("");
            VModelo.getTxtPrecioAct().setText("");
            VModelo.getTxtNuevaOperPrecioME().setText("");
            VModelo.getTxtPrecio().setText("");
            VModelo.getTxtPrecioOperAct().setText("");
            VModelo.getCmbOperacionExi().removeAllItems();
            VModelo.getCmbOperacionExiME().removeAllItems();
        }
        
        if(ae.getSource() == VVerProveedor.getBtnRegresar())
        {
            VVerProveedor.setVisible(false);
            VVerProveedor.getLblNombreRepresentante().setText("");
            VVerProveedor.getLblIdRepresentante().setText("");
            VVerProveedor.getLblCorreoRepresentante().setText("");
            VVerProveedor.getLblNombreProv().setText("");
            VVerProveedor.getLblIDProv().setText("");
            VVerProveedor.getTblRepresentantes().setModel(new DefaultTableModel());
            VVerProveedor.getTxtIdRepresentante().setText("");
            VPrincipal.getMenu().setVisible(true);
            VAdmi.setVisible(true);
        }
                                
        if(ae.getSource() == VRegProveedor.getBtnRegresarProv())
        {
            VRegProveedor.setVisible(false);
            VRegProveedor.getTxtId().setText("");
            VRegProveedor.getTxtNombre().setText("");
            VRegProveedor.getTxtNombreRepresentante().setText("");
            VRegProveedor.getTxtIdRepresentante().setText("");
            VRegProveedor.getTxtContraseñaRepresentante().setText("");
            VRegProveedor.getTxtCorreoRepresentante().setText("");
            VRegProveedor.getTxtIdMod().setText("");
            VRegProveedor.getTxtNombreMod().setText("");
            VRegProveedor.getTxtPrecioMod().setText("");
            VRegProveedor.getTxtNuevaOperId().setText("");
            VRegProveedor.getTxtNuevaOperDesc().setText("");
            VRegProveedor.getTxtNuevaOperPrecio().setText("");
            VRegProveedor.getCmbOperacionExi().removeAllItems();
            VRegProveedor.getLblRegModelo().setText("");
            VRegProveedor.getLblRegOperacionExis().setText("");
            VRegProveedor.getLblRegOperacionNueva().setText("");
            VRegProveedor.getTblOperaciones().setModel(new DefaultTableModel());
            VRegProveedor.getLblRegProveedor().setText("");
            VRegProveedor.getLblRegRepresentante().setText("");
            VPrincipal.getMenu().setVisible(true);
            VAdmi.setVisible(true);
        }
        
        if(ae.getSource() == VRegOperario.getBtnRegresarOper())
        {
            VRegOperario.setVisible(false);
            VPrincipal.getMenu().setVisible(true);
            VAdmi.setVisible(true);
        }
        
        if(ae.getSource() == VPrincipal.getOpmConsultar())
        {
            VCorte.setVisible(true);
        }
        
        if(ae.getSource() == VCorte.getBtnRegresar())
        {
            VCorte.setVisible(false);
            lista1.removeAllElements();
            VCorte.getListaCortes().setModel(lista1);
            VCorte.getTblConsultas().setModel(new DefaultTableModel());
            VCorte.getTxtInsumos().setVisible(false);
            VCorte.getLblInsumos().setVisible(false);
            VCorte.getTblCortes().setModel(new DefaultTableModel());
            VAdmi.setVisible(true);
            VPrincipal.getMenu().setVisible(true);
        }
        
        
        if(ae.getSource() == VNuevoCorte.getBtnSalir())
        {
            int resp = JOptionPane.showConfirmDialog(null, "¿Desea Cancelar el proceso? \n");
            
            if(resp == JOptionPane.YES_OPTION)
            {
                for(int i=0; i<cortes.size(); i++)
                {
                    corteN.setIdentificacion(cortes.get(i).getIdentificacion());
                    corteDAO.setCorteid(corteN);
                    corteDAO.Eliminar();
                }
                
                cortes.clear();
                VNuevoCorte.getCmbModelos().setSelectedIndex(0);
                VNuevoCorte.getTxtObservaciones().setText("");
                VNuevoCorte.getTxtCantidadTalla().setText("");
                VNuevoCorte.getTxtCantidadColor().setText("");
                VNuevoCorte.getTblTallas().setModel(new DefaultTableModel());
                VNuevoCorte.getTblColores().setModel(new DefaultTableModel());
                pedidos=0;
                VNuevoCorte.getOpmNuevo().setSelectedIndex(0);
                VNuevoCorte.setVisible(false);
                VAdmi.getTblCorteXEntregar().setModel(admiDAO.mostrarCortes("cortesporentregar"));
                VAdmi.setVisible(true);
                VPrincipal.getMenu().setVisible(true);
            }
            
        }
        
        if(ae.getSource() == VNuevoCorte.getBtnGuardarSalir())
        {
            int resp = JOptionPane.showConfirmDialog(null, "¿Desea Guardar y Salir? \n" + (NumeroPedidos-pedidos) + " Cortes por registrar");
            
            if(resp == JOptionPane.YES_OPTION)
            {
                if(VNuevoCorte.getOpmNuevo().getSelectedIndex()==0)
                {
                    pdf.fichaTecnica(cortes);
                    
                    VNuevoCorte.getCmbModelos().setSelectedIndex(0);
                    VNuevoCorte.getTxtObservaciones().setText("");
                    VNuevoCorte.getTxtCantidadTalla().setText("");
                    VNuevoCorte.getTxtCantidadColor().setText("");
                    VNuevoCorte.getTblTallas().setModel(new DefaultTableModel());
                    VNuevoCorte.getTblColores().setModel(new DefaultTableModel());
                    VNuevoCorte.getOpmNuevo().setSelectedIndex(0);
                    java.awt.Color colorJAva = new java.awt.Color(238, 238, 238);
                    try {
                        pdf.abrirA();
                     } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, "Error al abrir Archivo: " + e);
                     }
                     VNuevoCorte.setVisible(false);
                     VAdmi.setVisible(true);
                     VPrincipal.getMenu().setVisible(true);
                     pedidos=0;
                     cortes.clear();
                }
                else if(VNuevoCorte.getOpmNuevo().getSelectedIndex()==1)
                {
                    JOptionPane.showMessageDialog(null, "No registro Tallas del Corte " + corteN.getIdentificacion() + "\nCorte No Registrado", "Aviso", JOptionPane.WARNING_MESSAGE);
                    corteDAO.Eliminar();
                    cortes.removeLast();
                    
                    pdf.fichaTecnica(cortes);
                    
                    VNuevoCorte.getCmbModelos().setSelectedIndex(0);
                    VNuevoCorte.getTxtObservaciones().setText("");
                    VNuevoCorte.getTxtCantidadTalla().setText("");
                    VNuevoCorte.getTxtCantidadColor().setText("");
                    VNuevoCorte.getTblTallas().setModel(new DefaultTableModel());
                    VNuevoCorte.getTblColores().setModel(new DefaultTableModel());
                    VNuevoCorte.getOpmNuevo().setSelectedIndex(0);
                    java.awt.Color colorJAva = new java.awt.Color(238, 238, 238);
                    try {
                        pdf.abrirA();
                     } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, "Error al abrir Archivo: " + e);
                     }
                     VNuevoCorte.setVisible(false);
                     VAdmi.setVisible(true);
                     VPrincipal.getMenu().setVisible(true);
                     pedidos=0;
                     cortes.clear();
                }
            }
        }
                        
        if(ae.getSource() == VModelo.getBtnOperaciones() || ae.getSource() == VModelo.getTxtConsultarOper())
        {
            Modelo modeloO = new Modelo();
            try {
                modeloO.setIdentificacion(Integer.parseInt(VModelo.getTxtConsultarOper().getText()));
            operacionDAO.setModelo(modeloO);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ID Invalido");
            }
            VModelo.getTblOperaciones().setModel(operacionDAO.SeleccionarV());
            VModelo.getLblTotal().setText(operacionDAO.OperacionesTotal());
            VModelo.getLblValor().setText(modeloDAO.ModeloValor(Integer.parseInt(VModelo.getTxtConsultarOper().getText())));
        }
        
        if(VModelo.getBtnEliminarOperacion() == ae.getSource())
        {
            try {
                Operacion id = new Operacion();
                id.setIdentificacion(Integer.parseInt(VModelo.getTblEliminarOperacion().getValueAt(VModelo.getTblEliminarOperacion().getSelectedRow(), 0).toString()));

                Modelo modelo = new Modelo();
                modelo.setIdentificacion(Integer.parseInt(VModelo.getTxtIdAct().getText()));
                operacionDAO.setModelo(modelo);
                operacionDAO.setOperacionN(id);
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Seleccione Operacion");
            }catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, "Ingrese ID de Modelo");
            }
            
            tempo.setLabel(VModelo.getLblEliminarOperacion());
            tempo.setMensaje(operacionDAO.Eliminar());
            Thread lblEliminar = new Thread(tempo);
            lblEliminar.start();
            VModelo.getTblEliminarOperacion().setModel(operacionDAO.EliminarOperacion());
            VModelo.getTblOperacionesAct().setModel(operacionDAO.SeleccionarV());
        }
        
        if(ae.getSource() == VModelo.getBtnAgrModelo())
        {
            Modelo modeloN = new Modelo();
            Proveedor proveedor = new Proveedor();
            
            proveedor.setIdentificacion(Integer.parseInt(VVerProveedor.getLblIDProv().getText()));
            
            modeloN.setIdentificacion(Integer.parseInt(VModelo.getTxtId().getText()));
            modeloN.setNombre(VModelo.getTxtNombre().getText());
            modeloN.setValor(Integer.parseInt(VModelo.getTxtPrecio().getText()));
            modeloN.setProveedor(proveedor);
            modeloDAO.setModeloN(modeloN);
            
            tempo.setVentana(VModelo);
            tempo.setLabel(VModelo.getLblNuevoModelo());
            tempo.setMensaje(modeloDAO.insertar());
            Thread lblRegistro = new Thread(tempo);
            lblRegistro.start();
            
            LinkedList operaciones = operacionDAO.ListaOperaciones();
            
            for(int i=0; i<operaciones.size(); i++)
            {
                VModelo.getCmbOperacionExi().addItem(operaciones.get(i).toString());
                VModelo.getCmbOperacionExiME().addItem(operaciones.get(i).toString());
                
            }
        }
        
        if(ae.getSource() == VModelo.getBtnAgrOperacionE())
        {
            Operacion operacionE = new Operacion();
            Modelo modeloO = new Modelo();
            
            String [] OperId = VModelo.getCmbOperacionExi().getSelectedItem().toString().split(" ");
            
            modeloO.setIdentificacion(Integer.parseInt(VModelo.getTxtId().getText()));
            operacionE.setIdentificacion(Integer.parseInt(OperId[0]));
            //JOptionPane.showMessageDialog(null, OperId[0]);
            modeloDAO.setOperacionN(operacionE);
            modeloDAO.setModeloN(modeloO);
            JOptionPane.showMessageDialog(null, modeloDAO.añadirOperacion());
            
        }
        
        if(ae.getSource() == VModelo.getBtnAgrOperacion() || ae.getSource() == VModelo.getTxtNuevaOperPrecio())
        {
            Modelo modeloON = new Modelo();
            Operacion operacionN = new Operacion();
            
            operacionN.setIdentificacion(Integer.parseInt(VModelo.getTxtNuevaOperId().getText()));
            operacionN.setDescripcion(VModelo.getTxtNuevaOperDesc().getText());
            operacionN.setValor(Integer.parseInt(VModelo.getTxtNuevaOperPrecio().getText()));
            
            modeloON.setIdentificacion(Integer.parseInt(VModelo.getTxtId().getText()));
            
            operacionDAO.setOperacionN(operacionN);
            operacionDAO.setModelo(modeloON);
            
            try {
                tempo.setVentana(VModelo);
                tempo.setLabel(VModelo.getLblNuevoModeloAgrOper());
                tempo.setMensaje(operacionDAO.insertar());
                Thread lblRegistro = new Thread(tempo);
                lblRegistro.start();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error rollback: " + ex);
            }
            
            VModelo.getTxtNuevaOperId().setText("");
            VModelo.getTxtNuevaOperDesc().setText("");
            VModelo.getTxtNuevaOperPrecio().setText(""); 
           
        }
        
        if(ae.getSource() == VModelo.getBtnNuevaOperacion())
        {
            VModelo.getPnlNuevaOper().setVisible(true);
            VModelo.getTxtNuevaOperId().setText(operacionDAO.idNuevaOperacion());
        }
        
        if(ae.getSource() == VModelo.getBtnModeloNListo())
        {
            VModelo.getTxtId().setText("");
            VModelo.getTxtNombre().setText("");
            VModelo.getTxtPrecio().setText("");
            VModelo.getTxtNuevaOperId().setText("");
            VModelo.getTxtNuevaOperDesc().setText("");
            VModelo.getTxtNuevaOperPrecio().setText("");
            VModelo.getCmbOperacionExi().setSelectedIndex(0);
            VModelo.getTxtId().setText(modeloDAO.idNuevoModelo());
        }
        
        if(ae.getSource() == VModelo.getBtnActualizarGeneral())
        {
            Modelo modeloA = new Modelo();
            
            modeloA.setIdentificacion(Integer.parseInt(VModelo.getTxtIdAct().getText()));
            modeloA.setValor(Integer.parseInt(VModelo.getTxtPrecioAct().getText()));
            
            modeloDAO.setModeloN(modeloA);
            
            tempo.setVentana(VModelo);
            tempo.setLabel(VModelo.getLblActModeloGeneral());
            tempo.setMensaje(modeloDAO.actualizar());
            Thread lblRegistro = new Thread(tempo);
            lblRegistro.start();
            
            operacionDAO.setModelo(modeloA);
            VModelo.getTblOperacionesAct().setModel(operacionDAO.SeleccionarV());
        }
        
        if(ae.getSource() == VModelo.getBtnActualizarOper())
        {
            Modelo modeloA = new Modelo();
            Operacion operacionA = new Operacion();
            
            modeloA.setIdentificacion(Integer.parseInt(VModelo.getTxtIdAct().getText()));
            modeloDAO.setModeloN(modeloA);
            
            operacionA.setIdentificacion(Integer.parseInt(VModelo.getTxtIdOperAct().getText()));
            operacionA.setDescripcion(VModelo.getTxtNombreOperAct().getText());
            operacionA.setValor(Integer.parseInt(VModelo.getTxtPrecioOperAct().getText()));
            operacionDAO.setOperacionN(operacionA);
            operacionDAO.setModelo(modeloA);
            
            
            tempo.setVentana(VModelo);
            tempo.setLabel(VModelo.getLblActModeloOper());
            tempo.setMensaje(operacionDAO.actualizar());
            Thread lblRegistro = new Thread(tempo);
            lblRegistro.start();
            
            VModelo.getTblOperacionesAct().setModel(operacionDAO.SeleccionarV());
            
            
        }
        
        
        if(ae.getSource() == VModelo.getTxtIdAct())
        {
            Modelo modeloA = new Modelo();
            modeloA.setIdentificacion(Integer.parseInt(VModelo.getTxtIdAct().getText()));
            modeloDAO.setModeloN(modeloA);
            operacionDAO.setModelo(modeloA);
            
            modeloA = modeloDAO.obtenerModelo();
            
            VModelo.getTxtNombreAct().setText(modeloA.getNombre());
            VModelo.getTxtPrecioAct().setText(String.valueOf(modeloA.getValor()));
            
            VModelo.getTblOperacionesAct().setModel(operacionDAO.SeleccionarV());
            
            VModelo.getCmbOperacionExiME().removeAllItems();
            
            LinkedList operaciones = operacionDAO.ListaOperaciones();
            
            for(int i=0; i<operaciones.size(); i++)
            {
                VModelo.getCmbOperacionExiME().addItem(operaciones.get(i).toString());   
            }
            
            VModelo.getTblEliminarOperacion().setModel(operacionDAO.EliminarOperacion());
            
        }
        
        if(ae.getSource() == VModelo.getTxtIdOperAct())
        {
            Operacion operacionA = new Operacion();
            Modelo modelo = new Modelo();
            modelo.setIdentificacion(Integer.parseInt(VModelo.getTxtIdAct().getText()));
            operacionA.setIdentificacion(Integer.parseInt(VModelo.getTxtIdOperAct().getText()));
            operacionDAO.setOperacionN(operacionA);
            operacionDAO.setModelo(modelo);
            
            operacionA = operacionDAO.obtenerOperacion();
            
            VModelo.getTxtNombreOperAct().setText(operacionA.getDescripcion());
            VModelo.getTxtPrecioOperAct().setText(String.valueOf(operacionA.getValor()));
        }
        
        
        
        if(ae.getSource() == VModelo.getBtnAgrOperacionNueva())
        {
            Operacion operacionE = new Operacion();
            Modelo modeloO = new Modelo();
            
            String [] OperId = VModelo.getCmbOperacionExiME().getSelectedItem().toString().split(" ");
            
            try {
                modeloO.setIdentificacion(Integer.parseInt(VModelo.getTxtIdAct().getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese ID de Modelo");
            }
            
            operacionE.setIdentificacion(Integer.parseInt(OperId[0]));
            //JOptionPane.showMessageDialog(null, OperId[0]);
            modeloDAO.setOperacionN(operacionE);
            modeloDAO.setModeloN(modeloO);
            //JOptionPane.showMessageDialog(null, modeloDAO.getOperacionN().getIdentificacion());
            tempo.setVentana(VModelo);
            tempo.setLabel(VModelo.getLblActModeloNuevaOper());
            tempo.setMensaje(modeloDAO.añadirOperacion());
            Thread lblRegistro = new Thread(tempo);
            lblRegistro.start();
            modeloDAO.cortesModeloActualizado();
            VModelo.getTblOperacionesAct().setModel(operacionDAO.SeleccionarV());
        }
        
        if(ae.getSource() == VModelo.getBtnNuevaOperacionME())
        {
            VModelo.getPnlNuevaOperAct().setVisible(true);
            VModelo.getTxtNuevaOperIdME().setText(operacionDAO.idNuevaOperacion());
        }
        
        if(ae.getSource() == VModelo.getBtnAgrOperacionME() || ae.getSource() == VModelo.getTxtNuevaOperPrecioME())
        {
            Modelo modeloON = new Modelo();
            Operacion operacionN = new Operacion();
            
            operacionN.setIdentificacion(Integer.parseInt(VModelo.getTxtNuevaOperIdME().getText()));
            operacionN.setDescripcion(VModelo.getTxtNuevaOperDescME().getText());
                        
            try {
                modeloON.setIdentificacion(Integer.parseInt(VModelo.getTxtIdAct().getText()));
                operacionN.setValor(Integer.parseInt(VModelo.getTxtNuevaOperPrecioME().getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese ID de Modelo o Ingrese un Precio Valido");
            }

            operacionDAO.setOperacionN(operacionN);
            operacionDAO.setModelo(modeloON);
            
            try {
                tempo.setVentana(VModelo);
                tempo.setLabel(VModelo.getLblActModeloNuevaOper());
                tempo.setMensaje(operacionDAO.insertar());
                Thread lblRegistro = new Thread(tempo);
                lblRegistro.start();
                modeloDAO.setModeloN(modeloON);
                modeloDAO.cortesModeloActualizado();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error rollback: " + ex);
            }
            
            VModelo.getTxtNuevaOperIdME().setText("");
            VModelo.getTxtNuevaOperDescME().setText("");
            VModelo.getTxtNuevaOperPrecioME().setText(""); 
           
            VModelo.getTblOperacionesAct().setModel(operacionDAO.SeleccionarV());
            VModelo.getPnlNuevaOperAct().setVisible(false);
        }
        
        
        if(ae.getSource() == VPrincipal.getOpmSalir())
        {
            int resP = JOptionPane.showConfirmDialog(VPrincipal, "¿Desea terminar ejecucion?", "Salir", JOptionPane.YES_NO_OPTION);
            
            if(resP== JOptionPane.YES_NO_OPTION)
            {
                hilo.stop();
                VPrincipal.dispose();
            }
        }
        
        if(ae.getSource() == VPrincipal.getOpmNominaU())
        {
            VPrincipal.setMinimumSize(new Dimension(1110, 751));
            VNomina.setVisible(true);
            
            LinkedList<Operario> operarios = operarioDAO.listaOperarios();
            
            for(int i=0; i<operarios.size(); i++)
            {
                VNomina.getCmbOperarios().addItem(operarios.get(i).toString());
            }
            
            VCortes.setVisible(true);
            VAdmi.setVisible(false);
            VPrincipal.getMenu().setVisible(false);
            VCortes.getTblCortes().setModel(admiDAO.mostrarCortes("cortesEntregadosPagados"));
        }
        
        if(VPrincipal.getOpmNominaC() == ae.getSource())
        {
            VNominaC.setVisible(true);
            VAdmi.setVisible(false);
            VPrincipal.getMenu().setVisible(false);
            VNominaC.getTblCortes().setModel(admiDAO.mostrarCortes("cortesEntregadosPagados"));
        }
        
        if(ae.getSource() == VNomina.getBtnBuscar())
        {
            Operario operarioV = new Operario();
            
            String idO[] = VNomina.getCmbOperarios().getSelectedItem().toString().split(" ");
            
            try {
                operarioV.setIdentificacion(idO[0]);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese ID Valido");
            }
            
            operarioDAO.setObjOperario(operarioV);
            
            if(VNomina.getCmbOperarios().getSelectedItem().toString().equalsIgnoreCase("Seleccione"))
            {
                JOptionPane.showMessageDialog(null, "Seleccion ID de Operario");
                VNomina.getTblTareas().setModel(new DefaultTableModel());
                VNomina.getLblPagoNeto().setText("");
                VNomina.getCmbOperarios().setBackground(java.awt.Color.GRAY);
                VNomina.getTxtI1().setCaretColor(java.awt.Color.white);
                VNomina.getTxtI2().setCaretColor(java.awt.Color.white);
            }
            else if(Integer.parseInt(VNomina.getTxtI1().getText())>Integer.parseInt(VNomina.getTxtI2().getText()))
            {
                JOptionPane.showMessageDialog(null, "Intervalos Invalidos: " + VNomina.getTxtI1().getText() + " > " + VNomina.getTxtI2().getText() );
                VNomina.getTxtI1().setCaretColor(java.awt.Color.gray);
                VNomina.getTxtI2().setCaretColor(java.awt.Color.gray);
            }
            else if(corteDAO.validarCortesEntregados(Integer.parseInt(VNomina.getTxtI1().getText())).equals("0") || corteDAO.validarCortesEntregados(Integer.parseInt(VNomina.getTxtI2().getText())).equals("0"))            
            {
                JOptionPane.showMessageDialog(null, "Cortes No Entregados...");
                VNomina.getTxtI1().setText("");
                VNomina.getTxtI2().setText("");
            }
            else
            {
                try {
                    VNomina.getTblTareas().setModel(corteDAO.GeneralNomina(Integer.parseInt(operarioV.getIdentificacion()), Integer.parseInt(VNomina.getTxtI1().getText()), Integer.parseInt(VNomina.getTxtI2().getText())));
                    VNomina.getLblPagoNeto().setText(corteDAO.pagoNeto(Integer.parseInt(operarioV.getIdentificacion()), Integer.parseInt(VNomina.getTxtI1().getText()), Integer.parseInt(VNomina.getTxtI2().getText())));
                    
                    
                } catch (NumberFormatException e) { 
                    JOptionPane.showMessageDialog(VAdmi, "Datos Invalidos");
                }
                
            }
        }
        
        if(VNominaC.getBtnGenerar()== ae.getSource())
        {
            LinkedList<Operario> operarios = new LinkedList<>();
            LinkedList<Corte> cortes = new LinkedList<>();
            
            Corte cor[] = new Corte[lista.size()];
            
            for(int i=1; i<lista.size(); i++)
            {
                Corte corte = new Corte();
                corte.setIdentificacion(Integer.parseInt(lista.get(i).toString()));
                cor[i] = corte;
            }
                        
            for(int i=1; i<cor.length; i++)
            {
                Corte corte = new Corte();
                corte.setIdentificacion(Integer.parseInt(lista.get(i).toString()));
                cortes.add(cor[i]);
            }
            
            String binarios = "";
                
            for (int j = 0; j < cortes.size(); j++) 
            {
                String o[] = corteDAO.OperariosNominaC(cortes.get(j).getIdentificacion()).split(" ");

                if (!(o[0].equals(""))) 
                {
                    binarios += "1";
                    for (int i = 0; i < o.length; i += 2) 
                    {
                        Operario OperarioN = new Operario();
                        OperarioN.setIdentificacion(o[i]);
                        OperarioN.setNombre(o[i + 1]);
                        OperarioN.setSueldo(Integer.parseInt(corteDAO.pagoNeto(Integer.parseInt(OperarioN.getIdentificacion()), cortes)));
                        operarios.add(OperarioN);
                    }
                } else 
                {
                    binarios += "0";
                    JOptionPane.showMessageDialog(null, "No ha Asignado Tareas en el Corte #" + cortes.get(j).getIdentificacion());
                }

            }

            int insumos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Insumos"));
            
            DefaultTableModel ganancias = corteDAO.SeleccionarGananciasC(cortes, insumos);
            
            if (binarios.contains("1")) 
            {
                pdf.crear_PDFNominaC(operarios, cortes, ganancias);
                pdf.abrir();
            }

            VNominaC.getListaCortes().setModel(new DefaultListModel<>());
            VNominaC.setVisible(false);
            VPrincipal.getMenu().setVisible(true);
            VAdmi.setVisible(true);
            //}
            
        }
        
        if(ae.getSource() == VNominaC.getBtnSalir())
        {
            VPrincipal.getMenu().setVisible(true);
            VAdmi.setVisible(true);
            VNominaC.setVisible(false);
        }
        
        if(ae.getSource() == VNomina.getBtnSalir())
        {
            VNomina.setVisible(false);
            VCortes.setVisible(false);
            VNomina.getCmbOperarios().setSelectedIndex(0);
            VNomina.getCmbOperarios().removeAllItems();
            VNomina.getTxtI1().setText("");
            VNomina.getTxtI2().setText("");
            VNomina.getTblTareas().setModel(new DefaultTableModel());
            VAdmi.setVisible(true);
            VAdmi.setVisible(true);
            VPrincipal.getMenu().setVisible(true);
        }
        
        
        if(ae.getSource() == VCortes.getBtlSalir())
        {
            VCortes.setVisible(false);
        }
        
        if(ae.getSource() == VAdmi.getBtnEntregar())
        {
            try {
                VEntregarCorte.getTxtIdCorte().setText(String.valueOf(VAdmi.getTblCorteXEntregar().getValueAt(VAdmi.getTblCorteXEntregar().getSelectedRow(), 0)));
                VEntregarCorte.getTxtCantidad().setText(String.valueOf(VAdmi.getTblCorteXEntregar().getValueAt(VAdmi.getTblCorteXEntregar().getSelectedRow(), 3)));
            } catch (ArrayIndexOutOfBoundsException e) {
                VEntregarCorte.getTxtIdCorte().setText("");
                VEntregarCorte.getTxtCantidad().setText("");
            }
            
            VEntregarCorte.setVisible(true);
            VPrincipal.setMinimumSize(new Dimension(960, 732)); //x,y
            
        }
        
        if(ae.getSource() == VAdmi.getBtnEntregarP())
        {
            try {
                VEntregarCortePendiente.getTxtIdCorte().setText(String.valueOf(VAdmi.getTblCortesPendientes().getValueAt(VAdmi.getTblCortesPendientes().getSelectedRow(), 0)));
            } catch (ArrayIndexOutOfBoundsException e) {
                VEntregarCortePendiente.getTxtIdCorte().setText("");
            }
            
            VEntregarCortePendiente.setVisible(true);
            VPrincipal.setMinimumSize(new Dimension(1120, 732)); //x,y
            VEntregarCortePendiente.getTxtCantidad().setText("0");

        }
        
        if(ae.getSource() == VEntregarCortePendiente.getTxtIdCorte())
        {
            Corte corte = new Corte();
            corte.setIdentificacion(Integer.parseInt(VEntregarCortePendiente.getTxtIdCorte().getText()));
            corteDAO.setCorteid(corte);
            
            int cantidad = corteDAO.cantidadPendientes();
            if(cantidad==0)
            {
                VEntregarCortePendiente.getBtnEntregar().setEnabled(false);
                VEntregarCortePendiente.getBtnEntregarPagar().setEnabled(false);
            }
            else
            {
                VEntregarCortePendiente.getBtnEntregar().setEnabled(true);
                VEntregarCortePendiente.getBtnEntregarPagar().setEnabled(true);
            }
            VEntregarCortePendiente.getTblHistorialCortePendiente().setModel(corteDAO.cortePendiente());
            VEntregarCortePendiente.getTblHistorialGeneral().setModel(corteDAO.cortePendienteGeneral());
        }
        
        if(VEntregarCortePendiente.getBtnPagar() == ae.getSource())
        {
            Corte corte = new Corte();
            corte.setIdentificacion(Integer.parseInt(VEntregarCortePendiente.getTxtIdCorte().getText()));
            corteDAO.setCorteid(corte);
            
            tempo.setLabel(VEntregarCortePendiente.getLblMensaje());
            tempo.setMensaje(corteDAO.pagarCorte());
            Thread lblPagar = new Thread(tempo);
            lblPagar.start();
            
            VAdmi.getTblCortesPendientes().setModel(admiDAO.mostrarCortes("cortespendientes"));
        }
        
        if(ae.getSource() == VEntregarCorte.getBtnEntregar())
        {
            String Tipo = "";
            try {
                Corteid.setIdentificacion(Integer.parseInt(VEntregarCorte.getTxtIdCorte().getText()));
                Corteid.setCantidad(Integer.parseInt(VEntregarCorte.getTxtCantidad().getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese solo Numeros");
            }
            corteDAO.setCorteid(Corteid);
            
            tempo.setLabel(VEntregarCorte.getLblMensaje());
            tempo.setMensaje(corteDAO.EntregarCorte());
            Thread lblRegistro = new Thread(tempo);
            lblRegistro.start();
            
            VAdmi.getTblCorteXEntregar().setModel(admiDAO.mostrarCortes("CortesPorEntregar"));
            VAdmi.getTblCortesEntregados().setModel(admiDAO.mostrarCortes("CortesEntregados"));
            VAdmi.getTblCortesPendientes().setModel(admiDAO.mostrarCortes("CortesPendientes"));
            VAdmi.getTblCorteXPagar().setModel(admiDAO.mostrarCortes("cortesentregadossinpagar"));
            VEntregarCorte.getTxtIdCorte().setText("");
            VEntregarCorte.getTxtCantidad().setText("");
        }
        
        if(ae.getSource() == VEntregarCortePendiente.getBtnEntregar())
        {
            try {
                Corteid.setIdentificacion(Integer.parseInt(VEntregarCortePendiente.getTxtIdCorte().getText()));
                Corteid.setCantidad(Integer.parseInt(VEntregarCortePendiente.getTxtCantidad().getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese ID Valido o Cantidad Valida" );
            }
            corteDAO.setCorteid(Corteid);
            
            tempo.setLabel(VEntregarCortePendiente.getLblMensaje());
            tempo.setMensaje(corteDAO.EntregarCortePendiente());
            Thread lblEntregar = new Thread(tempo);
            lblEntregar.start();
            
            VAdmi.getTblCorteXEntregar().setModel(admiDAO.mostrarCortes("CortesPorEntregar"));      
            VAdmi.getTblCortesEntregados().setModel(admiDAO.mostrarCortes("CortesEntregados"));
            VAdmi.getTblCortesPendientes().setModel(admiDAO.mostrarCortes("CortesPendientes"));
            VEntregarCortePendiente.getTblHistorialCortePendiente().setModel(corteDAO.cortePendiente());
            VEntregarCortePendiente.getTblHistorialGeneral().setModel(corteDAO.cortePendienteGeneral());
        }
        
        if(ae.getSource() == VEntregarCortePendiente.getBtnEntregarPagar())
        {
            try {
                Corteid.setIdentificacion(Integer.parseInt(VEntregarCortePendiente.getTxtIdCorte().getText()));
                Corteid.setCantidad(Integer.parseInt(VEntregarCortePendiente.getTxtCantidad().getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese ID Valido o Cantidad Valida" );
            }
            
            corteDAO.setCorteid(Corteid);
            
            try {
                tempo.setLabel(VEntregarCortePendiente.getLblMensaje());
                tempo.setMensaje(corteDAO.EntregaryPagarPendiente());
                Thread lblEntregar = new Thread(tempo);
                lblEntregar.start();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: rollBack " + ex);
            }
            
            VAdmi.getTblCorteXEntregar().setModel(admiDAO.mostrarCortes("CortesPorEntregar"));      
            VAdmi.getTblCortesEntregados().setModel(admiDAO.mostrarCortes("CortesEntregados"));
            VAdmi.getTblCortesPendientes().setModel(admiDAO.mostrarCortes("CortesPendientes"));
            VAdmi.getTblCorteXPagar().setModel(admiDAO.mostrarCortes("cortesentregadossinpagar"));
            VEntregarCortePendiente.getTblHistorialCortePendiente().setModel(corteDAO.cortePendiente());
            VEntregarCortePendiente.getTblHistorialGeneral().setModel(corteDAO.cortePendienteGeneral());
        }
        
        if(ae.getSource() == VEntregarCorte.getBtnSalir())
        {
            VEntregarCorte.setVisible(false);
            VPrincipal.setMinimumSize(new Dimension(665, 732));
        }
        
        if(ae.getSource() == VEntregarCortePendiente.getBtnSalir())
        {
            VEntregarCortePendiente.setVisible(false);
            VEntregarCortePendiente.getTxtIdCorte().setText("");
            VEntregarCortePendiente.getTxtCantidad().setText("");
            VEntregarCortePendiente.getTblHistorialCortePendiente().setModel(new DefaultTableModel());
            VEntregarCortePendiente.getTblHistorialGeneral().setModel(new DefaultTableModel());
        }
        
        
        /*if(ae.getSource() == VCorte.getRbtnID())
        {
            VCorte.getRbtnFecha().setSelected(false);
            VCorte.getTxtFechaI().setEnabled(false);
            VCorte.getTxtFechaF().setEnabled(false);
            VCorte.getTxtIdCorte().setEnabled(true);
            VCorte.getTxtIdCorte2().setEnabled(true);
        }
        
        if(ae.getSource() == VCorte.getRbtnFecha())
        {
            VCorte.getRbtnID().setSelected(false);
            VCorte.getTxtIdCorte().setEnabled(false);
            VCorte.getTxtIdCorte2().setEnabled(false);
            VCorte.getTxtFechaI().setEnabled(true);
            VCorte.getTxtFechaF().setEnabled(true);
        }*/
        
        if(VAdmi.getTxtEliminarCorte() == ae.getSource())
        {
            int Resp =JOptionPane.showConfirmDialog(null, "Desea Eliminar el Corte " + VAdmi.getTxtEliminarCorte().getText(), "Eliminar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(Resp==JOptionPane.YES_OPTION)
            {
                Corteid.setIdentificacion(Integer.parseInt(VAdmi.getTxtEliminarCorte().getText()));
                corteDAO.setCorteid(Corteid);
                tempo.setLabel(VAdmi.getLblElliminarCorte());
                tempo.setMensaje(corteDAO.Eliminar());
                Thread lblEliminacion = new Thread(tempo);
                lblEliminacion.start();

            }
            
            VAdmi.getTxtEliminarCorte().setText("");
        }
        
        /*if(VAdmi.isSelected())
        {
           VEntregarCorte.setVisible(false);
        }*/
        
        /*if(VCorte.getBtnGananciasC() == ae.getSource())
        {
            LinkedList<Corte> cortes = new LinkedList<>();
            
            Corte corte1 = new Corte();
            Corte corte2 = new Corte();
            Corte corte3 = new Corte();
            
            corte1.setIdentificacion(10);
            corte2.setIdentificacion(11);
            corte3.setIdentificacion(12);
            
            cortes.add(corte1);
            cortes.add(corte2);
            cortes.add(corte3);
            
            VCorte.getTblConsultas().setModel(corteDAO.SeleccionarGananciasC(cortes, 40000));
        }*/
        
        if(ae.getSource() == VPrincipal.getjMenu6())
        {
            JOptionPane.showMessageDialog(null, VPrincipal.getjMenu6().getItem(1));
        }
    }
    

    @Override
    public void run()
    {   
        while(true)
        {
            VPrincipal.getLblFecha().setText(fecha.toString());
            fecha.reloj();
            try
            {
                Thread.sleep(1000);
            }catch(InterruptedException ex)
            {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        if(me.getSource() == VModelo.getTblModelos())
        {
            Object modelo_id = VModelo.getTblModelos().getValueAt(VModelo.getTblModelos().getSelectedRow(), 0);
            
            Modelo modeloO = new Modelo();
            try {
                modeloO.setIdentificacion(Integer.parseInt(String.valueOf(modelo_id)));
            operacionDAO.setModelo(modeloO);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ID Invalido");
            }
            VModelo.getTblOperaciones().setModel(operacionDAO.SeleccionarV());
            VModelo.getLblTotal().setText(operacionDAO.OperacionesTotal());
            VModelo.getLblValor().setText(modeloDAO.ModeloValor(Integer.parseInt(String.valueOf(modelo_id))));
        }
        
        if(me.getSource() == VAdmi.getTblCorteXPagar())
        {
            VAdmi.getTxtPagar().setText(String.valueOf(VAdmi.getTblCorteXPagar().getValueAt(VAdmi.getTblCorteXPagar().getSelectedRow(), 0)));
        }
        
        if(me.getSource() == VNominaC.getTblCortes())
        {
            Object dato = VNominaC.getTblCortes().getValueAt(VNominaC.getTblCortes().getSelectedRow(), 0);
                    
            if(lista.getSize()==0)
            {
                lista.setSize(1);
            }
            
            boolean bandera = true;
            
            for(int i=0; i<lista.size(); i++)
            {
                if(dato.equals(lista.get(i)))
                {
                    bandera = false;
                }   
            }
            
            if(bandera)
            {
                lista.addElement(dato);
                VNominaC.getListaCortes().setModel(lista);
            }        
        }
        
        if(me.getSource() == VCorte.getTblCortes())
        {
            Object dato = VCorte.getTblCortes().getValueAt(VCorte.getTblCortes().getSelectedRow(), 0);
                    
            if(lista1.getSize()==0)
            {
                lista1.setSize(1);
            }
            
            boolean bandera = true;
            
            for(int i=0; i<lista1.size(); i++)
            {
                if(dato.equals(lista1.get(i)))
                {
                    bandera = false;
                }   
            }
            
            if(bandera)
            {
                lista1.addElement(dato);
                VCorte.getListaCortes().setModel(lista1);
            }
        }
        
        if(me.getSource() == VNominaC.getListaCortes())
        {
            Object dato = VNominaC.getListaCortes().getSelectedValue();
            int indice = VNominaC.getListaCortes().getSelectedIndex();
            
            int resp = JOptionPane.showConfirmDialog(null, "¿Elimar el Corte: " + dato + "?");
            if(resp == JOptionPane.YES_OPTION)
            {
                lista.remove(indice);
                VNominaC.getListaCortes().setModel(lista);
            }
        }
        
        if(me.getSource() == VCorte.getListaCortes())
        {
            Object dato = VCorte.getListaCortes().getSelectedValue();
            int indice = VCorte.getListaCortes().getSelectedIndex();
            
            int resp = JOptionPane.showConfirmDialog(null, "¿Elimar el Corte: " + dato + "?");
            if(resp == JOptionPane.YES_OPTION)
            {
                lista1.remove(indice);
                VCorte.getListaCortes().setModel(lista1);
            }
        }
        
    }
    
    public void agregarContactoTabla(Object id, JList lista) //metodo que agregra nuevo contacto en la tabla.
    {
        Object dato = id; //crear arreglo o vector con la informacion de la persona.
        DefaultListModel plantilla = (DefaultListModel) lista.getModel();  
        plantilla.addElement(dato);
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
        if(SwingUtilities.isLeftMouseButton(me))
        {
            
        }
        else
        {
            if(SwingUtilities.isRightMouseButton(me))
            {
                Point p = me.getPoint();
                int rowNumber = VAdmi.getTblCorteXEntregar().rowAtPoint(p);
                ListSelectionModel modelo = VAdmi.getTblCorteXEntregar().getSelectionModel();
                modelo.setSelectionInterval(rowNumber, rowNumber);
                
                String v[] = {"Entregar", "Entregar y Pagar", "Cancelar"};
                
                switch(JOptionPane.showOptionDialog(VAdmi, "                              Seleccione opcion", "ThreadSoft", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, v, v[0]))
                {
                    case 0:

                        try {
                            Corteid.setIdentificacion(Integer.parseInt(String.valueOf(VAdmi.getTblCorteXEntregar().getValueAt(VAdmi.getTblCorteXEntregar().getSelectedRow(), 0))));
                            Corteid.setCantidad(Integer.parseInt(String.valueOf(VAdmi.getTblCorteXEntregar().getValueAt(VAdmi.getTblCorteXEntregar().getSelectedRow(), 3))));
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Ingrese solo Numeros");
                        }
                        corteDAO.setCorteid(Corteid);

                        tempo.setLabel(VAdmi.getLblMensaje());
                        tempo.setMensaje(corteDAO.EntregarCorte());
                        Thread lblMensaje = new Thread(tempo);
                        lblMensaje.start();

                        VAdmi.getTblCorteXEntregar().setModel(admiDAO.mostrarCortes("CortesPorEntregar"));
                        VAdmi.getTblCortesEntregados().setModel(admiDAO.mostrarCortes("CortesEntregados"));
                        VAdmi.getTblCortesPendientes().setModel(admiDAO.mostrarCortes("CortesPendientes"));
                        VAdmi.getTblCorteXPagar().setModel(admiDAO.mostrarCortes("cortesentregadossinpagar"));

                        break;

                    case 1:
                        
                        try {
                            Corteid.setIdentificacion(Integer.parseInt(String.valueOf(VAdmi.getTblCorteXEntregar().getValueAt(VAdmi.getTblCorteXEntregar().getSelectedRow(), 0))));
                            Corteid.setCantidad(Integer.parseInt(String.valueOf(VAdmi.getTblCorteXEntregar().getValueAt(VAdmi.getTblCorteXEntregar().getSelectedRow(), 3))));
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Ingrese solo Numeros");
                        }
                        corteDAO.setCorteid(Corteid);

                        try {

                            tempo.setLabel(VAdmi.getLblMensaje());
                            tempo.setMensaje(corteDAO.EntregaryPagar());
                            Thread lblRegistro = new Thread(tempo);
                            lblRegistro.start();

                            VAdmi.getTblCorteXPagar().setModel(admiDAO.mostrarCortes("cortesentregadossinpagar"));
                            VAdmi.getTblCorteXEntregar().setModel(admiDAO.mostrarCortes("cortesporentregar"));
                            VAdmi.getTblCortesPendientes().setModel(admiDAO.mostrarCortes("cortespendientes"));
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, "Error: rollBack" + e);
                        }
                        break;

                    case 2:
                        
                        JOptionPane.showMessageDialog(null, "Cancelo");

                        break;

                    default:

                        break;
                }
                
            }
        }
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    
    public LinkedList<Corte> listaCortes()
    {
        LinkedList<Corte> cortes = new LinkedList<>();
            
            Corte cor[] = new Corte[lista1.size()];
            
            for(int i=1; i<lista1.size(); i++)
            {
                Corte corte = new Corte();
                corte.setIdentificacion(Integer.parseInt(lista1.get(i).toString()));
                cortes.add(corte);
            }
            
            return cortes;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
        if(ke.getSource() == VTareas.getTxtFiltro())
        {   
            VTareas.getCmbTareasD().removeAllItems();
            String corte[] = VTareas.getCmbCortes().getSelectedItem().toString().split(" ");
            
            LinkedList<Tarea> tareas = operacionDAO.filtrar(Integer.parseInt(corte[0]), VTareas.getTxtFiltro().getText());
            
            for (int i = 0; i < tareas.size(); i++) 
            {
                VTareas.getCmbTareasD().addItem(tareas.get(i).toString());
            }
        }
        
        if(ke.getSource() == VModelo.getTxtFiltrarOperacionN())
        {
            VModelo.getCmbOperacionExi().removeAllItems();
            
            LinkedList<Operacion> operaciones = operacionDAO.buscarOperacion(VModelo.getTxtFiltrarOperacionN().getText());
            
            for(int i=0; i<operaciones.size(); i++)
            {
                VModelo.getCmbOperacionExi().addItem(operaciones.get(i).toString());
            }
        }
        
        if(ke.getSource() == VModelo.getTxtFiltrarOperacionA())
        {
            VModelo.getCmbOperacionExiME().removeAllItems();
            
            LinkedList<Operacion> operaciones = operacionDAO.buscarOperacion(VModelo.getTxtFiltrarOperacionA().getText());
            
            for(int i=0; i<operaciones.size(); i++)
            {
                VModelo.getCmbOperacionExiME().addItem(operaciones.get(i).toString());
            }
        }
        
        if(ke.getSource() == VModelo.getTblModelos())
        {
            Object modelo_id = VModelo.getTblModelos().getValueAt(VModelo.getTblModelos().getSelectedRow(), 0);
            
            Modelo modeloO = new Modelo();
            try {
                modeloO.setIdentificacion(Integer.parseInt(String.valueOf(modelo_id)));
            operacionDAO.setModelo(modeloO);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ID Invalido");
            }
            VModelo.getTblOperaciones().setModel(operacionDAO.SeleccionarV());
            VModelo.getLblTotal().setText(operacionDAO.OperacionesTotal());
            VModelo.getLblValor().setText(modeloDAO.ModeloValor(Integer.parseInt(String.valueOf(modelo_id))));
        }
        
    }
}

// Obtener texto de un cmb String filtro = ((JTextComponent) ((JComboBox) ((Component) ke.getSource()).getParent()).getEditor().getEditorComponent()).getText(); 