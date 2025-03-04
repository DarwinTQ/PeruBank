package logical;

public class Sucursal {
    private String ID_sucursal;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    
    public Sucursal(){}

    public String getID_sucursal() {
        return ID_sucursal;
    }

    public void setID_sucursal(String ID_sucursal) {
        this.ID_sucursal = ID_sucursal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
}
