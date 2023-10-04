
package Objetos;

import java.sql.Date;

public class Medico extends Persona {
    //nombre,apellido,dni,... heredados
    int id_especialidad;
    
    public Medico()
    {
    }

    public Medico(int id, String nombre, String apellido, String dni, Date fechaNacimiento,int id_especialidad) {
        super(id, nombre, apellido, dni, fechaNacimiento);//primero iniciazliamos el de la clase padre
        this.id_especialidad = id_especialidad;// y por ultimo el de los hijos
    }

    public Medico(String nombre, String apellido, String dni, Date fechaNacimiento,int id_especialidad) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.id_especialidad = id_especialidad;
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_Especialidad(int especialidad) {
        this.id_especialidad = especialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
}
