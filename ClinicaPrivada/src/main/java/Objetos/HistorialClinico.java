
package Objetos;

import java.sql.Timestamp;

public class HistorialClinico {
    int id;
    int paciente_id;
    int medico_id;
    Timestamp fecha_consulta; // fecha pero tambien hora ..  YYYY-MM-DD HH:SS   
    String diagnostico;

    public HistorialClinico(int id, int paciente_id, int medico_id, Timestamp fecha_consulta, String diagnostico) {
        this.id = id;
        this.paciente_id = paciente_id;
        this.medico_id = medico_id;
        this.fecha_consulta = fecha_consulta;
        this.diagnostico = diagnostico;
    }
    
    public HistorialClinico(int paciente_id, int medico_id, Timestamp fecha_consulta, String diagnostico) {
        this.paciente_id = paciente_id;
        this.medico_id = medico_id;
        this.fecha_consulta = fecha_consulta;
        this.diagnostico = diagnostico;
    }

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

    public Timestamp getFecha_consulta() {
        return fecha_consulta;
    }

    public void setFecha_consulta(Timestamp fecha_consulta) {
        this.fecha_consulta = fecha_consulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

}
