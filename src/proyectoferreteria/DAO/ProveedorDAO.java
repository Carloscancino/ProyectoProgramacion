
package proyectoferreteria.DAO;

import proyectoferreteria.BO.ProveedorBO;
import proyectoferreteria.Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


public class ProveedorDAO {
     Conexion objConexion= new Conexion();
     
     public ProveedorDAO(){
     }
     public int Agregar(ProveedorBO objProveedor){
         int ComandoEjecutado=objConexion.EjecutarComandoSQL("INSERT INTO proveedor(Nombre,Direccion,Email,Telefono,Estatus)\n" +
"VALUES ('"+objProveedor.getNombre()+"','"+objProveedor.getDireccion()+"','"+objProveedor.getEmail()+"','"+objProveedor.getTelefono()+"','"+objProveedor.getEstatus()+"');");
    objConexion.Desconectar();
    return ComandoEjecutado;
     }
     
     public int Eliminar(ProveedorBO objProveedor){
     int ComandoEjecutado=objConexion.EjecutarComandoSQL("update proveedor set Estatus='"+objProveedor.getEstatus()+"' WHERE id_proveedor='"+objProveedor.getCodigo()+"'");
     objConexion.Desconectar();
     return ComandoEjecutado;
     }
     
     public int Modificar(ProveedorBO objProveedor){
     int ComandoEjecutado=objConexion.EjecutarComandoSQL("UPDATE proveedor SET Nombre='"+objProveedor.getNombre()+"', Direccion='"+objProveedor.getDireccion()+"',Email='"+objProveedor.getEmail()+"',Telefono='"+objProveedor.getTelefono()+"',Estatus='"+objProveedor.getEstatus()+"' WHERE id_proveedor='"+objProveedor.getCodigo()+"'");
     objConexion.Desconectar();    
     return ComandoEjecutado;
     }
     //SELECT * FROM proveedor WHERE Nombre LIKE '%F%'
     public DefaultTableModel Buscar(ProveedorBO objProveedor){
        DefaultTableModel dtm =new DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Código", "Nombre", "Direcion", "Email","Telefono","Estatus"
            }
        ){ @Override
    public boolean isCellEditable(int row, int column) {
     // Para no editar en el jTable
       return false;
    }};
         
        try{
         Conexion objConexion= new Conexion();
         ResultSet  Resultado=objConexion.EjecutarSentenciaSQL("SELECT * FROM proveedor where Estatus='1'");
         while(Resultado.next()){
        // Recuperar Datos de la GUI
        Object[] Fila={
          Resultado.getString(1), 
          Resultado.getString(2),
          Resultado.getString(3), 
          Resultado.getString(4),
          Resultado.getString(5),
          Resultado.getString(6)
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
