
package proyectoferreteria.BO;

public class VentaDetalleBO {
    int Id_venta_detalle;
    String Cantidad;
    String Precio;
    String Precio_Final;
    String id_producto;
    String id_venta_Encabezado;

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }
    
    public int getId_venta_detalle() {
        return Id_venta_detalle;
    }

    public void setId_venta_detalle(int Id_venta_detalle) {
        this.Id_venta_detalle = Id_venta_detalle;
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

    public String getId_venta_Encabezado() {
        return id_venta_Encabezado;
    }

    public void setId_venta_Encabezado(String id_venta_Encabezado) {
        this.id_venta_Encabezado = id_venta_Encabezado;
    }
    
    
}
