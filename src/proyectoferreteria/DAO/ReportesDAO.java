package proyectoferreteria.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import proyectoferreteria.BO.ReportesBO;
import proyectoferreteria.BO.UsuariosBO;
import proyectoferreteria.Conexion.Conexion;

/**
 *
 * @author elektra
 */
public class ReportesDAO 
{
    Conexion conn = new Conexion();
    public ReportesBO TraerAcyNoAc()//Lllena Todos los texBox, ComboBox etc
    {
        try 
        {
            int contador = 0;
            ReportesBO Dato = new ReportesBO();
            
            String sql = "select Estatus, count(Estatus) from empleado group by Estatus";
            PreparedStatement pstm = conn.ConectarSQLite().prepareStatement(sql);
            ResultSet Resultado = pstm.executeQuery();
            while(Resultado.next())
            {
                if(contador == 0)
                {
                    Dato.setActivo(Resultado.getInt(2));
                    contador = 1;
                }
                if(contador == 1)
                {
                    Dato.setInAcivo(Resultado.getInt(2)); 
                }
            }
            conn.Desconectar();
            return Dato;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            //Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }        
    }
}
