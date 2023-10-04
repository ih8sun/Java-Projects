
package Objetos;

import java.sql.Date;

public class Persona { //LA CLASE PADRE QUE VA A DAR HERENCIA A SUS HIJOS (PACIENTE Y MEDICO)
    int id;
    String nombre,apellido,dni;
    Date fechaNacimiento;
    
    public Persona(){} //vacio
        
    //con id - cuando queremos recuperar informacion .. cuado queremos presentar lo de la base de datos
    //queremos obtener TODOOOS LOS CAMPOS.
    public Persona(int id, String nombre, String apellido, String dni, Date fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    //sin id y cuando solo queremos insertar
    //EN CAMBIO CUANDO QUEREMOS INSERTAR A LA BASE DE DATOS..
    // como el ID es autogenerado e incrementable no lo necesitamos en el java.. sino que el mismo sql va asignar un id dinamico..
    public Persona(String nombre, String apellido, String dni, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
