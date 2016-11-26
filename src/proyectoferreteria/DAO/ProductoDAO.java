package proyectoferreteria.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoferreteria.BO.ProductoBO;
import proyectoferreteria.Conexion.Conexion;

public class ProductoDAO {
    Conexion objConexion = new Conexion();
    public int Agregar(ProductoBO objProducto){
        String sentencia = "INSERT INTO producto(id_Codigo_barras,Imagen,Nombre,Descripcion,Marca,Stock,Unidad,Precio_compra,Precio_venta,Utilidad,Descuento,Desc_fecha_inicio,Desc_fecha_fin,IVA,Codigo_barras,Categoria_id_categoria,Proveedor_id_proveedor,Estatus)\n" +
            "VALUES ('"+
                objProducto.getId_Codigo_barra()+"','"+
                objProducto.getImagen()+"','"+
                objProducto.getNombre()+"','"+
                objProducto.getDescripcion()+"','"+
                objProducto.getMarca()+"','"+
                objProducto.getStock()+"','"+
                objProducto.getUnidad()+"','"+
                objProducto.getPrecio_compra()+"','"+
                objProducto.getPrecio_Venta()+"','"+
                objProducto.getUtilidad()+"','"+
                objProducto.getDescuento()+"','"+
                objProducto.getFech_ini_Desc()+"','"+
                objProducto.getFech_fin_Desc()+"','"+
                objProducto.getIVA()+"','"+
                objProducto.getCodigo_barras()+"','"+
                objProducto.getId_categoria()+"','"+
                objProducto.getId_proveedor()+"',1);";
        int resultado = objConexion.EjecutarComandoSQL(sentencia);
        if(resultado==1)
            JOptionPane.showMessageDialog(null,"Se ha agregado correctamente","Información", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"No se pudo completar la operación","Error", JOptionPane.ERROR_MESSAGE);        

       // int ComandoEjecutado=objConexion.EjecutarComandoSQL(Sentencia);
        objConexion.Desconectar();
        return resultado;
    }    
    public void ModificarConImagen(ProductoBO ObjProducto)
    {
 //,,,,,,,,,,,,,,,,,
       String Consulta = "UPDATE producto SET "+
                "id_Codigo_barras='"+ObjProducto.getId_Codigo_barra()+"','"+
                "Imagen ='"+ObjProducto.getImagen()+"','"+
                "Nombre='"+ObjProducto.getNombre()+"','"+
                "Descripcion ='"+ObjProducto.getDescripcion()+"','"+
                "Marca='"+ObjProducto.getMarca()+"','"+
                "Stock='"+ObjProducto.getStock()+"','"+
                "Unidad ='"+ObjProducto.getUnidad()+"','"+
                "Precio_compra='"+ObjProducto.getPrecio_compra()+"','"+
                "Precio_venta='"+ObjProducto.getPrecio_Venta()+"','"+
                "Utilidad ='"+ObjProducto.getUtilidad()+"','"+
                "Descuento ='"+ObjProducto.getDescuento()+"','"+
                "Desc_fecha_inicio ='"+ObjProducto.getFech_ini_Desc()+"','"+
                "Desc_fecha_fin ='"+ObjProducto.getFech_fin_Desc()+"','"+
                "IVA ='"+ObjProducto.getIVA()+"','"+
                "Codigo_barras ='"+ObjProducto.getCodigo_barras()+"','"+
                "Categoria_id_categoria ='"+ObjProducto.getId_categoria()+"','"+
                "Proveedor_id_proveedor ='"+ObjProducto.getId_proveedor()+"' "+

                "WHERE id_producto='"+ObjProducto.getCodigo()+"';";
       
       int resultado = objConexion.EjecutarComandoSQL(Consulta);
       
       if(resultado==1)
            JOptionPane.showMessageDialog(null,"Se ha modificado correctamente","Información", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"No se pudo completar la operación","Error", JOptionPane.ERROR_MESSAGE);
    }

    public void Eliminar(ProductoBO ObjProducto)
    {
 //,,,,,,,,,,,,,,,,,
       String Consulta = "UPDATE producto SET "+
                "Estatus = 0 "+
                "WHERE id_producto='"+ObjProducto.getCodigo()+"';";
       int resultado = objConexion.EjecutarComandoSQL(Consulta);
       
       if(resultado==1)
            JOptionPane.showMessageDialog(null,"Se ha modificado correctamente","Información", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"No se pudo completar la operación","Error", JOptionPane.ERROR_MESSAGE);
    }   
    public DefaultTableModel Buscar(){
        DefaultTableModel dtm =new DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Código", "Nombre","Descripción","Marca","Stock","Precio Venta"
            }
        ){ @Override
    public boolean isCellEditable(int row, int column) {
     // Para no editar en el jTable
       return false;
    }};
         
        try{
         Conexion objConexion= new Conexion();
         ResultSet  Resultado=objConexion.EjecutarSentenciaSQL("SELECT * FROM producto WHERE Estatus = 1");
         while(Resultado.next()){
        // Recuperar Datos de la GUI
        Object[] Fila={
          Resultado.getString(1) , 
          Resultado.getString(3),
          Resultado.getString(4),
          Resultado.getString(5),
          Resultado.getString(6),
          Resultado.getString(9),
        };
        // Agregar Datos al JTable
        dtm.addRow(Fila);
        
        }
         return dtm;       
         }catch(SQLException e){
         return null;
         }
    }    
    
}
