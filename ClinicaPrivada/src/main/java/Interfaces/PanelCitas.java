/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

import Datos.CitaDAO;
import Datos.EspecialidadDAO;
import Datos.HistorialClinicoDAO;
import Datos.MedicoDAO;
import Datos.PacienteDAO;
import Objetos.Medico;
import Objetos.Cita;
import Objetos.Especialidad;
import Objetos.HistorialClinico;
import Objetos.Paciente;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexsantiago
 */
public class PanelCitas extends javax.swing.JPanel {

    DefaultTableModel modeloCita;
    
    //CONEXIONES
    MedicoDAO conexionMedico;
    PacienteDAO conexionPaciente;
    CitaDAO conexionCita;
    EspecialidadDAO conexionEspecialidad;
    HistorialClinicoDAO conexionHistorial;

    public PanelCitas() {
        
        //ACA INICIALIZANDO CONEXIONES
        conexionMedico = new MedicoDAO();
        conexionPaciente = new PacienteDAO();
        conexionCita = new CitaDAO();
        conexionHistorial = new HistorialClinicoDAO();
        conexionEspecialidad = new EspecialidadDAO();
        
        
        initComponents(); // INICIALIZANDO COMPONENTENS

        //ACTUALIZANDO TABLA
        modeloCita = (DefaultTableModel) tabla.getModel();
        Object datos[] = new Object[4];
        modeloCita.setRowCount(0);

        for (Cita cita : conexionCita.mostrar()) {
            
            //CREO MI TIPO DE DATOS = OBTENGO SU CONEXION. Y OBTENGO EL TIPO(SOLO UNO)POR SU ID
            Medico medico = conexionMedico.obtenerMedicoByID(cita.getMedico_id()); // EJMP: SI ID 5 .. OBTENGO AL QUINTO DOCTOR DE LA LISTA
            Paciente paciente = conexionPaciente.obtenerPacienteByID(cita.getPaciente_id());// EJMP: SI ID 2 .. OBTENGO AL SEGUNDO PACIENTE DE LA LISTA

            datos[0] = paciente.getNombre() + " " + paciente.getApellido();
            datos[1] = medico.getNombre() + " " + medico.getApellido();
            datos[2] = cita.getFecha_cita();
            datos[3] = conexionEspecialidad.obtenerEspecialidadByID(medico.getId_especialidad()).getNombre();
            modeloCita.addRow(datos);
        }
        
        //ACA INICIALIZAMOS LOS COMBO BOX DE LAS LISTAS DE PACIENTESs
        for(Paciente paciente : conexionPaciente.mostrar())
        {
            String nombre_dni = paciente.getNombre() + " " + paciente.getApellido() + " " + paciente.getDni();
            cb_lista_pacientes.addItem(nombre_dni);//AGREGARA UN ITEM A LA LISTA DE COMBOBOX
        }
        
        for(Medico doctor : conexionMedico.mostrar())
        {
            String nombre_dni = doctor.getNombre() + " " + doctor.getApellido() + " " + doctor.getDni();
            cb_lista_doctores.addItem(nombre_dni);
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tDniPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tDniDoctor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tFecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tHora = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        DIAGNOSTICO = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txArea = new javax.swing.JTextArea();
        cb_lista_pacientes = new javax.swing.JComboBox<>();
        cb_lista_doctores = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        btnRegistrar.setBackground(new java.awt.Color(153, 153, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(btnRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrar)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 660, -1));

        jLabel3.setText("Dni");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 40, 58, 25));
        jPanel1.add(tDniPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 41, 89, -1));

        jLabel4.setText("Dni");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 58, 25));
        jPanel1.add(tDniDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 88, -1));

        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Paciente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 6, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Doctor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));
        jPanel1.add(tFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 10, 130, -1));

        jLabel5.setText("Fecha de Cita");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jLabel6.setText("Hora de Cita");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));
        jPanel1.add(tHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 110, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Paciente", "Doctor", "Fecha_Cita", "Especialidad"
            }
        ));
        tabla.setGridColor(new java.awt.Color(153, 153, 255));
        tabla.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tabla.setShowGrid(true);
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 623, 156));

        DIAGNOSTICO.setSelected(true);
        DIAGNOSTICO.setText("Añadir Diagnostico?");
        DIAGNOSTICO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIAGNOSTICOActionPerformed(evt);
            }
        });
        jPanel1.add(DIAGNOSTICO, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 330, -1, -1));

        txArea.setColumns(20);
        txArea.setRows(5);
        txArea.setText("Cita por Defecto");
        jScrollPane2.setViewportView(txArea);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 617, 46));

        cb_lista_pacientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_lista_pacientesItemStateChanged(evt);
            }
        });
        jPanel1.add(cb_lista_pacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 70, 221, -1));

        cb_lista_doctores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_lista_doctoresItemStateChanged(evt);
            }
        });
        jPanel1.add(cb_lista_doctores, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 221, -1));

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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (conexionCita.mostrar().isEmpty()) {//SI LA LISTA CITAS ESTA VACIA
            JOptionPane.showMessageDialog(null, "Aun no hay citas");
            return;
        }

        //CREANDO NUESTRA VARIABLE DE TIPO DE FECHA
        java.util.Date selectedDate = tFecha.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fecha_string = dateFormat.format(selectedDate); //FECHA OBTENIDA DEL PANEL
        
        //HASTA EL MOMMENTO DE ARRIBA TENEMOS YYYY-MM--DD :00.0 
        fecha_string += " " + tHora.getText() + ":00.0";



        Paciente paciente = conexionPaciente.mostrar().get(cb_lista_pacientes.getSelectedIndex()); //QUIERO ME OBTENGAS AL PACIENTE EN SU INDICE DE LA LISTA 
        Medico medico = conexionMedico.mostrar().get(cb_lista_doctores.getSelectedIndex()); //QUIERO ME OBTENGAS AL MEDICO EN SU INDICE DE LA LISTA 

        
        //VIENDO SI EL DOCTOR YA TIENE FECHAY HORA OCUPADA
        for (Cita cita : conexionCita.mostrar()) {//CREO MI FOR QUE RECORRA TOODAS LAS LISTAS
            if (cita.getFecha_cita().toString().equals(fecha_string)) {//Y HAGO LA COMPARACION DE LAS FECHAS.. LA FECHA QUE HA INGRESADO EL USUARIO CON LA FECHA QUE ESTAN EN LA LISTA
                if (cita.getMedico_id() == medico.getId()) {//PERO SI TAMBIEN COINCIDEN EN EL MEDICO .. LISTO ACA ACABA Y NO DEJA SEGUIR REGISTRANDO
                    //Si la fecha coincide y tambien el doctor entonces no se puede
                    JOptionPane.showMessageDialog(null, "EL DOCTOR TIENE ESTA FECHA Y HORA OCUPADA", "ERROR", 2);//TERMINA AQUI
                    return;
                }
            }
        }

        //INSERTANDO .. PORQUE YA HEMOS VALIDADO DE QUE HAY FECHA DISPONIBLE 
        try {
            //TRAMAOS DE INGRESAR A UN HISTORIAL PARA NUESTRO PACIENTE
            SimpleDateFormat conversor = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            java.util.Date parseado = conversor.parse(fecha_string);
            Timestamp fechaIngresar = new Timestamp(parseado.getTime()); // HASTA ACA YA HEMOS OBTENIDO LA FECHA EB FORMATO YYYY-MM-DD HH:MM:SS.SSSS
            
            //JDIAG..
            if(DIAGNOSTICO.isSelected())//SI ANADIR DIAGNOSTICO ESTA SELECIIONNADO.. CHAPARA LO QUE ESTA ESCRITO EN EL TXAREA
                conexionHistorial.insertar(new HistorialClinico(paciente.getId(), medico.getId(), fechaIngresar, txArea.getText()));
            else
                conexionHistorial.insertar(new HistorialClinico(paciente.getId(), medico.getId(), fechaIngresar, "PROXIMA_CITA"));
            //INGRESADO CORRECTAMENTE
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR");
        }

        
        try {
            //FORMATEANDO FECHA
            SimpleDateFormat conversor = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            java.util.Date parseado = conversor.parse(fecha_string);
            Timestamp fechaIngresar = new Timestamp(parseado.getTime());
            //FECHA OBTENIDA CORRECTAMENTE
            
            //OBTENER EL ULTIMO HISTORIAL RECIBIDO DE LA LISTA
            HistorialClinico historial = conexionHistorial.mostrar().get(conexionHistorial.mostrar().size() - 1); //ACA OBTENIENDO EL ULTIMO HISTORIAL
            
            //VOY A INSERTAR.. EL ID DEL PACIENTE, EL ID DEL MEDICO, EL ID DEL HISTORIAL, Y LA FECHA A INGRESAR
            conexionCita.insertar(new Cita(paciente.getId(), medico.getId(), historial.getId(), fechaIngresar));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR");
        }
        
        JOptionPane.showMessageDialog(null, "CITA AGENDADA CORRECTAMENTE", "CORRECTO", 1);
        
        
        //ACTUALIZANDO LA TABLA
        modeloCita.setRowCount(0);
        Object datos[] = new Object[4];

        for (Cita cita : conexionCita.mostrar()) {

            medico = conexionMedico.obtenerMedicoByID(cita.getMedico_id());
            paciente = conexionPaciente.obtenerPacienteByID(cita.getPaciente_id());

            datos[0] = paciente.getNombre() + " " + paciente.getApellido();
            datos[1] = medico.getNombre() + " " + medico.getApellido();
            datos[2] = cita.getFecha_cita();
            datos[3] = conexionEspecialidad.obtenerEspecialidadByID(medico.getId_especialidad()).getNombre();
            modeloCita.addRow(datos);
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void DIAGNOSTICOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIAGNOSTICOActionPerformed
        if(DIAGNOSTICO.isSelected())
        {
            txArea.setVisible(true);//SE PUEDE ESCRIBIR UN DIAGNOSTICO
        }else{
            txArea.setVisible(false);// NO SE PUEDE ESRICIBR NADA 
        }
    }//GEN-LAST:event_DIAGNOSTICOActionPerformed

    private void cb_lista_pacientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_lista_pacientesItemStateChanged
        
        String str = cb_lista_pacientes.getSelectedItem().toString(); //CADA QUE SE SELECCIONE UN ELEMENTO DEL COMBO BOX DE PACIENTES
        
        String[]cadenas = str.split(" ");// OBTENDRA EL ULTIMO REGISTRO DE LA CADENA , O SEA EL DNI -->    RICARDO RAMRIEZ 12345678
        
        tDniPaciente.setText(cadenas[cadenas.length-1]);
        
    }//GEN-LAST:event_cb_lista_pacientesItemStateChanged

    private void cb_lista_doctoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_lista_doctoresItemStateChanged
        String str = cb_lista_doctores.getSelectedItem().toString();
        
        String[]cadenas = str.split(" ");
        
        tDniDoctor.setText(cadenas[cadenas.length-1]);
    }//GEN-LAST:event_cb_lista_doctoresItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox DIAGNOSTICO;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cb_lista_doctores;
    private javax.swing.JComboBox<String> cb_lista_pacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tDniDoctor;
    private javax.swing.JTextField tDniPaciente;
    private com.toedter.calendar.JDateChooser tFecha;
    private javax.swing.JTextField tHora;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea txArea;
    // End of variables declaration//GEN-END:variables
}
