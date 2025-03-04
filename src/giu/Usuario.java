package giu;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.sql.CallableStatement;
import datos.DB_connection;
import java.sql.ResultSet;


public class Usuario extends javax.swing.JInternalFrame {
    private DB_connection objconnect;
    
    
    public Usuario() {
        objconnect = new DB_connection();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        USUARIO = new javax.swing.JTextField();
        CONTRASENA = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Contraseña");

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Usuario");

        jButton2.setText("Registrarse>>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(USUARIO)
                            .addComponent(CONTRASENA, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButton1)))
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CONTRASENA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // Obtener el contenedor principal (JDesktopPane)
    JDesktopPane desktopPane = getDesktopPane();
    
    if (desktopPane != null) {
        // Crear una nueva instancia del JInternalFrame RegistroClientes
        RegistroClientes r = new RegistroClientes(); 
        r.setTitle("Registro de Clientes");
        r.setClosable(true);
        r.setIconifiable(true);
        r.setMaximizable(true);
        r.setResizable(true);
        
        // Agregar el nuevo JInternalFrame al JDesktopPane
        desktopPane.add(r);
        r.setVisible(true);
    } else {
        System.out.println("Error: No se encontró el JDesktopPane.");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Connection conn = null;
    CallableStatement cs = null;

    try {
        // Conectar a la base de datos
        DB_connection db = new DB_connection();
        conn = db.conectar();

        // Validar que los campos no estén vacíos
        if (USUARIO.getText().trim().isEmpty() || CONTRASENA.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }

        // Llamar al procedimiento almacenado
        String sql = "{CALL IniciarSesion(?, ?, ?)}";
        cs = conn.prepareCall(sql);

        // Pasar los parámetros de entrada
        cs.setString(1, USUARIO.getText().trim());       // ID_cliente
        cs.setString(2, CONTRASENA.getText().trim());   // DNI

        // Registrar el parámetro de salida
        cs.registerOutParameter(3, java.sql.Types.NUMERIC);

        // Ejecutar el procedimiento almacenado
        cs.execute();

        // Obtener el resultado del procedimiento
        int resultado = cs.getInt(3);

        if (resultado == 1) { // Si los datos son correctos
           // cliente.setEnabled(true);  // Habilitar cliente
           // transaccion.setEnabled(true);  // Habilitar transacción
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso.");
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Datos incorrectos. Por favor, intente de nuevo.");
        }

    } catch (SQLException e) {
        System.err.println(e);
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (cs != null) cs.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CONTRASENA;
    private javax.swing.JTextField USUARIO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
