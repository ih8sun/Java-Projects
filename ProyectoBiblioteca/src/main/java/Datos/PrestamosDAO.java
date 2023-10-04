
package Datos;

import Objetos.Prestamos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrestamosDAO {

    LibroDAO conexionLibro = new LibroDAO();
    AlumnoDAO conexionPersona = new AlumnoDAO();
    public static final String SQL_SELECT = "SELECT * FROM Prestamo";
    public static final String SQL_INSERT = "INSERT INTO Prestamo(id_libro,id_persona,fecha_prestamo,fecha_devolucion) VALUES (?,?,?,?)";
    public static final String SQL_DELETE = "DELETE FROM Prestamo WHERE id = ?";
    public static final String SQL_UPDATE = "UPDATE Libro SET stock = stock - 1 WHERE id = ?";
    public static final String SQL_AUMENTAR_STOCK = "UPDATE Libro SET stock = stock + 1 WHERE id = ?";


    public List<Prestamos> mostrar() {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        List<Prestamos> prestamos = new ArrayList<>();

        try {

            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_SELECT);
            resultado = sentencia.executeQuery();

            while (resultado.next()) {

                int id = resultado.getInt("id");
                int id_libro = resultado.getInt("id_libro");
                int id_persona = resultado.getInt("id_persona");
                Date fecha_prestamo = resultado.getDate("fecha_prestamo");
                Date fecha_devolucion = resultado.getDate("fecha_devolucion");

                prestamos.add(new Prestamos(id, id_libro, id_persona, fecha_prestamo, fecha_devolucion));

            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                ConexionBD.cerrar(resultado);
                ConexionBD.cerrar(sentencia);
                ConexionBD.cerrar(conexion);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return prestamos;
    }
    
    public int recuperarIDLibroByPrestamoID(int id)
    {
        for(int i = 0; i < mostrar().size(); i++)
        {
            if(id == mostrar().get(i).getId())
            {
                return mostrar().get(i).getId_libro();
            }
        }
        return -1;
    }
    
    public int insertar(Prestamos prestamitos){
        
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try{
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_INSERT);
            
            sentencia.setInt(1, prestamitos.getId_libro());
            sentencia.setInt(2, prestamitos.getId_persona());
            sentencia.setDate(3, prestamitos.getFecha_prestamo());
            sentencia.setDate(4, prestamitos.getFecha_vuelta());
            
            registros = sentencia.executeUpdate(); 
            System.out.println("PRESTAMO AGREGADO CORRECTAMENTE");
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }finally{
            
            try{
                ConexionBD.cerrar(sentencia);
                ConexionBD.cerrar(conexion);
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
            
        }
        return registros;
    }
    
    
    public int disminuirLibro(int idLibro){
        
        
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try{
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_UPDATE);
            sentencia.setInt(1, idLibro);
            
            registros = sentencia.executeUpdate();
            System.out.println("LIBRO ACTUALIZDO");
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }finally{
            
            try{
                ConexionBD.cerrar(sentencia);
                ConexionBD.cerrar(conexion);
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
            
        }
        return registros;
    }
    
    
    public int aumentarLibro(int idLibro){
        
        
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try{
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_AUMENTAR_STOCK);
            sentencia.setInt(1, idLibro);
            
            registros = sentencia.executeUpdate();
            System.out.println("LIBRO ACTUALIZDO");
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }finally{
            
            try{
                ConexionBD.cerrar(sentencia);
                ConexionBD.cerrar(conexion);
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
            
        }
        return registros;
    }
    
    public int eliminar(int Indice){
        
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try{
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_DELETE);
            sentencia.setInt(1,Indice);
            registros = sentencia.executeUpdate();
            
            
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }finally{
            
            try{
                ConexionBD.cerrar(sentencia);
                ConexionBD.cerrar(conexion);
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
            
        }
        return registros;
    }

}
