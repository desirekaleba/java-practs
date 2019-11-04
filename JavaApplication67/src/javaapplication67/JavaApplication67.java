/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication67;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import javax.swing.JFrame;

/**
 *
 * @author desire
 */
public class JavaApplication67 {

    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("title");
        frame.setBounds(200,200,600,630);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        Panel pan = new Panel();
        frame.getContentPane().add(pan);
        pan.setBackground(Color.cyan);
        frame.setVisible(true);
    }
    
}
