package proyectoferreteria.Conexion;

import java.awt.JobAttributes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;


public class Conexion 
{     
    String CadenaConexion = "jdbc:sqlite:C:\\Users\\elektra\\Documents\\Ferreteria.s3db";
    Connection conectar=null;  
    //HOLA ASESINOS
    //SQLite
    //HOLA A TODOS
    public Connection ConectarSQLite()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            this.conectar = DriverManager.getConnection(CadenaConexion);
            System.out.println("Conectado...");
        }
        catch(Exception ex)
        {
            System.out.println("Error "+ex);
        }
        return this.conectar;
    }
    
    public void Desconectar()
    {
        try
        {
            this.conectar.close();
            System.out.println("Desconectado");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    public int EjecutarComandoSQL(String Sentencia){
        try {
         PreparedStatement pstm=ConectarSQLite().prepareStatement(Sentencia);
         pstm.execute();
         return 1;
        }catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    
    }
    public ResultSet EjecutarSentenciaSQL(String Sentencia){
     try {
         PreparedStatement pstm=ConectarSQLite().prepareStatement(Sentencia);
          pstm.execute();
          ResultSet Resultado=pstm.executeQuery();
           return Resultado;
        }catch (SQLException e) {
            System.out.println(e);
         return null;   
        }
    }

    public int EjecutarComandoSQLImagen(String Sentencia, byte[] imagen)
    {
        try
        {
            PreparedStatement pstm = ConectarSQLite().prepareStatement(Sentencia);
            pstm.setBytes(1, imagen);
            pstm.execute();
            System.out.println("Ejecución exitosa");
            Desconectar();
            return 1;
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return 0;
        }
    }
    
//    //MySQL
//    public Connection conexion()
//    {  
//        try {       
//            Class.forName("com.mysql.jdbc.Driver");          
//            conectar=DriverManager.getConnection("jdbc:mysql://localhost/escuela","root","");
//        }
//        catch (ClassNotFoundException | SQLException e) {       
//            JOptionPane.showMessageDialog(null,"Error "+e.getMessage());      
//        }     
//        return conectar;
//    }
}
