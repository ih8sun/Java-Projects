/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Datos.LibroDAO;
import Datos.AlumnoDAO;
import Objetos.Libro;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexsantiago
 */
public class PanelLibro extends javax.swing.JPanel {

    /**
     * Creates new form PanelLibro
     */
    DefaultTableModel modeloLibro;
    LibroDAO conexionLibro;
    public PanelLibro() {
        initComponents();
        conexionLibro = new LibroDAO();
        
        modeloLibro = (DefaultTableModel) tablaLibro.getModel();
        Object datosLibro[] = new Object[5];
        
        modeloLibro.setRowCount(0);

        for (Libro libro : conexionLibro.mostrar()) {
            datosLibro[0] = libro.getTitulo();
            datosLibro[1] = libro.getAutor();
            datosLibro[2] = libro.getAnio();
            datosLibro[3] = libro.getGenero();
            datosLibro[4] = libro.getStock();
            modeloLibro.addRow(datosLibro);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_limpiar1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tTitulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tAnio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tgenero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tstock = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        btnRegistrarLibro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tAutor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaLibro = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btn_limpiar1.setBackground(new java.awt.Color(255, 255, 255));
        btn_limpiar1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_limpiar1.setToolTipText("");
        btn_limpiar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Titulo");
        btn_limpiar1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, -1));
        btn_limpiar1.add(tTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 160, -1));

        jLabel6.setText("Año");
        btn_limpiar1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, -1));
        btn_limpiar1.add(tAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 160, -1));

        jLabel7.setText("genero");
        btn_limpiar1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, -1));
        btn_limpiar1.add(tgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 160, -1));

        jLabel8.setText("Stock");
        btn_limpiar1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 60, -1));
        btn_limpiar1.add(tstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 160, -1));

        jButton5.setBackground(new java.awt.Color(255, 204, 204));
        jButton5.setText("Limpiar");
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        btn_limpiar1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 80, -1));

        btnRegistrarLibro.setBackground(new java.awt.Color(255, 204, 204));
        btnRegistrarLibro.setText("Registrar");
        btnRegistrarLibro.setBorderPainted(false);
        btnRegistrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarLibroActionPerformed(evt);
            }
        });
        btn_limpiar1.add(btnRegistrarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel1.setText("Autor");
        btn_limpiar1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        btn_limpiar1.add(tAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 160, -1));

        tablaLibro.setBackground(new java.awt.Color(255, 102, 102));
        tablaLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Autor", "Anio", "Genero", "Stock"
            }
        ));
        tablaLibro.setSelectionForeground(new java.awt.Color(255, 204, 204));
        jScrollPane2.setViewportView(tablaLibro);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/alexsantiago/NetBeansProjects/ProyectoBiblioteca/src/main/java/img/LibroIcono.png")); // NOI18N

        jLabel9.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("REGISTRO DE LIBRO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel9))
                            .addComponent(btn_limpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLibroActionPerformed
        // TODO add your handling code here:
        String titulo, autor, anio,genero;
        int stock;

        titulo = this.tTitulo.getText();
        autor = this.tAutor.getText();
        anio = this.tAnio.getText();
        java.sql.Date sqlDate = java.sql.Date.valueOf(anio);

        genero = this.tgenero.getText();
        stock = Integer.parseInt(this.tstock.getText());

        if (titulo.isBlank() || autor.isBlank() || anio.isBlank()) {
            JOptionPane.showMessageDialog(null, "EXISTEN CAMPOS VACIOS" );
            return;
        }

        conexionLibro.insertar(new Libro(titulo,autor,sqlDate,genero,stock));

        JOptionPane.showMessageDialog(null, "Libro Guardado Correctamente");

        Object datos[] = new Object[5];

        modeloLibro.setRowCount(0);

        for (Libro libro : conexionLibro.mostrar()) {
            datos[0] = libro.getTitulo();
            datos[1] = libro.getAutor();
            datos[2] = libro.getAnio();
            datos[3] = libro.getGenero();
            datos[4] = libro.getStock();
            modeloLibro.addRow(datos);
            
        }
    }//GEN-LAST:event_btnRegistrarLibroActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.tAnio.setText("");
        this.tAutor.setText("");
        this.tTitulo.setText("");
        this.tgenero.setText("");
        this.tstock.setText("");
        this.tTitulo.requestFocus();
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarLibro;
    private javax.swing.JPanel btn_limpiar1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tAnio;
    private javax.swing.JTextField tAutor;
    private javax.swing.JTextField tTitulo;
    private javax.swing.JTable tablaLibro;
    private javax.swing.JTextField tgenero;
    private javax.swing.JTextField tstock;
    // End of variables declaration//GEN-END:variables
}