import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class First extends JFrame{

	JButton btn = new JButton("show");
	JLabel name = new JLabel();

public First(){

	this.setSize(400, 300);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.setVisible(true);

	btn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event){
			try{
				Connection conn = FirstConnectDB.connectDB();

				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from users");
				if (rs.isBeforeFirst()) {
					while(rs.next()){
						name.setText(rs.getString("username"));

					}
				}
				
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, e);
			}
		}
	});

	getContentPane().add(btn);
	
}

public static void main(String[] args){
	new First();
}

}