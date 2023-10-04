/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import static datos.ClienteDAO.SQL_INSERT;
import static datos.ClienteDAO.SQL_SELECT;
import dominio.Cliente;
import dominio.Reservacion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class ReservacionDAO {
    public static final String SQL_SELECT = "SELECT * FROM RESERVACION";
    public static final String SQL_INSERT = "INSERT INTO RESERVACION(idCliente,fecha,mesa,persona,DNI,cantidadPersonas,comentario) VALUES (?,?,?,?,?,?,?)";
    public static final String SQL_DELETE = "DELETE FROM RESERVACION WHERE idReservacion = ?";
    
    
    public List<Reservacion> mostrar(){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        List<Reservacion> reservacion = new ArrayList<>();
        
        try{
            
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_SELECT);
            resultado = sentencia.executeQuery();
            
            while(resultado.next())
            {
                
            int id = resultado.getInt("idReservacion");
            int idCliente = resultado.getInt("idCliente");
            Date fechaNac = resultado.getDate("fecha");
            int mesa = resultado.getInt("mesa");
            String persona = resultado.getString("persona");
            String DNI = resultado.getString("DNI");
            int cantidadPersonas = resultado.getInt("cantidadPersonas");
            String comentario = resultado.getString("comentario");

            reservacion.add(new Reservacion(id, idCliente,fechaNac,mesa,persona,DNI,cantidadPersonas,comentario ));

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
        return reservacion;
    }
    
    
    public int insertar(Reservacion reservacioncito){
        
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try{
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_INSERT);
            
            //ACA ESTAMOS REEMPLZANDO LOS ?  DE VALUES(?,?,?,?);
            sentencia.setInt(1, reservacioncito.getIdCliente());//deveuelve el nombre del parametro mascotita
            sentencia.setDate(2, reservacioncito.getFecha());//deveuelve el nombre del parametro mascotita
            sentencia.setInt(3, reservacioncito.getMesa());//deveuelve el nombre del parametro mascotita
            sentencia.setString(4, reservacioncito.getPersona());//deveuelve el nombre del parametro mascotita
            sentencia.setString(5, reservacioncito.getDNI());//deveuelve el nombre del parametro mascotita
            sentencia.setInt(6, reservacioncito.getCantidadPersonas());//deveuelve el nombre del parametro mascotita
            sentencia.setString(7, reservacioncito.getComentario());//deveuelve el nombre del parametro mascotita
            
            registros = sentencia.executeUpdate(); 
            System.out.println("RESERVACION AGREGADA CORRECTAMENTE");
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
            JOptionPane.showMessageDialog(null, "RESERVA REMOVIDA CORRECTAMENTE");
            
            
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
