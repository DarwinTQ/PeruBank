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
import javax.swing.JFrame;


public class Interfaz extends javax.swing.JFrame {


    public Interfaz() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        centrarLabel(); // Centrar al inicio
        // Agregar un listener para mantenerlo centrado si cambia el tamaño de la ventana
        desktopPane.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                centrarLabel();
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        bienvenida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        USUARIO = new javax.swing.JTextField();
        CONTRASENA = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        Hola = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        cliente = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        GestionCuentas = new javax.swing.JMenuItem();
        transaccion = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        conf = new javax.swing.JMenu();
        cutMenuItem4 = new javax.swing.JMenuItem();
        copyMenuItem4 = new javax.swing.JMenuItem();
        pasteMenuItem4 = new javax.swing.JMenuItem();
        editMenu6 = new javax.swing.JMenu();
        cutMenuItem6 = new javax.swing.JMenuItem();
        copyMenuItem6 = new javax.swing.JMenuItem();
        pasteMenuItem6 = new javax.swing.JMenuItem();
        deleteMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bienvenida.setFont(new java.awt.Font("Harlow Solid Italic", 0, 80)); // NOI18N
        bienvenida.setText("Bienvenidos a Peru Bank");
        bienvenida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bienvenidaFocusGained(evt);
            }
        });
        desktopPane.add(bienvenida);
        bienvenida.setBounds(140, 320, 860, 80);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel1.setText("Contraseña");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(220, 640, 180, 39);

        jButton1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton1);
        jButton1.setBounds(430, 690, 140, 30);

        jLabel2.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel2.setText("Usuario");
        desktopPane.add(jLabel2);
        jLabel2.setBounds(40, 640, 160, 39);

        USUARIO.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        desktopPane.add(USUARIO);
        USUARIO.setBounds(30, 690, 140, 30);

        CONTRASENA.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        desktopPane.add(CONTRASENA);
        CONTRASENA.setBounds(230, 690, 130, 30);

        jButton2.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jButton2.setText("Registrarse>>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton2);
        jButton2.setBounds(1310, 700, 200, 40);

        Hola.setFont(new java.awt.Font("Harlow Solid Italic", 0, 80)); // NOI18N
        desktopPane.add(Hola);
        Hola.setBounds(20, 20, 1460, 120);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Inicio");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Panel Principal");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        jMenuItem6.setText("Admin");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem6);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Cerrar Sesion");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        cliente.setMnemonic('h');
        cliente.setText("Cliente");
        cliente.setEnabled(false);
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Registro clientes");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        cliente.add(contentMenuItem);

        jMenuItem2.setText("Listar clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        cliente.add(jMenuItem2);

        GestionCuentas.setText("Gestion de cuentas");
        GestionCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionCuentasActionPerformed(evt);
            }
        });
        cliente.add(GestionCuentas);

        menuBar.add(cliente);

        transaccion.setMnemonic('e');
        transaccion.setText("Transacciones");
        transaccion.setEnabled(false);

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Retiro");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        transaccion.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Deposito");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        transaccion.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Tranferencia Interbancaria");
        pasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItemActionPerformed(evt);
            }
        });
        transaccion.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Transferencia entre cuentas");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        transaccion.add(deleteMenuItem);

        jMenuItem5.setText("Reporte de movimientos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        transaccion.add(jMenuItem5);

        menuBar.add(transaccion);

        conf.setMnemonic('e');
        conf.setText("Configuracion");
        conf.setEnabled(false);

        cutMenuItem4.setMnemonic('t');
        cutMenuItem4.setText("Gestion de sucursal");
        conf.add(cutMenuItem4);

        copyMenuItem4.setMnemonic('y');
        copyMenuItem4.setText("Gestion de empleados");
        copyMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem4ActionPerformed(evt);
            }
        });
        conf.add(copyMenuItem4);

        pasteMenuItem4.setMnemonic('p');
        pasteMenuItem4.setText("Tipos de cuentas");
        conf.add(pasteMenuItem4);

        menuBar.add(conf);

        editMenu6.setMnemonic('e');
        editMenu6.setText("Ayuda");

        cutMenuItem6.setMnemonic('t');
        cutMenuItem6.setText("Manual de usuario");
        editMenu6.add(cutMenuItem6);

        copyMenuItem6.setMnemonic('y');
        copyMenuItem6.setText("Acerca de Peru Bank");
        copyMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem6ActionPerformed(evt);
            }
        });
        editMenu6.add(copyMenuItem6);

        pasteMenuItem6.setMnemonic('p');
        pasteMenuItem6.setText("Soporte tecnico");
        editMenu6.add(pasteMenuItem6);

        deleteMenuItem6.setMnemonic('d');
        deleteMenuItem6.setText("Contactos");
        deleteMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItem6ActionPerformed(evt);
            }
        });
        editMenu6.add(deleteMenuItem6);

        menuBar.add(editMenu6);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void bienvenidaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bienvenidaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_bienvenidaFocusGained

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
    Deposito D = new Deposito(); 
    D.setTitle("Deposito");
    desktopPane.add(D);  
    D.setVisible(true);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
    TransfereciaCuentas TC = new TransfereciaCuentas(); 
    TC.setTitle("Transferecia Cuentas");
    desktopPane.add(TC);  
    TC.setVisible(true);    
    }//GEN-LAST:event_deleteMenuItemActionPerformed

    private void copyMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyMenuItem6ActionPerformed

    private void deleteMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMenuItem6ActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
     // Cerrar todas las subventanas (JInternalFrame)
    for (javax.swing.JInternalFrame frame : desktopPane.getAllFrames()) {
        frame.dispose(); // Cierra cada subventana
    }
    
    // Traer la ventana principal al frente
    this.toFront();
    this.requestFocus();
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    Admin a = new Admin(); 
    a.setTitle("Inicia Sesión");
    desktopPane.add(a);  
    a.setVisible(true);
    
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
    Retiro R = new Retiro(); 
    R.setTitle("Retiro");
    desktopPane.add(R);  
    R.setVisible(true);
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyMenuItem4ActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Connection conn = null;
    CallableStatement cs = null;
    CallableStatement csNombre = null;

    try {
        // Conectar a la base de datos
        DB_connection db = new DB_connection();
        conn = db.conectar();

        // Validar que los campos no estén vacíos
        if (USUARIO.getText().trim().isEmpty() || CONTRASENA.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }

        // Llamar al procedimiento almacenado para iniciar sesión
        String sql = "{CALL IniciarSesion(?, ?, ?)}";
        cs = conn.prepareCall(sql);
        cs.setString(1, USUARIO.getText().trim());       
        cs.setString(2, CONTRASENA.getText().trim());  
        cs.registerOutParameter(3, java.sql.Types.NUMERIC);
        cs.execute();
        int resultado = cs.getInt(3);

        if (resultado == 1) { // Si los datos son correctos
            cliente.setEnabled(true);  
            transaccion.setEnabled(true);  

            // Llamar al procedimiento almacenado para obtener el nombre del cliente
            String sqlNombre = "{CALL ObtenerNombreCliente(?, ?)}";
            csNombre = conn.prepareCall(sqlNombre);
            csNombre.setString(1, USUARIO.getText().trim()); // Pasar ID cliente
            csNombre.registerOutParameter(2, java.sql.Types.VARCHAR);
            csNombre.execute();
            String nombreCliente = csNombre.getString(2);

            // Mostrar el nombre completo del cliente
            Hola.setText("Hola " + nombreCliente);
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso.");
            USUARIO.setText("");
            CONTRASENA.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Datos incorrectos. Por favor, intente de nuevo.");
        }

    } catch (SQLException e) {
        System.err.println(e);
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (cs != null) cs.close();
            if (csNombre != null) csNombre.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Obtener el contenedor principal (JDesktopPane)
        //JDesktopPane desktopPane = getDesktopPane();

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

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
      cliente.setEnabled(false);  // Habilitar cliente
      transaccion.setEnabled(false);  // Habilitar transacción
      Hola.setText("");
      JOptionPane.showMessageDialog(this, "Cierre de sesión exitoso.");
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
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
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    ListaClientes lc = new ListaClientes(); 
    lc.setTitle("Lista de clientes");
    desktopPane.add(lc);  
    lc.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void GestionCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionCuentasActionPerformed
    GestionCuentas g = new GestionCuentas(); 
    g.setTitle("Gestion de cuantas");
    desktopPane.add(g);  
    g.setVisible(true);
    }//GEN-LAST:event_GestionCuentasActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    Reportes R = new Reportes(); 
    R.setTitle("Reportes");
    desktopPane.add(R);  
    R.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void pasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItemActionPerformed
    TransfereciaInt TR = new TransfereciaInt(); 
    TR.setTitle("Transferecia Interbancaria");
    desktopPane.add(TR);  
    TR.setVisible(true);
    }//GEN-LAST:event_pasteMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
private void centrarLabel() {
        int x = (desktopPane.getWidth() - bienvenida.getWidth()) / 2;
        int y = (desktopPane.getHeight() - bienvenida.getHeight()) / 2;
        bienvenida.setLocation(x, y);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CONTRASENA;
    private javax.swing.JMenuItem GestionCuentas;
    private javax.swing.JLabel Hola;
    private javax.swing.JTextField USUARIO;
    private javax.swing.JLabel bienvenida;
    private javax.swing.JMenu cliente;
    private javax.swing.JMenu conf;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem copyMenuItem4;
    private javax.swing.JMenuItem copyMenuItem6;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem cutMenuItem4;
    private javax.swing.JMenuItem cutMenuItem6;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenuItem deleteMenuItem6;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu6;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem pasteMenuItem4;
    private javax.swing.JMenuItem pasteMenuItem6;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenu transaccion;
    // End of variables declaration//GEN-END:variables

}
