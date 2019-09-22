/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulaire;

import javax.swing.JFrame;
    import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author desire
 */
public class ComboBox extends JFrame{
private JPanel container = new JPanel();
String[] tab = {"Option 1", "Option 2", "Option 3", "Option 4"};
private JComboBox combo = new JComboBox(tab);
private JLabel label = new JLabel("Une ComboBox");
public ComboBox(){
this.setTitle("Animation");
this.setSize(300, 300);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLocationRelativeTo(null);
container.setBackground(Color.white);
container.setLayout(new BorderLayout());
combo.setPreferredSize(new Dimension(100, 20));
//combo.addItem("Option 1");
//combo.addItem("Option 2");
//combo.addItem("Option 3");
//combo.addItem("Option 4");
JPanel top = new JPanel();
top.add(label);
top.add(combo);
container.add(top, BorderLayout.NORTH);
this.setContentPane(container);
this.setVisible(true);
combo.addActionListener(new ItemAction());
combo.setPreferredSize(new Dimension(100, 20));
combo.setForeground(Color.blue);
//La fin reste inchangée
}
//La classe interne ItemState reste inchangée
class ItemAction implements ActionListener{
public void actionPerformed(ActionEvent e) {
System.out.println("ActionListener : action sur " +
combo.getSelectedItem());
}}
    public static void main(String[] args) {
        // TODO code application logic here
        ComboBox form = new ComboBox();
    }
    
}
