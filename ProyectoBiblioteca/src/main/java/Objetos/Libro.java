/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.sql.Date;

public class Libro {
    int id;
    String titulo, autor, genero;
    Date anio;
    int stock;

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", anio=" + anio + ", stock=" + stock + '}';
    }

    public Libro(int id, String titulo, String autor, Date anio, String genero,int stock) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.genero = genero;
        this.stock = stock;
    }
    
    public Libro(String titulo, String autor, Date anio, String genero,int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.genero = genero;
        this.stock = stock;
    }
    public Libro(String titulo, String autor, String genero,int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.stock = stock;
    }
    public Libro() {
        this.id = -1;
        this.titulo = "ERROR";
        this.autor =  "ERROR";
        this.genero = "ERROR";
        this.stock = -111;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
}
