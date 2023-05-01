/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pandelitosecommercewebsite;

import java.sql.*;

/**
 *
 * @author lloyd
 */
public class DBconnection {
    static final String DB_URL = "jdbc:mysql://localhost/pandelitoswebsitedatabase";
    static final String USER = "root";
    static final String PASS = "";
    
    public static Connection connectDB()
    {
        Connection con = null;
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =  DriverManager.getConnection(DB_URL, USER,PASS);
            return con;
        }catch(Exception ex){
            System.out.println("There was an error from connecting to server");
        }
        return null;
    }
}
