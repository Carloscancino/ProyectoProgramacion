/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoferreteria.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import proyectoferreteria.Conexion.Conexion;

/**
 *
 * @author elektra
 */
public class ManejoDeImagenes 
{
    Conexion conn = new Conexion();
    public ImageIcon MostrarImagen(String Tabla, String CampoID, String Id, JLabel imagenContent)
    {
        try
        {     
            String sql = "Select Imagen From "+Tabla+" Where "+CampoID+" = '"+ Id +"';";
            PreparedStatement pstm = conn.ConectarSQLite().prepareStatement(sql);
            ResultSet resultado = pstm.executeQuery();
            byte[] arreglo = resultado.getBytes(1);
            return new ImageIcon((new ImageIcon(arreglo)).getImage().getScaledInstance(imagenContent.getWidth(),imagenContent.getHeight(), java.awt.Image.SCALE_SMOOTH));
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        finally
        {
            conn.Desconectar();
        }
    }
    
    public byte[] MostrarImagenBYTE(String Tabla, String CampoID, String Id)
    {
        try
        {     
            String sql = "Select Imagen From "+Tabla+" Where "+CampoID+" = '"+ Id +"';";
            PreparedStatement pstm = conn.ConectarSQLite().prepareStatement(sql);
            ResultSet resultado = pstm.executeQuery();
            byte[] arreglo = resultado.getBytes(1);
            return arreglo;
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        finally
        {
            conn.Desconectar();
        }
    }
    
    public ImageIcon MostrarImagenBarras(String Tabla, String CampoID, String Id, JLabel imagenContent)
    {
        try
        {     
            String sql = "Select Codigo_barras From "+Tabla+" Where "+CampoID+" = '"+ Id +"';";
            PreparedStatement pstm = conn.ConectarSQLite().prepareStatement(sql);
            ResultSet resultado = pstm.executeQuery();
            byte[] arreglo = resultado.getBytes(1);
            return new ImageIcon((new ImageIcon(arreglo)).getImage().getScaledInstance(imagenContent.getWidth(),imagenContent.getHeight(), java.awt.Image.SCALE_SMOOTH));
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        finally
        {
            conn.Desconectar();
        }
    }
    
    public byte[] MostrarImagenBYTEBarras(String Tabla, String CampoID, String Id)
    {
        try
        {     
            String sql = "Select Codigo_barras From "+Tabla+" Where "+CampoID+" = '"+ Id +"';";
            PreparedStatement pstm = conn.ConectarSQLite().prepareStatement(sql);
            ResultSet resultado = pstm.executeQuery();
            byte[] arreglo = resultado.getBytes(1);
            return arreglo;
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        finally
        {
            conn.Desconectar();
        }
    }
}
