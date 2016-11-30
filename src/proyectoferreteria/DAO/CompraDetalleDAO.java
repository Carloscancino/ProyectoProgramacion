
package proyectoferreteria.DAO;

import javax.swing.JOptionPane;
import proyectoferreteria.BO.CompraDetalleBO;
import proyectoferreteria.Conexion.Conexion;

public class CompraDetalleDAO {
    Conexion objConexion = new Conexion();
    CompraEncabezadoDAO objEncabezadoDAO = new CompraEncabezadoDAO();
    public int Agregar(CompraDetalleBO objDetalle){
        ProductoDAO metodo = new ProductoDAO();
        metodo.AgregarAStock(objDetalle.getId_Producto(), Integer.parseInt(objDetalle.getCantidad()));
        String Sentencia = "INSERT INTO compra_detalle(Cantidad, Precio,Precio_final,Producto_id_producto,Compra_encabezado_id_compra_encabezado,Status)\n" +
            "VALUES ('"+objDetalle.getCantidad()+"','"+objDetalle.getPrecio()+"','"+objDetalle.getPrecio_Final()+"','"+objDetalle.getId_Producto()+"','"+objEncabezadoDAO.MaxId()+"',1);";
        JOptionPane.showMessageDialog(null, Sentencia);
        int ComandoEjecutado=objConexion.EjecutarComandoSQL(Sentencia);
        objConexion.Desconectar();
        return ComandoEjecutado;
    }
    
}
