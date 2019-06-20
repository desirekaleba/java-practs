import java.sql.*;
import javax.swing.*;
import java.awt.*;

public class FirstConnectDB{


	static Connection conn = null;

	public static Connection connectDB(){
		try{
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost/exam","root","");
			JOptionPane.showMessageDialog(null,"connection established");

			return conn;

		}catch(Exception e){

			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}