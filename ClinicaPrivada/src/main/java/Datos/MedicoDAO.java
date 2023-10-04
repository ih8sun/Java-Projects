/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Objetos.Medico;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO {
    public static final String SQL_SELECT = "SELECT * FROM Medico";
    public static final String SQL_INSERT = "INSERT INTO Medico(nombre,apellido,dni,fecha_nacimiento,id_especialidad) VALUES (?,?,?,?,?)";
    
    
    public List<Medico> mostrar(){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        List<Medico> personas = new ArrayList<>();
        
        try{
            
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_SELECT);
            resultado = sentencia.executeQuery();
            
            while(resultado.next())
            {
                
            int id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            String apellido = resultado.getString("apellido");
            String dni = resultado.getString("dni");
            Date fecha_nacimiento = resultado.getDate("fecha_nacimiento");
            int especialidad = resultado.getInt("id_especialidad");

            personas.add(new Medico(id,nombre,apellido,dni,fecha_nacimiento,especialidad));

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
    
    
    public int insertar(Medico medico){
        
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try{
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_INSERT);
            
            sentencia.setString(1, medico.getNombre());
            sentencia.setString(2, medico.getApellido());
            sentencia.setString(3, medico.getDni());
            sentencia.setDate(4, medico.getFechaNacimiento());
            sentencia.setInt(5, medico.getId_especialidad());
            
            registros = sentencia.executeUpdate(); 
            System.out.println("MEDICO AGREGADO CORRECTAMENTE");
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
    
    public Medico obtenerMedicoByID(int ID)
    {
        List<Medico> lista_medicos = mostrar();
        
       for(int i = 0; i < lista_medicos.size(); i++)
       {
           if(lista_medicos.get(i).getId() == ID)
           {
               return lista_medicos.get(i);
           }
       }
        
        return new Medico();
    }
    
    public Medico obtenerMedicoByDNI(String dni)
    {
        List<Medico> lista_medicos = mostrar();
        
       for(int i = 0; i < lista_medicos.size(); i++)
       {
           if(lista_medicos.get(i).getDni().equals(dni))
           {
               return lista_medicos.get(i);
           }
       }
        
        return new Medico();
    }
}
