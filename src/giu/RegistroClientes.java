package giu;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.sql.CallableStatement;
import datos.DB_connection;
import java.sql.ResultSet;

public class RegistroClientes extends javax.swing.JInternalFrame {
    private DB_connection objconnect;
    
    public RegistroClientes() {
        objconnect = new DB_connection();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JTextField();
        DNI = new javax.swing.JTextField();
        AMATERNO = new javax.swing.JTextField();
        CORREO = new javax.swing.JTextField();
        APATERNO = new javax.swing.JTextField();
        GUARDAR = new javax.swing.JToggleButton();
        LIMPIAR = new javax.swing.JToggleButton();
        ELIMINAR = new javax.swing.JToggleButton();
        ACTUALIZAR = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        TELEFONO = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        DIRECCION = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel7.setText("Registros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("ID_CLIENTE");

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("DNI");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("APaterno");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("AMaterno");

        DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNIActionPerformed(evt);
            }
        });

        GUARDAR.setText("Guardar");
        GUARDAR.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
        GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARActionPerformed(evt);
            }
        });

        LIMPIAR.setText("Limpiar");
        LIMPIAR.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 255, 0)));
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });

        ELIMINAR.setText("Eliminar");
        ELIMINAR.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        ACTUALIZAR.setText("Actualizar");
        ACTUALIZAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZARActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Telefono");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Direccion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(GUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(ACTUALIZAR))
                                    .addComponent(CORREO, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addComponent(LIMPIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AMATERNO, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(APATERNO, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(APATERNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AMATERNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CORREO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GUARDAR)
                    .addComponent(ELIMINAR)
                    .addComponent(ACTUALIZAR)
                    .addComponent(LIMPIAR))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection conn = null;
    CallableStatement cs = null;

    try {
        // Conectar a la base de datos
        DB_connection db = new DB_connection();
        conn = db.conectar();

        // Llamar al procedimiento almacenado
        String sql = "{CALL BuscarCliente(?, ?, ?, ?, ?, ?, ?, ?)}";
        cs = conn.prepareCall(sql);

        // Pasar el ID_cliente desde el campo de búsqueda
        cs.setString(1, ID.getText());

        // Definir los parámetros de salida
        cs.registerOutParameter(2, java.sql.Types.VARCHAR); // DNI
        cs.registerOutParameter(3, java.sql.Types.VARCHAR); // Nombres
        cs.registerOutParameter(4, java.sql.Types.VARCHAR); // APaterno
        cs.registerOutParameter(5, java.sql.Types.VARCHAR); // AMaterno
        cs.registerOutParameter(6, java.sql.Types.VARCHAR); // Direccion
        cs.registerOutParameter(7, java.sql.Types.VARCHAR); // Telefono
        cs.registerOutParameter(8, java.sql.Types.VARCHAR); // Email

        // Ejecutar el procedimiento
        cs.execute();

        // Obtener los resultados
        String dni = cs.getString(2);
        String nombres = cs.getString(3);
        String apPaterno = cs.getString(4);
        String apMaterno = cs.getString(5);
        String direccion = cs.getString(6);
        String telefono = cs.getString(7);
        String email = cs.getString(8);

        // Mostrar los datos si existen
        if (dni != null) {
            DNI.setText(dni);
            NOMBRE.setText(nombres);
            APATERNO.setText(apPaterno);
            AMATERNO.setText(apMaterno);
            DIRECCION.setText(direccion);
            TELEFONO.setText(telefono);
            CORREO.setText(email);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el cliente.", "Información", JOptionPane.INFORMATION_MESSAGE);
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

    private void GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDARActionPerformed
    Connection conn = null;
    CallableStatement cs = null;

    try {
        // Mostrar mensaje de confirmación
        int confirmacion = JOptionPane.showConfirmDialog(this, 
            "¿Estás seguro de realizar la acción de guardar?", 
            "Confirmar Guardado", 
            JOptionPane.YES_NO_OPTION);

        // Si el usuario confirma, se procede con el guardado
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Crear la conexión a la base de datos
            DB_connection db = new DB_connection();
            conn = db.conectar();

            // Llamar al procedimiento almacenado
            String sql = "{CALL InsertarCliente(?, ?, ?, ?, ?, ?, ?, ?)}";
            cs = conn.prepareCall(sql);

            // Asignar valores desde los campos de texto
            cs.setString(1, ID.getText());
            cs.setString(2, DNI.getText());
            cs.setString(3, NOMBRE.getText());
            cs.setString(4, APATERNO.getText());
            cs.setString(5, AMATERNO.getText());
            cs.setString(6, DIRECCION.getText());
            cs.setString(7, TELEFONO.getText());
            cs.setString(8, CORREO.getText());

            // Ejecutar el procedimiento almacenado
            int filasAfectadas = cs.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Cliente registrado con éxito.");
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar cliente.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    } catch (HeadlessException | SQLException e) {
        System.err.println(e);
    } finally {
        try {
            if (cs != null) cs.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }}
    
    }//GEN-LAST:event_GUARDARActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
    ID.setText("");
    DNI.setText("");
    NOMBRE.setText("");
    APATERNO.setText("");
    AMATERNO.setText("");
    DIRECCION.setText("");
    TELEFONO.setText("");
    CORREO.setText("");
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
    Connection conn = null;
    CallableStatement cs = null;

    try {
        // Conectar a la base de datos
        DB_connection db = new DB_connection();
        conn = db.conectar();

        // Confirmación antes de eliminar
        int confirmacion = JOptionPane.showConfirmDialog(this, 
            "¿Estás seguro de eliminar este cliente?", 
            "Confirmar eliminación", 
            JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            // Llamar al procedimiento almacenado
            String sql = "{CALL EliminarCliente(?)}";
            cs = conn.prepareCall(sql);
            
            // Pasar el ID_cliente desde el campo de texto
            cs.setString(1, ID.getText());

            // Ejecutar el procedimiento
            cs.execute();

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente.");

            // Limpiar los campos de texto
            ID.setText("");
            DNI.setText("");
            NOMBRE.setText("");
            APATERNO.setText("");
            AMATERNO.setText("");
            DIRECCION.setText("");
            TELEFONO.setText("");
            CORREO.setText("");
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
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed
Connection conn = null;
    CallableStatement cs = null;

    try {
        // Conectar a la base de datos
        DB_connection db = new DB_connection();
        conn = db.conectar();

        // Validar que ningún campo esté vacío
        if (ID.getText().trim().isEmpty() ||
            DNI.getText().trim().isEmpty() ||
            NOMBRE.getText().trim().isEmpty() ||
            APATERNO.getText().trim().isEmpty() ||
            AMATERNO.getText().trim().isEmpty() ||
            DIRECCION.getText().trim().isEmpty() ||
            TELEFONO.getText().trim().isEmpty() ||
            CORREO.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            return;
        }

        // Mostrar cuadro de confirmación
        int confirmacion = JOptionPane.showConfirmDialog(
            null,
            "¿Estás seguro de que deseas actualizar la información del cliente?",
            "Confirmar actualización",
            JOptionPane.YES_NO_OPTION
        );

        if (confirmacion != JOptionPane.YES_OPTION) {
            return; // Si el usuario elige "No", se cancela la actualización
        }

        // Llamar al procedimiento almacenado
        String sql = "{CALL ActualizarCliente(?, ?, ?, ?, ?, ?, ?, ?)}";
        cs = conn.prepareCall(sql);

        // Asignar valores
        cs.setString(1, ID.getText().trim());       // ID_cliente (clave primaria)
        cs.setString(2, DNI.getText().trim());      // DNI
        cs.setString(3, NOMBRE.getText().trim());   // Nombres
        cs.setString(4, APATERNO.getText().trim()); // Apellido Paterno
        cs.setString(5, AMATERNO.getText().trim()); // Apellido Materno
        cs.setString(6, DIRECCION.getText().trim()); // Dirección
        cs.setString(7, TELEFONO.getText().trim()); // Teléfono
        cs.setString(8, CORREO.getText().trim());   // Email

        // Ejecutar procedimiento
        cs.execute();

        // Mensaje de éxito
        JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente.");

    } catch (SQLException e) {
        System.err.println(e);
        JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (cs != null) cs.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    }//GEN-LAST:event_ACTUALIZARActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DNIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JTextField AMATERNO;
    private javax.swing.JTextField APATERNO;
    private javax.swing.JTextField CORREO;
    private javax.swing.JTextField DIRECCION;
    private javax.swing.JTextField DNI;
    private javax.swing.JToggleButton ELIMINAR;
    private javax.swing.JToggleButton GUARDAR;
    private javax.swing.JTextField ID;
    private javax.swing.JToggleButton LIMPIAR;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JTextField TELEFONO;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
