/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author YO
 */
public class frmRegProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form scroll
     */
    public frmRegProveedor() {
        initComponents();
    }

    public JButton getBtnActualizarGeneral() {
        return btnActualizarGeneral;
    }

    public void setBtnActualizarGeneral(JButton btnActualizarGeneral) {
        this.btnActualizarGeneral = btnActualizarGeneral;
    }

    public JButton getBtnActualizarOper() {
        return btnActualizarOper;
    }

    public void setBtnActualizarOper(JButton btnActualizarOper) {
        this.btnActualizarOper = btnActualizarOper;
    }

    public JButton getBtnAgrRepresentante() {
        return btnAgrRepresentante;
    }

    public void setBtnAgrRepresentante(JButton btnAgrRepresentante) {
        this.btnAgrRepresentante = btnAgrRepresentante;
    }

    public JButton getBtnAgrModelo() {
        return btnAgrModelo;
    }

    public void setBtnAgrModelo(JButton btnAgrModelo) {
        this.btnAgrModelo = btnAgrModelo;
    }

    public JButton getBtnAgrOperacion() {
        return btnAgrOperacion;
    }

    public void setBtnAgrOperacion(JButton btnAgrOperacion) {
        this.btnAgrOperacion = btnAgrOperacion;
    }

    public JButton getBtnAgrTelRepresentante() {
        return btnAgrTelRepresentante;
    }

    public void setBtnAgrTelRepresentante(JButton btnAgrTelRepresentante) {
        this.btnAgrTelRepresentante = btnAgrTelRepresentante;
    }

    public JButton getBtnNuevaOperacion() {
        return btnNuevaOperacion;
    }

    public void setBtnNuevaOperacion(JButton btnNuevaOperacion) {
        this.btnNuevaOperacion = btnNuevaOperacion;
    }

    public JButton getBtnRegProveedor() {
        return btnRegProveedor;
    }

    public void setBtnRegProveedor(JButton btnRegProveedor) {
        this.btnRegProveedor = btnRegProveedor;
    }

    public JComboBox<String> getCmbOperacionExi() {
        return cmbOperacionExi;
    }

    public void setCmbOperacionExi(JComboBox<String> cmbOperacionExi) {
        this.cmbOperacionExi = cmbOperacionExi;
    }

    public JLabel getLblIdRepresentante() {
        return lblIdRepresentante;
    }

    public void setLblIdRepresentante(JLabel lblIdRepresentante) {
        this.lblIdRepresentante = lblIdRepresentante;
    }

    public JLabel getLblIdProveedor() {
        return lblIdProveedor;
    }

    public void setLblIdProveedor(JLabel lblIdProveedor) {
        this.lblIdProveedor = lblIdProveedor;
    }

    public JLabel getLblRegRepresentante() {
        return lblRegRepresentante;
    }

    public void setLblRegRepresentante(JLabel lblRegRepresentante) {
        this.lblRegRepresentante = lblRegRepresentante;
    }

    public JLabel getLblRegModelo() {
        return lblRegModelo;
    }

    public void setLblRegModelo(JLabel lblRegModelo) {
        this.lblRegModelo = lblRegModelo;
    }

    public JLabel getLblRegProveedor() {
        return lblRegProveedor;
    }

    public void setLblRegProveedor(JLabel lblRegProveedor) {
        this.lblRegProveedor = lblRegProveedor;
    }

    public JLabel getLblRegTel() {
        return lblRegTel;
    }

    public void setLblRegTel(JLabel lblRegTel) {
        this.lblRegTel = lblRegTel;
    }

    public JPanel getPnlModelos() {
        return pnlModelos;
    }

    public void setPnlModelos(JPanel pnlModelos) {
        this.pnlModelos = pnlModelos;
    }

    public JPanel getPnlModelos2() {
        return pnlModelos2;
    }

    public void setPnlModelos2(JPanel pnlModelos2) {
        this.pnlModelos2 = pnlModelos2;
    }

    public JPanel getPnlNuevaOper1() {
        return pnlNuevaOper1;
    }

    public void setPnlNuevaOper1(JPanel pnlNuevaOper1) {
        this.pnlNuevaOper1 = pnlNuevaOper1;
    }

    public JTable getTblOperaciones() {
        return tblOperaciones;
    }

    public void setTblOperaciones(JTable tblOperaciones) {
        this.tblOperaciones = tblOperaciones;
    }

    public JTextField getTxtContraseñaRepresentante() {
        return txtContraseñaRepresentante;
    }

    public void setTxtContraseñaRepresentante(JTextField txtContraseñaRepresentante) {
        this.txtContraseñaRepresentante = txtContraseñaRepresentante;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtIdProveedor() {
        return txtIdProveedor;
    }

    public void setTxtIdProveedor(JTextField txtIdProveedor) {
        this.txtIdProveedor = txtIdProveedor;
    }
    
    

    public JTextField getTxtIdRepresentante() {
        return txtIdRepresentante;
    }

    public void setTxtIdRepresentante(JTextField txtIdRepresentante) {
        this.txtIdRepresentante = txtIdRepresentante;
    }

    public JTextField getTxtIdMod() {
        return txtIdMod;
    }

    public void setTxtIdMod(JTextField txtIdMod) {
        this.txtIdMod = txtIdMod;
    }

    public JTextField getTxtIdModAct() {
        return txtIdModAct;
    }

    public void setTxtIdModAct(JTextField txtIdModAct) {
        this.txtIdModAct = txtIdModAct;
    }

    public JTextField getTxtIdOperAct() {
        return txtIdOperAct;
    }

    public void setTxtIdOperAct(JTextField txtIdOperAct) {
        this.txtIdOperAct = txtIdOperAct;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtNombreRepresentante() {
        return txtNombreRepresentante;
    }

    public void setTxtNombreRepresentante(JTextField txtNombreRepresentante) {
        this.txtNombreRepresentante = txtNombreRepresentante;
    }

    public JTextField getTxtNombreMod() {
        return txtNombreMod;
    }

    public void setTxtNombreMod(JTextField txtNombreMod) {
        this.txtNombreMod = txtNombreMod;
    }

    public JTextField getTxtNombreModAct() {
        return txtNombreModAct;
    }

    public void setTxtNombreModAct(JTextField txtNombreModAct) {
        this.txtNombreModAct = txtNombreModAct;
    }

    public JTextField getTxtNombreOperAct() {
        return txtNombreOperAct;
    }

    public void setTxtNombreOperAct(JTextField txtNombreOperAct) {
        this.txtNombreOperAct = txtNombreOperAct;
    }

    public JTextField getTxtNuevaOperDesc() {
        return txtNuevaOperDesc;
    }

    public void setTxtNuevaOperDesc(JTextField txtNuevaOperDesc) {
        this.txtNuevaOperDesc = txtNuevaOperDesc;
    }

    public JTextField getTxtNuevaOperId() {
        return txtNuevaOperId;
    }

    public void setTxtNuevaOperId(JTextField txtNuevaOperId) {
        this.txtNuevaOperId = txtNuevaOperId;
    }

    public JTextField getTxtNuevaOperPrecio() {
        return txtNuevaOperPrecio;
    }

    public void setTxtNuevaOperPrecio(JTextField txtNuevaOperPrecio) {
        this.txtNuevaOperPrecio = txtNuevaOperPrecio;
    }

    public JTextField getTxtNumeroRepresentante() {
        return txtNumeroRepresentante;
    }

    public void setTxtNumeroRepresentante(JTextField txtNumeroRepresentante) {
        this.txtNumeroRepresentante = txtNumeroRepresentante;
    }

    public JTextField getTxtOperadorTel() {
        return txtOperadorTel;
    }

    public void setTxtOperadorTel(JTextField txtOperadorTel) {
        this.txtOperadorTel = txtOperadorTel;
    }

    public JTextField getTxtPrecioMod() {
        return txtPrecioMod;
    }

    public void setTxtPrecioMod(JTextField txtPrecioMod) {
        this.txtPrecioMod = txtPrecioMod;
    }

    public JTextField getTxtPrecioModAct() {
        return txtPrecioModAct;
    }

    public void setTxtPrecioModAct(JTextField txtPrecioModAct) {
        this.txtPrecioModAct = txtPrecioModAct;
    }

    public JTextField getTxtPrecioOperAct() {
        return txtPrecioOperAct;
    }

    public void setTxtPrecioOperAct(JTextField txtPrecioOperAct) {
        this.txtPrecioOperAct = txtPrecioOperAct;
    }

    public JButton getBtnRegresarProv() {
        return btnRegresarProv;
    }

    public void setBtnRegresarProv(JButton btnRegresarProv) {
        this.btnRegresarProv = btnRegresarProv;
    }

    public JPanel getPnlañadirOperaciones() {
        return jPanel5;
    }

    public void setPnlañadirOperaciones(JPanel pnlañadirOperaciones) {
        this.jPanel5 = pnlañadirOperaciones;
    }

    public JLabel getLblIdProveedorModelo() {
        return lblIdProveedorModelo;
    }

    public void setLblIdProveedorModelo(JLabel lblIdProveedorModelo) {
        this.lblIdProveedorModelo = lblIdProveedorModelo;
    }

    public JLabel getLblRegOperacionExis() {
        return lblRegOperacionExis;
    }

    public void setLblRegOperacionExis(JLabel lblRegOperacionExis) {
        this.lblRegOperacionExis = lblRegOperacionExis;
    }

    public JLabel getLblRegOperacionNueva() {
        return lblRegOperacionNueva;
    }

    public void setLblRegOperacionNueva(JLabel lblRegOperacionNueva) {
        this.lblRegOperacionNueva = lblRegOperacionNueva;
    }

    public JTextField getTxtCorreoRepresentante() {
        return txtCorreoRepresentante;
    }

    public void setTxtCorreoRepresentante(JTextField txtCorreoRepresentante) {
        this.txtCorreoRepresentante = txtCorreoRepresentante;
    }

    public JTabbedPane getPnlActOperaciones() {
        return pnlActOperaciones;
    }

    public void setPnlActOperaciones(JTabbedPane pnlActOperaciones) {
        this.pnlActOperaciones = pnlActOperaciones;
    }

    public JLabel getLblActModeloGeneral() {
        return lblActModeloGeneral;
    }

    public void setLblActModeloGeneral(JLabel lblActModeloGeneral) {
        this.lblActModeloGeneral = lblActModeloGeneral;
    }

    public JLabel getLblActOperaciones() {
        return lblActOperaciones;
    }

    public void setLblActOperaciones(JLabel lblActOperaciones) {
        this.lblActOperaciones = lblActOperaciones;
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnRegProveedor = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRegProveedor = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlModelos = new javax.swing.JPanel();
        btnAgrRepresentante = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIdRepresentante = new javax.swing.JTextField();
        txtNombreRepresentante = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtContraseñaRepresentante = new javax.swing.JTextField();
        lblIdProveedor = new javax.swing.JLabel();
        lblRegRepresentante = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCorreoRepresentante = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNumeroRepresentante = new javax.swing.JTextField();
        txtOperadorTel = new javax.swing.JTextField();
        btnAgrTelRepresentante = new javax.swing.JButton();
        lblRegTel = new javax.swing.JLabel();
        lblIdRepresentante = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        pnlModelos2 = new javax.swing.JPanel();
        btnAgrModelo = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtIdMod = new javax.swing.JTextField();
        txtNombreMod = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtPrecioMod = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        lblRegModelo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblIdProveedorModelo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        cmbOperacionExi = new javax.swing.JComboBox<>();
        pnlNuevaOper1 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtNuevaOperDesc = new javax.swing.JTextField();
        txtNuevaOperPrecio = new javax.swing.JTextField();
        txtNuevaOperId = new javax.swing.JTextField();
        btnNuevaOperacion = new javax.swing.JButton();
        lblRegOperacionNueva = new javax.swing.JLabel();
        btnAgrOperacion = new javax.swing.JButton();
        lblRegOperacionExis = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlActOperaciones = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        txtIdModAct = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtNombreModAct = new javax.swing.JTextField();
        txtPrecioModAct = new javax.swing.JTextField();
        btnActualizarGeneral = new javax.swing.JButton();
        lblActModeloGeneral = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblOperaciones = new javax.swing.JTable();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtIdOperAct = new javax.swing.JTextField();
        txtNombreOperAct = new javax.swing.JTextField();
        txtPrecioOperAct = new javax.swing.JTextField();
        btnActualizarOper = new javax.swing.JButton();
        lblActOperaciones = new javax.swing.JLabel();
        btnRegresarProv = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        btnRegProveedor.setText("Registrar");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Proveedor Nuevo");

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese identificacion");

        jLabel7.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel7.setText("Registro");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese Nombre");

        lblRegProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(lblRegProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(jLabel6))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addComponent(btnRegProveedor))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(jLabel7))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(60, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(lblRegProveedor)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel7)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel1))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnRegProveedor)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );

        jLabel8.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel8.setText("Registrar Representante");

        btnAgrRepresentante.setText("Agregar");

        jLabel9.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel9.setText("Ingrese Identificacion");

        jLabel10.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel10.setText("Ingrese Nombre");

        txtNombreRepresentante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRepresentanteActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel11.setText("Ingrese Contraseña");

        lblIdProveedor.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        lblIdProveedor.setForeground(new java.awt.Color(0, 0, 4));
        lblIdProveedor.setAlignmentY(0.0F);
        lblIdProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblRegRepresentante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel3.setText("Proveedor ");

        jLabel12.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel12.setText("Ingrese Correo");

        javax.swing.GroupLayout pnlModelosLayout = new javax.swing.GroupLayout(pnlModelos);
        pnlModelos.setLayout(pnlModelosLayout);
        pnlModelosLayout.setHorizontalGroup(
            pnlModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModelosLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(txtIdRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlModelosLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNombreRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlModelosLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtContraseñaRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlModelosLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModelosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModelosLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnAgrRepresentante))
                    .addComponent(lblRegRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
            .addGroup(pnlModelosLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCorreoRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlModelosLayout.setVerticalGroup(
            pnlModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModelosLayout.createSequentialGroup()
                .addGroup(pnlModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtIdRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNombreRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtContraseñaRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(pnlModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCorreoRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgrRepresentante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRegRepresentante)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos", pnlModelos);

        jLabel17.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel17.setText("Ingrese Numero");

        jLabel18.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel18.setText("Ingrese Operador");

        btnAgrTelRepresentante.setText("Agregar");

        lblRegTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblIdRepresentante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(txtNumeroRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtOperadorTel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnAgrTelRepresentante))
                            .addComponent(lblRegTel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lblIdRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblIdRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtNumeroRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtOperadorTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgrTelRepresentante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRegTel)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Telefonos", jPanel1);

        jLabel24.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel24.setText("Registar Modelos");

        btnAgrModelo.setText("Agregar");

        jLabel29.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel29.setText("Ingrese Identificacion");

        jLabel30.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel30.setText("Ingrese Nombre");

        txtIdMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdModActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel31.setText("Ingrese Precio");

        jLabel32.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel32.setText("Informacion General");

        lblRegModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel5.setText("Proveedor ");

        lblIdProveedorModelo.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        lblIdProveedorModelo.setForeground(new java.awt.Color(0, 0, 4));
        lblIdProveedorModelo.setAlignmentY(0.0F);
        lblIdProveedorModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout pnlModelos2Layout = new javax.swing.GroupLayout(pnlModelos2);
        pnlModelos2.setLayout(pnlModelos2Layout);
        pnlModelos2Layout.setHorizontalGroup(
            pnlModelos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModelos2Layout.createSequentialGroup()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(txtIdMod, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlModelos2Layout.createSequentialGroup()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlModelos2Layout.createSequentialGroup()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPrecioMod, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlModelos2Layout.createSequentialGroup()
                .addGroup(pnlModelos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModelos2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel32))
                    .addGroup(pnlModelos2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnAgrModelo))
                    .addGroup(pnlModelos2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lblRegModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlModelos2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIdProveedorModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlModelos2Layout.setVerticalGroup(
            pnlModelos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModelos2Layout.createSequentialGroup()
                .addGroup(pnlModelos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIdProveedorModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addGroup(pnlModelos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtIdMod, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModelos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModelos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtPrecioMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgrModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRegModelo)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Datos", pnlModelos2);

        jLabel33.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel33.setText("Ingrese Operacion Existente");
        jLabel33.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel33.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        cmbOperacionExi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione" }));

        jLabel34.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel34.setText("Ingrese Identificacion");

        jLabel35.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel35.setText("Ingrese Descripcion");

        jLabel36.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel36.setText("Ingrese Precio");

        txtNuevaOperId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevaOperIdActionPerformed(evt);
            }
        });

        btnNuevaOperacion.setText("Nueva");

        lblRegOperacionNueva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout pnlNuevaOper1Layout = new javax.swing.GroupLayout(pnlNuevaOper1);
        pnlNuevaOper1.setLayout(pnlNuevaOper1Layout);
        pnlNuevaOper1Layout.setHorizontalGroup(
            pnlNuevaOper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevaOper1Layout.createSequentialGroup()
                .addGroup(pnlNuevaOper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNuevaOper1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlNuevaOper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNuevaOper1Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(57, 57, 57)
                                .addComponent(txtNuevaOperPrecio))
                            .addGroup(pnlNuevaOper1Layout.createSequentialGroup()
                                .addGroup(pnlNuevaOper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlNuevaOper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNuevaOperDesc)
                                    .addComponent(txtNuevaOperId)))))
                    .addGroup(pnlNuevaOper1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnNuevaOperacion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlNuevaOper1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(lblRegOperacionNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNuevaOper1Layout.setVerticalGroup(
            pnlNuevaOper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNuevaOper1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNuevaOper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtNuevaOperId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNuevaOper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtNuevaOperDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNuevaOper1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtNuevaOperPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnNuevaOperacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRegOperacionNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        btnAgrOperacion.setText("Agregar");

        lblRegOperacionExis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbOperacionExi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addComponent(pnlNuevaOper1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnAgrOperacion))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblRegOperacionExis, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(cmbOperacionExi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgrOperacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRegOperacionExis)
                .addGap(12, 12, 12)
                .addComponent(pnlNuevaOper1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Operaciones", jPanel5);

        jLabel37.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel37.setText("Actualizar Informacion");

        jLabel44.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel44.setText("Ingrese Identificacion");

        jLabel45.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel45.setText("Nombre");

        jLabel46.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel46.setText("Precio");

        btnActualizarGeneral.setText("Actualizar");

        lblActModeloGeneral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnActualizarGeneral)
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblActModeloGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(23, 23, 23)
                        .addComponent(txtPrecioModAct))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreModAct))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdModAct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtIdModAct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtNombreModAct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtPrecioModAct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnActualizarGeneral)
                .addGap(18, 18, 18)
                .addComponent(lblActModeloGeneral)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pnlActOperaciones.addTab("General", jPanel9);

        tblOperaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblOperaciones);

        jLabel47.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel47.setText("Ingrese Identificacion");

        jLabel48.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel48.setText("Nombre");

        jLabel49.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel49.setText("Precio");

        btnActualizarOper.setText("Actualizar");

        lblActOperaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreOperAct))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdOperAct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(23, 23, 23)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(lblActOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtPrecioOperAct))))
                        .addGap(90, 90, 90))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnActualizarOper)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtIdOperAct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txtNombreOperAct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(txtPrecioOperAct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizarOper)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblActOperaciones)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pnlActOperaciones.addTab("Operaciones", jPanel10);

        jScrollPane3.setViewportView(pnlActOperaciones);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel37)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Actualizar", jPanel6);

        btnRegresarProv.setText("Regresar");

        jLabel4.setText("Identificacion de Proveedor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addComponent(jLabel24))
                                    .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(btnRegresarProv))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jLabel8)))
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresarProv)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreRepresentanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRepresentanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRepresentanteActionPerformed

    private void txtIdModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdModActionPerformed

    private void txtNuevaOperIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevaOperIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevaOperIdActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarGeneral;
    private javax.swing.JButton btnActualizarOper;
    private javax.swing.JButton btnAgrModelo;
    private javax.swing.JButton btnAgrOperacion;
    private javax.swing.JButton btnAgrRepresentante;
    private javax.swing.JButton btnAgrTelRepresentante;
    private javax.swing.JButton btnNuevaOperacion;
    private javax.swing.JButton btnRegProveedor;
    private javax.swing.JButton btnRegresarProv;
    private javax.swing.JComboBox<String> cmbOperacionExi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JLabel lblActModeloGeneral;
    private javax.swing.JLabel lblActOperaciones;
    private javax.swing.JLabel lblIdProveedor;
    private javax.swing.JLabel lblIdProveedorModelo;
    private javax.swing.JLabel lblIdRepresentante;
    private javax.swing.JLabel lblRegModelo;
    private javax.swing.JLabel lblRegOperacionExis;
    private javax.swing.JLabel lblRegOperacionNueva;
    private javax.swing.JLabel lblRegProveedor;
    private javax.swing.JLabel lblRegRepresentante;
    private javax.swing.JLabel lblRegTel;
    private javax.swing.JTabbedPane pnlActOperaciones;
    private javax.swing.JPanel pnlModelos;
    private javax.swing.JPanel pnlModelos2;
    private javax.swing.JPanel pnlNuevaOper1;
    private javax.swing.JTable tblOperaciones;
    private javax.swing.JTextField txtContraseñaRepresentante;
    private javax.swing.JTextField txtCorreoRepresentante;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdMod;
    private javax.swing.JTextField txtIdModAct;
    private javax.swing.JTextField txtIdOperAct;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtIdRepresentante;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreMod;
    private javax.swing.JTextField txtNombreModAct;
    private javax.swing.JTextField txtNombreOperAct;
    private javax.swing.JTextField txtNombreRepresentante;
    private javax.swing.JTextField txtNuevaOperDesc;
    private javax.swing.JTextField txtNuevaOperId;
    private javax.swing.JTextField txtNuevaOperPrecio;
    private javax.swing.JTextField txtNumeroRepresentante;
    private javax.swing.JTextField txtOperadorTel;
    private javax.swing.JTextField txtPrecioMod;
    private javax.swing.JTextField txtPrecioModAct;
    private javax.swing.JTextField txtPrecioOperAct;
    // End of variables declaration//GEN-END:variables
}
