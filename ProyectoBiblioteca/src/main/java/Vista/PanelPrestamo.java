/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Datos.LibroDAO;
import Datos.AlumnoDAO;
import Datos.PrestamosDAO;
import Objetos.Libro;
import Objetos.Alumno;
import Objetos.Prestamos;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexsantiago
 */
public class PanelPrestamo extends javax.swing.JPanel {

    /**
     * Creates new form Prestamo
     */
    LibroDAO conexionLibro;
    AlumnoDAO conexionPersona;
    DefaultTableModel modeloPrestamo;
    PrestamosDAO conexionPrestamos;
    
    
    private Libro obtenerLibro(int id)
    {
        for(int i = 0; i < conexionLibro.mostrar().size(); i++){
            
            if(id == conexionLibro.mostrar().get(i).getId())
            {
                return conexionLibro.mostrar().get(i);
            }
        }
        return new Libro();
    }
    
    private Alumno obtenerPersona(int id)
    {
        for(int i = 0; i < conexionPersona.mostrar().size(); i++){
            
            if(id == conexionPersona.mostrar().get(i).getId())
            {
                return conexionPersona.mostrar().get(i);
            }
        }
        return new Alumno();
    }
    
    
    public PanelPrestamo() {
        initComponents();
        conexionPrestamos= new PrestamosDAO();
        conexionLibro = new LibroDAO();
        conexionPersona = new AlumnoDAO();
        
        modeloPrestamo = (DefaultTableModel) tablaPrestamo.getModel();
        Object datosPrestamo[] = new Object[5];
        
        List<Libro> libros = conexionLibro.mostrar();
        for(int i = 0; i< libros.size(); i++)
        {
            cbLibro.addItem(libros.get(i).getTitulo());
        }
        
        List<Alumno> alumnos = conexionPersona.mostrar();
        
        for(int i = 0; i< alumnos.size(); i++)
        {
            cbPersona.addItem(alumnos.get(i).getNombre() + " " + alumnos.get(i).getApellido());
        }
        
        modeloPrestamo.setRowCount(0);
        
        for (Prestamos prestamo : conexionPrestamos.mostrar()) {
            datosPrestamo[0] = prestamo.getId();
            datosPrestamo[1] = obtenerLibro(prestamo.getId_libro()).getTitulo();
            datosPrestamo[2] = obtenerPersona(prestamo.getId_persona()).getNombre() + " " + obtenerPersona(prestamo.getId_persona()).getApellido();
            datosPrestamo[3] = prestamo.getFecha_prestamo();
            datosPrestamo[4] = prestamo.getFecha_vuelta();
            modeloPrestamo.addRow(datosPrestamo);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbPersona = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbLibro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tbDevolucion = new javax.swing.JTextField();
        btnPrestar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrestamo = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tID = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Alumno");

        cbPersona.setBackground(new java.awt.Color(255, 204, 204));
        cbPersona.setOpaque(true);
        cbPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPersonaActionPerformed(evt);
            }
        });

        jLabel2.setText("Libro a Prestar");

        cbLibro.setBackground(new java.awt.Color(255, 204, 204));
        cbLibro.setAutoscrolls(true);
        cbLibro.setOpaque(true);

        jLabel3.setText("Fecha Devolucion");

        tbDevolucion.setBackground(new java.awt.Color(255, 204, 204));

        btnPrestar.setBackground(new java.awt.Color(255, 204, 204));
        btnPrestar.setText("Prestar");
        btnPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cbPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbLibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(116, 116, 116))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tbDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(btnPrestar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrestar)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tbDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tablaPrestamo.setBackground(new java.awt.Color(255, 102, 102));
        tablaPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Libro", "Alumno", "Fecha Prestamo", "Fecha Devolucion"
            }
        ));
        tablaPrestamo.setGridColor(new java.awt.Color(255, 255, 255));
        tablaPrestamo.setSelectionBackground(new java.awt.Color(255, 204, 204));
        jScrollPane1.setViewportView(tablaPrestamo);
        if (tablaPrestamo.getColumnModel().getColumnCount() > 0) {
            tablaPrestamo.getColumnModel().getColumn(0).setMaxWidth(45);
        }

        btnEliminar.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel4.setText("ID:");

        tID.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnEliminar)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(jLabel4)
                    .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestarActionPerformed
        


        java.sql.Date sqlDate = java.sql.Date.valueOf(tbDevolucion.getText());
        Date currentDate = new Date(System.currentTimeMillis());
        
        int selectedLibro = cbLibro.getSelectedIndex();
        int selectedPersona = cbPersona.getSelectedIndex();
//        JOptionPane.showMessageDialog(null, conexionLibro.mostrar().get(selectedLibro).toString());
//        JOptionPane.showMessageDialog(null, conexionPersona.mostrar().get(selectedPersona).toString());
        
        conexionPrestamos.insertar(new Prestamos(conexionLibro.mostrar().get(selectedLibro).getId(), conexionPersona.mostrar().get(selectedPersona).getId(),currentDate,sqlDate ));
        JOptionPane.showMessageDialog(null, "PRESTAMO AGREGADO CORRECTAMENTE");
        
        modeloPrestamo.setRowCount(0);
        Object datosPrestamo[] = new Object[5];
        
        conexionPrestamos.disminuirLibro(conexionLibro.mostrar().get(selectedLibro).getId());


        for (Prestamos prestamo : conexionPrestamos.mostrar()) {
            datosPrestamo[0] = prestamo.getId();
            datosPrestamo[1] = obtenerLibro(prestamo.getId_libro()).getTitulo();
            datosPrestamo[2] = obtenerPersona(prestamo.getId_persona()).getNombre();
            datosPrestamo[3] = prestamo.getFecha_prestamo();
            datosPrestamo[4] = prestamo.getFecha_vuelta();
            modeloPrestamo.addRow(datosPrestamo);
        }
        
    }//GEN-LAST:event_btnPrestarActionPerformed

    private void cbPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPersonaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        if(tID.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "ID VACIO","ERROR",2);
            return;
        }
        
        int id = Integer.parseInt(tID.getText());
        for(int i = 0; i < conexionPrestamos.mostrar().size(); i++)
        {
            if(id == conexionPrestamos.mostrar().get(i).getId()){
                JOptionPane.showMessageDialog(null, "PRESTAMO DEVUELTO CORRECTAMENTE","CONFIRMADO",3);
                
                int indiceLibroAumentar = conexionPrestamos.recuperarIDLibroByPrestamoID(id);
                                
                conexionPrestamos.aumentarLibro(indiceLibroAumentar);
                conexionPrestamos.eliminar(id);
                
                modeloPrestamo.setRowCount(0);
                Object datosPrestamo[] = new Object[5];
                
                for (Prestamos prestamo : conexionPrestamos.mostrar()) {
                    datosPrestamo[0] = prestamo.getId();
                    datosPrestamo[1] = obtenerLibro(prestamo.getId_libro()).getTitulo();
                    datosPrestamo[2] = obtenerPersona(prestamo.getId_persona()).getNombre();
                    datosPrestamo[3] = prestamo.getFecha_prestamo();
                    datosPrestamo[4] = prestamo.getFecha_vuelta();
                    modeloPrestamo.addRow(datosPrestamo);
                }
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "PRESTAMO NO ENCONTRADO","ERROR",2);

    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPrestar;
    private javax.swing.JComboBox<String> cbLibro;
    private javax.swing.JComboBox<String> cbPersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tID;
    private javax.swing.JTable tablaPrestamo;
    private javax.swing.JTextField tbDevolucion;
    // End of variables declaration//GEN-END:variables
}
