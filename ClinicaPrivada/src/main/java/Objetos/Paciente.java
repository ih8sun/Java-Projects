/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.sql.Date;

public class Paciente extends Persona{
    //estaclase es una hija de la clase padre(base)
    //por ende va a heredar los mismos atributos que tien la clase padre.(Persona) ? (sus variables y metodos)
    String direccion,telefono;
    
    public Paciente(){}
    public Paciente( int id,String nombre, String apellido, String dni, Date fechaNacimiento,String direccion,String telefono) {
        super(id, nombre, apellido, dni, fechaNacimiento); // damos herencia a nuestra clase padre
        this.direccion = direccion;//y ahora damos herencia a nuestras variables de nuestra clase
        this.telefono = telefono;
    }
    

    public Paciente(String nombre, String apellido, String dni, Date fechaNacimiento,String direccion,String telefono) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.direccion = direccion;
        this.telefono = telefono;
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
    
        
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
