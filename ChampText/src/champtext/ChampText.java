/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package champtext;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author desire
 */
public class ChampText extends JFrame {
private JPanel container = new JPanel();
private JTextField jtf = new JTextField();
private JLabel label = new JLabel("Un JTextField");
public ChampText(){
this.setTitle("JTextField");
this.setSize(300, 300);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLocationRelativeTo(null);
container.setBackground(Color.white);
container.setLayout(new BorderLayout());
JPanel top = new JPanel();
Font police = new Font("Arial", Font.BOLD, 14);
jtf.setFont(police);
jtf.setPreferredSize(new Dimension(150, 30));
jtf.setForeground(Color.BLUE);
top.add(label);
top.add(jtf);
container.add(top, BorderLayout.NORTH);
this.setContentPane(container);
this.setVisible(true);
}
    public static void main(String[] args) {
        // TODO code application logic here
        ChampText ct = new ChampText();
    }
    
}
