/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoferreteria.GUI;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoferreteria.BO.UsuariosBO;
import proyectoferreteria.DAO.ManejoDeImagenes;
import proyectoferreteria.DAO.UsuariosDAO;

/**
 *
 * @author Emmanuel
 */
public class NuevoEmpleados extends javax.swing.JInternalFrame {

    /**
     * Creates new form NuevoEmpleados
     */
    DefaultTableModel dtm = new DefaultTableModel();
    JFileChooser SelectorImagenes;
    String rutaImagem="";
    UsuariosDAO metodos = new UsuariosDAO();
    ManejoDeImagenes metodosImagen = new ManejoDeImagenes();
    byte[] imag;
    
    public NuevoEmpleados() {
        initComponents();
        actualizarJtable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbpnlNuevoEmpleado = new javax.swing.JTabbedPane();
        pnlNuevEmple = new javax.swing.JPanel();
        lblIdNuevEmple = new javax.swing.JLabel();
        lblNomNuevEmple = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlEstadoNuevEmple = new javax.swing.JPanel();
        rbtnActiNueEmple = new javax.swing.JRadioButton();
        rbtnInacNueEmple = new javax.swing.JRadioButton();
        lblemailNuevEmple = new javax.swing.JLabel();
        lblSuelNuevEmple = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtIDNuevEmple = new javax.swing.JTextField();
        txtNombNuevEmple = new javax.swing.JTextField();
        txtApelliNuevEmple = new javax.swing.JTextField();
        rbtnMascNueEmple = new javax.swing.JRadioButton();
        rbtnFemeNueEmple = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtEmailNueEmple = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtFNcimiento = new com.toedter.calendar.JDateChooser();
        txtTelefono = new javax.swing.JTextField();
        txtUsuarioUser = new javax.swing.JTextField();
        txtContrseña = new javax.swing.JPasswordField();
        cbxTipoUsuario = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        JBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        btnExaminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbBusNuevEmple1 = new javax.swing.JTable();
        tbBusNuevEmple1 = new javax.swing.JTable();
        dtm = new DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Usuario", "Contraseña", "Tipo"
            }
        );

        setClosable(true);

        pnlNuevEmple.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del empleado"));

        lblIdNuevEmple.setText("ID Empleado:");

        lblNomNuevEmple.setText("Nombre:");

        jLabel3.setText("Apelldios:");

        jLabel4.setText("Sexo:");

        pnlEstadoNuevEmple.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado"));

        rbtnActiNueEmple.setText("ACTIVO");

        rbtnInacNueEmple.setText("INACTIVO");

        javax.swing.GroupLayout pnlEstadoNuevEmpleLayout = new javax.swing.GroupLayout(pnlEstadoNuevEmple);
        pnlEstadoNuevEmple.setLayout(pnlEstadoNuevEmpleLayout);
        pnlEstadoNuevEmpleLayout.setHorizontalGroup(
            pnlEstadoNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstadoNuevEmpleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnActiNueEmple)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnInacNueEmple)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEstadoNuevEmpleLayout.setVerticalGroup(
            pnlEstadoNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEstadoNuevEmpleLayout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(pnlEstadoNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnActiNueEmple)
                    .addComponent(rbtnInacNueEmple)))
        );

        lblemailNuevEmple.setText("Email:");

        lblSuelNuevEmple.setText("DNI:");

        jLabel9.setText("Fecha de nacimiento:");

        jLabel10.setText("Dirección:");

        jLabel11.setText("Teléfono");

        rbtnMascNueEmple.setText("Masculino");

        rbtnFemeNueEmple.setText("Femenino");
        rbtnFemeNueEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFemeNueEmpleActionPerformed(evt);
            }
        });

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        jScrollPane2.setViewportView(txtDireccion);

        jLabel14.setText("Usuario:");

        jLabel15.setText("Contraseña:");

        jLabel16.setText("Tipo de usuario:");

        cbxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cajero", "Vendedor" }));

        btnAgregar.setBackground(new java.awt.Color(95, 186, 125));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnAgregar.setText("Agregrar");
        btnAgregar.setName("agregar"); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        JBuscar.setBackground(new java.awt.Color(95, 186, 125));
        JBuscar.setForeground(new java.awt.Color(255, 255, 255));
        JBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        JBuscar.setText("Buscar");
        JBuscar.setName("buscar"); // NOI18N
        JBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(95, 186, 125));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setName("actualizar"); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(95, 186, 125));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setName("eliminar"); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagen"));

        lblImagen.setBackground(new java.awt.Color(153, 153, 153));
        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnExaminar.setBackground(new java.awt.Color(95, 186, 125));
        btnExaminar.setForeground(new java.awt.Color(255, 255, 255));
        btnExaminar.setText("Examinar");
        btnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnExaminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbBusNuevEmple1.setModel(dtm);
        tbBusNuevEmple1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBusNuevEmple1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbBusNuevEmple1);

        javax.swing.GroupLayout pnlNuevEmpleLayout = new javax.swing.GroupLayout(pnlNuevEmple);
        pnlNuevEmple.setLayout(pnlNuevEmpleLayout);
        pnlNuevEmpleLayout.setHorizontalGroup(
            pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                        .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNuevEmpleLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2))
                            .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                                .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdNuevEmple)
                                    .addComponent(lblNomNuevEmple)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                                        .addComponent(txtIDNuevEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel9))
                                    .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                                        .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                                                .addComponent(rbtnMascNueEmple)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                                .addComponent(rbtnFemeNueEmple))
                                            .addComponent(txtApelliNuevEmple, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombNuevEmple, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblemailNuevEmple)
                                            .addComponent(lblSuelNuevEmple))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDNI)
                                    .addComponent(txtFNcimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                                        .addComponent(pnlEstadoNuevEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtEmailNueEmple))))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNuevEmpleLayout.createSequentialGroup()
                        .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(4, 4, 4)
                                .addComponent(txtContrseña, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(240, 240, 240))
                            .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(23, 23, 23)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtUsuarioUser))
                                    .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNuevEmpleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
            .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnAgregar)
                .addGap(31, 31, 31)
                .addComponent(btnEliminar)
                .addGap(26, 26, 26)
                .addComponent(btnActualizar)
                .addGap(22, 22, 22)
                .addComponent(JBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNuevEmpleLayout.setVerticalGroup(
            pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblIdNuevEmple)
                                .addComponent(txtIDNuevEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addComponent(txtFNcimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomNuevEmple)
                            .addComponent(txtNombNuevEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblemailNuevEmple)
                            .addComponent(txtEmailNueEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApelliNuevEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSuelNuevEmple)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(rbtnMascNueEmple)
                                    .addComponent(rbtnFemeNueEmple)))
                            .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlEstadoNuevEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNuevEmpleLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtContrseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(cbxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(txtUsuarioUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlNuevEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tbpnlNuevoEmpleado.addTab("Usuarios", pnlNuevEmple);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpnlNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbpnlNuevoEmpleado)
                .addContainerGap())
        );

        tbpnlNuevoEmpleado.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbBusNuevEmple1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBusNuevEmple1MouseClicked
        String Id = dtm.getValueAt(tbBusNuevEmple1.getSelectedRow(), 0).toString();
        UsuariosBO Datos = metodos.LlenarCampos(Id);
        
        txtIDNuevEmple.setText(Datos.getCodigo());
        txtNombNuevEmple.setText(Datos.getNombre());
        txtApelliNuevEmple.setText(Datos.getApellido());
        txtDireccion.setText(Datos.getDireccion());
        txtTelefono.setText(Datos.getTelefono());
        txtEmailNueEmple.setText(Datos.getCorreo());
        txtDNI.setText(Datos.getDNI());
        txtUsuarioUser.setText(Datos.getUsuario());
        txtContrseña.setText(Datos.getContrasena());
        
        lblImagen.setIcon(metodosImagen.MostrarImagen("empleado","id_empleado",Id,lblImagen));
        imag = metodosImagen.MostrarImagenBYTE("empleado","id_empleado",Id);
    }//GEN-LAST:event_tbBusNuevEmple1MouseClicked

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed
        SeleccionarImagen(lblImagen);
    }//GEN-LAST:event_btnExaminarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        metodos.ModificarConImagen(RecuperarDatos());
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void JBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBuscarActionPerformed

    }//GEN-LAST:event_JBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try
        {
            metodos.AgregarConIagen(RecuperarDatos());
            actualizarJtable();

        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void rbtnFemeNueEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFemeNueEmpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnFemeNueEmpleActionPerformed

    public void SeleccionarImagen(JLabel lblImagen)
    {   
        SelectorImagenes= new JFileChooser();
        if(SelectorImagenes.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
        {
          File Archivo= SelectorImagenes.getSelectedFile();
          String RutaArchivo= Archivo.getAbsolutePath();
          rutaImagem = Archivo.getPath();
          ImageIcon ImagenP=new ImageIcon(((new ImageIcon(RutaArchivo)).getImage()).getScaledInstance(lblImagen.getWidth(),lblImagen.getHeight(), java.awt.Image.SCALE_SMOOTH));
          lblImagen.setIcon(ImagenP);
          System.out.println("Nombre Imagen:"+Archivo.getName());        
        }    
    }
    
    public byte[] obtenerBytes(String ruta)
    {
        try
        {
            File imagen = new File(ruta);
            FileInputStream fis = new FileInputStream(imagen);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int i; (i=fis.read(buf))!=-1;)
            {
                bos.write(buf,0,i);
            }
            byte[] mapaBits = bos.toByteArray();
            return mapaBits;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public UsuariosBO RecuperarDatos()
    {
        UsuariosBO objUsuariosBO = new UsuariosBO();
        
        objUsuariosBO.setCodigo(txtIDNuevEmple.getText()); 
        objUsuariosBO.setNombre(txtNombNuevEmple.getText()); 
        objUsuariosBO.setApellido(txtApelliNuevEmple.getText());
        objUsuariosBO.setDireccion(txtDireccion.getText());
        objUsuariosBO.setTelefono(txtTelefono.getText());
        objUsuariosBO.setCorreo(txtEmailNueEmple.getText());
        objUsuariosBO.setUsuario(txtUsuarioUser.getText());
        objUsuariosBO.setDNI(txtDNI.getText());
        objUsuariosBO.setContrasena(txtContrseña.getText());
        objUsuariosBO.setRol(cbxTipoUsuario.getSelectedItem().toString());
        if(!rutaImagem.equals(""))
        {
            objUsuariosBO.setImagen(obtenerBytes(rutaImagem));  
        }
        else
        {
            objUsuariosBO.setImagen(imag);
        } 
        return objUsuariosBO;
    }
    
    public void actualizarJtable()
    {
        dtm = metodos.Llenar();
        tbBusNuevEmple1.setModel(dtm);   
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBuscar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JComboBox<String> cbxTipoUsuario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblIdNuevEmple;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNomNuevEmple;
    private javax.swing.JLabel lblSuelNuevEmple;
    private javax.swing.JLabel lblemailNuevEmple;
    private javax.swing.JPanel pnlEstadoNuevEmple;
    private javax.swing.JPanel pnlNuevEmple;
    private javax.swing.JRadioButton rbtnActiNueEmple;
    private javax.swing.JRadioButton rbtnFemeNueEmple;
    private javax.swing.JRadioButton rbtnInacNueEmple;
    private javax.swing.JRadioButton rbtnMascNueEmple;
    private javax.swing.JTable tbBusNuevEmple1;
    private javax.swing.JTabbedPane tbpnlNuevoEmpleado;
    private javax.swing.JTextField txtApelliNuevEmple;
    private javax.swing.JPasswordField txtContrseña;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtEmailNueEmple;
    private com.toedter.calendar.JDateChooser txtFNcimiento;
    private javax.swing.JTextField txtIDNuevEmple;
    private javax.swing.JTextField txtNombNuevEmple;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuarioUser;
    // End of variables declaration//GEN-END:variables
}
