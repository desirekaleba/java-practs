/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author desire
 */
public class JavaApplication4 extends JFrame{
    CardLayout cl = new CardLayout();
    JPanel content = new JPanel();
    String[] listContent = {"CARD1", "CARD2", "CARD3", "CARD4", "CARD5"};
    int indice;
    public JavaApplication4()
    {
        this.setTitle("card layout");
        this.setSize(300,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel card1 = new JPanel();
        card1.setBackground(Color.red);
        JPanel card2 = new JPanel();
        card2.setBackground(Color.black);
        JPanel card3 = new JPanel();
        card3.setBackground(Color.green);
        JPanel card4 = new JPanel();
        card4.setBackground(Color.magenta);
        JPanel card5 = new JPanel();
        card5.setBackground(Color.blue);
        JPanel boutonPane = new JPanel();
        JButton bouton = new Bouton("suivant");
        bouton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                cl.next(content);
            }});
        JButton bouton2 = new Bouton("par indice");
        bouton2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        if(++indice>4)
            indice = 0;
        cl.show(content, listContent[indice]);}
        });
        boutonPane.add(bouton);
        boutonPane.add(bouton2);
        content.setLayout(cl);
        content.add(card1, listContent[0]);
        content.add(card2, listContent[1]);
        content.add(card3, listContent[2]);
        content.add(card4, listContent[3]);
        content.add(card5, listContent[4]);
        
        this.setVisible(true);
        //this.setContentPane(content);
        this.getContentPane().add(boutonPane, BorderLayout.NORTH);
        this.getContentPane().add(content, BorderLayout.CENTER);
    }
    public static void main(String[] args) 
    {
        // TODO code application logic here
        JavaApplication4 fen = new JavaApplication4();
        
    
}
}

