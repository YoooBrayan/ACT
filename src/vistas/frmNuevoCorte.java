package vistas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import modelos.Fecha;
import javax.swing.JTextArea;
import org.jdesktop.swingx.JXDatePicker;
/**
 *
 * @author YO
 */
public class frmNuevoCorte extends javax.swing.JInternalFrame implements Observer{

    
    Fecha fechaEntrada;
    /**
     * Creates new form frmCorte
     * @param FE
     */
    public frmNuevoCorte(Fecha FE) {
        initComponents();
        this.fechaEntrada = FE;

    }
    
    public frmNuevoCorte() {
        initComponents();
    }

    public JPanel getPnlNuevo() {
        return pnlNuevo;
    }

    public JLabel getLblIDProveedor() {
        return lblIDProveedor;
    }

    public void setLblIDProveedor(JLabel lblIDProveedor) {
        this.lblIDProveedor = lblIDProveedor;
    }

    public JTextArea getTxtObservaciones() {
        return txtObservaciones;
    }

    public void setTxtObservaciones(JTextArea txtObservaciones) {
        this.txtObservaciones = txtObservaciones;
    }

    public JComboBox<String> getCmbRepresentantes() {
        return cmbRepresentantes;
    }

    public void setCmbRepresentantes(JComboBox<String> cmbRepresentantes) {
        this.cmbRepresentantes = cmbRepresentantes;
    }

    public JButton getBtnAgrColor() {
        return btnAgrColor;
    }

    public void setBtnAgrColor(JButton btnAgrColor) {
        this.btnAgrColor = btnAgrColor;
    }

    public JButton getBtnAgrTalla() {
        return btnAgrTalla;
    }

    public void setBtnAgrTalla(JButton btnAgrTalla) {
        this.btnAgrTalla = btnAgrTalla;
    }

    public JButton getBtnRegistrarCorte() {
        return btnRegistrarCorte;
    }

    public void setBtnRegistrarCorte(JButton btnRegistrarCorte) {
        this.btnRegistrarCorte = btnRegistrarCorte;
    }

    public JComboBox<String> getCmbAgrColor() {
        return cmbAgrColor;
    }

    public void setCmbAgrColor(JComboBox<String> cmbAgrColor) {
        this.cmbAgrColor = cmbAgrColor;
    }

    public JComboBox<String> getCmbAgrTalla() {
        return cmbAgrTalla;
    }

    public void setCmbAgrTalla(JComboBox<String> cmbAgrTalla) {
        this.cmbAgrTalla = cmbAgrTalla;
    }

    public JComboBox<String> getCmbModelos() {
        return cmbModelos;
    }

    public void setCmbModelos(JComboBox<String> cmbModelos) {
        this.cmbModelos = cmbModelos;
    }

    public JLabel getLblRegistro() {
        return lblRegistro;
    }

    public void setLblRegistro(JLabel lblRegistro) {
        this.lblRegistro = lblRegistro;
    }

    public JTabbedPane getOpmNuevo() {
        return opmNuevo;
    }

    public void setOpmNuevo(JTabbedPane opmNuevo) {
        this.opmNuevo = opmNuevo;
    }

    public JTable getTblColores() {
        return tblColores;
    }

    public void setTblColores(JTable tblColores) {
        this.tblColores = tblColores;
    }

    public JTable getTblTallas() {
        return tblTallas;
    }

    public void setTblTallas(JTable tblTallas) {
        this.tblTallas = tblTallas;
    }

    public JTextField getTxtCodigo() {
        return txtCodigo;
    }

    public void setTxtCodigo(JTextField txtCodigo) {
        this.txtCodigo = txtCodigo;
    }

    public JButton getBtnGuardarSalir() {
        return btnGuardarSalir;
    }

    public void setBtnGuardarSalir(JButton btnGuardarSalir) {
        this.btnGuardarSalir = btnGuardarSalir;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    
    
    public JTextField getTxtCantidadColor() {
        return txtCantidadColor;
    }

    public void setTxtCantidadColor(JTextField txtCantidadColor) {
        this.txtCantidadColor = txtCantidadColor;
    }

    public JTextField getTxtCantidadTalla() {
        return txtCantidadTalla;
    }

    public void setTxtCantidadTalla(JTextField txtCantidadTalla) {
        this.txtCantidadTalla = txtCantidadTalla;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public Fecha getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Fecha fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }


    public JPanel getPnlAdicionales() {
        return pnlAdicionales;
    }

    public JButton getBtnEliminarTalla() {
        return btnEliminarTalla;
    }

    public void setBtnEliminarTalla(JButton btnEliminar) {
        this.btnEliminarTalla = btnEliminar;
    }

    public JButton getBtnEliminarColor() {
        return btnEliminarColor;
    }

    public void setBtnEliminarColor(JButton btnEliminarColor) {
        this.btnEliminarColor = btnEliminarColor;
    }

    public JLabel getLblcorte() {
        return lblcorte;
    }

    public void setLblcorte(JLabel lblcorte) {
        this.lblcorte = lblcorte;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegistro = new javax.swing.JLabel();
        opmNuevo = new javax.swing.JTabbedPane();
        pnlNuevo = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        cmbModelos = new javax.swing.JComboBox<>();
        btnRegistrarCorte = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        lblcorte = new javax.swing.JLabel();
        cmbFechaEnvio = new org.jdesktop.swingx.JXDatePicker();
        cmbFechaEntrega = new org.jdesktop.swingx.JXDatePicker();
        pnlAdicionales = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbAgrColor = new javax.swing.JComboBox<>();
        btnAgrColor = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cmbAgrTalla = new javax.swing.JComboBox<>();
        btnAgrTalla = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTallas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblColores = new javax.swing.JTable();
        txtCantidadColor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCantidadTalla = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEliminarTalla = new javax.swing.JButton();
        btnEliminarColor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblIDProveedor = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmbRepresentantes = new javax.swing.JComboBox<>();
        btnGuardarSalir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        lblRegistro.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        lblRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        opmNuevo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel28.setText("Ingrese Datos del Corte #");

        jLabel29.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel29.setText("Codigo");

        jLabel30.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel30.setText("Modelo");

        txtCodigo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N

        cmbModelos.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        cmbModelos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        btnRegistrarCorte.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        btnRegistrarCorte.setText("Registrar");

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel5.setText("Fecha de Envio");

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel6.setText("Fecha de Entrega");

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        txtObservaciones.setRows(5);
        txtObservaciones.setAutoscrolls(false);
        jScrollPane3.setViewportView(txtObservaciones);

        jLabel15.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel15.setText("Observaciones");

        lblcorte.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N

        cmbFechaEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFechaEnvioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNuevoLayout = new javax.swing.GroupLayout(pnlNuevo);
        pnlNuevo.setLayout(pnlNuevoLayout);
        pnlNuevoLayout.setHorizontalGroup(
            pnlNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevoLayout.createSequentialGroup()
                .addGroup(pnlNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNuevoLayout.createSequentialGroup()
                        .addGroup(pnlNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNuevoLayout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(btnRegistrarCorte))
                            .addGroup(pnlNuevoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cmbFechaEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlNuevoLayout.createSequentialGroup()
                                    .addGap(149, 149, 149)
                                    .addComponent(jLabel28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblcorte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlNuevoLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(128, 128, 128)
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmbModelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlNuevoLayout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jLabel15)))
                        .addGap(0, 75, Short.MAX_VALUE))
                    .addGroup(pnlNuevoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        pnlNuevoLayout.setVerticalGroup(
            pnlNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(lblcorte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(cmbModelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbFechaEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btnRegistrarCorte)
                .addGap(19, 19, 19))
        );

        opmNuevo.addTab("Nuevo", pnlNuevo);

        pnlAdicionales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel2.setText("Seleccione Color");

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel8.setText("Adicionar Colores Y Tallas");

        cmbAgrColor.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        cmbAgrColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        btnAgrColor.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        btnAgrColor.setText("Agregar");

        jLabel9.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel9.setText("Seleccione Talla");

        cmbAgrTalla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        cmbAgrTalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        btnAgrTalla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        btnAgrTalla.setText("Agregar");

        tblTallas.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        tblTallas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTallas);

        tblColores.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        tblColores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblColores);

        txtCantidadColor.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel1.setText("Cantidad");

        txtCantidadTalla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel3.setText("Cantidad");

        btnGuardar.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        btnGuardar.setText("Guardar");

        btnEliminarTalla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        btnEliminarTalla.setText("Eliminar");

        btnEliminarColor.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        btnEliminarColor.setText("Eliminar");

        javax.swing.GroupLayout pnlAdicionalesLayout = new javax.swing.GroupLayout(pnlAdicionales);
        pnlAdicionales.setLayout(pnlAdicionalesLayout);
        pnlAdicionalesLayout.setHorizontalGroup(
            pnlAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdicionalesLayout.createSequentialGroup()
                .addGroup(pnlAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdicionalesLayout.createSequentialGroup()
                        .addGroup(pnlAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAdicionalesLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel8))
                            .addGroup(pnlAdicionalesLayout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(btnGuardar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlAdicionalesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAdicionalesLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cmbAgrColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCantidadColor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgrColor))
                            .addGroup(pnlAdicionalesLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(cmbAgrTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCantidadTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgrTalla))
                            .addGroup(pnlAdicionalesLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarTalla))
                            .addGroup(pnlAdicionalesLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarColor)))))
                .addContainerGap())
        );
        pnlAdicionalesLayout.setVerticalGroup(
            pnlAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdicionalesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(pnlAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCantidadTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(pnlAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(cmbAgrTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgrTalla)))
                .addGap(18, 18, 18)
                .addGroup(pnlAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdicionalesLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(pnlAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbAgrColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgrColor)
                            .addComponent(txtCantidadColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(btnEliminarTalla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        opmNuevo.addTab("Adicionales", pnlAdicionales);

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel4.setText("Proveedor");

        lblIDProveedor.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        lblIDProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel16.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel16.setText("Representante");

        cmbRepresentantes.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        cmbRepresentantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        btnGuardarSalir.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        btnGuardarSalir.setText("Guardar y Salir");

        btnSalir.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        btnSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opmNuevo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIDProveedor)
                                .addGap(141, 141, 141)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbRepresentantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(lblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(btnGuardarSalir)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIDProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(cmbRepresentantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(opmNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarSalir)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFechaEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFechaEnvioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFechaEnvioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgrColor;
    private javax.swing.JButton btnAgrTalla;
    private javax.swing.JButton btnEliminarColor;
    private javax.swing.JButton btnEliminarTalla;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarSalir;
    private javax.swing.JButton btnRegistrarCorte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbAgrColor;
    private javax.swing.JComboBox<String> cmbAgrTalla;
    private org.jdesktop.swingx.JXDatePicker cmbFechaEntrega;
    private org.jdesktop.swingx.JXDatePicker cmbFechaEnvio;
    private javax.swing.JComboBox<String> cmbModelos;
    private javax.swing.JComboBox<String> cmbRepresentantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblIDProveedor;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblcorte;
    private javax.swing.JTabbedPane opmNuevo;
    private javax.swing.JPanel pnlAdicionales;
    private javax.swing.JPanel pnlNuevo;
    private javax.swing.JTable tblColores;
    private javax.swing.JTable tblTallas;
    private javax.swing.JTextField txtCantidadColor;
    private javax.swing.JTextField txtCantidadTalla;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
        
        if (o==fechaEntrada)
        {
            //fechaEntrada.FechaEntrega();
        }
        
    }
    
    /*public void canlendario(frmNuevoCorte V)
    {
        V.getCmbDiaFEnvio().removeAllItems();
        
        String mes[] = V.getCmbMesFEnvio().getSelectedItem().toString().split(" ");
        
        int m = Integer.parseInt(mes[0]);
        
        if(m == 2)
        {
            for(int i=1; i<=28; i++)
            {
                V.getCmbDiaFEnvio().addItem(String.valueOf(i));
            }
        }
        else if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
        {
                for(int i=1; i<=31; i++)
                {
                    V.getCmbDiaFEnvio().addItem(String.valueOf(i));
                }
        }
        else if(m == 4 || m == 6 || m == 9 || m == 11)
        {
            for (int i = 1; i <= 30; i++) 
            {
                V.getCmbDiaFEnvio().addItem(String.valueOf(i));
            }

        }
    }*/

    public JXDatePicker getCmbFechaEntrega() {
        return cmbFechaEntrega;
    }

    public void setCmbFechaEntrega(JXDatePicker cmbFechaEntrega) {
        this.cmbFechaEntrega = cmbFechaEntrega;
    }

    public JXDatePicker getCmbFechaEnvio() {
        return cmbFechaEnvio;
    }

    public void setCmbFechaEnvio(JXDatePicker cmbFechaEnvio) {
        this.cmbFechaEnvio = cmbFechaEnvio;
    }


}
