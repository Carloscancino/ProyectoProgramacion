
package proyectoferreteria.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import proyectoferreteria.BO.CompraEncabezadoBO;
import proyectoferreteria.Conexion.Conexion;

public class CompraEncabezadoDAO {
    Conexion objConexion = new Conexion();
    public int Agregar(CompraEncabezadoBO objCompra){
        String Sentencia = "INSERT INTO compra_encabezado(Fecha,Total, Proveedor_id_proveedor,Empleado_id_empleado,Status)\n" +
            "VALUES ('"+objCompra.getFecha()+"','"+objCompra.getTotal()+"','"+objCompra.getId_proveedor()+"','"+objCompra.getId_empleado()+"',1);";
        int ComandoEjecutado=objConexion.EjecutarComandoSQL(Sentencia);
        objConexion.Desconectar();
        return ComandoEjecutado;
    }
    public int Modificar(CompraEncabezadoBO objCompra){
        String Sentencia = "UPDATE categoria\n" +
            "SET Fecha ='"+objCompra.getFecha()+"',Proveedor_id_proveedor ='"+objCompra.getId_proveedor()+"',Empleado_id_empleado ='"+objCompra.getId_empleado()+"',Status = 1 WHERE id_compra_encabezado = '"+objCompra.getIdcodigo()+"';";
        int ComandoEjecutado=objConexion.EjecutarComandoSQL(Sentencia);
        objConexion.Desconectar();
        return ComandoEjecutado;
    }        
    public DefaultTableModel Buscar(){
        DefaultTableModel dtm =new DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Fecha", "Total","Proveedor","Empleado"
            }
        ){ @Override
    public boolean isCellEditable(int row, int column) {
     // Para no editar en el jTable
       return false;
    }};
         
        try{
         Conexion objConexion= new Conexion();
         ResultSet  Resultado=objConexion.EjecutarSentenciaSQL("SELECT ce.Fecha, ce.Total, p.Nombre as 'Proveedor', e.Nombre as 'Empleado' FROM compra_encabezado as ce\n" +
            "JOIN proveedor as p\n" +
            "ON ce.Proveedor_id_proveedor = p.id_proveedor\n" +
            "JOIN empleado as e\n" +
            "ON ce.Empleado_id_empleado = e.id_empleado");
         while(Resultado.next()){
        // Recuperar Datos de la GUI
        Object[] Fila={
          Resultado.getString(1) , 
          Resultado.getString(2),
          Resultado.getString(3),
          Resultado.getString(4),          

        };
        // Agregar Datos al JTable
        dtm.addRow(Fila);
        
        }
         return dtm;       
         }catch(SQLException e){
         return null;
         }
    }


    public String MaxId()
    {
        try{
         String id_Max = "";
         Conexion objConexion= new Conexion();
         ResultSet  Resultado=objConexion.EjecutarSentenciaSQL("select max(id_compra_encabezado) as maximo from compra_encabezado");
         while(Resultado.next()){
        // Recuperar Datos de la GUI
            id_Max = Resultado.getString(1);
        // Agregar Datos al JTable
                
        }
         return id_Max;       
         }catch(SQLException e){
         return null;
         }
    }

    
}
