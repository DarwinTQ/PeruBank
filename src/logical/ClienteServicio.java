package logical;
import java.util.Date;

public class ClienteServicio {
    private Date Fecha_solicitud;
    private String ID_servico;
    private String ID_cliente;
    
    public ClienteServicio(){}

    public Date getFecha_solicitud() {
        return Fecha_solicitud;
    }

    public void setFecha_solicitud(Date Fecha_solicitud) {
        this.Fecha_solicitud = Fecha_solicitud;
    }

    public String getID_servico() {
        return ID_servico;
    }

    public void setID_servico(String ID_servico) {
        this.ID_servico = ID_servico;
    }

    public String getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(String ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    
}
