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
public class frmModelo extends javax.swing.JInternalFrame{

    /**
     * Creates new form frmModelo
     */
    public frmModelo() {
        initComponents();
    }

    public JButton getBtnAgrOperacionE() {
        return btnAgrOperacionE;
    }

    public void setBtnAgrOperacionE(JButton btnAgrOperacionE) {
        this.btnAgrOperacionE = btnAgrOperacionE;
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

    public JButton getBtnNuevaOperacion() {
        return btnNuevaOperacion;
    }

    public void setBtnNuevaOperacion(JButton btnNuevaOperacion) {
        this.btnNuevaOperacion = btnNuevaOperacion;
    }

    public JButton getBtnOperaciones() {
        return btnOperaciones;
    }

    public void setBtnOperaciones(JButton btnOperaciones) {
        this.btnOperaciones = btnOperaciones;
    }

    public JComboBox<String> getCmbOperacionExi() {
        return cmbOperacionExi;
    }

    public void setCmbOperacionExi(JComboBox<String> cmbOperacionExi) {
        this.cmbOperacionExi = cmbOperacionExi;
    }

    public JLabel getLblAM() {
        return lblAM;
    }

    public void setLblAM(JLabel lblAM) {
        this.lblAM = lblAM;
    }

    public JLabel getLblNM() {
        return lblNM;
    }

    public void setLblNM(JLabel lblNM) {
        this.lblNM = lblNM;
    }

    public JTabbedPane getPnlActModelo() {
        return pnlActModelo;
    }

    public void setPnlActModelo(JTabbedPane pnlActModelo) {
        this.pnlActModelo = pnlActModelo;
    }

    public JTabbedPane getPnlNuevoModelo() {
        return pnlNuevoModelo;
    }

    public void setPnlNuevoModelo(JTabbedPane pnlNuevoModelo) {
        this.pnlNuevoModelo = pnlNuevoModelo;
    }
    
    public JPanel getPnlModelos() {
        return pnlModelos;
    }

    public void setPnlModelos(JPanel pnlModelos) {
        this.pnlModelos = pnlModelos;
    }

    public JPanel getPnlNuevaOper() {
        return pnlNuevaOper;
    }

    public void setPnlNuevaOper(JPanel pnlNuevaOper) {
        this.pnlNuevaOper = pnlNuevaOper;
    }

    public JTable getTblModelos() {
        return tblModelos;
    }

    public void setTblModelos(JTable tblModelos) {
        this.tblModelos = tblModelos;
    }

    public JTable getTblOperaciones() {
        return tblOperaciones;
    }

    public void setTblOperaciones(JTable tblOperaciones) {
        this.tblOperaciones = tblOperaciones;
    }

    public JTable getTblOperacionesAct() {
        return tblOperacionesAct;
    }

    public void setTblOperacionesAct(JTable tblOperacionesAct) {
        this.tblOperacionesAct = tblOperacionesAct;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtIdAct() {
        return txtIdAct;
    }

    public void setTxtIdAct(JTextField txtIdAct) {
        this.txtIdAct = txtIdAct;
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

    public JTextField getTxtNombreAct() {
        return txtNombreAct;
    }

    public void setTxtNombreAct(JTextField txtNombreAct) {
        this.txtNombreAct = txtNombreAct;
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

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(JTextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

    public JTextField getTxtPrecioAct() {
        return txtPrecioAct;
    }

    public void setTxtPrecioAct(JTextField txtPrecioAct) {
        this.txtPrecioAct = txtPrecioAct;
    }

    public JTextField getTxtPrecioOperAct() {
        return txtPrecioOperAct;
    }

    public void setTxtPrecioOperAct(JTextField txtPrecioOperAct) {
        this.txtPrecioOperAct = txtPrecioOperAct;
    }

    public JTextField getTxtConsultarOper() {
        return txtConsultarOper;
    }

    public void setTxtConsultarOper(JTextField txtConsultarOper) {
        this.txtConsultarOper = txtConsultarOper;
    }

    public JButton getBtnAgrOperacionME() { /*Agregar operacion existente a modelo*/
        return btnAgrOperacionME;
    }

    public void setBtnAgrOperacionME(JButton btnAgrOperacionME) {
        this.btnAgrOperacionME = btnAgrOperacionME;
    }

    public JButton getBtnNuevaOperacionME() {
        return btnNuevaOperacionME;
    }

    public void setBtnNuevaOperacionME(JButton btnNuevaOperacionME) {
        this.btnNuevaOperacionME = btnNuevaOperacionME;
    }

    public JComboBox<String> getCmbOperacionExiME() {
        return cmbOperacionExiME;
    }

    public void setCmbOperacionExiME(JComboBox<String> cmbOperacionExiME) {
        this.cmbOperacionExiME = cmbOperacionExiME;
    }

    public JPanel getPnlNuevaOperAct() {
        return pnlNuevaOperAct;
    }

    public void setPnlNuevaOperAct(JPanel pnlNuevaOperAct) {
        this.pnlNuevaOperAct = pnlNuevaOperAct;
    }
    
    public JTextField getTxtNuevaOperDescME() {
        return txtNuevaOperDescME;
    }

    public void setTxtNuevaOperDescME(JTextField txtNuevaOperDescME) {
        this.txtNuevaOperDescME = txtNuevaOperDescME;
    }

    public JTextField getTxtNuevaOperIdME() {
        return txtNuevaOperIdME;
    }

    public void setTxtNuevaOperIdME(JTextField txtNuevaOperIdME) {
        this.txtNuevaOperIdME = txtNuevaOperIdME;
    }

    public JTextField getTxtNuevaOperPrecioME() {
        return txtNuevaOperPrecioME;
    }

    public void setTxtNuevaOperPrecioME(JTextField txtNuevaOperPrecioME) {
        this.txtNuevaOperPrecioME = txtNuevaOperPrecioME;
    }

    public JButton getBtnAgrOperacionNueva() {
        return btnAgrOperacionNueva;
    }

    public void setBtnAgrOperacionNueva(JButton btnAgrOperacionNueva) {
        this.btnAgrOperacionNueva = btnAgrOperacionNueva;
    }

    public JPanel getPnlNuevaOperacionAct() {
        return pnlNuevaOperacionAct;
    }

    public void setPnlNuevaOperacionAct(JPanel pnlNuevaOperacionAct) {
        this.pnlNuevaOperacionAct = pnlNuevaOperacionAct;
    }

    public JPanel getPnlActOperacion() {
        return pnlActOperacion;
    }

    public void setPnlActOperacion(JPanel pnlActOperacion) {
        this.pnlActOperacion = pnlActOperacion;
    }

    public JPanel getPnlNuevaOperacion() {
        return pnlNuevaOperacion;
    }

    public void setPnlNuevaOperacion(JPanel pnlNuevaOperacion) {
        this.pnlNuevaOperacion = pnlNuevaOperacion;
    }

    public JButton getBtnRegAdmi() {
        return btnRegAdmi;
    }

    public JLabel getLblActModeloGeneral() {
        return lblActModeloGeneral;
    }

    public void setLblActModeloGeneral(JLabel lblActModeloGeneral) {
        this.lblActModeloGeneral = lblActModeloGeneral;
    }

    public JLabel getLblActModeloNuevaOper() {
        return lblActModeloNuevaOper;
    }

    public void setLblActModeloNuevaOper(JLabel lblActModeloNuevaOper) {
        this.lblActModeloNuevaOper = lblActModeloNuevaOper;
    }

    public JLabel getLblActModeloOper() {
        return lblActModeloOper;
    }

    public void setLblActModeloOper(JLabel lblActModeloOper) {
        this.lblActModeloOper = lblActModeloOper;
    }

    public JLabel getLblNuevoModelo() {
        return lblNuevoModelo;
    }

    public void setLblNuevoModelo(JLabel lblNuevoModelo) {
        this.lblNuevoModelo = lblNuevoModelo;
    }

    public JLabel getLblNuevoModeloAgrOper() {
        return lblNuevoModeloAgrOper;
    }

    public void setLblNuevoModeloAgrOper(JLabel lblNuevoModeloAgrOper) {
        this.lblNuevoModeloAgrOper = lblNuevoModeloAgrOper;
    }

    public JLabel getLblEliminarOperacion() {
        return lblEliminarOperacion;
    }

    public void setLblEliminarOperacion(JLabel lblEliminarOperacion) {
        this.lblEliminarOperacion = lblEliminarOperacion;
    }

    public JTable getTblEliminarOperacion() {
        return tblEliminarOperacion;
    }

    public void setTblEliminarOperacion(JTable tblEliminarOperacion) {
        this.tblEliminarOperacion = tblEliminarOperacion;
    }

    public JButton getBtnModeloNListo() {
        return btnModeloNListo;
    }

    public void setBtnModeloNListo(JButton btnModeloNListo) {
        this.btnModeloNListo = btnModeloNListo;
    }

    public JLabel getLblTotal() {
        return lblTotal;
    }

    public void setLblTotal(JLabel lblTotal) {
        this.lblTotal = lblTotal;
    }

    public JButton getBtnEliminarOperacion() {
        return btnEliminarOperacion;
    }

    public void setBtnEliminarOperacion(JButton btnEliminarOperacion) {
        this.btnEliminarOperacion = btnEliminarOperacion;
    }

    public JTextField getTxtFiltrarOperacionA() {
        return txtFiltrarOperacionA;
    }

    public void setTxtFiltrarOperacionA(JTextField txtFiltrarOperacionA) {
        this.txtFiltrarOperacionA = txtFiltrarOperacionA;
    }

    public JTextField getTxtFiltrarOperacionN() {
        return txtFiltrarOperacionN;
    }

    public void setTxtFiltrarOperacionN(JTextField txtFiltrarOperacionN) {
        this.txtFiltrarOperacionN = txtFiltrarOperacionN;
    }

    public JLabel getLblValor() {
        return lblValor;
    }

    public void setLblValor(JLabel lblValor) {
        this.lblValor = lblValor;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblModelos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlActModelo = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtIdAct = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtNombreAct = new javax.swing.JTextField();
        txtPrecioAct = new javax.swing.JTextField();
        btnActualizarGeneral = new javax.swing.JButton();
        lblActModeloGeneral = new javax.swing.JLabel();
        pnlActOperacion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOperacionesAct = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtIdOperAct = new javax.swing.JTextField();
        txtNombreOperAct = new javax.swing.JTextField();
        txtPrecioOperAct = new javax.swing.JTextField();
        btnActualizarOper = new javax.swing.JButton();
        lblActModeloOper = new javax.swing.JLabel();
        pnlNuevaOperacionAct = new javax.swing.JPanel();
        pnlNuevaOperacion = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cmbOperacionExiME = new javax.swing.JComboBox<>();
        btnNuevaOperacionME = new javax.swing.JButton();
        pnlNuevaOperAct = new javax.swing.JPanel();
        txtNuevaOperDescME = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNuevaOperIdME = new javax.swing.JTextField();
        btnAgrOperacionME = new javax.swing.JButton();
        txtNuevaOperPrecioME = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnAgrOperacionNueva = new javax.swing.JButton();
        txtFiltrarOperacionA = new javax.swing.JTextField();
        lblActModeloNuevaOper = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblEliminarOperacion = new javax.swing.JTable();
        lblEliminarOperacion = new javax.swing.JLabel();
        btnEliminarOperacion = new javax.swing.JButton();
        lblNM = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOperaciones = new javax.swing.JTable();
        btnRegAdmi = new javax.swing.JButton();
        pnlNuevoModelo = new javax.swing.JTabbedPane();
        pnlModelos = new javax.swing.JPanel();
        btnAgrModelo = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        lblNuevoModelo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cmbOperacionExi = new javax.swing.JComboBox<>();
        btnNuevaOperacion = new javax.swing.JButton();
        pnlNuevaOper = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNuevaOperDesc = new javax.swing.JTextField();
        txtNuevaOperPrecio = new javax.swing.JTextField();
        txtNuevaOperId = new javax.swing.JTextField();
        btnAgrOperacion = new javax.swing.JButton();
        lblNuevoModeloAgrOper = new javax.swing.JLabel();
        btnAgrOperacionE = new javax.swing.JButton();
        txtFiltrarOperacionN = new javax.swing.JTextField();
        btnModeloNListo = new javax.swing.JButton();
        lblAM = new javax.swing.JLabel();
        btnOperaciones = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtConsultarOper = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();

        setResizable(true);

        tblModelos.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        tblModelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblModelos);

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel4.setText("Consultar Operaciones");

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel5.setText("Ingrese Identificacion");

        jLabel18.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel18.setText("Ingrese Identificacion");

        txtIdAct.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel19.setText("Nombre");

        jLabel20.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel20.setText("Precio");

        txtNombreAct.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        txtPrecioAct.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        btnActualizarGeneral.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        btnActualizarGeneral.setText("Actualizar");

        lblActModeloGeneral.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        lblActModeloGeneral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(23, 23, 23)
                        .addComponent(txtPrecioAct))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreAct))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                        .addComponent(txtIdAct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnActualizarGeneral))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblActModeloGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtIdAct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtNombreAct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtPrecioAct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnActualizarGeneral)
                .addGap(18, 18, 18)
                .addComponent(lblActModeloGeneral)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        pnlActModelo.addTab("General", jPanel3);

        tblOperacionesAct.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        tblOperacionesAct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblOperacionesAct);

        jLabel28.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel28.setText("Ingrese Identificacion");

        jLabel29.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel29.setText("Nombre");

        jLabel30.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel30.setText("Precio");

        txtIdOperAct.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        txtNombreOperAct.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        txtPrecioOperAct.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        btnActualizarOper.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        btnActualizarOper.setText("Actualizar");

        lblActModeloOper.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        lblActModeloOper.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout pnlActOperacionLayout = new javax.swing.GroupLayout(pnlActOperacion);
        pnlActOperacion.setLayout(pnlActOperacionLayout);
        pnlActOperacionLayout.setHorizontalGroup(
            pnlActOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActOperacionLayout.createSequentialGroup()
                .addGroup(pnlActOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlActOperacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlActOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlActOperacionLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdOperAct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlActOperacionLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                                .addComponent(txtNombreOperAct, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlActOperacionLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPrecioOperAct, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnlActOperacionLayout.createSequentialGroup()
                        .addGroup(pnlActOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlActOperacionLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(btnActualizarOper))
                            .addGroup(pnlActOperacionLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(lblActModeloOper, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlActOperacionLayout.setVerticalGroup(
            pnlActOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlActOperacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlActOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtIdOperAct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlActOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtNombreOperAct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlActOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtPrecioOperAct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarOper)
                .addGap(18, 18, 18)
                .addComponent(lblActModeloOper)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pnlActModelo.addTab("Operaciones", pnlActOperacion);

        jLabel17.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel17.setText("Ingrese Operacion Existente");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel17.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        cmbOperacionExiME.setEditable(true);
        cmbOperacionExiME.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        btnNuevaOperacionME.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        btnNuevaOperacionME.setText("Nueva");

        txtNuevaOperDescME.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel23.setText("Ingrese Precio");

        jLabel22.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel22.setText("Ingrese Descripcion");

        txtNuevaOperIdME.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        btnAgrOperacionME.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        btnAgrOperacionME.setText("Agregar");

        txtNuevaOperPrecioME.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel21.setText("Ingrese Identificacion");

        javax.swing.GroupLayout pnlNuevaOperActLayout = new javax.swing.GroupLayout(pnlNuevaOperAct);
        pnlNuevaOperAct.setLayout(pnlNuevaOperActLayout);
        pnlNuevaOperActLayout.setHorizontalGroup(
            pnlNuevaOperActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevaOperActLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnAgrOperacionME)
                .addContainerGap(341, Short.MAX_VALUE))
            .addGroup(pnlNuevaOperActLayout.createSequentialGroup()
                .addGroup(pnlNuevaOperActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNuevaOperActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNuevaOperPrecioME)
                    .addComponent(txtNuevaOperDescME)
                    .addComponent(txtNuevaOperIdME)))
        );
        pnlNuevaOperActLayout.setVerticalGroup(
            pnlNuevaOperActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevaOperActLayout.createSequentialGroup()
                .addGroup(pnlNuevaOperActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtNuevaOperIdME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNuevaOperActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtNuevaOperDescME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNuevaOperActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtNuevaOperPrecioME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgrOperacionME)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgrOperacionNueva.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        btnAgrOperacionNueva.setText("Agregar");

        txtFiltrarOperacionA.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        javax.swing.GroupLayout pnlNuevaOperacionLayout = new javax.swing.GroupLayout(pnlNuevaOperacion);
        pnlNuevaOperacion.setLayout(pnlNuevaOperacionLayout);
        pnlNuevaOperacionLayout.setHorizontalGroup(
            pnlNuevaOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNuevaOperAct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlNuevaOperacionLayout.createSequentialGroup()
                .addComponent(btnAgrOperacionNueva)
                .addGap(18, 18, 18)
                .addComponent(btnNuevaOperacionME)
                .addContainerGap(335, Short.MAX_VALUE))
            .addGroup(pnlNuevaOperacionLayout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFiltrarOperacionA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbOperacionExiME, 0, 316, Short.MAX_VALUE))
        );
        pnlNuevaOperacionLayout.setVerticalGroup(
            pnlNuevaOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNuevaOperacionLayout.createSequentialGroup()
                .addGroup(pnlNuevaOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFiltrarOperacionA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlNuevaOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(cmbOperacionExiME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNuevaOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevaOperacionME)
                    .addComponent(btnAgrOperacionNueva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNuevaOperAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblActModeloNuevaOper.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout pnlNuevaOperacionActLayout = new javax.swing.GroupLayout(pnlNuevaOperacionAct);
        pnlNuevaOperacionAct.setLayout(pnlNuevaOperacionActLayout);
        pnlNuevaOperacionActLayout.setHorizontalGroup(
            pnlNuevaOperacionActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevaOperacionActLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlNuevaOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNuevaOperacionActLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblActModeloNuevaOper, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        pnlNuevaOperacionActLayout.setVerticalGroup(
            pnlNuevaOperacionActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevaOperacionActLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlNuevaOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblActModeloNuevaOper)
                .addContainerGap())
        );

        pnlActModelo.addTab("Nueva Operacion", pnlNuevaOperacionAct);

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel2.setText("Seleccione Operacion");

        tblEliminarOperacion.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        tblEliminarOperacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblEliminarOperacion);

        lblEliminarOperacion.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        lblEliminarOperacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnEliminarOperacion.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        btnEliminarOperacion.setText("Eliminar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 360, Short.MAX_VALUE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(lblEliminarOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(btnEliminarOperacion)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarOperacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEliminarOperacion)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pnlActModelo.addTab("Eliminar Operacion", jPanel4);

        lblNM.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        lblNM.setText("Modelo Nuevo");

        tblOperaciones.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        tblOperaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblOperaciones);

        btnRegAdmi.setText("Regresar");
        btnRegAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegAdmiActionPerformed(evt);
            }
        });

        btnAgrModelo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        btnAgrModelo.setText("Agregar");

        jLabel9.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel9.setText("Ingrese Identificacion");

        jLabel10.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel10.setText("Ingrese Nombre");

        txtId.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel11.setText("Ingrese Precio");

        txtPrecio.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel16.setText("Informacion General");

        lblNuevoModelo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        lblNuevoModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout pnlModelosLayout = new javax.swing.GroupLayout(pnlModelos);
        pnlModelos.setLayout(pnlModelosLayout);
        pnlModelosLayout.setHorizontalGroup(
            pnlModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModelosLayout.createSequentialGroup()
                .addGroup(pnlModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModelosLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel16))
                    .addGroup(pnlModelosLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnAgrModelo))
                    .addGroup(pnlModelosLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lblNuevoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlModelosLayout.createSequentialGroup()
                        .addGroup(pnlModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(pnlModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        pnlModelosLayout.setVerticalGroup(
            pnlModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModelosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(pnlModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModelosLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addGroup(pnlModelosLayout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgrModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNuevoModelo)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pnlNuevoModelo.addTab("Datos", pnlModelos);

        jLabel15.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel15.setText("Ingrese Operacion Existente");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel15.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        cmbOperacionExi.setEditable(true);
        cmbOperacionExi.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        btnNuevaOperacion.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        btnNuevaOperacion.setText("Nueva");

        jLabel12.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel12.setText("Ingrese Identificacion");

        jLabel13.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel13.setText("Ingrese Descripcion");

        jLabel14.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel14.setText("Ingrese Precio");

        txtNuevaOperDesc.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        txtNuevaOperPrecio.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        txtNuevaOperId.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        txtNuevaOperId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevaOperIdActionPerformed(evt);
            }
        });

        btnAgrOperacion.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        btnAgrOperacion.setText("Agregar");

        lblNuevoModeloAgrOper.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout pnlNuevaOperLayout = new javax.swing.GroupLayout(pnlNuevaOper);
        pnlNuevaOper.setLayout(pnlNuevaOperLayout);
        pnlNuevaOperLayout.setHorizontalGroup(
            pnlNuevaOperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevaOperLayout.createSequentialGroup()
                .addGroup(pnlNuevaOperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNuevaOperLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlNuevaOperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNuevaOperLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(57, 57, 57)
                                .addComponent(txtNuevaOperPrecio))
                            .addGroup(pnlNuevaOperLayout.createSequentialGroup()
                                .addGroup(pnlNuevaOperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlNuevaOperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNuevaOperDesc)
                                    .addComponent(txtNuevaOperId)))))
                    .addGroup(pnlNuevaOperLayout.createSequentialGroup()
                        .addGroup(pnlNuevaOperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNuevaOperLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(btnAgrOperacion))
                            .addGroup(pnlNuevaOperLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(lblNuevoModeloAgrOper, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 297, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlNuevaOperLayout.setVerticalGroup(
            pnlNuevaOperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNuevaOperLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNuevaOperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNuevaOperId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNuevaOperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNuevaOperDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNuevaOperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNuevaOperPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgrOperacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNuevoModeloAgrOper)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgrOperacionE.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        btnAgrOperacionE.setText("Agregar");

        txtFiltrarOperacionN.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        btnModeloNListo.setText("Listo");
        btnModeloNListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModeloNListoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgrOperacionE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNuevaOperacion))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFiltrarOperacionN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbOperacionExi, 0, 235, Short.MAX_VALUE))
                    .addComponent(pnlNuevaOper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(btnModeloNListo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cmbOperacionExi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltrarOperacionN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevaOperacion)
                    .addComponent(btnAgrOperacionE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNuevaOper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModeloNListo)
                .addGap(5, 5, 5))
        );

        pnlNuevoModelo.addTab("Operaciones", jPanel1);

        lblAM.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        lblAM.setText("Actualizar Modelo");

        btnOperaciones.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        btnOperaciones.setText("Consultar");

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel1.setText("Modelos");

        txtConsultarOper.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        txtConsultarOper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultarOperActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel3.setText("Total");

        lblTotal.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N
        jLabel6.setText("Valor");

        lblValor.setFont(new java.awt.Font("Perpetua Titling MT", 1, 15)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtConsultarOper, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOperaciones))
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(154, 154, 154)
                                        .addComponent(lblNM))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(pnlNuevoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblAM)
                                        .addGap(130, 130, 130))
                                    .addComponent(pnlActModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotal)
                .addGap(256, 256, 256))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(btnRegAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(482, 482, 482))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(458, 458, 458)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtConsultarOper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOperaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblTotal)
                    .addComponent(jLabel6)
                    .addComponent(lblValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAM)
                    .addComponent(lblNM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlActModelo)
                    .addComponent(pnlNuevoModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegAdmi)
                .addContainerGap())
        );

        jScrollPane4.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConsultarOperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultarOperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarOperActionPerformed

    private void txtNuevaOperIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevaOperIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevaOperIdActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnModeloNListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModeloNListoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModeloNListoActionPerformed

    private void btnRegAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAdmiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegAdmiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarGeneral;
    private javax.swing.JButton btnActualizarOper;
    private javax.swing.JButton btnAgrModelo;
    private javax.swing.JButton btnAgrOperacion;
    private javax.swing.JButton btnAgrOperacionE;
    private javax.swing.JButton btnAgrOperacionME;
    private javax.swing.JButton btnAgrOperacionNueva;
    private javax.swing.JButton btnEliminarOperacion;
    private javax.swing.JButton btnModeloNListo;
    private javax.swing.JButton btnNuevaOperacion;
    private javax.swing.JButton btnNuevaOperacionME;
    private javax.swing.JButton btnOperaciones;
    private javax.swing.JButton btnRegAdmi;
    private javax.swing.JComboBox<String> cmbOperacionExi;
    private javax.swing.JComboBox<String> cmbOperacionExiME;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblAM;
    private javax.swing.JLabel lblActModeloGeneral;
    private javax.swing.JLabel lblActModeloNuevaOper;
    private javax.swing.JLabel lblActModeloOper;
    private javax.swing.JLabel lblEliminarOperacion;
    private javax.swing.JLabel lblNM;
    private javax.swing.JLabel lblNuevoModelo;
    private javax.swing.JLabel lblNuevoModeloAgrOper;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTabbedPane pnlActModelo;
    private javax.swing.JPanel pnlActOperacion;
    private javax.swing.JPanel pnlModelos;
    private javax.swing.JPanel pnlNuevaOper;
    private javax.swing.JPanel pnlNuevaOperAct;
    private javax.swing.JPanel pnlNuevaOperacion;
    private javax.swing.JPanel pnlNuevaOperacionAct;
    private javax.swing.JTabbedPane pnlNuevoModelo;
    private javax.swing.JTable tblEliminarOperacion;
    private javax.swing.JTable tblModelos;
    private javax.swing.JTable tblOperaciones;
    private javax.swing.JTable tblOperacionesAct;
    private javax.swing.JTextField txtConsultarOper;
    private javax.swing.JTextField txtFiltrarOperacionA;
    private javax.swing.JTextField txtFiltrarOperacionN;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdAct;
    private javax.swing.JTextField txtIdOperAct;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreAct;
    private javax.swing.JTextField txtNombreOperAct;
    private javax.swing.JTextField txtNuevaOperDesc;
    private javax.swing.JTextField txtNuevaOperDescME;
    private javax.swing.JTextField txtNuevaOperId;
    private javax.swing.JTextField txtNuevaOperIdME;
    private javax.swing.JTextField txtNuevaOperPrecio;
    private javax.swing.JTextField txtNuevaOperPrecioME;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioAct;
    private javax.swing.JTextField txtPrecioOperAct;
    // End of variables declaration//GEN-END:variables

    
}
