package proyectoferreteria.DAO;

import java.awt.JobAttributes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion 
{     
    Connection conectar=null;  
    public Connection conexion()
    {  
        try {       
            Class.forName("com.mysql.jdbc.Driver");          
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/escuela","root","");
        }
        catch (ClassNotFoundException | SQLException e) {       
            JOptionPane.showMessageDialog(null,"Error "+e.getMessage());      
        }     
        return conectar;
    }
}
