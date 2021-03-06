/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoferreteria.GUI;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoferreteria.BO.BuscarVentasBO;
import proyectoferreteria.DAO.BuscarVentasDAO;
/**
 *
 * @author Emmanuel
 */
public class BuscarVentas extends javax.swing.JInternalFrame {
    
    DefaultTableModel dtm= new DefaultTableModel(
        new Object [][] { },
        new String [] {
        "ID encabezado","Total","Descuento","Fecha","Estatus","ID empleado","ID cliente"
    });
    BuscarVentasBO ObjBuscarVentasBO= new BuscarVentasBO();
    BuscarVentasDAO objBuscarVentasDAO= new BuscarVentasDAO();

    /**
     * Creates new form BuscarVentas
     */
    public BuscarVentas() {
        initComponents();
        ActualizarTabla();
        lblFechaInicio.setVisible(false);
        lblFechaFinal.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBuscaVenta = new javax.swing.JPanel();
        lblBuscaVent = new javax.swing.JLabel();
        btnBuscarVenta = new javax.swing.JButton();
        jdtFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jdtFechaFinal = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jblBuscarVenta = new javax.swing.JTable();
        lblFechaInicio = new javax.swing.JLabel();
        lblFechaFinal = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("Buscar Compras");

        pnlBuscaVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Compra"));

        lblBuscaVent.setText("Buscar por fecha:");

        btnBuscarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVentaActionPerformed(evt);
            }
        });

        jLabel1.setText("Inicio");

        jLabel2.setText("Final");

        javax.swing.GroupLayout pnlBuscaVentaLayout = new javax.swing.GroupLayout(pnlBuscaVenta);
        pnlBuscaVenta.setLayout(pnlBuscaVentaLayout);
        pnlBuscaVentaLayout.setHorizontalGroup(
            pnlBuscaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuscaVent)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdtFechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(btnBuscarVenta)
                .addContainerGap())
        );
        pnlBuscaVentaLayout.setVerticalGroup(
            pnlBuscaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuscaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarVenta)
                    .addGroup(pnlBuscaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jdtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlBuscaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlBuscaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBuscaVent)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jblBuscarVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jblBuscarVenta);

        lblFechaInicio.setText("jLabel3");

        lblFechaFinal.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(pnlBuscaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaInicio)
                    .addComponent(lblFechaFinal))
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBuscaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFechaInicio)
                        .addGap(14, 14, 14)
                        .addComponent(lblFechaFinal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pnlBuscaVenta.getAccessibleContext().setAccessibleName("Buscar Compra");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVentaActionPerformed
        // TODO add your handling code here:
        ActualizarTabla1();
        
    }//GEN-LAST:event_btnBuscarVentaActionPerformed
    
    public BuscarVentasBO RecoletarDatos(){
        
        try{
             String dia = Integer.toString(jdtFechaInicio.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(jdtFechaInicio.getCalendar().get(Calendar.MONTH)+1);
        String ano = Integer.toString(jdtFechaInicio.getCalendar().get(Calendar.YEAR));
        String FechaInicio = (ano+""+mes+""+dia);
        
        int FechaInicio1 = Integer.parseInt(FechaInicio);
        
        String dia2 = Integer.toString(jdtFechaFinal.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes2 = Integer.toString(jdtFechaFinal.getCalendar().get(Calendar.MONTH)+1);
        String ano2 = Integer.toString(jdtFechaFinal.getCalendar().get(Calendar.YEAR));
        String FechaFinal = (ano2+""+mes2+""+dia2);
        
        int FechaFinal2 = Integer.parseInt(FechaFinal);
        
        lblFechaInicio.setText(""+FechaInicio);
        lblFechaFinal.setText(""+FechaFinal2);
        
        ObjBuscarVentasBO.setFechaInicio(FechaInicio);
        ObjBuscarVentasBO.setFechaFinal(FechaFinal);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " +e);
        }
       return ObjBuscarVentasBO;
    }
    public void ActualizarTabla1(){
    jblBuscarVenta.setModel(objBuscarVentasDAO.BuscarFecha(RecoletarDatos()));
    } 
     public void ActualizarTabla(){
    jblBuscarVenta.setModel(objBuscarVentasDAO.Buscar());
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
            java.util.logging.Logger.getLogger(BuscarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jblBuscarVenta;
    private com.toedter.calendar.JDateChooser jdtFechaFinal;
    private com.toedter.calendar.JDateChooser jdtFechaInicio;
    private javax.swing.JLabel lblBuscaVent;
    private javax.swing.JLabel lblFechaFinal;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JPanel pnlBuscaVenta;
    // End of variables declaration//GEN-END:variables
}
