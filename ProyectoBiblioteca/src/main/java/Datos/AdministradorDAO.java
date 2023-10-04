/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Objetos.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdministradorDAO {

    public static final String SQL_SELECT = "SELECT * FROM ADMINISTRADOR";

    public List<Administrador> mostrar(){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        List<Administrador> administradores = new ArrayList<>();
        
        try{
            
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_SELECT);
            resultado = sentencia.executeQuery();
            
            while(resultado.next())
            {
                
            int    id = resultado.getInt("id");
            String usuario = resultado.getString("usuario");
            String contrasena = resultado.getString("contrasena");

            administradores.add(new Administrador(id, usuario,contrasena));

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
        return administradores;
    }
    
}
