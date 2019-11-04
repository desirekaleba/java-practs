/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication66;

import com.sun.glass.events.KeyEvent;
import java.awt.BorderLayout;

/**
 *
 * @author desire
 */
public class JavaApplication66 extends javax.swing.JFrame{
    public JavaApplication66(){
        try{
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, e);}
        setTitle("login");
        setSize(300, 150);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        panel = new javax.swing.JPanel();
        userName = new javax.swing.JLabel("User name :");
        password = new javax.swing.JLabel("Password :");
        textFieldName = new javax.swing.JTextField();
        textFieldName.setPreferredSize(new java.awt.Dimension(180,20));
        passwordField = new javax.swing.JPasswordField();
        passwordField.setPreferredSize(new java.awt.Dimension(180,20));
        passwordField.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt){
                if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                    if(textFieldName.getText().equals("deska") && passwordField.getText().equals("desire")){
                   javax.swing.JOptionPane.showMessageDialog(null,"successfully logged in","title",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    javax.swing.JOptionPane.showMessageDialog(null,"wrong inputs","title",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
                }
            }
        });
        btn =new javax.swing.JButton("submit");
        btn.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                if(textFieldName.getText().equals("deska") && passwordField.getText().equals("desire")){
                   javax.swing.JOptionPane.showMessageDialog(null,"successfully logged in","title",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    javax.swing.JOptionPane.showMessageDialog(null,"wrong inputs","title",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        panel.add(userName);
        panel.add(textFieldName);
        panel.add(password);
        panel.add(passwordField);
       panel.add(btn);
        setContentPane(panel);
        
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new JavaApplication66().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel userName;
    private javax.swing.JLabel password;
    private javax.swing.JTextField textFieldName;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel panel;
    private javax.swing.JButton btn;
    
}
