package Objetos;


public class Alumno {
    
    int id;
    String nombre,apellido,codAlumno;
    public Alumno(int id,String nombre, String apellido, String codAlumno) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codAlumno = codAlumno;
    }
    
    public Alumno(String nombre, String apellido, String codAlumno) {
        this.id = -1;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codAlumno = codAlumno;
    }

    
    public Alumno() {
        this.id = -1;
        this.nombre = "ERROR";
        this.apellido = "ERROR";
        this.codAlumno = "ERROR";
    }
    
    public String getcodAlumno() {
        return codAlumno;
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

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", codAlumno=" + codAlumno + '}';
    }

    
    
}
