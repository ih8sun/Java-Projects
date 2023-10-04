/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import java.awt.BorderLayout;
import java.awt.Color;

public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();                                    
        this.btnMedicos.setBackground(Color.BLUE);
        this.setLocationRelativeTo(null);
        
        PanelMedicos pl = new PanelMedicos();
        pl.setSize(650,540);
        pl.setLocation(0,0);
        
        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMedicos = new javax.swing.JLabel();
        btnCitas = new javax.swing.JLabel();
        btnPacientes = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_especialidades = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 153, 153));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/alexsantiago/NetBeansProjects/Clinica/src/main/java/img/foto.png")); // NOI18N

        btnMedicos.setBackground(new java.awt.Color(255, 255, 255));
        btnMedicos.setIcon(new javax.swing.ImageIcon("/Users/alexsantiago/NetBeansProjects/Clinica/src/main/java/img/Doctor Female Skin Type 1.png")); // NOI18N
        btnMedicos.setText("Medicos");
        btnMedicos.setOpaque(true);
        btnMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMedicosMouseClicked(evt);
            }
        });

        btnCitas.setBackground(new java.awt.Color(255, 255, 255));
        btnCitas.setIcon(new javax.swing.ImageIcon("/Users/alexsantiago/NetBeansProjects/Clinica/src/main/java/img/Date From.png")); // NOI18N
        btnCitas.setText("Citas");
        btnCitas.setOpaque(true);
        btnCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCitasMouseClicked(evt);
            }
        });

        btnPacientes.setBackground(new java.awt.Color(255, 255, 255));
        btnPacientes.setIcon(new javax.swing.ImageIcon("/Users/alexsantiago/NetBeansProjects/Clinica/src/main/java/img/Illness.png")); // NOI18N
        btnPacientes.setText("Pacientes");
        btnPacientes.setOpaque(true);
        btnPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPacientesMouseClicked(evt);
            }
        });

        btnHistorial.setBackground(new java.awt.Color(255, 255, 255));
        btnHistorial.setIcon(new javax.swing.ImageIcon("/Users/alexsantiago/NetBeansProjects/Clinica/src/main/java/img/Activity History.png")); // NOI18N
        btnHistorial.setText("Historial Clinico");
        btnHistorial.setOpaque(true);
        btnHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHistorialMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Otros");
        jLabel2.setOpaque(true);

        btn_especialidades.setBackground(new java.awt.Color(255, 255, 255));
        btn_especialidades.setIcon(new javax.swing.ImageIcon("/Users/alexsantiago/NetBeansProjects/ClinicaPrivada/src/main/java/img/Star.png")); // NOI18N
        btn_especialidades.setText("Especialidades");
        btn_especialidades.setOpaque(true);
        btn_especialidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_especialidadesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35))
            .addComponent(btnMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_especialidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(btnMedicos)
                .addGap(17, 17, 17)
                .addComponent(btnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_especialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 660, 540));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 870, 30));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        bg.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 700, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMedicosMouseClicked
        this.btnMedicos.setBackground(Color.BLUE); //este ha sido seleccionado
        this.btnPacientes.setBackground(Color.WHITE);
        this.btnCitas.setBackground(Color.WHITE);
        this.btnHistorial.setBackground(Color.WHITE);
        this.btn_especialidades.setBackground(Color.WHITE);
        
        PanelMedicos pl = new PanelMedicos();//metodos que se nos indican para poder poner alguna interfaz o panel a la izquierda
        pl.setSize(650,540);
        pl.setLocation(0,0);
        
        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnMedicosMouseClicked

    private void btnPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPacientesMouseClicked
        // TODO add your handling code here:
        this.btnPacientes.setBackground(Color.BLUE);                                        
        this.btnMedicos.setBackground(Color.WHITE);
        this.btnCitas.setBackground(Color.WHITE);
        this.btnHistorial.setBackground(Color.WHITE);
        this.btn_especialidades.setBackground(Color.WHITE);
        
        
        PanelPacientes pl = new PanelPacientes();
        pl.setSize(650,540);
        pl.setLocation(0,0);
        
        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnPacientesMouseClicked

    private void btnCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasMouseClicked
        // TODO add your handling code here:
        this.btnCitas.setBackground(Color.BLUE);
        this.btnPacientes.setBackground(Color.WHITE);                                        
        this.btnMedicos.setBackground(Color.WHITE);
        this.btnHistorial.setBackground(Color.WHITE);
        this.btn_especialidades.setBackground(Color.WHITE);
        
        
        PanelCitas pl = new PanelCitas();
        pl.setSize(650,540);
        pl.setLocation(0,0);
        
        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnCitasMouseClicked

    private void btnHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistorialMouseClicked
        
        this.btnHistorial.setBackground(Color.BLUE);
        this.btnCitas.setBackground(Color.WHITE);
        this.btnPacientes.setBackground(Color.WHITE);                                        
        this.btnMedicos.setBackground(Color.WHITE);
        this.btn_especialidades.setBackground(Color.WHITE);
        
        
        PanelHistorial pl = new PanelHistorial();
        pl.setSize(650,540);
        pl.setLocation(0,0);
        
        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnHistorialMouseClicked

    private void btn_especialidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_especialidadesMouseClicked
        
        this.btn_especialidades.setBackground(Color.YELLOW);
        this.btnHistorial.setBackground(Color.WHITE);
        this.btnCitas.setBackground(Color.WHITE);
        this.btnPacientes.setBackground(Color.WHITE);                                        
        this.btnMedicos.setBackground(Color.WHITE);
        
        PanelEspecialidad pl = new PanelEspecialidad();
        pl.setSize(650,540);
        pl.setLocation(0,0);
        
        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btn_especialidadesMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btnCitas;
    private javax.swing.JLabel btnHistorial;
    private javax.swing.JLabel btnMedicos;
    private javax.swing.JLabel btnPacientes;
    private javax.swing.JLabel btn_especialidades;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
