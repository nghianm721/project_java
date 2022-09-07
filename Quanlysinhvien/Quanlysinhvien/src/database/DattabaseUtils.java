/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DattabaseUtils {
      public static final String connectionUri="jdbc:sqlserver://Localhost:1433;"+"databaseName=Quanlysinhvien;user=sa;password=123";
    public static Connection getDBConnect(){
         try
            {
            Connection conn=null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");                         
            conn =DriverManager.getConnection(connectionUri); 
            return conn;
            }
            catch (ClassNotFoundException ex)
            {
                System.out.println("where is driver?");
                System.out.println("Error:"+ex.toString());               
            }
         catch (SQLException ex){
             //loi ket noi
             System.out.println("Erro:"+ex.toString());
         }
         return null;
    }
}
