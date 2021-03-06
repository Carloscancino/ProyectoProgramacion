/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoferreteria.GUI;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.security.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import proyectoferreteria.BO.UsuariosBO;
import proyectoferreteria.Conexion.Conexion;
import proyectoferreteria.DAO.Fondo;
import proyectoferreteria.DAO.UsuariosDAO;

/**
 *
 * @author Emmanuel
 */
public class PaginaPrincipal extends javax.swing.JFrame implements Runnable{
    String hora,minutos,segundos,ampm;
    Calendar calendario;
    Thread h1;

    /**
     * Creates new form PaginaPrincipal
     */
    UsuariosDAO metodp = new UsuariosDAO();
    public PaginaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        InputStream Fondo1 = this.getClass().getResourceAsStream("/Imagenes/fondo_ferri2.png");
        cargarImagen(jDesktop, Fondo1);
        
        h1 = new Thread(this);
        h1.start();
        traerUsuario();
//        lblPrincHora.setText(horaActual());
        lblPrincFecha.setText(fechaActual());
    }
    
 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jDesktop = new javax.swing.JDesktopPane();
        pnlEstado = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblEstadoUsuario = new javax.swing.JLabel();
        lblPrincHora = new javax.swing.JLabel();
        lblPrincFecha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSistema = new javax.swing.JMenu();
        menuItemSalir = new javax.swing.JMenuItem();
        menuItemCerrarSesion = new javax.swing.JMenuItem();
        menuAlmacen = new javax.swing.JMenu();
        menuItemProd = new javax.swing.JMenu();
        menuItemNueProd = new javax.swing.JMenuItem();
        menuItemElimProd = new javax.swing.JMenuItem();
        menuItemCatego = new javax.swing.JMenuItem();
        menuCompra = new javax.swing.JMenu();
        menuItemProvee = new javax.swing.JMenuItem();
        menuItemCompras = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuEmpleado = new javax.swing.JMenu();
        menuItemEmplea = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        btnIngresarVenta = new javax.swing.JMenuItem();
        menuItemBusVen = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuReportProd = new javax.swing.JMenuItem();
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

        lblUsuario.setText("Usuario:");

        lblEstadoUsuario.setText("Estado");

        lblPrincHora.setText("hh:mm:ss");

        lblPrincFecha.setText("dd/mm/aaa");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout pnlEstadoLayout = new javax.swing.GroupLayout(pnlEstado);
        pnlEstado.setLayout(pnlEstadoLayout);
        pnlEstadoLayout.setHorizontalGroup(
            pnlEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addComponent(lblEstadoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 595, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrincHora)
                .addGap(18, 18, 18)
                .addComponent(lblPrincFecha)
                .addContainerGap())
        );
        pnlEstadoLayout.setVerticalGroup(
            pnlEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEstadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(lblEstadoUsuario)
                    .addComponent(lblPrincHora)
                    .addComponent(lblPrincFecha))
                .addContainerGap())
            .addComponent(jSeparator1)
        );

        jDesktop.setLayer(pnlEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopLayout.createSequentialGroup()
                .addGap(0, 413, Short.MAX_VALUE)
                .addComponent(pnlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        menuItemCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compras2.png"))); // NOI18N
        menuItemCompras.setText("Ingresar Compras");
        menuItemCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemComprasActionPerformed(evt);
            }
        });
        menuCompra.add(menuItemCompras);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar2.png"))); // NOI18N
        jMenuItem2.setText("Buscar Compras");
        menuCompra.add(jMenuItem2);

        jMenuBar1.add(menuCompra);

        menuEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarios2.png"))); // NOI18N
        menuEmpleado.setText("Empleados");

        menuItemEmplea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        menuItemEmplea.setText("Gestión Empleados");
        menuItemEmplea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEmpleaActionPerformed(evt);
            }
        });
        menuEmpleado.add(menuItemEmplea);

        jMenuBar1.add(menuEmpleado);

        menuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venta.png"))); // NOI18N
        menuVentas.setText("Ventas");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jMenuItem3.setText("Ingresar Clientes");
        menuVentas.add(jMenuItem3);

        btnIngresarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compra.png"))); // NOI18N
        btnIngresarVenta.setText("Ingresar Venta");
        btnIngresarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarVentaActionPerformed(evt);
            }
        });
        menuVentas.add(btnIngresarVenta);

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
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuConsultas.add(jMenuItem1);

        menuReportProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte.png"))); // NOI18N
        menuReportProd.setText("Imprimir Reporte Productos");
        menuReportProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportProdActionPerformed(evt);
            }
        });
        menuConsultas.add(menuReportProd);

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

    public void run(){
        Thread ct = Thread.currentThread();
        while(ct == h1) {
            calcula();
            lblPrincHora.setText(hora + ":" + minutos + ":" + segundos + " "+ampm);
            try 
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) 
            {}
        }
    }
    
    public void traerUsuario(){
        try {
            UsuariosBO objUsuari = new UsuariosBO();
            ResultSet resultado = metodp.Buscar(objUsuari);
            while (resultado.next()) {
                String Usuario = resultado.getString(8);
                lblEstadoUsuario.setText(Usuario);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    public void calcula () {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        if(ampm.equals("PM")){
            int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
            hora = h>9?""+h:"0"+h;
        }
        else
        {
            hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY); }
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
}
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
    public static String fechaActual()
    {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
    
    public static String horaActual()
    {
        Date hora = new Date();
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        return formatoHora.format(hora);
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

    private void menuItemEmpleaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEmpleaActionPerformed
        // TODO add your handling code here:
        try
        {
        NuevoEmpleados v = new NuevoEmpleados();
        jDesktop.add(v);
        Dimension desktopSize = jDesktop.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);        
        v.setVisible(true); 
        }catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
    }//GEN-LAST:event_menuItemEmpleaActionPerformed

    private void menuReportProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportProdActionPerformed
       try {
            Conexion cc = new Conexion();
            
            JasperReport reportes= (JasperReport) JRLoader.loadObject(Principal.class.getResource("/Reportes/ReporteProductos.jasper"));
            JasperPrint print=JasperFillManager.fillReport(reportes, null, cc.ConectarSQLite());
            JasperViewer jv = new JasperViewer(print,false);
            jv.setTitle("Productos más vendidos");
            jv.setVisible(true);
            
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }//GEN-LAST:event_menuReportProdActionPerformed

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

    private void menuItemComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemComprasActionPerformed
        // TODO add your handling code here:
        VentanaCompras v = new VentanaCompras();
        jDesktop.add(v);
        Dimension desktopSize = jDesktop.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);        
        v.setVisible(true); 
    }//GEN-LAST:event_menuItemComprasActionPerformed

    private void menuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesionActionPerformed
        // TODO add your handling code here:
        Login v = new Login();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemCerrarSesionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try
        {
        ReportesVentasForm v = new ReportesVentasForm();
        jDesktop.add(v);
        Dimension desktopSize = jDesktop.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);        
        v.setVisible(true); 
        }catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnIngresarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarVentaActionPerformed
        // TODO add your handling code here:
        ventanaVentas v = new ventanaVentas();
        jDesktop.add(v);
        Dimension desktopSize = jDesktop.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);        
        v.setVisible(true);         
    }//GEN-LAST:event_btnIngresarVentaActionPerformed
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
    private javax.swing.JMenuItem btnIngresarVenta;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEstadoUsuario;
    private javax.swing.JLabel lblPrincFecha;
    private javax.swing.JLabel lblPrincHora;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuAcerca;
    private javax.swing.JMenu menuAlmacen;
    private javax.swing.JMenuItem menuAnulCompr;
    private javax.swing.JMenuItem menuAnulVenta;
    private javax.swing.JMenu menuAnular;
    private javax.swing.JMenu menuCompra;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuEmpleado;
    private javax.swing.JMenu menuHerramien;
    private javax.swing.JMenuItem menuItemBusVen;
    private javax.swing.JMenuItem menuItemCatego;
    private javax.swing.JMenuItem menuItemCerrarSesion;
    private javax.swing.JMenuItem menuItemCompras;
    private javax.swing.JMenuItem menuItemElimProd;
    private javax.swing.JMenuItem menuItemEmplea;
    private javax.swing.JMenuItem menuItemNueProd;
    private javax.swing.JMenu menuItemProd;
    private javax.swing.JMenuItem menuItemProvee;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenuItem menuReportProd;
    private javax.swing.JMenuItem menuRespBD;
    private javax.swing.JMenuItem menuRestBD;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenu menuVentas;
    private javax.swing.JPanel pnlEstado;
    // End of variables declaration//GEN-END:variables
}
