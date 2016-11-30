package proyectoferreteria.BO;

/**
 *
 * @author elektra
 */
public class VentaEncabezadoBO 
{
    int idcodigo;
    String descuento;
    String Fecha;
    int total;
    String id_clieto;
    String id_empleado;

    public int getIdcodigo() {
        return idcodigo;
    }

    public void setIdcodigo(int idcodigo) {
        this.idcodigo = idcodigo;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getId_clieto() {
        return id_clieto;
    }

    public void setId_clieto(String id_clieto) {
        this.id_clieto = id_clieto;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
}
