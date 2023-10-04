
package Datos;

import Objetos.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlumnoDAO {
    public static final String SQL_SELECT = "SELECT * FROM Alumno";
    public static final String SQL_INSERT = "INSERT INTO Alumno(nombre,apellido,cod_alumno) VALUES (?,?,?)";
    public static final String SQL_DELETE = "DELETE FROM Alumno WHERE id = ?";
    
    
    
    public List<Alumno> mostrar(){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        List<Alumno> personas = new ArrayList<>();
        
        try{
            
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_SELECT);
            resultado = sentencia.executeQuery();
            
            while(resultado.next())
            {
                
            int id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            String apellido = resultado.getString("apellido");
            String dni = resultado.getString("cod_alumno");

            personas.add(new Alumno(id,nombre,apellido,dni));
            

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
    
       
    public int insertar(Alumno personita){
        
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try{
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_INSERT);
            
            sentencia.setString(1, personita.getNombre());
            sentencia.setString(2, personita.getApellido());
            sentencia.setString(3, personita.getcodAlumno());
            
            registros = sentencia.executeUpdate(); 
            System.out.println("ALUMNO AGREGADO CORRECTAMENTE");
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
            JOptionPane.showMessageDialog(null, "PERSONA REMOVIDA CORRECTAMENTE");
            
            
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
