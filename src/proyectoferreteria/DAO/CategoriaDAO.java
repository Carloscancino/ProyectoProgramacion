/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoferreteria.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import proyectoferreteria.BO.CategorioBO;
import proyectoferreteria.Conexion.Conexion;

/**
 *
 * @author ORTIZ
 */
public class CategoriaDAO {
    Conexion objConexion = new Conexion();
    
    //INSERT INTO categoria (Nombre, Status) VALUES("Herramientas",1)
    public int Agregar(CategorioBO objCategoria){
        String Sentencia = "INSERT INTO categoria(Nombre, Status)\n" +
            "VALUES ('"+objCategoria.getNombre()+"',1);";
        int ComandoEjecutado=objConexion.EjecutarComandoSQL(Sentencia);
        objConexion.Desconectar();
        return ComandoEjecutado;
    }
    public int Eliminar(CategorioBO objCategoria){
        String Sentencia = "DELETE FROM categoria\n" +
            "WHERE id_categoria = '"+objCategoria.getCodigo()+"';";
        int ComandoEjecutado = objConexion.EjecutarComandoSQL(Sentencia);
        objConexion.Desconectar();
        return ComandoEjecutado;
    }    
    public int Modificar(CategorioBO objCategoria){
        String Sentencia = "UPDATE categoria\n" +
            "SET Nombre ='"+objCategoria.getNombre()+"',Status = 1 WHERE id_categoria = '"+objCategoria.getCodigo()+"';";
        int ComandoEjecutado=objConexion.EjecutarComandoSQL(Sentencia);
        objConexion.Desconectar();
        return ComandoEjecutado;
    }    
    public DefaultTableModel Buscar(){
        DefaultTableModel dtm =new DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Código", "Nombre"
            }
        ){ @Override
    public boolean isCellEditable(int row, int column) {
     // Para no editar en el jTable
       return false;
    }};
         
        try{
         Conexion objConexion= new Conexion();
         ResultSet  Resultado=objConexion.EjecutarSentenciaSQL("SELECT * FROM categoria");
         while(Resultado.next()){
        // Recuperar Datos de la GUI
        Object[] Fila={
          Resultado.getString(1) , 
          Resultado.getString(2),

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
