package logical;
import java.util.Date;

public class HistorialLaboral {
    private String ID_historial;
    private Date Fecha_inicio;
    private String Cargo;
    private String ID_empleado;
    
    public HistorialLaboral(){}

    public String getID_historial() {
        return ID_historial;
    }

    public void setID_historial(String ID_historial) {
        this.ID_historial = ID_historial;
    }

    public Date getFecha_inicio() {
        return Fecha_inicio;
    }

    public void setFecha_inicio(Date Fecha_inicio) {
        this.Fecha_inicio = Fecha_inicio;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getID_empleado() {
        return ID_empleado;
    }

    public void setID_empleado(String ID_empleado) {
        this.ID_empleado = ID_empleado;
    }
    
    
}
