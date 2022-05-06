/*
//package practice;
import java.sql.*;

public class myConnection {
    public static Connection getConnection()
    {
        Connection con = null;
        
        try{        
            Class.forName("com.mysql.jdbc.Driver");
            //con = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","root"); 
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return con;
    }
}


 */