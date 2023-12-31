/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import datos.ClienteDAO;
import dominio.Cliente;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class NuevoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form NuevoUsuario
     */
    public NuevoUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        APELLIDO = new javax.swing.JTextField();
        NOMBRE = new javax.swing.JTextField();
        TELEFONO = new javax.swing.JTextField();
        CONTRASENA = new javax.swing.JTextField();
        CORREO = new javax.swing.JTextField();
        REPCONTRASENA = new javax.swing.JTextField();
        BTN_REGISTRAR = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setText("NUEVO USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 32, -1, -1));

        jLabel2.setText("NOMBRES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 95, -1, -1));

        jLabel3.setText("APELLIDOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 95, -1, -1));

        jLabel4.setText("TELEFONO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 195, -1, -1));

        jLabel5.setText("FECHA DE NACIMIENTO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 195, -1, -1));

        jLabel6.setText("CORREO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 305, -1, -1));

        jLabel7.setText("CONTRASENA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel8.setText("REPETIR CONTRASENA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));
        jPanel1.add(APELLIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 138, 109, -1));
        jPanel1.add(NOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 138, 109, -1));
        jPanel1.add(TELEFONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 229, 109, -1));
        jPanel1.add(CONTRASENA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 153, -1));
        jPanel1.add(CORREO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 247, -1));
        jPanel1.add(REPCONTRASENA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 193, -1));

        BTN_REGISTRAR.setText("REGISTRAR");
        BTN_REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_REGISTRARActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_REGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 141, 36));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/EmpresaBrand.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));
        jPanel1.add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_REGISTRARActionPerformed
        // TODO add your handling code here:
        
        java.util.Date mFecha = calendario.getDate();
        if (mFecha == null) {
            JOptionPane.showMessageDialog(null, "INGRESA DATOS");
            return;
        }
        
        long fecha = mFecha.getTime();

        Date fecha_sql = new Date(fecha);

        String fecha_Final = fecha_sql.toString();
//        JOptionPane.showMessageDialog(null, ));

        String[] partes = fecha_Final.split("-");

        int anio = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int dia = Integer.parseInt(partes[2]);
        
        
        
        ClienteDAO conexionCliente = new ClienteDAO();
        
        Cliente nuevo = new Cliente(CORREO.getText(),CONTRASENA.getText(),NOMBRE.getText(),APELLIDO.getText(),TELEFONO.getText(), Date.valueOf(fecha_Final));
        
        conexionCliente.insertar(nuevo);
        JOptionPane.showMessageDialog(null, "CLIENTE AGREGADO CORRECTAMENTE, CERRANDO PROGRAMA PARA CARGAR DATOS");
        System.exit(0);
    }//GEN-LAST:event_BTN_REGISTRARActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField APELLIDO;
    private javax.swing.JButton BTN_REGISTRAR;
    private javax.swing.JTextField CONTRASENA;
    private javax.swing.JTextField CORREO;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JTextField REPCONTRASENA;
    private javax.swing.JTextField TELEFONO;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
