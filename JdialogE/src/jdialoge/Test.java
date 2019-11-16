/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdialoge;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

/**
 *
 * @author desire
 */
public class Test extends JFrame{
     private JButton bouton = new JButton("Appel");
    public Test(){
       
this.setTitle("Ma JFrame");
this.setSize(300, 100);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLocationRelativeTo(null);
this.getContentPane().setLayout(new FlowLayout());
this.getContentPane().add(bouton);
bouton.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent arg0) {
JdialogE zd = new JdialogE(null, "Salutation", true);
}
});
this.setVisible(true);
} 
    public static void main(String[] main){
Test fen = new Test();
}
    
}
