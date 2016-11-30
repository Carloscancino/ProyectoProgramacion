/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoferreteria.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyectoferreteria.BO.ReportesBO;
import proyectoferreteria.BO.VentaEncabezadoBO;
import proyectoferreteria.Conexion.Conexion;

/**
 *
 * @author elektra
 */
public class VentaEncabezadoDAO {
    
        Conexion conn = new Conexion();
    public VentaEncabezadoBO TotalVentas(String Fecha)
    {
        try 
        {
            VentaEncabezadoBO Dato = new VentaEncabezadoBO();
            
            String sql = "SELECT SUM(Total) as suma from venta_encabezado where Fecha=\""+Fecha+"\"";
            PreparedStatement pstm = conn.ConectarSQLite().prepareStatement(sql);
            ResultSet Resultado = pstm.executeQuery();
            while(Resultado.next())
            {
                Dato.setTotal(Resultado.getInt(1));
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
