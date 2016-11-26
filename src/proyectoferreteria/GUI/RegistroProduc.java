/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoferreteria.GUI;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author elektra
 */
public class RegistroProduc extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ventas
     */
    public RegistroProduc() {
        initComponents();
       // txtFechProd.setText(fechaactual());
        //setLocation(0, 90);
        calenDeREPro.setEnabled(false);
        calenAREPro.setEnabled(false);
        spinDescREProd.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int activar = Integer.parseInt(spinDescREProd.getValue().toString());
                if (activar != 0)
                {
                    calenDeREPro.setEnabled(true);
                    calenAREPro.setEnabled(true);
                }
                else
                {
                    calenDeREPro.setEnabled(false);
                    calenAREPro.setEnabled(false);
                }
            }
        });   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegistrarProduc = new javax.swing.JPanel();
        jblBuscarProduc1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCodProd = new javax.swing.JLabel();
        lblNomProd = new javax.swing.JLabel();
        lblCatProd = new javax.swing.JLabel();
        lblMarProd = new javax.swing.JLabel();
        txtCodREProd = new javax.swing.JTextField();
        lblCantPro = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescProd = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtNomREProd = new javax.swing.JTextField();
        txtMarcREPro = new javax.swing.JTextField();
        txtCantREPro = new javax.swing.JTextField();
        lblImaProd = new javax.swing.JLabel();
        cbxCateREPro = new javax.swing.JComboBox<>();
        lblUnidProd = new javax.swing.JLabel();
        cbxUnidREPro = new javax.swing.JComboBox<>();
        lblProvProd1 = new javax.swing.JLabel();
        txtProveREPro = new javax.swing.JTextField();
        btnCargarREProd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblPreComProd = new javax.swing.JLabel();
        lblPreVenProd = new javax.swing.JLabel();
        lblUtilProd = new javax.swing.JLabel();
        txtPreComREPro = new javax.swing.JTextField();
        txtPreVentREPro = new javax.swing.JTextField();
        txtUtilREPro = new javax.swing.JTextField();
        txtIvaREPro = new javax.swing.JTextField();
        lblIvaProd = new javax.swing.JLabel();
        lblIvaProd1 = new javax.swing.JLabel();
        lblDescDeREPRrod = new javax.swing.JLabel();
        lblDescAREPRrod = new javax.swing.JLabel();
        spinDescREProd = new javax.swing.JSpinner();
        calenDeREPro = new com.toedter.calendar.JDateChooser();
        calenAREPro = new com.toedter.calendar.JDateChooser();
        btnNewProd = new javax.swing.JButton();
        btnGuarProd = new javax.swing.JButton();
        btnModifProd = new javax.swing.JButton();
        btnCancelProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Registro Productos");
        setToolTipText("");

        pnlRegistrarProduc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlRegistrarProduc.setToolTipText("");

        jblBuscarProduc1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jblBuscarProduc1.setText("REGISTRAR PRODUCTO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Características del producto"));

        lblCodProd.setText("Código:");

        lblNomProd.setText("Nombre:");

        lblCatProd.setText("Categoría:");

        lblMarProd.setText("Marca:");

        lblCantPro.setText("Cantidad:");

        jLabel7.setText("Descripción:");

        txtDescProd.setColumns(20);
        txtDescProd.setRows(5);
        jScrollPane2.setViewportView(txtDescProd);

        jLabel5.setText("Imagen:");

        lblImaProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbxCateREPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasfiteria", "Plomería", "Electricidad" }));

        lblUnidProd.setText("Unidad:");

        cbxUnidREPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unid.", "m.", "mm.", "cm.", "Kg.", "Bulto", "Caja", " " }));

        lblProvProd1.setText("Proveedor:");

        btnCargarREProd.setText("Cargar");
        btnCargarREProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarREProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCantPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMarProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMarcREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCodProd)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodREProd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCatProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxCateREPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomProd)
                        .addGap(14, 14, 14)
                        .addComponent(txtNomREProd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblUnidProd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxUnidREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblProvProd1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProveREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCargarREProd)
                        .addGap(73, 73, 73))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodProd)
                            .addComponent(txtCodREProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomProd)
                            .addComponent(txtNomREProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCatProd)
                            .addComponent(cbxCateREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarProd)
                    .addComponent(txtMarcREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxUnidREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnidProd))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantPro)
                    .addComponent(txtCantREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProvProd1)
                    .addComponent(txtProveREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(102, 102, 102)))
                .addGap(18, 18, 18)
                .addComponent(btnCargarREProd)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles del Precio y Utilidades"));

        lblPreComProd.setText("Precio de compra:");

        lblPreVenProd.setText("Precio de venta:");

        lblUtilProd.setText("Utilidad %:");

        txtIvaREPro.setText("15");

        lblIvaProd.setText("IVA %:");

        lblIvaProd1.setText("Descuento %:");

        lblDescDeREPRrod.setText("De:");

        lblDescAREPRrod.setText("A:");

        spinDescREProd.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPreComProd)
                    .addComponent(lblIvaProd1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPreComREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(lblPreVenProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreVentREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(spinDescREProd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDescDeREPRrod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calenDeREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescAREPRrod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calenAREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblIvaProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIvaREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblUtilProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUtilREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreComProd)
                    .addComponent(txtPreComREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPreVenProd)
                    .addComponent(txtPreVentREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUtilProd)
                    .addComponent(txtUtilREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIvaProd)
                        .addComponent(txtIvaREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIvaProd1)
                        .addComponent(lblDescDeREPRrod)
                        .addComponent(lblDescAREPRrod)
                        .addComponent(spinDescREProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calenDeREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calenAREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNewProd.setBackground(new java.awt.Color(95, 186, 125));
        btnNewProd.setForeground(new java.awt.Color(255, 255, 255));
        btnNewProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btnNewProd.setText("Nuevo");
        btnNewProd.setMaximumSize(new java.awt.Dimension(95, 25));
        btnNewProd.setMinimumSize(new java.awt.Dimension(95, 25));

        btnGuarProd.setBackground(new java.awt.Color(95, 186, 125));
        btnGuarProd.setForeground(new java.awt.Color(255, 255, 255));
        btnGuarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnGuarProd.setText("Guardar");
        btnGuarProd.setMaximumSize(new java.awt.Dimension(95, 25));
        btnGuarProd.setMinimumSize(new java.awt.Dimension(95, 25));

        btnModifProd.setBackground(new java.awt.Color(95, 186, 125));
        btnModifProd.setForeground(new java.awt.Color(255, 255, 255));
        btnModifProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModifProd.setText("Modificar");

        btnCancelProd.setBackground(new java.awt.Color(95, 186, 125));
        btnCancelProd.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelProd.setText("Cancelar");

        javax.swing.GroupLayout pnlRegistrarProducLayout = new javax.swing.GroupLayout(pnlRegistrarProduc);
        pnlRegistrarProduc.setLayout(pnlRegistrarProducLayout);
        pnlRegistrarProducLayout.setHorizontalGroup(
            pnlRegistrarProducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarProducLayout.createSequentialGroup()
                .addGroup(pnlRegistrarProducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistrarProducLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnNewProd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnGuarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnModifProd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnCancelProd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRegistrarProducLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRegistrarProducLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlRegistrarProducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblBuscarProduc1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRegistrarProducLayout.setVerticalGroup(
            pnlRegistrarProducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrarProducLayout.createSequentialGroup()
                .addComponent(jblBuscarProduc1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegistrarProducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNewProd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelProd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegistrarProduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegistrarProduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarREProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarREProdActionPerformed
        // TODO add your handling code here:
        SeleccionarImagen(lblImaProd);
    }//GEN-LAST:event_btnCargarREProdActionPerformed

    public void SeleccionarImagen(JLabel lblImagen)
    {
        JFileChooser SelectorImagenes = new JFileChooser();
        if(SelectorImagenes.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
          File Archivo = SelectorImagenes.getSelectedFile();
          String RutaArchivo = Archivo.getAbsolutePath();
          
         ImageIcon ImagenP=new ImageIcon(((new ImageIcon(RutaArchivo)).getImage()).getScaledInstance(lblImagen.getWidth(),lblImagen.getHeight(), java.awt.Image.SCALE_SMOOTH));
         lblImagen.setIcon(ImagenP);
            System.out.println("Nombre Imagen:" + Archivo.getName());
        }   
    }
        
    public static String fechaactual()
    {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelProd;
    private javax.swing.JButton btnCargarREProd;
    private javax.swing.JButton btnGuarProd;
    private javax.swing.JButton btnModifProd;
    private javax.swing.JButton btnNewProd;
    private com.toedter.calendar.JDateChooser calenAREPro;
    private com.toedter.calendar.JDateChooser calenDeREPro;
    private javax.swing.JComboBox<String> cbxCateREPro;
    private javax.swing.JComboBox<String> cbxUnidREPro;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jblBuscarProduc1;
    private javax.swing.JLabel lblCantPro;
    private javax.swing.JLabel lblCatProd;
    private javax.swing.JLabel lblCodProd;
    private javax.swing.JLabel lblDescAREPRrod;
    private javax.swing.JLabel lblDescDeREPRrod;
    private javax.swing.JLabel lblImaProd;
    private javax.swing.JLabel lblIvaProd;
    private javax.swing.JLabel lblIvaProd1;
    private javax.swing.JLabel lblMarProd;
    private javax.swing.JLabel lblNomProd;
    private javax.swing.JLabel lblPreComProd;
    private javax.swing.JLabel lblPreVenProd;
    private javax.swing.JLabel lblProvProd1;
    private javax.swing.JLabel lblUnidProd;
    private javax.swing.JLabel lblUtilProd;
    private javax.swing.JPanel pnlRegistrarProduc;
    private javax.swing.JSpinner spinDescREProd;
    private javax.swing.JTextField txtCantREPro;
    private javax.swing.JTextField txtCodREProd;
    private javax.swing.JTextArea txtDescProd;
    private javax.swing.JTextField txtIvaREPro;
    private javax.swing.JTextField txtMarcREPro;
    private javax.swing.JTextField txtNomREProd;
    private javax.swing.JTextField txtPreComREPro;
    private javax.swing.JTextField txtPreVentREPro;
    private javax.swing.JTextField txtProveREPro;
    private javax.swing.JTextField txtUtilREPro;
    // End of variables declaration//GEN-END:variables
}
