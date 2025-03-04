package datos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DB_connection {
    private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private final String URL = "jdbc:oracle:thin:@//localhost:1521/XE";
    private final String USER = "system";
    private final String PASSWORD = "darwin";
    private Connection cadena;

    public Connection conectar() {
        try {
            Class.forName(DRIVER);
            cadena = DriverManager.getConnection(URL, USER, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conectado");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            System.exit(0);
        }
        return cadena;
    }

    public void desconectar() {
        try {
            if (cadena != null && !cadena.isClosed()) {
                cadena.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}