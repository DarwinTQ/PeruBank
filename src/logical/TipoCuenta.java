package logical;

public class TipoCuenta {
    private String ID_tipo_cuenta;
    private String Nombre;
    private String ID_cuenta;
    
    public TipoCuenta(){}

    public String getID_tipo_cuenta() {
        return ID_tipo_cuenta;
    }

    public void setID_tipo_cuenta(String ID_tipo_cuenta) {
        this.ID_tipo_cuenta = ID_tipo_cuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getID_cuenta() {
        return ID_cuenta;
    }

    public void setID_cuenta(String ID_cuenta) {
        this.ID_cuenta = ID_cuenta;
    }
    
    
}
