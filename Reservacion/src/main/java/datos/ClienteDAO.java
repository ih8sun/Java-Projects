/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Cliente;
import dominio.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class ClienteDAO {
    
    public static final String SQL_SELECT = "SELECT * FROM CLIENTE";
    public static final String SQL_INSERT = "INSERT INTO CLIENTE(correo,contrasena,nombre,apellido,telefono,fechaNacimiento) VALUES (?,?,?,?,?,?)";

        
    public List<Cliente> mostrar(){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        List<Cliente> clientes = new ArrayList<>();
        
        try{
            
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_SELECT);
            resultado = sentencia.executeQuery();
            
            while(resultado.next())
            {
                
            int    id = resultado.getInt("id");
            String correo = resultado.getString("correo");
            String contrasena = resultado.getString("contrasena");
            String nombre = resultado.getString("nombre");
            String apellido = resultado.getString("apellido");
            String telefono = resultado.getString("telefono");
            Date fechaNac = resultado.getDate("fechaNacimiento");

            clientes.add(new Cliente(id, correo,contrasena,nombre, apellido, telefono, fechaNac));


                
                
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
        return clientes;
    }
    
    
    public int insertar(Cliente clientito){
        
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try{
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_INSERT);
            
            //ACA ESTAMOS REEMPLZANDO LOS ?  DE VALUES(?,?,?,?);
            sentencia.setString(1, clientito.getCorreo());//deveuelve el nombre del parametro mascotita
            sentencia.setString(2, clientito.getContrasena());//deveuelve el nombre del parametro mascotita
            sentencia.setString(3, clientito.getNombre());//deveuelve el nombre del parametro mascotita
            sentencia.setString(4, clientito.getApellido());//deveuelve el nombre del parametro mascotita
            sentencia.setString(5, clientito.getTelefono());//deveuelve el nombre del parametro mascotita
            sentencia.setDate(6, clientito.getFechanacimiento());//deveuelve el nombre del parametro mascotita
            
            registros = sentencia.executeUpdate(); 
            System.out.println("MASCOTITA AGREGADA CORRECTAMENTE");
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
