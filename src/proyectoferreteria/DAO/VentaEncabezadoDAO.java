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
    
    public int Agregar(VentaEncabezadoBO objVenta){
        String Sentencia = "INSERT INTO venta_encabezado(Fecha,Total, Proveedor_id_proveedor,Empleado_id_empleado,Status)\n" +
            "VALUES ('"+objVenta.getFecha()+"','"+objVenta.getTotal()+"','"+objVenta.getId_clieto()+"','"+objVenta.getId_empleado()+"',1);";
        int ComandoEjecutado=conn.EjecutarComandoSQL(Sentencia);
        conn.Desconectar();
        return ComandoEjecutado;
    }
    public String MaxId()
    {
        try{
         String id_Max = "";
         Conexion objConexion= new Conexion();
         ResultSet  Resultado=objConexion.EjecutarSentenciaSQL("select max(id_venta_encabezado) as maximo from venta_encabezado");
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
