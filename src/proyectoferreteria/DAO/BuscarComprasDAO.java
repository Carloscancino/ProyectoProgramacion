
package proyectoferreteria.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import proyectoferreteria.BO.BuscarComprasBO;
import proyectoferreteria.BO.BuscarVentasBO;
import proyectoferreteria.Conexion.Conexion;

public class BuscarComprasDAO {
    
    Conexion objConexion= new Conexion();
    
    public BuscarComprasDAO(){
    }
 
    public DefaultTableModel BuscarFecha (BuscarComprasBO objBuscarCompras){
        DefaultTableModel dtm =new DefaultTableModel(
            new Object [][] {},
            new String [] {
                 "ID de compra", "Total", "Descuento", "Fecha","Estatus","ID del empleado","ID del cliente"
            }
        ){ @Override
    public boolean isCellEditable(int row, int column) {
     // Para no editar en el jTable
       return false;
    }};
         
        try{
         Conexion objConexion= new Conexion();
         ResultSet  Resultado=objConexion.EjecutarSentenciaSQL("SELECT * FROM compra_encabezado WHERE fecha BETWEEN '"+objBuscarCompras.getFechaInicio()+"' AND '"+objBuscarCompras.getFechaFinal()+"' AND Status='1'");
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
                "ID venta", "Total", "Descuento", "Fecha","Estatus","ID empleado","ID cliente"
            }
        ){ @Override
    public boolean isCellEditable(int row, int column) {
     // Para no editar en el jTable
       return false;
    }};
         
        try{
         Conexion objConexion= new Conexion();
         ResultSet  Resultado=objConexion.EjecutarSentenciaSQL("SELECT * FROM compra_encabezado where Status='1'");
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
