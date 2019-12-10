
package oopiii_lecture_ii;
import java.sql.*;
import javax.swing.JOptionPane;


public class ConnectionDB {
    
    
    static Connection conn = null;
    
    public static Connection dbConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost/students","root","");
          return conn;
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
    
}
