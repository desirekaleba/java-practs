/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 *
 * @author desire
 */
public class Login extends JFrame{
    

    public Login()
        {
            this.setTitle("Login Form");
            this.setSize(270,140);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
           
            JPanel pan = new JPanel();
            JLabel lab1 = new JLabel("user name");
            JLabel lab2 = new JLabel("password");
            JTextField jtf1 = new JTextField();
            jtf1.setPreferredSize(new Dimension(150,20));
            JPasswordField jtf2 = new JPasswordField();
            jtf2.setPreferredSize(new Dimension(150,20));
            JButton b = new JButton("login");
           JButton b1 = new JButton("create an account"), b2=new JButton("elements du tableau");
            pan.add(lab1);
            pan.add(jtf1);
            pan.add(lab2);
            pan.add(jtf2);
            JPanel s = new JPanel();
            s.add(b);
            s.add(b1);
            //s.add(b1);
            //s.add(b2);
            pan.add(s);
            this.setContentPane(pan);
            this.setVisible(true);
            
            b.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                        {
                            //JOptionPane.showConfirmDialog(null,"connected "+jtf1.getText(),"connect",JOptionPane.PLAIN_MESSAGE);
                          try{
                            Class.forName("com.mysql.jdbc.Driver");
                            String url = "jdbc:mysql://localhost/login";
                            String username = "root";
                            String password = "";
                            Connection conn = DriverManager.getConnection(url,username,password);
                            System.out.println("connected to the bdd");
                            //System.out.println("connected");
                            //Statement stm = conn.createStatement();
                            String d = "select * from userlogged where userName =? and pwd = ?";
                            PreparedStatement ps = conn.prepareStatement(d);
                           // Statement state = conn.createStatement();
                            ps.setString(1, jtf1.getText());
                            ps.setString(2, jtf2.getText());
                            ResultSet rs = ps.executeQuery();
                            if(rs.next())
                                JOptionPane.showMessageDialog(null,"connected "+jtf1.getText(),"confirm",JOptionPane.PLAIN_MESSAGE);
                            else
                                JOptionPane.showMessageDialog(null, "user name or password  incorrect","confirm",JOptionPane.PLAIN_MESSAGE);
                            
                            
                              }catch(Exception e){e.printStackTrace();}
                        }
                });
            b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event)
                    {
                       String nom = (String)JOptionPane.showInputDialog(null, "user name", "account", JOptionPane.QUESTION_MESSAGE);
                       String password1 = (String)JOptionPane.showInputDialog(null, "password", "account", JOptionPane.QUESTION_MESSAGE);
                        try{
                         Class.forName("com.mysql.jdbc.Driver");
                            String url = "jdbc:mysql://localhost/login";
                            String username = "root";
                            String password = "";
                            Connection con = DriverManager.getConnection(url,username,password);
                            // stmt = con.createStatement();
                            
                       String sql="Insert into userlogged(userName,pwd) values(?,?)";
                       PreparedStatement pst = con.prepareStatement(sql);
                       if(nom.isEmpty())
                           System.out.println("your name must not be null");
                       else
                       pst.setString(1, nom);
                        if(password1.isEmpty())
                           System.out.println("your password must not be null");
                       else
                       pst.setString(2, password1);
                       pst.execute();
                        
                             }catch(Exception e){ e.fillInStackTrace();}
                    }
            });
            b2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event)
                    {
                        try{
                         Class.forName("com.mysql.jdbc.Driver");
                            String url = "jdbc:mysql://localhost/log";
                            String username = "root";
                            String password = "";
                            Connection con = DriverManager.getConnection(url,username,password);
                            Statement ss = con.createStatement();
                        ResultSet rs = ss.executeQuery("SELECT * FROM log.liste");
                        ResultSetMetaData tsmd = rs.getMetaData();
                        //for(int i= 1;i<=tsmd.getColumnCount();i++)
                        while(rs.next())
                        JOptionPane.showMessageDialog(null,"vous avez "+tsmd.getColumnName(NORMAL)+" colones","nombre",JOptionPane.PLAIN_MESSAGE);
                        
                             }catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage());}
                    }
            });
            
            
        }
    public static void main(String[] args) {
        // TODO code application logic here
        new Login();
    }
    
}
