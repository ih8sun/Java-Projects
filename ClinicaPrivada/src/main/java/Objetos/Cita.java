/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.sql.Timestamp;

public class Cita {
    int id;
    int paciente_id;
    int medico_id;
    int historial_id;
    Timestamp fecha_cita;

    public Cita(int id, int paciente_id, int medico_id, int historial_id, Timestamp fecha_cita) {
        this.id = id;
        this.paciente_id = paciente_id;
        this.medico_id = medico_id;
        this.historial_id = historial_id;
        this.fecha_cita = fecha_cita;
    }
    
    public Cita( int paciente_id, int medico_id, int historial_id, Timestamp fecha_cita) {
        this.paciente_id = paciente_id;
        this.medico_id = medico_id;
        this.historial_id = historial_id;
        this.fecha_cita = fecha_cita;
    }
    public Cita(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(int paciente_id) {
        this.paciente_id = paciente_id;
    }

    public int getMedico_id() {
        return medico_id;
    }

    public void setMedico_id(int medico_id) {
        this.medico_id = medico_id;
    }

    public int getHistorial_id() {
        return historial_id;
    }

    public void setHistorial_id(int historial_id) {
        this.historial_id = historial_id;
    }

    public Timestamp getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(Timestamp fecha_cita) {
        this.fecha_cita = fecha_cita;
    }
    
    
    
}
