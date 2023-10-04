/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Objetos.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;


public class LibroDAO {
    public static final String SQL_SELECT = "SELECT * FROM LIBRO";
    public static final String SQL_INSERT = "INSERT INTO LIBRO(titulo,autor,anio,genero,stock) VALUES (?,?,?,?,?)";
    public static final String SQL_DELETE = "DELETE FROM LIBRO WHERE id = ?";
    
    
    public List<Libro> mostrar(){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        List<Libro> libros = new ArrayList<>();
        
        try{
            
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_SELECT);
            resultado = sentencia.executeQuery();
            
            while(resultado.next())
            {
                
            int id = resultado.getInt("id");
            String titulo = resultado.getString("titulo");
            String autor = resultado.getString("autor");
            Date anio = resultado.getDate("anio");
            String genero = resultado.getString("genero");
            int stock = resultado.getInt("stock");

            libros.add(new Libro(id, titulo,autor,anio,genero,stock));
            

            }
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }finally{
            try{
                ConexionBD.cerrar(resultado);
                ConexionBD.cerrar(sentencia);
                ConexionBD.cerrar(conexion);
            }catch(SQLException e){
                    e.printStackTrace(System.out);
            }
        }
        return libros;
    }
    
    
    public int insertar(Libro librito){
        
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try{
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_INSERT);
            
            sentencia.setString(1, librito.getTitulo());
            sentencia.setString(2, librito.getAutor());
            sentencia.setDate(3, librito.getAnio());
            sentencia.setString(4, librito.getGenero());
            sentencia.setInt(5, librito.getStock());
            
            registros = sentencia.executeUpdate(); 
            System.out.println("LIBRO AGREGADO CORRECTAMENTE");
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
        ResultSet resultado = null;
        int registros = 0;
        
        try{
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_DELETE);
            sentencia.setInt(1,Indice);
            registros = sentencia.executeUpdate();
            JOptionPane.showMessageDialog(null, "LIBRO REMOVIDO CORRECTAMENTE");
            
            
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
