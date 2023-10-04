/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.sql.Date;

/**
 *
 * @author Alex
 */
public class Reservacion {
    
    int idReservacion;
    int idCliente;
    Date fecha;
    int mesa;
    String persona,DNI;
    int cantidadPersonas;
    String comentario;

    public Reservacion(int idReservacion, int idCliente, Date fecha, int mesa, String persona, String DNI, int cantidadPersonas,String comentario) {
        this.idReservacion = idReservacion;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.mesa = mesa;
        this.persona = persona;
        this.DNI = DNI;
        this.cantidadPersonas = cantidadPersonas;
        this.comentario = comentario;
    }

    public Reservacion(int idCliente, Date fecha, int mesa, String persona, String DNI, int cantidadPersonas,String comentario) {
        this.idReservacion = idReservacion;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.mesa = mesa;
        this.persona = persona;
        this.DNI = DNI;
        this.cantidadPersonas = cantidadPersonas;
        this.comentario = comentario;
    }
    public Reservacion(){}

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
    
    
    
}
