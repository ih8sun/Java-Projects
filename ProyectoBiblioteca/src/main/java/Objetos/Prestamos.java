/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.sql.Date;

public class Prestamos {
    int id;
    int id_persona;
    int id_libro;
    Date fecha_prestamo;
    Date fecha_vuelta;

    public Prestamos(int id, int id_persona, int id_libro, Date fecha_prestamo, Date fecha_vuelta) {
        this.id = id;
        this.id_persona = id_persona;
        this.id_libro = id_libro;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_vuelta = fecha_vuelta;
    }

    public Prestamos() {
    }

    public Prestamos(int id_persona, int id_libro, Date fecha_prestamo, Date fecha_vuelta) {
        
        this.id_persona = id_persona;
        this.id_libro = id_libro;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_vuelta = fecha_vuelta;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public Date getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public Date getFecha_vuelta() {
        return fecha_vuelta;
    }

    public void setFecha_vuelta(Date fecha_vuelta) {
        this.fecha_vuelta = fecha_vuelta;
    }
    
    
    
}
