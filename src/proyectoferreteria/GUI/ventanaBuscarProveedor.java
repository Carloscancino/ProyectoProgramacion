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
 * @author ORTIZ
 */
public class ventanaBuscarProveedor extends javax.swing.JDialog {
    ProveedorDAO objProveedorDAO = new ProveedorDAO();
    ProveedorBO objProveedorBO = new ProveedorBO();
    public String NombreProveedor = "";
    public String IdProveedor = "";
    
    public void ActualizarTabla(){
        jtproveedor.setModel(objProveedorDAO.Buscar(RecoletarDatos()));
    }   
    public ProveedorBO RecoletarDatos(){
        
        objProveedorBO.setNombre(txtbusqueda.getText());        
        return objProveedorBO;
    }    
    public ventanaBuscarProveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ActualizarTabla();
    }
    DefaultTableModel dtm= new DefaultTableModel(
        new Object [][] { },
        new String [] {
        "Código", "Nombre", "Direccion", "Email","Telefono","Estatus"
    });

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtproveedor = new javax.swing.JTable();
        cbxtipo = new javax.swing.JComboBox<>();
        txtbusqueda = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblproveedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtproveedor.setModel(dtm);
        jtproveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtproveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtproveedor);

        cbxtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Correo", "Teléfono" }));

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/palomita.png"))); // NOI18N
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar por:");

        jLabel2.setText("Seleccionado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblproveedor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lblproveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtproveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtproveedorMouseClicked
        int row = jtproveedor.getSelectedRow();
        System.out.println("--"+row);
        
        JTable target = (JTable)evt.getSource();
        lblproveedor.setText(target.getValueAt(target.getSelectedRow(), 1).toString()); 
        NombreProveedor = target.getValueAt(target.getSelectedRow(), 1).toString();
        IdProveedor = target.getValueAt(target.getSelectedRow(), 0).toString();
    }//GEN-LAST:event_jtproveedorMouseClicked

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        if(jtproveedor.getSelectedRowCount()<1)
        {
            JOptionPane.showMessageDialog(null, "Elegir Proveedor");
        }
        else
        {
            this.dispose();
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaBuscarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaBuscarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaBuscarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaBuscarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventanaBuscarProveedor dialog = new ventanaBuscarProveedor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JComboBox<String> cbxtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtproveedor;
    private javax.swing.JLabel lblproveedor;
    private javax.swing.JTextField txtbusqueda;
    // End of variables declaration//GEN-END:variables
}
