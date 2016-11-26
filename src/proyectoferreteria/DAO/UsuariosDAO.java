package proyectoferreteria.DAO;

import proyectoferreteria.Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoferreteria.BO.UsuariosBO;

/**
 *
 * @author elektra
 */
public class UsuariosDAO 
{
    Conexion conn = new Conexion();
    
    public void AgregarConIagen(UsuariosBO objUsuarios)
    {
        String sentencia = "INSERT INTO empleado (Nombre, Imagen, Apellido, Direccion, Telefono, Correo, DNI, Usuario, Contrasena, Rol, Estatus)"
                + "VALUES(\""+objUsuarios.getNombre()+"\",?,\""+objUsuarios.getApellido()+"\",\""+objUsuarios.getDireccion()+"\",\""+objUsuarios.getTelefono()+"\","
                + "\""+objUsuarios.getCorreo()+"\",\""+objUsuarios.getDNI()+"\",\""+objUsuarios.getUsuario()+"\",\""+objUsuarios.getContrasena()+"\",\""+objUsuarios.getRol()+"\",\"1\")";
        
        int resultado = conn.EjecutarComandoSQLImagen(sentencia,objUsuarios.getImagen());
        
        if(resultado==1)
            JOptionPane.showMessageDialog(null,"Se ha agregado correctamente","Información", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"No se pudo completar la operación","Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void ModificarConImagen(UsuariosBO ObjUsuario)
    {
       String Consulta = "UPDATE empleado SET "+
                "Nombre='"+ObjUsuario.getNombre()+"',Imagen = ?,"+
                "Apellido='"+ObjUsuario.getApellido()+"',"+
                "Direccion ='"+ObjUsuario.getDireccion()+"',"+
                "Telefono='"+ObjUsuario.getTelefono()+"',"+
                "Correo='"+ObjUsuario.getCorreo()+"',"+
                "DNI ='"+ObjUsuario.getDNI()+"',"+
                "Usuario='"+ObjUsuario.getUsuario()+"',"+
                "Contrasena='"+ObjUsuario.getContrasena()+"',"+
                "Rol ='"+ObjUsuario.getRol()+"',"+
                "Estatus='"+ObjUsuario.getEstatus()+"' Where id_empleado='"+ObjUsuario.getCodigo()+"';";
       
       int resultado = conn.EjecutarComandoSQLImagen(Consulta, ObjUsuario.getImagen());
       
       if(resultado==1)
            JOptionPane.showMessageDialog(null,"Se ha modificado correctamente","Información", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"No se pudo completar la operación","Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void Desactivar(UsuariosBO ObjUsuario)
    {
       String Consulta = "";
       if(ObjUsuario.getEstatus().equals("1"))
       {
          Consulta = "UPDATE empleado SET Estatus='0' Where id_empleado='"+ObjUsuario.getCodigo()+"';";
       }
       if(ObjUsuario.getEstatus().equals("0"))
       {
          Consulta = "UPDATE empleado SET Estatus='1' Where id_empleado='"+ObjUsuario.getCodigo()+"';";
       }
       int resultado = conn.EjecutarComandoSQL(Consulta);
       
       if(resultado==1)
            JOptionPane.showMessageDialog(null,"Se ha desactivado al usuario","Información", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"No se pudo completar la operación","Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public DefaultTableModel BuscarDinamica(UsuariosBO datos)
    {
        DefaultTableModel dtm; dtm = new DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Código", "Nombre", "Apellidos", "Usuario"
            }
        );  
        try {
            String cadenaWhere = "";
            Boolean edo = false;
            String Mysql = "";
            
            if (!"".equals(datos.getCodigo()))
            {
                cadenaWhere = cadenaWhere + " id_empleado='" + datos.getCodigo() + "' and";
                edo = true;
            }
            if (!"".equals(datos.getNombre()))
            {
                cadenaWhere = cadenaWhere + " Nombre='" + datos.getNombre() + "' and";
                edo = true;
            }
            if (!"".equals(datos.getApellido()))
            {
                cadenaWhere = cadenaWhere + " Apellido='" + datos.getApellido() + "' and";
                edo = true;
            }
            if (!"".equals(datos.getCorreo()))
            {
                cadenaWhere = cadenaWhere + " Correo='" + datos.getCorreo() + "' and";
                edo = true;
            }
            if (!"".equals(datos.getDireccion()))
            {
                cadenaWhere = cadenaWhere + " Direccion='" + datos.getDireccion() + "' and";
                edo = true;
            }
            if (!"".equals(datos.getTelefono()))
            {
                cadenaWhere = cadenaWhere + " Telefono='" + datos.getTelefono() + "' and";
                edo = true;
            }
            if (!"".equals(datos.getUsuario()))
            {
                cadenaWhere = cadenaWhere + " Usuario='" + datos.getUsuario() + "' and";
                edo = true;
            }

            if (edo == true)
            {
                int numero = cadenaWhere.length() - 3;
                cadenaWhere = " WHERE " + cadenaWhere.substring(0, numero);
                Mysql = "SELECT * FROM empleado" + cadenaWhere;
            }
            PreparedStatement pstm = conn.ConectarSQLite().prepareStatement(Mysql);
            ResultSet resultado = pstm.executeQuery();
            
            while(resultado.next())
            {
                Object[] Fila={
                    resultado.getString(1),
                    resultado.getString(2),
                    resultado.getString(3),
                    resultado.getString(8)
                };
                dtm.addRow(Fila);
            }
        conn.Desconectar();
        return dtm;
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public DefaultTableModel Llenar()//Parallenar La Tabla
    {
        DefaultTableModel dtm; dtm = new DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Código", "Nombre", "Apellidos", "Usuario"
            }
        );   
        try 
        {
            PreparedStatement pstm = conn.ConectarSQLite().prepareStatement("SELECT * FROM empleado");
            ResultSet Resultado = pstm.executeQuery();
            
            while(Resultado.next())
            {
                Object[] Fila={
                    Resultado.getString(1),
                    Resultado.getString(2),
                    Resultado.getString(3),
                    Resultado.getString(8)
                };
                dtm.addRow(Fila);
            }
            conn.Desconectar();
            return dtm;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            //Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }        
    }
    
    public UsuariosBO LlenarCampos(String Id)//Lllena Todos los texBox, ComboBox etc
    {
        try 
        {
            UsuariosBO Dato = new UsuariosBO();
            String sql = "Select * From empleado Where id_empleado = '"+ Id +"';";
            PreparedStatement pstm = conn.ConectarSQLite().prepareStatement(sql);
            ResultSet Resultado = pstm.executeQuery();
            
            while(Resultado.next())
            {
                Dato.setCodigo(Resultado.getString(1));
                Dato.setNombre(Resultado.getString(2));
                Dato.setApellido(Resultado.getString(3));
                Dato.setDireccion(Resultado.getString(4));
                Dato.setTelefono(Resultado.getString(5));
                Dato.setCorreo(Resultado.getString(6));
                Dato.setDNI(Resultado.getString(7));
                Dato.setUsuario(Resultado.getString(8));
                Dato.setContrasena(Resultado.getString(9));
                Dato.setRol(Resultado.getString(10));            
                Dato.setEstatus(Resultado.getString(12));            
            }
            conn.Desconectar();
            return Dato;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            //Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }        
    }
    
    public ResultSet Buscar(UsuariosBO objUsuarios)//Para El Loguin
    {
        try
        {
            String consulta = "SELECT * FROM empleado Where Usuario = \""+objUsuarios.getUsuario()+"\" and Contrasena = \""+objUsuarios.getContrasena()+"\" and Estatus = \"1\"";
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
