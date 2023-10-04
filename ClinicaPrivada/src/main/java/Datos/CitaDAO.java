/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Objetos.Cita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CitaDAO {
    
    public static final String SQL_SELECT = "SELECT * FROM Cita";
    public static final String SQL_INSERT = "INSERT INTO Cita(paciente_id,medico_id,historial_id,fecha_cita) VALUES (?,?,?,?)";
    
    
    public List<Cita> mostrar(){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        List<Cita> citas = new ArrayList<>();
        
        try{
            
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_SELECT);
            resultado = sentencia.executeQuery();
            
            while(resultado.next())
            {
                
            int id = resultado.getInt("id");
            int paciente_id = resultado.getInt("paciente_id");
            int medico_id = resultado.getInt("medico_id");
            int historial_id = resultado.getInt("historial_id");
            Timestamp fecha_consulta = resultado.getTimestamp("fecha_cita");

            citas.add(new Cita(id,paciente_id,medico_id,historial_id,fecha_consulta));
            

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
        return citas;
    }
    
    
    public int insertar(Cita cita){
        
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try{
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_INSERT);
            
            sentencia.setInt(1, cita.getPaciente_id());
            sentencia.setInt(2, cita.getMedico_id());
            sentencia.setInt(3, cita.getHistorial_id());
            sentencia.setTimestamp(4, cita.getFecha_cita());
            
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
