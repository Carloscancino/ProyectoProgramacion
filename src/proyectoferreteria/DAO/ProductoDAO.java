package proyectoferreteria.DAO;

import proyectoferreteria.BO.ProductoBO;
import proyectoferreteria.Conexion.Conexion;

public class ProductoDAO {
    Conexion objConexion = new Conexion();
    public int Agregar(ProductoBO objProducto){
        String Sentencia = "INSERT INTO producto(id_Codigo_barras,Nombre,Descripcion,Marca,Stock,Unidad,Precio_compra,Precio_venta,Utilidad,Descuento,Desc_fecha_inicio,Desc_fecha_fin,Imagen,IVA,Codigo_barras,Categoria_id_categoria,Proveedor_id_proveedor,Estatus)\n" +
            "VALUES ('"+objProducto.getId_Codigo_barra()+"','"+objProducto.getNombre()+"','"+objProducto.getDescripcion()+"','"+objProducto.getMarca()+"','"+objProducto.getStock()+"','"+objProducto.getUnidad()+"','"+objProducto.getPrecio_compra()+"','"+objProducto.getPrecio_Venta()+"','"+objProducto.getUtilidad()+"','"+objProducto.getDescuento()+"','"+objProducto.getFech_ini_Desc()+"','"+objProducto.getFech_fin_Desc()+"','"+objProducto.getImagen()+"','"+objProducto.getIVA()+"','"+objProducto.getCodigo_barras()+"','"+objProducto.getId_categoria()+"','"+objProducto.getId_proveedor()+"',1);";
        int ComandoEjecutado=objConexion.EjecutarComandoSQL(Sentencia);
        objConexion.Desconectar();
        return ComandoEjecutado;
    }    
    
    
}
