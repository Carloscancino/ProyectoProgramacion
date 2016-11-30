/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoferreteria.GUI;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.Interleaved25;
import proyectoferreteria.BO.ProductoBO;
import proyectoferreteria.DAO.ManejoDeImagenes;
import proyectoferreteria.DAO.ProductoDAO;

/**
 *
 * @author elektra
 */
public class RegistroProduc extends javax.swing.JInternalFrame {

    ProductoDAO objProductoDAO = new ProductoDAO();
    ProductoBO objProductoBO = new ProductoBO();
    ManejoDeImagenes metodosImagen = new ManejoDeImagenes();
    byte[] imagenCodeBar;
    byte[] imag;
    byte[] imag2;
    JFileChooser SelectorImagenes;
    String rutaImagem="";
    Boolean Correcto = false;
    DefaultTableModel dtm =new DefaultTableModel(
        new Object [][] {},
        new String [] {
            "Código", "Nombre","Descripción","Marca","Stock","Precio Venta"
        }
    );    
    public RegistroProduc() {
        initComponents();
        botonagregar();
        actualizarJtable();
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
    public void actualizarJtable()
    {
        //dtm = objUsuariosDAO.Buscar(objUsuariosBO);
        DefaultTableModel newDtm = objProductoDAO.Buscar();
        jTableProductos.setModel(newDtm); 
    }
    public ProductoBO RecuperarDatos()
    {
        String fecha_inicio="";
        String fecha_fin ="";
        if(!spinDescREProd.getValue().toString().equals("0"))
        {
            fecha_inicio = new SimpleDateFormat("yyyy/MM/dd").format(calenDeREPro.getDate());
            objProductoBO.setFech_ini_Desc(fecha_inicio);
            fecha_fin = new SimpleDateFormat("yyyy/MM/dd").format(calenAREPro.getDate());
            objProductoBO.setFech_fin_Desc(fecha_fin);            
        }  
        objProductoBO.setCodigo(txtCodREProd.getText());
        objProductoBO.setId_Codigo_barra(txtId_Cod_Barr.getText());
        objProductoBO.setNombre(txtNomREProd.getText());
        objProductoBO.setDescripcion(txtDescProd.getText());
        objProductoBO.setMarca(txtMarcREPro.getText());
        objProductoBO.setStock(txtCantREPro.getValue().toString());
        objProductoBO.setUnidad(""+cbxUnidREPro.getSelectedIndex());
        objProductoBO.setPrecio_compra(txtPreComREPro.getText());
        objProductoBO.setPrecio_Venta(txtPreVentREPro.getText());
        objProductoBO.setUtilidad(txtUtilREPro.getText());
        objProductoBO.setDescuento(spinDescREProd.getValue().toString());
        //Fechas
        objProductoBO.setIVA(txtIvaREPro.getValue().toString());
        objProductoBO.setId_categoria(""+cbxCateREPro.getSelectedIndex());
        objProductoBO.setId_proveedor(txtProveREPro.getText());     

        if(!rutaImagem.equals(""))
        {
            objProductoBO.setImagen(obtenerBytes(rutaImagem));  
        }
        else
        {
            objProductoBO.setImagen(imag);
        }
        
        if(imagenCodeBar != null)
        {
            objProductoBO.setCodigo_barras(imagenCodeBar);  
        }
        else
        {
            objProductoBO.setCodigo_barras(imag2);
        }
        
        return objProductoBO;
    }     
    public Date convertToFecha(String strFecha)
    {        
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            Date date; 
            date = formatter.parse(strFecha);
            System.out.println(date);
            System.out.println(formatter.format(date));
            return date;
        } catch (ParseException ex) {
            Logger.getLogger(RegistroProduc.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    public void Limpiar()
    {
        txtCodREProd.setText("");
        txtId_Cod_Barr.setText("");
        txtNomREProd.setText("");
        txtDescProd.setText("");
        txtMarcREPro.setText("");
        txtCantREPro.setValue(0);
        cbxUnidREPro.setSelectedIndex(0);
        txtPreComREPro.setText("");
        txtPreVentREPro.setText("");
        txtUtilREPro.setText("");
        txtDescProd.setText("");
        calenDeREPro.setDate(null);
        calenAREPro.setDate(null);
        txtIvaREPro.setValue(15);
        cbxCateREPro.setSelectedIndex(0);
        txtProveREPro.setText("");
        lblImaProd1.setIcon(null);
        lblImaProd.setIcon(null);
        imagenCodeBar = null;
        lblImaProd.setSize(143, 80);
    }
    public void botonagregar()
    {
        btnGuarProd.setEnabled(true);
        btnModifProd.setEnabled(false);
        btnCancelProd.setEnabled(false);
    }
    public void botonModificar()
    {
        btnGuarProd.setEnabled(false);
        btnModifProd.setEnabled(true);
        btnCancelProd.setEnabled(true);
    }    
    public void ActualizarPrecios()
    {
        DecimalFormat decimales = new DecimalFormat("0.##");
        int iva = Integer.parseInt(txtIvaREPro.getValue().toString());
        double precioCompra = Double.parseDouble(txtPreComREPro.getText());
        double precioDeLaVenta = Double.parseDouble(decimales.format(precioCompra + ((precioCompra/100)*iva)));
        String preioDeLaUtilidad = decimales.format((precioDeLaVenta-precioCompra));
        txtPreVentREPro.setText(""+precioDeLaVenta);
        txtUtilREPro.setText(preioDeLaUtilidad);
    }
    public void generarCodeBar()
    {
        lblImaProd.setIcon(null);
        JBarcodeBean barcode = new JBarcodeBean();
        // nuestro tipo de codigo de barra
        barcode.setCodeType(new Interleaved25());
        //barcode.setCodeType(new Code39());

        // nuestro valor a codificar y algunas configuraciones mas
        barcode.setCode(txtId_Cod_Barr.getText());
        barcode.setCheckDigit(true);
        BufferedImage bufferedImage = barcode.draw(new BufferedImage(lblImaProd.getWidth(), lblImaProd.getHeight(), BufferedImage.TYPE_INT_RGB));
        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        //ImageIcon ImagenP=new ImageIcon(((bufferedImage).getImage()).getScaledInstance(lblImagen.getWidth(),lblImagen.getHeight(), java.awt.Image.SCALE_SMOOTH));
        lblImaProd.setIcon(imageIcon);
        imagenCodeBar = imageToByteArray(bufferedImage);
    }
    static byte[] imageToByteArray(BufferedImage image) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "png", stream);
        } catch(IOException e) {
            // This *shouldn't* happen with a ByteArrayOutputStream, but if it
            // somehow does happen, then we don't want to just ignore it
            throw new RuntimeException(e);
        }
        return stream.toByteArray();
        // ByteArrayOutputStreams don't need to be closed (the documentation says so)
    }

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
        lblImaProd = new javax.swing.JLabel();
        cbxCateREPro = new javax.swing.JComboBox<>();
        lblUnidProd = new javax.swing.JLabel();
        cbxUnidREPro = new javax.swing.JComboBox<>();
        lblProvProd1 = new javax.swing.JLabel();
        txtProveREPro = new javax.swing.JTextField();
        btnCargarREProd = new javax.swing.JButton();
        lblImaProd1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblProvProd2 = new javax.swing.JLabel();
        txtId_Cod_Barr = new javax.swing.JTextField();
        btnCargarCodBarr = new javax.swing.JButton();
        txtCantREPro = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        lblPreComProd = new javax.swing.JLabel();
        lblPreVenProd = new javax.swing.JLabel();
        lblUtilProd = new javax.swing.JLabel();
        txtPreComREPro = new javax.swing.JTextField();
        txtPreVentREPro = new javax.swing.JTextField();
        txtUtilREPro = new javax.swing.JTextField();
        lblIvaProd = new javax.swing.JLabel();
        lblIvaProd1 = new javax.swing.JLabel();
        lblDescDeREPRrod = new javax.swing.JLabel();
        lblDescAREPRrod = new javax.swing.JLabel();
        spinDescREProd = new javax.swing.JSpinner();
        calenDeREPro = new com.toedter.calendar.JDateChooser();
        calenAREPro = new com.toedter.calendar.JDateChooser();
        txtIvaREPro = new javax.swing.JSpinner();
        btnNewProd = new javax.swing.JButton();
        btnGuarProd = new javax.swing.JButton();
        btnModifProd = new javax.swing.JButton();
        btnCancelProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();

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

        txtCodREProd.setEnabled(false);

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

        lblImaProd1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Código de Barras");

        lblProvProd2.setText("Id Código de Barras:");

        btnCargarCodBarr.setText("...");
        btnCargarCodBarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarCodBarrActionPerformed(evt);
            }
        });

        txtCantREPro.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCatProd)
                            .addComponent(lblMarProd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxCateREPro, 0, 103, Short.MAX_VALUE)
                            .addComponent(txtMarcREPro)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCantPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomProd)
                            .addComponent(lblCodProd))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodREProd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomREProd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUnidProd)
                                .addGap(18, 18, 18)
                                .addComponent(cbxUnidREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(lblImaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(lblImaProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtId_Cod_Barr, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProvProd2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCargarCodBarr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblProvProd1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProveREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCargarREProd)
                        .addGap(56, 56, 56))))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxCateREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCatProd))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMarProd)
                            .addComponent(txtMarcREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxUnidREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUnidProd))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantPro)
                            .addComponent(txtCantREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(lblImaProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblProvProd2))
                            .addComponent(lblImaProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCargarREProd)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblProvProd1)
                                .addComponent(txtProveREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtId_Cod_Barr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCargarCodBarr)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles del Precio y Utilidades"));

        lblPreComProd.setText("Precio de compra:");

        lblPreVenProd.setText("Precio de venta:");

        lblUtilProd.setText("Utilidad %:");

        txtPreComREPro.setText("0");
        txtPreComREPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreComREProActionPerformed(evt);
            }
        });

        txtPreVentREPro.setText("0");
        txtPreVentREPro.setEnabled(false);

        txtUtilREPro.setText("0");
        txtUtilREPro.setEnabled(false);

        lblIvaProd.setText("IVA %:");

        lblIvaProd1.setText("Descuento %:");

        lblDescDeREPRrod.setText("De:");

        lblDescAREPRrod.setText("A:");

        spinDescREProd.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        calenDeREPro.setDateFormatString("yyyy/MM/dd");

        calenAREPro.setDateFormatString("yyyy/MM/dd");

        txtIvaREPro.setModel(new javax.swing.SpinnerNumberModel(15, 0, null, 1));
        txtIvaREPro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtIvaREProStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblIvaProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIvaREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPreComProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPreComREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblIvaProd1)
                                .addGap(21, 21, 21)
                                .addComponent(spinDescREProd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblDescDeREPRrod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calenDeREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDescAREPRrod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calenAREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPreVenProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPreVentREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(lblUtilProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUtilREPro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(71, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIvaProd)
                    .addComponent(txtIvaREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPreComREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPreVenProd)
                        .addComponent(txtPreVentREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUtilProd)
                        .addComponent(txtUtilREPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPreComProd, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
        btnNewProd.setText("Limpiar");
        btnNewProd.setMaximumSize(new java.awt.Dimension(95, 25));
        btnNewProd.setMinimumSize(new java.awt.Dimension(95, 25));
        btnNewProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProdActionPerformed(evt);
            }
        });

        btnGuarProd.setBackground(new java.awt.Color(95, 186, 125));
        btnGuarProd.setForeground(new java.awt.Color(255, 255, 255));
        btnGuarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnGuarProd.setText("Guardar");
        btnGuarProd.setMaximumSize(new java.awt.Dimension(95, 25));
        btnGuarProd.setMinimumSize(new java.awt.Dimension(95, 25));
        btnGuarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuarProdActionPerformed(evt);
            }
        });

        btnModifProd.setBackground(new java.awt.Color(95, 186, 125));
        btnModifProd.setForeground(new java.awt.Color(255, 255, 255));
        btnModifProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModifProd.setText("Modificar");
        btnModifProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifProdActionPerformed(evt);
            }
        });

        btnCancelProd.setBackground(new java.awt.Color(95, 186, 125));
        btnCancelProd.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelProd.setText("Eliminar");
        btnCancelProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelProdActionPerformed(evt);
            }
        });

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Código", "Nombre"
            }
        ));
        jTableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProductos);

        javax.swing.GroupLayout pnlRegistrarProducLayout = new javax.swing.GroupLayout(pnlRegistrarProduc);
        pnlRegistrarProduc.setLayout(pnlRegistrarProducLayout);
        pnlRegistrarProducLayout.setHorizontalGroup(
            pnlRegistrarProducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarProducLayout.createSequentialGroup()
                .addGroup(pnlRegistrarProducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlRegistrarProducLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlRegistrarProducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jblBuscarProduc1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(pnlRegistrarProducLayout.createSequentialGroup()
                .addGroup(pnlRegistrarProducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistrarProducLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRegistrarProducLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnGuarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnModifProd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnCancelProd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnNewProd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRegistrarProducLayout.setVerticalGroup(
            pnlRegistrarProducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrarProducLayout.createSequentialGroup()
                .addComponent(jblBuscarProduc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegistrarProducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewProd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifProd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelProd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegistrarProduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRegistrarProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarREProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarREProdActionPerformed
        // TODO add your handling code here:
        SeleccionarImagen(lblImaProd1);
    }//GEN-LAST:event_btnCargarREProdActionPerformed

    private void btnCargarCodBarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarCodBarrActionPerformed
        // TODO add your handling code here:
        if(txtId_Cod_Barr.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Introducir código");
        }
        else   
        {
            generarCodeBar();
        }
    }//GEN-LAST:event_btnCargarCodBarrActionPerformed

    private void btnNewProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProdActionPerformed
        // TODO add your handling code here:
        Limpiar();
        botonagregar();
    }//GEN-LAST:event_btnNewProdActionPerformed

    private void btnGuarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuarProdActionPerformed
        // TODO add your handling code here:
        Validar();
        if(Correcto == true)
        {
            objProductoDAO.Agregar(RecuperarDatos());
            actualizarJtable();
            Limpiar(); 
        }
    }//GEN-LAST:event_btnGuarProdActionPerformed

    private void txtIvaREProStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtIvaREProStateChanged
        // TODO add your handling code here:
        ActualizarPrecios();
    }//GEN-LAST:event_txtIvaREProStateChanged

    private void txtPreComREProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreComREProActionPerformed
        // TODO add your handling code here:
        ActualizarPrecios();
    }//GEN-LAST:event_txtPreComREProActionPerformed

    private void jTableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductosMouseClicked
        // TODO add your handling code here:
        Limpiar();
        botonModificar();
        int row = jTableProductos.getSelectedRow();
        System.out.println("--"+row);
        JTable target = (JTable)evt.getSource();
        
        ProductoBO Datos = objProductoDAO.LlenarCampos(target.getValueAt(target.getSelectedRow(), 0).toString());
        txtCodREProd.setText(Datos.getCodigo());
        txtId_Cod_Barr.setText(Datos.getId_Codigo_barra());
        txtNomREProd.setText(Datos.getNombre());
        txtDescProd.setText(Datos.getDescripcion());
        txtMarcREPro.setText(Datos.getMarca());
        txtCantREPro.setValue(Integer.parseInt(Datos.getStock()));
        cbxUnidREPro.setSelectedIndex(Integer.parseInt(Datos.getUnidad()));
        txtPreComREPro.setText(Datos.getPrecio_compra());
        txtPreVentREPro.setText(Datos.getPrecio_Venta());
        txtUtilREPro.setText(Datos.getUtilidad());
        spinDescREProd.setValue(Integer.parseInt(Datos.getDescuento()));
        txtIvaREPro.setValue(Integer.parseInt(Datos.getIVA()));
        cbxCateREPro.setSelectedIndex(Integer.parseInt(Datos.getId_categoria()));
        txtProveREPro.setText(Datos.getId_proveedor());
        if(!Datos.getDescuento().equals("0"))
        {
            calenDeREPro.setDate(convertToFecha(Datos.getFech_ini_Desc()));
            //System.out.println("Entre");
            calenAREPro.setDate(convertToFecha(Datos.getFech_fin_Desc()));
        }
        String Id = target.getValueAt(target.getSelectedRow(), 0).toString();
        lblImaProd1.setIcon(metodosImagen.MostrarImagen("producto","id_producto",Id,lblImaProd1));
        imag = metodosImagen.MostrarImagenBYTE("producto","id_producto",Id);
        
        lblImaProd.setIcon(metodosImagen.MostrarImagenBarras("producto","id_producto",Id,lblImaProd));
        imag2 = metodosImagen.MostrarImagenBYTEBarras("producto","id_producto",Id);
                
    }//GEN-LAST:event_jTableProductosMouseClicked

    private void btnCancelProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelProdActionPerformed
        // TODO add your handling code here:
        if(txtCodREProd.getText()=="")
        {
            JOptionPane.showMessageDialog(null, "Elegir registro");
        }
        else
        {
            objProductoDAO.Eliminar(RecuperarDatos());
            Limpiar();
            actualizarJtable();
        }
    }//GEN-LAST:event_btnCancelProdActionPerformed

    private void btnModifProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifProdActionPerformed
        // TODO add your handling code here:
        botonagregar();
        objProductoDAO.ModificarConImagen(RecuperarDatos());
        actualizarJtable();
        Limpiar(); 
        
    }//GEN-LAST:event_btnModifProdActionPerformed
        
    public static String fechaactual()
    {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy/MM/dd");
        return formatofecha.format(fecha);
    }
    
    public void Validar()
    {
        Correcto = false;
        if("".equals(txtNomREProd.getText()))
        {
            Correcto = false;
            JOptionPane.showMessageDialog(null, "Ingresar El Nombrre");
            return;
        }
        if("".equals(txtDescProd.getText()))
        {
            Correcto = false;
            JOptionPane.showMessageDialog(null, "Ingresar Descripción");
            return;
        }
        if("".equals(txtMarcREPro.getText()))
        {
            Correcto = false;
            JOptionPane.showMessageDialog(null, "Ingresar Marca");
            return;
        }
        if("".equals(txtProveREPro.getText()))
        {
            Correcto = false;
            JOptionPane.showMessageDialog(null, "Ingresar Proveedor");
            return;
        }
        if("".equals(txtId_Cod_Barr.getText()))
        {
            Correcto = false;
            JOptionPane.showMessageDialog(null, "Ingresar Código de Barras");
            return;
        }
        Correcto = true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelProd;
    private javax.swing.JButton btnCargarCodBarr;
    private javax.swing.JButton btnCargarREProd;
    private javax.swing.JButton btnGuarProd;
    private javax.swing.JButton btnModifProd;
    private javax.swing.JButton btnNewProd;
    private com.toedter.calendar.JDateChooser calenAREPro;
    private com.toedter.calendar.JDateChooser calenDeREPro;
    private javax.swing.JComboBox<String> cbxCateREPro;
    private javax.swing.JComboBox<String> cbxUnidREPro;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JLabel jblBuscarProduc1;
    private javax.swing.JLabel lblCantPro;
    private javax.swing.JLabel lblCatProd;
    private javax.swing.JLabel lblCodProd;
    private javax.swing.JLabel lblDescAREPRrod;
    private javax.swing.JLabel lblDescDeREPRrod;
    private javax.swing.JLabel lblImaProd;
    private javax.swing.JLabel lblImaProd1;
    private javax.swing.JLabel lblIvaProd;
    private javax.swing.JLabel lblIvaProd1;
    private javax.swing.JLabel lblMarProd;
    private javax.swing.JLabel lblNomProd;
    private javax.swing.JLabel lblPreComProd;
    private javax.swing.JLabel lblPreVenProd;
    private javax.swing.JLabel lblProvProd1;
    private javax.swing.JLabel lblProvProd2;
    private javax.swing.JLabel lblUnidProd;
    private javax.swing.JLabel lblUtilProd;
    private javax.swing.JPanel pnlRegistrarProduc;
    private javax.swing.JSpinner spinDescREProd;
    private javax.swing.JSpinner txtCantREPro;
    private javax.swing.JTextField txtCodREProd;
    private javax.swing.JTextArea txtDescProd;
    private javax.swing.JTextField txtId_Cod_Barr;
    private javax.swing.JSpinner txtIvaREPro;
    private javax.swing.JTextField txtMarcREPro;
    private javax.swing.JTextField txtNomREProd;
    private javax.swing.JTextField txtPreComREPro;
    private javax.swing.JTextField txtPreVentREPro;
    private javax.swing.JTextField txtProveREPro;
    private javax.swing.JTextField txtUtilREPro;
    // End of variables declaration//GEN-END:variables
}
