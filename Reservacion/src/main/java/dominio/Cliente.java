/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.sql.Date;
import java.sql.Timestamp;


public class Cliente extends Usuario {
    String nombre,apellido,telefono;
    Date fechanacimiento;
    int usuario_id;

    public Cliente(int id, String correo, String contrasena, String nombre, String apellido, String telefono, Date fechanacimiento) {
        super(id,correo,contrasena);
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechanacimiento = fechanacimiento;
        this.usuario_id = usuario_id;
    }

    public Cliente(String correo, String contrasena, String nombre, String apellido, String telefono, Date fechanacimiento) {
        super(correo,contrasena);
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechanacimiento = fechanacimiento;
        this.usuario_id = usuario_id;
    }
    public Cliente() {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }
    
    
}
