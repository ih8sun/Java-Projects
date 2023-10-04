
package Objetos;

import java.util.Date;

public class Administrador {
    
    int id;
    String usuario,contrasena;

    public Administrador(int id, String usuario, String contrasena) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    public Administrador(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Administrador{" + "id=" + id + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    

}
