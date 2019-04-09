/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essaiet;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author desire
 */
public class EssaieT extends JFrame{
    public EssaieT()
    {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        JTable t = new JTable();
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
            String sql = "SELECT * FROM userlogged";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            t.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){}
        getContentPane().add(t, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new EssaieT();
    }
    
}
