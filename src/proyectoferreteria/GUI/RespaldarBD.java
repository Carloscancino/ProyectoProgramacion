/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoferreteria.GUI;

/**
 *
 * @author Emmanuel
 */
public class RespaldarBD extends javax.swing.JInternalFrame {

    /**
     * Creates new form RespaldarBD
     */
    public RespaldarBD() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRespBD = new javax.swing.JPanel();
        lblServRespBD = new javax.swing.JLabel();
        txtServRespBD = new javax.swing.JTextField();
        lblUserRespBD = new javax.swing.JLabel();
        txtUserRespBD = new javax.swing.JTextField();
        lblContrRespBD = new javax.swing.JLabel();
        lblBDRespBD = new javax.swing.JLabel();
        txtBDRespBD = new javax.swing.JTextField();
        lblRespalRespBD = new javax.swing.JLabel();
        txtRespalRespBD = new javax.swing.JTextField();
        btnSeleccRespBD = new javax.swing.JButton();
        btnGeneRespBD = new javax.swing.JButton();
        btnCancRespBD = new javax.swing.JButton();
        txtContrRespBD = new javax.swing.JPasswordField();

        setClosable(true);
        setTitle("Respaldar de la base de datos");

        pnlRespBD.setBorder(javax.swing.BorderFactory.createTitledBorder("Información del Respaldo"));

        lblServRespBD.setText("Servidor:");

        txtServRespBD.setText("localhost");
        txtServRespBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServRespBDActionPerformed(evt);
            }
        });

        lblUserRespBD.setText("Usuario:");

        txtUserRespBD.setText("root");

        lblContrRespBD.setText("Contraseña:");

        lblBDRespBD.setText("Base de datos:");

        lblRespalRespBD.setText("Respaldar en:");

        txtRespalRespBD.setEditable(false);

        btnSeleccRespBD.setText("Seleccionar");

        btnGeneRespBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bdrpBD.png"))); // NOI18N
        btnGeneRespBD.setText("Generar");

        btnCancRespBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancRespBD.setText("Cancelar");

        txtContrRespBD.setText("jPasswordField1");

        javax.swing.GroupLayout pnlRespBDLayout = new javax.swing.GroupLayout(pnlRespBD);
        pnlRespBD.setLayout(pnlRespBDLayout);
        pnlRespBDLayout.setHorizontalGroup(
            pnlRespBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRespBDLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlRespBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblServRespBD)
                    .addComponent(lblUserRespBD)
                    .addComponent(lblContrRespBD)
                    .addComponent(lblBDRespBD)
                    .addComponent(lblRespalRespBD))
                .addGap(11, 11, 11)
                .addGroup(pnlRespBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRespBDLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtRespalRespBD, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnSeleccRespBD)
                        .addGap(107, 107, 107))
                    .addGroup(pnlRespBDLayout.createSequentialGroup()
                        .addGroup(pnlRespBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBDRespBD, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlRespBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUserRespBD)
                                .addComponent(txtServRespBD)
                                .addComponent(txtContrRespBD, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                            .addGroup(pnlRespBDLayout.createSequentialGroup()
                                .addComponent(btnGeneRespBD, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(btnCancRespBD, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlRespBDLayout.setVerticalGroup(
            pnlRespBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRespBDLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlRespBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServRespBD)
                    .addComponent(txtServRespBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRespBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserRespBD)
                    .addComponent(txtUserRespBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRespBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrRespBD)
                    .addComponent(txtContrRespBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRespBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBDRespBD)
                    .addComponent(txtBDRespBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRespBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRespalRespBD)
                    .addComponent(txtRespalRespBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccRespBD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(pnlRespBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGeneRespBD)
                    .addComponent(btnCancRespBD, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRespBD, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRespBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtServRespBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServRespBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServRespBDActionPerformed

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
            java.util.logging.Logger.getLogger(RespaldarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RespaldarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RespaldarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RespaldarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RespaldarBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancRespBD;
    private javax.swing.JButton btnGeneRespBD;
    private javax.swing.JButton btnSeleccRespBD;
    private javax.swing.JLabel lblBDRespBD;
    private javax.swing.JLabel lblContrRespBD;
    private javax.swing.JLabel lblRespalRespBD;
    private javax.swing.JLabel lblServRespBD;
    private javax.swing.JLabel lblUserRespBD;
    private javax.swing.JPanel pnlRespBD;
    private javax.swing.JTextField txtBDRespBD;
    private javax.swing.JPasswordField txtContrRespBD;
    private javax.swing.JTextField txtRespalRespBD;
    private javax.swing.JTextField txtServRespBD;
    private javax.swing.JTextField txtUserRespBD;
    // End of variables declaration//GEN-END:variables
}