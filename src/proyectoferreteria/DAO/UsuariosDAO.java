package proyectoferreteria.DAO;

import proyectoferreteria.Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import proyectoferreteria.BO.UsuariosBO;

/**
 *
 * @author elektra
 */
public class UsuariosDAO 
{
    Conexion conn = new Conexion();
    public ResultSet Buscar(UsuariosBO objUsuarios)
    {
        try
        {
            String consulta = "SELECT * FROM empleado Where Usuario = \""+objUsuarios.getUsuario()+"\" and Contrasena = \""+objUsuarios.getContaseña()+"\"";
            //String consulta = "SELECT * FROM usuarios Where UsuarioName = \""+objUsuarios.getUsuario()+"\" and Contraseña = \""+objUsuarios.getContaseña()+"\"";
            PreparedStatement pstm = conn.ConectarSQLite().prepareStatement(consulta);
            ResultSet resultado = pstm.executeQuery();
            System.out.println("Listin...");
            return resultado;
        }
        catch(Exception ex)
        {
            System.out.println("Error "+ex);
            return null;
        }
    }
}
