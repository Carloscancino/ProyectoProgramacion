/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoferreteria.BO;

/**
 *
 * @author ORTIZ
 */
public class CompraDetalleBO {
    int Id_compra_detalle;
    String Cantidad;
    String Precio;
    String Precio_Final;
    String id_Producto;
    String id_Compra_Encabezado;

    public int getId_compra_detalle() {
        return Id_compra_detalle;
    }

    public void setId_compra_detalle(int Id_compra_detalle) {
        this.Id_compra_detalle = Id_compra_detalle;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getPrecio_Final() {
        return Precio_Final;
    }

    public void setPrecio_Final(String Precio_Final) {
        this.Precio_Final = Precio_Final;
    }

    public String getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(String id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getId_Compra_Encabezado() {
        return id_Compra_Encabezado;
    }

    public void setId_Compra_Encabezado(String id_Compra_Encabezado) {
        this.id_Compra_Encabezado = id_Compra_Encabezado;
    }
    
    
}
