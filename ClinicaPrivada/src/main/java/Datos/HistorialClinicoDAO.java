
package Datos;

import Objetos.Cita;
import Objetos.HistorialClinico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class HistorialClinicoDAO {
    
    public static final String SQL_SELECT = "SELECT * FROM HistorialClinico";
        public static final String SQL_INSERT = "INSERT INTO HistorialClinico(paciente_id,medico_id,fecha_consulta,diagnostico) VALUES (?,?,?,?)";

    
    
    public List<HistorialClinico> mostrar(){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        List<HistorialClinico> historial = new ArrayList<>();
        
        try{
            
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_SELECT);
            resultado = sentencia.executeQuery();
            
            while(resultado.next())
            {
                
            int id = resultado.getInt("id");
            int paciente_id = resultado.getInt("paciente_id");
            int medico_id = resultado.getInt("medico_id");
            Timestamp fecha_consulta = resultado.getTimestamp("fecha_consulta");
            String diagnostico = resultado.getString("diagnostico");

            historial.add(new HistorialClinico(id,paciente_id,medico_id,fecha_consulta,diagnostico));
            

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
        return historial;
    }
    
    
    public int insertar(HistorialClinico historial){
        
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try{
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_INSERT);
            
            sentencia.setInt(1, historial.getPaciente_id());
            sentencia.setInt(2, historial.getMedico_id());
            sentencia.setTimestamp(3, historial.getFecha_consulta());
            sentencia.setString(4, historial.getDiagnostico());
            
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
