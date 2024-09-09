/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;

/**
 *
 * @author hatem
 */
public class conectionProvider {
   
    public static String url;
   
    public static Connection connection;
    private static conectionProvider instance;

    public conectionProvider() {
        try{
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root",""); //conexion à la base de données admin
        } catch(SQLException ex){
        
        
        }
    }
    
   public Connection getConnection(){
   
   return connection;
   }
   
   public static conectionProvider getInstance(){
       
  if(instance==null)
      instance=new conectionProvider();
  return instance;
   
   }
}