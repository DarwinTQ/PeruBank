package logical;
import java.util.Date;

public class Reporte {
    private String ID_reporte;
    private String Tipo;
    private Date Fecha_generacion;
    private String ID_empleado;
    
    public Reporte(){}

    public String getID_reporte() {
        return ID_reporte;
    }

    public void setID_reporte(String ID_reporte) {
        this.ID_reporte = ID_reporte;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Date getFecha_generacion() {
        return Fecha_generacion;
    }

    public void setFecha_generacion(Date Fecha_generacion) {
        this.Fecha_generacion = Fecha_generacion;
    }

    public String getID_empleado() {
        return ID_empleado;
    }

    public void setID_empleado(String ID_empleado) {
        this.ID_empleado = ID_empleado;
    }
    
    
    
}
