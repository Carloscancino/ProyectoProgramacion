/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoferreteria.GUI;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectoferreteria.BO.UsuariosBO;
import proyectoferreteria.DAO.Conexion;
import proyectoferreteria.DAO.UsuariosDAO;

/**
 *
 * @author Emmanuel
 */
public class LoginFerreteria extends javax.swing.JFrame {

    /**
     * Creates new form LoginFerreteria
     */
    UsuariosDAO metodp = new UsuariosDAO();
    public LoginFerreteria() {
        initComponents();
        ImageIcon imagen = new ImageIcon("src/Imagenes/candado.png");
        Icon icono = new ImageIcon (imagen.getImage().getScaledInstance(lblImagenLogi.getWidth(), lblImagenLogi.getHeight(), Image.SCALE_DEFAULT));
        lblImagenLogi.setIcon(icono);
        this.repaint();
        this.setLocationRelativeTo(null);
        btnEntrLogi.addKeyListener(new PresionarEnter());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNewProd = new javax.swing.JButton();
        btnGuarProd = new javax.swing.JButton();
        lblImagenLogi = new javax.swing.JLabel();
        lblUsuLogi = new javax.swing.JLabel();
        lblContraLogi = new javax.swing.JLabel();
        txtUsuLogi = new javax.swing.JTextField();
        btnEntrLogi = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        txtContraLogi = new javax.swing.JPasswordField();

        btnNewProd.setText("Nuevo");

        btnGuarProd.setText("Guardar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla de acceso");

        lblUsuLogi.setText("Usuario:");

        lblContraLogi.setText("Contraseña:");

        btnEntrLogi.setBackground(new java.awt.Color(95, 186, 125));
        btnEntrLogi.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrLogi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/palomita.png"))); // NOI18N
        btnEntrLogi.setText("Accesar");
        btnEntrLogi.setMaximumSize(new java.awt.Dimension(95, 25));
        btnEntrLogi.setMinimumSize(new java.awt.Dimension(95, 25));
        btnEntrLogi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrLogiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImagenLogi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuLogi)
                                    .addComponent(lblContraLogi))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContraLogi, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(txtUsuLogi)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEntrLogi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblImagenLogi, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuLogi)
                            .addComponent(txtUsuLogi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContraLogi)
                            .addComponent(txtContraLogi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(btnEntrLogi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class PresionarEnter extends KeyAdapter { 
      public void keyPressed(KeyEvent ke) {
          if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
              btnEntrLogiActionPerformed(null);
          }
      }
    }

    private void btnEntrLogiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrLogiActionPerformed
        UsuariosBO objUsuari = new UsuariosBO();
        objUsuari.setUsuario(txtUsuLogi.getText());
        objUsuari.setContaseña(txtContraLogi.getText());
        String Usuario = "";
        String Coontraseña = "";

        ResultSet resultado = metodp.Buscar(objUsuari);
        try 
        {           
            while(resultado.next())
            {
                Usuario = resultado.getString(2);
                Coontraseña = resultado.getString(3);
            }
            if(objUsuari.getUsuario().equals(Usuario)&& objUsuari.getContaseña().equals(Coontraseña))
            {
                MainForm abrir = new MainForm();
                abrir.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        } catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        } 
    }//GEN-LAST:event_btnEntrLogiActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFerreteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFerreteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFerreteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFerreteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFerreteria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrLogi;
    private javax.swing.JButton btnGuarProd;
    private javax.swing.JButton btnNewProd;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblContraLogi;
    private javax.swing.JLabel lblImagenLogi;
    private javax.swing.JLabel lblUsuLogi;
    private javax.swing.JPasswordField txtContraLogi;
    private javax.swing.JTextField txtUsuLogi;
    // End of variables declaration//GEN-END:variables
}
