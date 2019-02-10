/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator {

    public static JLabel lab_number1, lab_number2, lab_sign, lab_answer;
    public static JTextField field = new JTextField();
    public static void main(String[] args) {
        lab_number1 = new JLabel();
        lab_number1.setFont(new Font("TimesRoman", Font.ITALIC, 15));
        lab_number2 = new JLabel();
        lab_number2.setFont(new Font("TimesRoman", Font.ITALIC, 15));
        lab_sign = new JLabel();
        lab_sign.setFont(new Font("TimesRoman", Font.ITALIC, 15));
        lab_answer = new JLabel();
        lab_answer.setFont(new Font("TimesRoman", Font.ITALIC, 15));
        Buttons btn = new Buttons();
        JPanel pan = new JPanel();
        pan.setLayout(new GridBagLayout());
        pan.add(lab_number1);
        pan.add(lab_sign);
        pan.add(lab_number2);
        pan.add(lab_answer);
        pan.setPreferredSize(new Dimension(280,50));
        pan.setAutoscrolls(true);
        pan.setBackground(Color.cyan);
        
        field = new JTextField();
        field.setPreferredSize(new Dimension(280,30));
        field.setEditable(false);
        JPanel pann = new JPanel();
        pann.setLayout(new BorderLayout());
        pann.add(pan, BorderLayout.NORTH);
        pann.add(field, BorderLayout.CENTER);
        
        JFrame mainFrame = new JFrame();
        mainFrame.setTitle("Calculator");
        mainFrame.setSize(400,400);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.getContentPane().add(pann, BorderLayout.NORTH);
        mainFrame.getContentPane().add(btn, BorderLayout.CENTER);
      mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }
   
    
}
