/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Objetos.Medico;
import Objetos.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {
    
    public static final String SQL_SELECT = "SELECT * FROM Paciente"; //PREPARAMOS LA SENTENCIA QUE HAREMOS
                                                                        // PREPARAMOS NUESTRA SENTENCIA PARA INGRESAR UN VALOR
    public static final String SQL_INSERT = "INSERT INTO Paciente(nombre,apellido,dni,fecha_nacimiento,direccion,telefono) VALUES (?,?,?,?,?,?)";
                                                                //CADA INCOGNITA SERA REEMPLAZADA POR EL CAMPO EN EL ORDEN INDICADO
    
    public List<Paciente> mostrar(){//MOSTRMAOS DE LA MISMA MANERA QUE ADMISIONDAO
        Connection conexion = null; //CREAMOS CONEXIONES
        PreparedStatement sentencia = null;//SENTENCIAS
        ResultSet resultado = null;//RESULTADOS
        
        List<Paciente> personas = new ArrayList<>();//NUESTRA LISTA DE PCIENTES QUE MAS ADELANTE SERA DEVUELTA
        
        try{
            
            conexion = ConexionBD.getConexion(); // CREAMOS NUESTRA CONEXION
            sentencia = conexion.prepareStatement(SQL_SELECT);//CREAMOS NUESTRO SELECT
            resultado = sentencia.executeQuery();//EJECUTAMOS EL SELECT Y RESULTADO YA TIENE TODOS LOS DATOS DEL SISTEMA SQL
            
            while(resultado.next())//SE VA A RECORRER FILA POR FILA (1 MARIANO GONZALES 12345678 2010-02-21 EHAEAJ 2747274)
            {
                
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String dni = resultado.getString("dni");
                Date fecha_nacimiento = resultado.getDate("fecha_nacimiento");
                String direccion = resultado.getString("direccion");
                String telefono = resultado.getString("telefono");
                //UNA VEZ OBTENIDO LOS DATOS DE LA X FILA, VOY A AGREGARLOS AL ALISTA DE PERSONA
                personas.add(new Paciente(id,nombre,apellido,dni,fecha_nacimiento,direccion,telefono));

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
    
    //VOY A RECIBIR UN PACIENTE- TODOS SUS DATOS.. OBVIAMENTE ID NO PORQUE LO GENERO EL SQL
    //EL NUMERO DE ACTUAL REGISTROS
    public int insertar(Paciente paciente){
        
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        
        try{
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(SQL_INSERT); // PREPARAME LA CONEXION
            
            //ACA REEMPLAZAMOS CADA INCOGNITA.. POR ORDEN
            //"INSERT INTO Paciente(nombre,apellido,dni,fecha_nacimiento,direccion,telefono) VALUES (?,?,?,?,?,?)";
            sentencia.setString(1, paciente.getNombre());
            sentencia.setString(2, paciente.getApellido());
            sentencia.setString(3, paciente.getDni());
            sentencia.setDate(4, paciente.getFechaNacimiento());
            sentencia.setString(5, paciente.getDireccion());
            sentencia.setString(6, paciente.getTelefono());
            
            //"INSERT INTO Paciente(nombre,apellido,dni,fecha_nacimiento,direccion,telefono) VALUES ("EL PPEE","ETE SECH",12345678,"2010-02-22",QUQUU4,123456789)";
            
            registros = sentencia.executeUpdate(); //EJECUTAMOS EL SQL INSERT
            System.out.println("PACIENTE AGREGADO CORRECTAMENTE");
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
    
    public Paciente obtenerPacienteByDni(String dni)//voy devolver el paciente encontrado por dni.. como parametro me han pasado un dni
    {
        
        
        for(int i = 0; i < mostrar().size(); i++)
        {
            if(dni.equals(mostrar().get(i).getDni())){//coincide con el mismo dni envia
                return mostrar().get(i); // si lo encuentra retorna TODO EL PACIENTE
            }
        }
        
        return new Paciente();//RETORNA UNO VACIO
    }
    
    public Paciente obtenerPacienteByID(int id)//obtener paciente por ID
    {
        for(int i = 0; i < mostrar().size(); i++)
        {
            if(id== mostrar().get(i).getId()){//si coincide con el mismo ID envia
                return mostrar().get(i);
            }
        }
        
        return new Paciente();
    }
    
    public List<Paciente> mostrarPorDni(String dni)
    {
        List<Paciente> pacientes = new ArrayList<>();
        
        for(int i = 0; i < mostrar().size(); i++)
        {
            if(dni.equals(mostrar().get(i).getDni()))//aca muestra un dni
            {
                pacientes.add(mostrar().get(i));
            }
        }
        return pacientes;
    }
    
}
