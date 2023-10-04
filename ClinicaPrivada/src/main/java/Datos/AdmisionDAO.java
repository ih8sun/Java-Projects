
package Datos;

import Objetos.Admision;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdmisionDAO {
    //ADMISION = ES EL OBJETO
    //AdmisionDAO = es el objeto combinado con la base dtos
    public static final String SQL_SELECT = "SELECT * FROM Admision"; // hara un select en la basa de deatos
    
    //public : tipo de acceso //AdmisionDAO conexion = new AdmisionDAO();
    //Dato de qye va a devolver: una lista de objetos ADMISION.
    //nombre del metodo .. mostrar()
    public List<Admision> mostrar(){ // me va a devolver una lista de objeto tipo Admision(id - usuario - contra)
        
        Connection conexion = null;//creando mi conexion..
        PreparedStatement sentencia = null;// creando mi sentencia
        ResultSet resultado = null;//creando mi resultado
        List<Admision> administradores = new ArrayList<>();//creando una lista de objetos de tipo de admision que mas adelante
        //sera la que se devolvera.
        
        try{//INTENTARA CONECTARSE A LA BASE DE DATOS
            //SI ENTRA.. PASARA ESTO
            conexion = ConexionBD.getConexion(); //me conecto a la base de datos 
            sentencia = conexion.prepareStatement(SQL_SELECT); //preparo mi sentencia
            resultado = sentencia.executeQuery(); // aqui ejecuto la sentencia y ME DEVOLVERA EL RESULTADO.. EN UNA MATRIZ
            
            
            while(resultado.next())   //   1   elpepe   123.. CADA QUE DA UN NEXT IRA A LA SIGUIENTE FILA
            {
                
            int    id = resultado.getInt("id");// CREO UN AUXILIAR LLAMADO ID QUE RECEPCIONARA EL PRIMER ELEMENTO
            String usuario = resultado.getString("usuario");// CREO UN AXUILIAR LLAMADO USUARIO QUE RECEPCIONARA EL SEGUNDO ELEMENTO LLAMADO  COLUMNA(USUARIO)
            String contrasena = resultado.getString("contrasena");// CREO UN AXUILIAR LLAMADO CONTRASENA QUE RECEPCIONARA EL SEGUNDO ELEMENTO LLAMADO  COLUMNA(USUARIO)
            
            //A LA LISTA DE ADMINISTADORES LE INTRODUCIRE EL NUEVO ADMISION-USUARIO
            administradores.add(new Admision(id, usuario,contrasena));
            
            }
        }catch(SQLException e){
            e.printStackTrace(System.out);//MANDA UN ERROR DE QUE NO SE PUDO
        }finally{
            try{// ESTA INTENTANDO CERRAR LAS CONEXIONES - SENTENCIAS Y RESULTADOS
                ConexionBD.cerrar(resultado);
                ConexionBD.cerrar(sentencia);
                ConexionBD.cerrar(conexion);
            }catch(SQLException e){
                    e.printStackTrace(System.out);// ARROJARA UN ERROR SI ALGO NO SE LLEGA A CERRAR O SALE MAL
            }
        }
        return administradores;
    }
    
}
