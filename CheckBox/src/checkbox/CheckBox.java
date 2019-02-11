/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkbox;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author desire
 */
public class CheckBox extends JFrame {
private JPanel container = new JPanel();
private JCheckBox check1 = new JCheckBox("Case 1");
private JCheckBox check2 = new JCheckBox("Case 2");
public CheckBox(){
this.setTitle("Animation");
this.setSize(300, 300);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLocationRelativeTo(null);
container.setBackground(Color.white);
container.setLayout(new BorderLayout());
JPanel top = new JPanel();
check1.addActionListener(new StateListener());
check2.addActionListener(new StateListener());
top.add(check1);
top.add(check2);
container.add(top, BorderLayout.NORTH);
this.setContentPane(container);
this.setVisible(true);}
class StateListener implements ActionListener{
public void actionPerformed(ActionEvent e) {
System.out.println("source : " +
((JCheckBox)e.getSource()).getText() + " - état : " +
((JCheckBox)e.getSource()).isSelected());
}
}
    public static void main(String[] args) {
        // TODO code application logic here
        CheckBox cb = new CheckBox();
    }
    
}
