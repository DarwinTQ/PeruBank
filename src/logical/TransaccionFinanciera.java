package logical;
import java.util.Date;

public class TransaccionFinanciera {
    private String ID_transaccion;
    private String Tipo;
    private Double Monto;
    private Date Fecha;
    private String ID_cuenta;
    private String ID_empleado;
    
    public TransaccionFinanciera(){}

    public String getID_transaccion() {
        return ID_transaccion;
    }

    public void setID_transaccion(String ID_transaccion) {
        this.ID_transaccion = ID_transaccion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Double getMonto() {
        return Monto;
    }

    public void setMonto(Double Monto) {
        this.Monto = Monto;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getID_cuenta() {
        return ID_cuenta;
    }

    public void setID_cuenta(String ID_cuenta) {
        this.ID_cuenta = ID_cuenta;
    }

    public String getID_empleado() {
        return ID_empleado;
    }

    public void setID_empleado(String ID_empleado) {
        this.ID_empleado = ID_empleado;
    }
    
    
}
