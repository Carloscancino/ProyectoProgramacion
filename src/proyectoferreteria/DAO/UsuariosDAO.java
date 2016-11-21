package proyectoferreteria.DAO;

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
            String consulta = "SELECT * FROM usuarios Where UsuarioName = \""+objUsuarios.getUsuario()+"\" and Contraseña = \""+objUsuarios.getContaseña()+"\"";
            PreparedStatement pstm = conn.conexion().prepareStatement(consulta);
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
