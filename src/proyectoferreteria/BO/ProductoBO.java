
package proyectoferreteria.BO;

import java.util.Date;

public class ProductoBO {
    private String Codigo;
    private String Id_Codigo_barra;
    private String Nombre;
    private String Descripcion;
    private String Marca;
    private String Stock;
    private String Unidad;
    private String Precio_compra;
    private String Precio_Venta;
    private String Utilidad;
    private String Descuento;
    private String Fech_ini_Desc;
    private String Fech_fin_Desc;
    private byte [] Imagen;
    private String IVA;
    private byte[] Codigo_barras;
    private String id_categoria;
    private String id_proveedor;
    private boolean estatus;
    private String NumeroVentas;

    public String getNumeroVentas() {
        return NumeroVentas;
    }

    public void setNumeroVentas(String NumeroVentas) {
        this.NumeroVentas = NumeroVentas;
    }
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getId_Codigo_barra() {
        return Id_Codigo_barra;
    }

    public void setId_Codigo_barra(String Id_Codigo_barra) {
        this.Id_Codigo_barra = Id_Codigo_barra;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String Stock) {
        this.Stock = Stock;
    }

    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }

    public String getPrecio_compra() {
        return Precio_compra;
    }

    public void setPrecio_compra(String Precio_compra) {
        this.Precio_compra = Precio_compra;
    }

    public String getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(String Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    public String getUtilidad() {
        return Utilidad;
    }

    public void setUtilidad(String Utilidad) {
        this.Utilidad = Utilidad;
    }

    public String getDescuento() {
        return Descuento;
    }

    public void setDescuento(String Descuento) {
        this.Descuento = Descuento;
    }

    public String getFech_ini_Desc() {
        return Fech_ini_Desc;
    }

    public void setFech_ini_Desc(String Fech_ini_Desc) {
        this.Fech_ini_Desc = Fech_ini_Desc;
    }

    public String getFech_fin_Desc() {
        return Fech_fin_Desc;
    }

    public void setFech_fin_Desc(String Fech_fin_Desc) {
        this.Fech_fin_Desc = Fech_fin_Desc;
    }

    public byte[] getImagen() {
        return Imagen;
    }

    public void setImagen(byte[] Imagen) {
        this.Imagen = Imagen;
    }

    public String getIVA() {
        return IVA;
    }

    public void setIVA(String IVA) {
        this.IVA = IVA;
    }

    public byte[] getCodigo_barras() {
        return Codigo_barras;
    }

    public void setCodigo_barras(byte[] Codigo_barras) {
        this.Codigo_barras = Codigo_barras;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(String id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }
        
}
