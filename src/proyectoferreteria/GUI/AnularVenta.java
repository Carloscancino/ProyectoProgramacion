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
public class AnularVenta extends javax.swing.JInternalFrame {

    /**
     * Creates new form AnularVenta
     */
    public AnularVenta() {
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

        pnlAnulVent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblAnulVent = new javax.swing.JTable();
        pnlOpcAnulVent = new javax.swing.JPanel();
        calenDeAnulVent = new com.toedter.calendar.JDateChooser();
        calenAAnulVent = new com.toedter.calendar.JDateChooser();
        btnBuscAnulVent = new javax.swing.JButton();
        btnAnulAnulVent = new javax.swing.JButton();
        lblDeAnulVent = new javax.swing.JLabel();
        lblAAnulVent = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Anulación de ventas");

        pnlAnulVent.setBorder(javax.swing.BorderFactory.createTitledBorder("Ventas Anuladas"));

        jtblAnulVent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NO DE VENTA", "VENDEDOR", "NOMBRE", "PRECIO", "CANTIDAD", "TOTAL", "FECHA DE VENTA"
            }
        ));
        jScrollPane1.setViewportView(jtblAnulVent);

        pnlOpcAnulVent.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones de búsqueda"));

        btnBuscAnulVent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar2.png"))); // NOI18N
        btnBuscAnulVent.setText("Buscar");

        btnAnulAnulVent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anular.png"))); // NOI18N
        btnAnulAnulVent.setText("Anular");

        lblDeAnulVent.setText("Desde:");

        lblAAnulVent.setText("Hasta:");

        javax.swing.GroupLayout pnlOpcAnulVentLayout = new javax.swing.GroupLayout(pnlOpcAnulVent);
        pnlOpcAnulVent.setLayout(pnlOpcAnulVentLayout);
        pnlOpcAnulVentLayout.setHorizontalGroup(
            pnlOpcAnulVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcAnulVentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpcAnulVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calenDeAnulVent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeAnulVent))
                .addGap(42, 42, 42)
                .addGroup(pnlOpcAnulVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calenAAnulVent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAAnulVent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnBuscAnulVent)
                .addGap(68, 68, 68)
                .addComponent(btnAnulAnulVent)
                .addGap(42, 42, 42))
        );
        pnlOpcAnulVentLayout.setVerticalGroup(
            pnlOpcAnulVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcAnulVentLayout.createSequentialGroup()
                .addGroup(pnlOpcAnulVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlOpcAnulVentLayout.createSequentialGroup()
                        .addGroup(pnlOpcAnulVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlOpcAnulVentLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblDeAnulVent))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpcAnulVentLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblAAnulVent)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlOpcAnulVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calenDeAnulVent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calenAAnulVent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlOpcAnulVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscAnulVent)
                        .addComponent(btnAnulAnulVent)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlAnulVentLayout = new javax.swing.GroupLayout(pnlAnulVent);
        pnlAnulVent.setLayout(pnlAnulVentLayout);
        pnlAnulVentLayout.setHorizontalGroup(
            pnlAnulVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnulVentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAnulVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                    .addGroup(pnlAnulVentLayout.createSequentialGroup()
                        .addComponent(pnlOpcAnulVent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlAnulVentLayout.setVerticalGroup(
            pnlAnulVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnulVentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOpcAnulVent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAnulVent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAnulVent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AnularVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnularVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnularVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnularVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnularVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnulAnulVent;
    private javax.swing.JButton btnBuscAnulVent;
    private com.toedter.calendar.JDateChooser calenAAnulVent;
    private com.toedter.calendar.JDateChooser calenDeAnulVent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblAnulVent;
    private javax.swing.JLabel lblAAnulVent;
    private javax.swing.JLabel lblDeAnulVent;
    private javax.swing.JPanel pnlAnulVent;
    private javax.swing.JPanel pnlOpcAnulVent;
    // End of variables declaration//GEN-END:variables
}
