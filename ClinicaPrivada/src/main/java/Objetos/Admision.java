package Objetos;

public class Admision {
    int id;
    String usuario,contrasena;


    public Admision(int id, String usuario, String contrasena) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
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
