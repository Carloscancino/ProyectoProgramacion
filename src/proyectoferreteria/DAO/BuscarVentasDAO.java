
package proyectoferreteria.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import proyectoferreteria.BO.BuscarVentasBO;
import proyectoferreteria.BO.ProveedorBO;
import proyectoferreteria.Conexion.Conexion;

public class BuscarVentasDAO {
    Conexion objConexion= new Conexion();
    
    public BuscarVentasDAO(){
    }
 
    public DefaultTableModel BuscarFecha (BuscarVentasBO objBuscarVentas){
        DefaultTableModel dtm =new DefaultTableModel(
            new Object [][] {},
            new String [] {
                 "ID encabezado", "Total", "Descuento", "Fecha","Estatus","ID empleado","ID cliente"
            }
        ){ @Override
    public boolean isCellEditable(int row, int column) {
     // Para no editar en el jTable
       return false;
    }};
         
        try{
         Conexion objConexion= new Conexion();
         ResultSet  Resultado=objConexion.EjecutarSentenciaSQL("SELECT id_venta_encabezado,Total,Descuento,Fecha,Estatus,Empleado_id_empleado,Cliente_id_cliente FROM venta_encabezado WHERE (FechaBusqueda BETWEEN '"+objBuscarVentas.getFechaInicio()+"' AND '"+objBuscarVentas.getFechaFinal()+"') AND Estatus='1'");
         while(Resultado.next()){
        // Recuperar Datos de la GUI
        Object[] Fila={
          Resultado.getString(1), 
          Resultado.getString(2),
          Resultado.getString(3), 
          Resultado.getString(4),
          Resultado.getString(5),
          Resultado.getString(6),
          Resultado.getString(7)
        };
        // Agregar Datos al JTable
        dtm.addRow(Fila);
        
        }
         return dtm;       
         }catch(SQLException e){
         return null;
         }
    }
    
    public DefaultTableModel Buscar(){
        DefaultTableModel dtm =new DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID encabezado", "Total", "Descuento", "Fecha","Estatus","ID empleado","ID cliente"
            }
        ){ @Override
    public boolean isCellEditable(int row, int column) {
     // Para no editar en el jTable
       return false;
    }};
         
        try{
         Conexion objConexion= new Conexion();
         ResultSet  Resultado=objConexion.EjecutarSentenciaSQL("SELECT id_venta_encabezado,Total,Descuento,Fecha,Estatus,Empleado_id_empleado,Cliente_id_cliente FROM venta_encabezado where Estatus='1'");
         while(Resultado.next()){
        // Recuperar Datos de la GUI
        Object[] Fila={
          Resultado.getString(1), 
          Resultado.getString(2),
          Resultado.getString(3), 
          Resultado.getString(4),
          Resultado.getString(5),
          Resultado.getString(6),
          Resultado.getString(7)
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
