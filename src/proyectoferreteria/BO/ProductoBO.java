
package proyectoferreteria.BO;

import java.util.Date;

public class ProductoBO {
    private String Codigo;
    private String Id_Codigo_barra;
    private String Nombre;
    private String Descripcion;
    private String Marca;
    private int Stock;
    private String Unidad;
    private double Precio_compra;
    private double Precio_Venta;
    private double Utilidad;
    private int Descuento;
    private Date Fech_ini_Desc;
    private Date Fech_fin_Desc;
    private byte [] Imagen;
    private double IVA;
    private byte[] Codigo_barras;
    private String id_categoria;
    private String id_proveedor;
    private boolean estatus;

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

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }

    public double getPrecio_compra() {
        return Precio_compra;
    }

    public void setPrecio_compra(double Precio_compra) {
        this.Precio_compra = Precio_compra;
    }

    public double getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(double Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    public double getUtilidad() {
        return Utilidad;
    }

    public void setUtilidad(double Utilidad) {
        this.Utilidad = Utilidad;
    }

    public int getDescuento() {
        return Descuento;
    }

    public void setDescuento(int Descuento) {
        this.Descuento = Descuento;
    }

    public Date getFech_ini_Desc() {
        return Fech_ini_Desc;
    }

    public void setFech_ini_Desc(Date Fech_ini_Desc) {
        this.Fech_ini_Desc = Fech_ini_Desc;
    }

    public Date getFech_fin_Desc() {
        return Fech_fin_Desc;
    }

    public void setFech_fin_Desc(Date Fech_fin_Desc) {
        this.Fech_fin_Desc = Fech_fin_Desc;
    }

    public byte[] getImagen() {
        return Imagen;
    }

    public void setImagen(byte[] Imagen) {
        this.Imagen = Imagen;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
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