
package proyectoferreteria.DAO;

import javax.swing.JOptionPane;
import proyectoferreteria.BO.VentaDetalleBO;
import proyectoferreteria.Conexion.Conexion;

public class ventaDetalleDAO {
    Conexion objConexion = new Conexion();
    CompraEncabezadoDAO objEncabezadoDAO = new CompraEncabezadoDAO();
    public int Agregar(VentaDetalleBO objDetalle){
        ProductoDAO metodo = new ProductoDAO();
        metodo.AgregarAStock(objDetalle.getId_producto(), Integer.parseInt(objDetalle.getCantidad()));
        String Sentencia = "INSERT INTO venta_detalle(Cantidad, Precio,Precio_final,Producto_id_producto,Venta_encabezado_id_venta_encabezado,Status)\n" +
            "VALUES ('"+objDetalle.getCantidad()+"','"+objDetalle.getPrecio()+"','"+objDetalle.getPrecio_Final()+"','"+objDetalle.getId_producto()+"','"+objEncabezadoDAO.MaxId()+"',1);";
        JOptionPane.showMessageDialog(null, Sentencia);
        int ComandoEjecutado=objConexion.EjecutarComandoSQL(Sentencia);
        objConexion.Desconectar();
        return ComandoEjecutado;
    }    
    
}
