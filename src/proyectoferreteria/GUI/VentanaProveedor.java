/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoferreteria.GUI;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyectoferreteria.BO.ProveedorBO;
import proyectoferreteria.DAO.ProveedorDAO;

/**
 *
 * @author Emmanuel
 */
public class VentanaProveedor extends javax.swing.JInternalFrame {
        DefaultTableModel dtm= new DefaultTableModel(
        new Object [][] { },
        new String [] {
        "Código", "Nombre", "Direccion", "Email","Telefono","Estatus"
    });
    ProveedorBO ObjUsuariosBO= new ProveedorBO();
    ProveedorDAO objUsuariosDAO= new ProveedorDAO();

    /**
     * Creates new form VentanaProveedor
     */
    public VentanaProveedor() {
        initComponents();
        ActualizarTabla();
        txtCodigoProve.setEnabled(false);
        txtEstatus.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrinProve = new javax.swing.JPanel();
        txtNombVENProve = new javax.swing.JLabel();
        txtNombreProve = new javax.swing.JTextField();
        lblDireccVENProve = new javax.swing.JLabel();
        txtDireccionProve = new javax.swing.JTextField();
        lblTelVENProve = new javax.swing.JLabel();
        txtTelefonoProve = new javax.swing.JTextField();
        lblCorreVENProve = new javax.swing.JLabel();
        txtCorreoProve = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAgregarProveedor = new javax.swing.JButton();
        btnModificarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        btnLimpiarProveedor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoProve = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEstatus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();

        setClosable(true);

        pnlPrinProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Información de la empresa"));

        txtNombVENProve.setText("Nombre:");

        txtNombreProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProveActionPerformed(evt);
            }
        });

        lblDireccVENProve.setText("Dirección:");

        lblTelVENProve.setText("Teléfono:");

        lblCorreVENProve.setText("E-MAIL:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnAgregarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/palomita.png"))); // NOI18N
        btnAgregarProveedor.setText("Agregar");
        btnAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProveedorActionPerformed(evt);
            }
        });

        btnModificarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarProveedor.setText("Modificar");
        btnModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProveedorActionPerformed(evt);
            }
        });

        btnEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnEliminarProveedor.setText("Elimnar");
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        btnLimpiarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnLimpiarProveedor.setText("Limpiar");
        btnLimpiarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnAgregarProveedor)
                .addGap(18, 18, 18)
                .addComponent(btnModificarProveedor)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnLimpiarProveedor)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarProveedor)
                    .addComponent(btnModificarProveedor)
                    .addComponent(btnEliminarProveedor)
                    .addComponent(btnLimpiarProveedor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Codigo:");

        jLabel2.setText("Estatus:");

        javax.swing.GroupLayout pnlPrinProveLayout = new javax.swing.GroupLayout(pnlPrinProve);
        pnlPrinProve.setLayout(pnlPrinProveLayout);
        pnlPrinProveLayout.setHorizontalGroup(
            pnlPrinProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrinProveLayout.createSequentialGroup()
                .addGroup(pnlPrinProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrinProveLayout.createSequentialGroup()
                        .addGroup(pnlPrinProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrinProveLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txtNombVENProve)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrinProveLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlPrinProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrinProveLayout.createSequentialGroup()
                                        .addComponent(lblDireccVENProve)
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrinProveLayout.createSequentialGroup()
                                        .addComponent(lblCorreVENProve)
                                        .addGap(18, 18, 18)))))
                        .addGroup(pnlPrinProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccionProve, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreProve, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreoProve, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlPrinProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrinProveLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrinProveLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlPrinProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrinProveLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrinProveLayout.createSequentialGroup()
                                        .addComponent(lblTelVENProve)
                                        .addGap(18, 18, 18)))))
                        .addGroup(pnlPrinProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoProve, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoProve, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlPrinProveLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlPrinProveLayout.setVerticalGroup(
            pnlPrinProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrinProveLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlPrinProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrinProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtCodigoProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrinProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombVENProve)
                        .addComponent(txtNombreProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(pnlPrinProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrinProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrinProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDireccVENProve)
                        .addComponent(txtDireccionProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(pnlPrinProveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreVENProve)
                    .addComponent(lblTelVENProve)
                    .addComponent(txtTelefonoProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Dirección", "Ciudad", "Teléfono", "E-MAIL"
            }
        ));
        tblProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addComponent(pnlPrinProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(pnlPrinProve, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProveActionPerformed

    private void btnAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProveedorActionPerformed
        // TODO add your handling code here:
        if(txtNombreProve.getText().equals("")||txtDireccionProve.getText().equals("")||txtCorreoProve.getText().equals("")||txtTelefonoProve.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Llene todos los datos correctamente");
        }
        else{
            txtEstatus.setText("1");
        if(objUsuariosDAO.Agregar(RecoletarDatos())==1)
        {
            JOptionPane.showMessageDialog(null,"Información Agregada");
        }
            
        }

     ActualizarTabla();
     Limpiar();
    }//GEN-LAST:event_btnAgregarProveedorActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        // TODO add your handling code here:
         txtEstatus.setText("0");
        if(objUsuariosDAO.Eliminar(RecoletarDatos())==1)
        {
           
            JOptionPane.showMessageDialog(null,"Información eliminada");
        }
        ActualizarTabla();
        Limpiar();
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnLimpiarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProveedorActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnLimpiarProveedorActionPerformed

    private void btnModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProveedorActionPerformed
        // TODO add your handling code here:
        
        if(objUsuariosDAO.Modificar(RecoletarDatos())==1)
        {
            JOptionPane.showMessageDialog(null,"Información modificada");
        }
        ActualizarTabla();
        Limpiar();
    }//GEN-LAST:event_btnModificarProveedorActionPerformed

    private void tblProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedorMouseClicked
        // TODO add your handling code here:
        int row = tblProveedor.getSelectedRow();
        System.out.println("--"+row);
        
        JTable target = (JTable)evt.getSource();
        txtCodigoProve.setText(target.getValueAt(target.getSelectedRow(), 0).toString());
        txtNombreProve.setText(target.getValueAt(target.getSelectedRow(), 1).toString());
        txtDireccionProve.setText(target.getValueAt(target.getSelectedRow(), 2).toString());
        txtCorreoProve.setText(target.getValueAt(target.getSelectedRow(), 3).toString());
        txtTelefonoProve.setText(target.getValueAt(target.getSelectedRow(), 4).toString());
        txtEstatus.setText(target.getValueAt(target.getSelectedRow(), 5).toString());
        
        
         btnEliminarProveedor.setEnabled(true);
         btnModificarProveedor.setEnabled(true);
         btnAgregarProveedor.setEnabled(false);
         
    }//GEN-LAST:event_tblProveedorMouseClicked

    public void Limpiar(){
  txtCodigoProve.setText("");
  txtNombreProve.setText("");
  txtDireccionProve.setText("");
  txtCorreoProve.setText("");
  txtTelefonoProve.setText("");
  txtEstatus.setText("");

  btnEliminarProveedor.setEnabled(false);
  btnModificarProveedor.setEnabled(false);
  btnAgregarProveedor.setEnabled(true);
   
  } 
  
  public ProveedorBO RecoletarDatos(){
        
        ObjUsuariosBO.setCodigo(txtCodigoProve.getText());
        ObjUsuariosBO.setNombre(txtNombreProve.getText());
        ObjUsuariosBO.setDireccion(txtDireccionProve.getText());
        ObjUsuariosBO.setEmail(txtCorreoProve.getText());
        ObjUsuariosBO.setTelefono(txtTelefonoProve.getText());
        ObjUsuariosBO.setEstatus(txtEstatus.getText());
        
        return ObjUsuariosBO;
    }

 public void ActualizarTabla(){
    tblProveedor.setModel(objUsuariosDAO.Buscar(RecoletarDatos()));
    }  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProveedor;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnLimpiarProveedor;
    private javax.swing.JButton btnModificarProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCorreVENProve;
    private javax.swing.JLabel lblDireccVENProve;
    private javax.swing.JLabel lblTelVENProve;
    private javax.swing.JPanel pnlPrinProve;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTextField txtCodigoProve;
    private javax.swing.JTextField txtCorreoProve;
    private javax.swing.JTextField txtDireccionProve;
    private javax.swing.JTextField txtEstatus;
    private javax.swing.JLabel txtNombVENProve;
    private javax.swing.JTextField txtNombreProve;
    private javax.swing.JTextField txtTelefonoProve;
    // End of variables declaration//GEN-END:variables
}
