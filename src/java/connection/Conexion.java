/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NIL CARDENAS
 */
public class Conexion {
    
    public Connection getConnection(){
        
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fereteria", "root","");
        }catch(SQLException e){
            
        } catch (Exception e) {
            
            System.out.println("Error de Conexion connection.Conexion" + e.getMessage());
        }
        
        return cn;
    }
    
    /*public static void main(String[] args) {
        Conexion con= new Conexion();
        System.out.println(con.getConnection());
        
    }*/
}
