/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoferreteria.GUI;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import proyectoferreteria.DAO.Fondo;

/**
 *
 * @author Emmanuel
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipal
     */
    public PaginaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        InputStream Fondo1 = this.getClass().getResourceAsStream("/Imagenes/fondo_pr.png");
        cargarImagen(jDesktop, Fondo1);
    }
    
 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSistema = new javax.swing.JMenu();
        menuItemSalir = new javax.swing.JMenuItem();
        menuItemCerrarSesion = new javax.swing.JMenuItem();
        menuAlmacen = new javax.swing.JMenu();
        menuItemProd = new javax.swing.JMenu();
        menuItemNueProd = new javax.swing.JMenuItem();
        menuItemElimProd = new javax.swing.JMenuItem();
        menuItemCatego = new javax.swing.JMenuItem();
        menuItemUnid = new javax.swing.JMenuItem();
        menuCompra = new javax.swing.JMenu();
        menuItemProvee = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        menuItemUsua = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        menuItemBusVen = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuReportProd = new javax.swing.JMenuItem();
        menuItemRealVen = new javax.swing.JMenuItem();
        menuItemFalliVen = new javax.swing.JMenuItem();
        menuAnular = new javax.swing.JMenu();
        menuAnulVenta = new javax.swing.JMenuItem();
        menuAnulCompr = new javax.swing.JMenuItem();
        menuHerramien = new javax.swing.JMenu();
        menuRespBD = new javax.swing.JMenuItem();
        menuRestBD = new javax.swing.JMenuItem();
        menuAcerca = new javax.swing.JMenu();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Página Principal Administrador");

        jDesktop.setBackground(new java.awt.Color(226, 255, 226));
        jDesktop.setForeground(new java.awt.Color(24, 2, 94));
        jDesktop.setToolTipText("");

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        menuSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sistema.png"))); // NOI18N
        menuSistema.setText("Sistema");

        menuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir2.png"))); // NOI18N
        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuSistema.add(menuItemSalir);

        menuItemCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarios2.png"))); // NOI18N
        menuItemCerrarSesion.setText("Cerrar Sesión");
        menuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesionActionPerformed(evt);
            }
        });
        menuSistema.add(menuItemCerrarSesion);

        jMenuBar1.add(menuSistema);

        menuAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/almacen.png"))); // NOI18N
        menuAlmacen.setText("Almacén");

        menuItemProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producto.png"))); // NOI18N
        menuItemProd.setText("Ingresar Productos");

        menuItemNueProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        menuItemNueProd.setText("Ingresar Nuevo Producto");
        menuItemNueProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNueProdActionPerformed(evt);
            }
        });
        menuItemProd.add(menuItemNueProd);

        menuItemElimProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        menuItemElimProd.setText("Ver Productos Eliminados");
        menuItemElimProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemElimProdActionPerformed(evt);
            }
        });
        menuItemProd.add(menuItemElimProd);

        menuAlmacen.add(menuItemProd);

        menuItemCatego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/categoria.png"))); // NOI18N
        menuItemCatego.setText("Ingresar Categoria");
        menuItemCatego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCategoActionPerformed(evt);
            }
        });
        menuAlmacen.add(menuItemCatego);

        menuItemUnid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/unidad.png"))); // NOI18N
        menuItemUnid.setText("Ingresar Unidad");
        menuItemUnid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUnidActionPerformed(evt);
            }
        });
        menuAlmacen.add(menuItemUnid);

        jMenuBar1.add(menuAlmacen);

        menuCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compra.png"))); // NOI18N
        menuCompra.setText("Compra");

        menuItemProvee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedores.png"))); // NOI18N
        menuItemProvee.setText("Ingresar Proveedores");
        menuItemProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProveeActionPerformed(evt);
            }
        });
        menuCompra.add(menuItemProvee);

        jMenuBar1.add(menuCompra);

        menuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarios2.png"))); // NOI18N
        menuUsuario.setText("Usuario");

        menuItemUsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        menuItemUsua.setText("Gestión Usuarios");
        menuItemUsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuaActionPerformed(evt);
            }
        });
        menuUsuario.add(menuItemUsua);

        jMenuBar1.add(menuUsuario);

        menuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venta.png"))); // NOI18N
        menuVentas.setText("Ventas");

        menuItemBusVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar2.png"))); // NOI18N
        menuItemBusVen.setText("Buscar Ventas");
        menuItemBusVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBusVenActionPerformed(evt);
            }
        });
        menuVentas.add(menuItemBusVen);

        jMenuBar1.add(menuVentas);

        menuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultas.png"))); // NOI18N
        menuConsultas.setText("Consultas");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imprimir.png"))); // NOI18N
        jMenuItem1.setText("Imprimir Venta");
        menuConsultas.add(jMenuItem1);

        menuReportProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte.png"))); // NOI18N
        menuReportProd.setText("Imprimir Reporte Productos");
        menuReportProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportProdActionPerformed(evt);
            }
        });
        menuConsultas.add(menuReportProd);

        menuItemRealVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/palomita2.png"))); // NOI18N
        menuItemRealVen.setText("Ventas Realizadas");
        menuItemRealVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRealVenActionPerformed(evt);
            }
        });
        menuConsultas.add(menuItemRealVen);

        menuItemFalliVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar2.png"))); // NOI18N
        menuItemFalliVen.setText("Ventas Fallidas");
        menuItemFalliVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFalliVenActionPerformed(evt);
            }
        });
        menuConsultas.add(menuItemFalliVen);

        jMenuBar1.add(menuConsultas);

        menuAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anular.png"))); // NOI18N
        menuAnular.setText("Anulación");

        menuAnulVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anularventa.png"))); // NOI18N
        menuAnulVenta.setText("Anular Venta");
        menuAnulVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAnulVentaActionPerformed(evt);
            }
        });
        menuAnular.add(menuAnulVenta);

        menuAnulCompr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anularcompra.png"))); // NOI18N
        menuAnulCompr.setText("Anular Compra");
        menuAnulCompr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAnulComprActionPerformed(evt);
            }
        });
        menuAnular.add(menuAnulCompr);

        jMenuBar1.add(menuAnular);

        menuHerramien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/herramienta.png"))); // NOI18N
        menuHerramien.setText("Herramientas");

        menuRespBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bdrpBD.png"))); // NOI18N
        menuRespBD.setText("Respaldar BD");
        menuRespBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRespBDActionPerformed(evt);
            }
        });
        menuHerramien.add(menuRespBD);

        menuRestBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bdrtBD.png"))); // NOI18N
        menuRestBD.setText("Restaurar BD");
        menuRestBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRestBDActionPerformed(evt);
            }
        });
        menuHerramien.add(menuRestBD);

        jMenuBar1.add(menuHerramien);

        menuAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ayuda.png"))); // NOI18N
        menuAcerca.setText("Acerca de");
        jMenuBar1.add(menuAcerca);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    public void cargarImagen(JDesktopPane jdes, InputStream imagen)
    {
        try
        {
            BufferedImage image = ImageIO.read(imagen);
            jdes.setBorder(new Fondo(image));
        }
        catch(Exception ex)
        {} 
    }
        
    private void menuItemCategoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCategoActionPerformed
        // TODO add your handling code here:
       CategoriaProducto v = new CategoriaProducto();
       jDesktop.add(v);
        Dimension desktopSize = jDesktop.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);       
       v.setVisible(true);         
    }//GEN-LAST:event_menuItemCategoActionPerformed

    private void menuItemProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProveeActionPerformed
        // TODO add your handling code here:
        VentanaProveedor v = new VentanaProveedor();
        //v.setLocation(null);
        jDesktop.add(v);
        Dimension desktopSize = jDesktop.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        v.setVisible(true);
    }//GEN-LAST:event_menuItemProveeActionPerformed

    private void menuItemUnidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUnidActionPerformed
        // TODO add your handling code here:
        UnidadProducto v = new UnidadProducto();
        jDesktop.add(v);
        Dimension desktopSize = jDesktop.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);        
        v.setVisible(true); 
    }//GEN-LAST:event_menuItemUnidActionPerformed

    private void menuItemNueProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNueProdActionPerformed
        // TODO add your handling code here:
       RegistroProduc v = new RegistroProduc();
       jDesktop.add(v);
        Dimension desktopSize = jDesktop.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);       
       v.setVisible(true); 
    }//GEN-LAST:event_menuItemNueProdActionPerformed

    private void menuItemElimProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemElimProdActionPerformed
        // TODO add your handling code here:
        ProductosEliminados v = new ProductosEliminados();
        jDesktop.add(v);
        Dimension desktopSize = jDesktop.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);        
        v.setVisible(true); 
    }//GEN-LAST:event_menuItemElimProdActionPerformed

    private void menuItemUsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuaActionPerformed
        // TODO add your handling code here:
        try
        {
            NuevoUsuario v = new NuevoUsuario();
            jDesktop.add(v);
            Dimension desktopSize = jDesktop.getSize();
            Dimension FrameSize = v.getSize();
            v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);        
            v.setVisible(true); 
        }catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
    }//GEN-LAST:event_menuItemUsuaActionPerformed

    private void menuReportProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuReportProdActionPerformed

    private void menuItemRealVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRealVenActionPerformed
        // TODO add your handling code here:
        VentasRealizadas v = new VentasRealizadas();
        jDesktop.add(v);
        Dimension desktopSize = jDesktop.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);        
        v.setVisible(true); 
    }//GEN-LAST:event_menuItemRealVenActionPerformed

    private void menuItemFalliVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFalliVenActionPerformed
        // TODO add your handling code here:
        VentasFallidas v = new VentasFallidas();
        jDesktop.add(v);
        Dimension desktopSize = jDesktop.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);        
        v.setVisible(true); 
    }//GEN-LAST:event_menuItemFalliVenActionPerformed

    private void menuItemBusVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBusVenActionPerformed
        // TODO add your handling code here:
        BuscarVentas v = new BuscarVentas();
        jDesktop.add(v);
        Dimension desktopSize = jDesktop.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);        
        v.setVisible(true); 
    }//GEN-LAST:event_menuItemBusVenActionPerformed

    private void menuAnulVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAnulVentaActionPerformed
        // TODO add your handling code here:
        AnularVenta v = new AnularVenta();
        jDesktop.add(v);
        Dimension desktopSize = jDesktop.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);        
        v.setVisible(true); 
    }//GEN-LAST:event_menuAnulVentaActionPerformed

    private void menuAnulComprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAnulComprActionPerformed
        // TODO add your handling code here:
        AnularCompra v = new AnularCompra();
        jDesktop.add(v);
        Dimension desktopSize = jDesktop.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);        
        v.setVisible(true); 
    }//GEN-LAST:event_menuAnulComprActionPerformed

    private void menuRespBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRespBDActionPerformed
        // TODO add your handling code here:
        RespaldarBD v = new RespaldarBD();
        jDesktop.add(v);
        Dimension desktopSize = jDesktop.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);        
        v.setVisible(true); 
    }//GEN-LAST:event_menuRespBDActionPerformed

    private void menuRestBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRestBDActionPerformed
        // TODO add your handling code here:
        RestaurarBD v = new RestaurarBD();
        jDesktop.add(v);
        Dimension desktopSize = jDesktop.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);        
        v.setVisible(true); 
    }//GEN-LAST:event_menuRestBDActionPerformed

    private void menuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesionActionPerformed
        // TODO add your handling code here:
        Login v = new Login();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAcerca;
    private javax.swing.JMenu menuAlmacen;
    private javax.swing.JMenuItem menuAnulCompr;
    private javax.swing.JMenuItem menuAnulVenta;
    private javax.swing.JMenu menuAnular;
    private javax.swing.JMenu menuCompra;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuHerramien;
    private javax.swing.JMenuItem menuItemBusVen;
    private javax.swing.JMenuItem menuItemCatego;
    private javax.swing.JMenuItem menuItemCerrarSesion;
    private javax.swing.JMenuItem menuItemElimProd;
    private javax.swing.JMenuItem menuItemFalliVen;
    private javax.swing.JMenuItem menuItemNueProd;
    private javax.swing.JMenu menuItemProd;
    private javax.swing.JMenuItem menuItemProvee;
    private javax.swing.JMenuItem menuItemRealVen;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenuItem menuItemUnid;
    private javax.swing.JMenuItem menuItemUsua;
    private javax.swing.JMenuItem menuReportProd;
    private javax.swing.JMenuItem menuRespBD;
    private javax.swing.JMenuItem menuRestBD;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenu menuVentas;
    // End of variables declaration//GEN-END:variables
}
