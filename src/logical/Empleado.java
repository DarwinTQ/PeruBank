package logical;
import java.util.Date;

public class Empleado {
    private String ID_empleado;
    private Date Fecha_Registro;
    private String Nombre;
    private String Cargo;
    private Date Fecha_contratacio;
    private String ID_sucursal;
    
    public Empleado(){}

    public String getID_empleado() {
        return ID_empleado;
    }

    public void setID_empleado(String ID_empleado) {
        this.ID_empleado = ID_empleado;
    }

    public Date getFecha_Registro() {
        return Fecha_Registro;
    }

    public void setFecha_Registro(Date Fecha_Registro) {
        this.Fecha_Registro = Fecha_Registro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public Date getFecha_contratacio() {
        return Fecha_contratacio;
    }

    public void setFecha_contratacio(Date Fecha_contratacio) {
        this.Fecha_contratacio = Fecha_contratacio;
    }

    public String getID_sucursal() {
        return ID_sucursal;
    }

    public void setID_sucursal(String ID_sucursal) {
        this.ID_sucursal = ID_sucursal;
    }
    
    
}
