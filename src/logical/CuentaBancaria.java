package logical;
import java.util.Date;

public class CuentaBancaria {
    private String ID_cuenta;
    private String Numero_cuenta;
    private Double Saldo;
    private Date Fecha_Apertura;
    private String ID_cliente;
    private String ID_sucursal;
    
    public CuentaBancaria(){}

    public String getID_cuenta() {
        return ID_cuenta;
    }

    public void setID_cuenta(String ID_cuenta) {
        this.ID_cuenta = ID_cuenta;
    }

    public String getNumero_cuenta() {
        return Numero_cuenta;
    }

    public void setNumero_cuenta(String Numero_cuenta) {
        this.Numero_cuenta = Numero_cuenta;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;
    }

    public Date getFecha_Apertura() {
        return Fecha_Apertura;
    }

    public void setFecha_Apertura(Date Fecha_Apertura) {
        this.Fecha_Apertura = Fecha_Apertura;
    }

    public String getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(String ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public String getID_sucursal() {
        return ID_sucursal;
    }

    public void setID_sucursal(String ID_sucursal) {
        this.ID_sucursal = ID_sucursal;
    }
    
    
}
