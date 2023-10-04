/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Objetos.Especialidad;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EspecialidadDAO {
    public static final String SQL_SELECT = "SELECT * FROM Especialidad";
    public static final String SQL_INSERT = "INSERT INTO Especialidad(nombre,descripcion) VALUES (?,?)";
    
    
    public List<Especialidad> mostrar(){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        List<Especialidad> personas = new ArrayList<>();
        
        try{
            
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_SELECT);
            resultado = sentencia.executeQuery();
            
            while(resultado.next())
            {
                
            int id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            String descripcion = resultado.getString("descripcion");

            personas.add(new Especialidad(id,nombre,descripcion));

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
        return personas;
    }
    
    
    public int insertar(Especialidad medico){
        
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try{
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_INSERT);
            
            sentencia.setString(1, medico.getNombre());
            sentencia.setString(2, medico.getDescripcion());
            registros = sentencia.executeUpdate(); 
            System.out.println("ESPECIALIDAD AGREGADO CORRECTAMENTE");
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
    
    public Especialidad obtenerEspecialidadByID(int ID)
    {
        List<Especialidad> lista_especialidades = mostrar();
        
       for(int i = 0; i < lista_especialidades.size(); i++)
       {
           if(lista_especialidades.get(i).getId() == ID)
           {
               return lista_especialidades.get(i);
           }
       }
        
        return new Especialidad();
    }
    
    public Especialidad obtenerEspecialidadByNombre(String nombre)
    {
        List<Especialidad> lista_especialidades = mostrar();
        
       for(int i = 0; i < lista_especialidades.size(); i++)
       {
           if(lista_especialidades.get(i).getNombre().equals(nombre))
           {
               return lista_especialidades.get(i);
           }
       }
        
        return new Especialidad();
    }
    
    
}
