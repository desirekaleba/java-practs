/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingearth;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author desire
 */
public class MovingEarth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame mainWindow = new JFrame();
		mainWindow.setTitle("My Drawing Graphics");
		mainWindow.setBounds(800,200,600,630);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BackPanel dc=new BackPanel();
		mainWindow.getContentPane().add(dc);
		dc.setBackground(Color.WHITE);
		dc.validate();
		dc.repaint();
		mainWindow.setVisible(true);
		Thread t=new Thread(dc);
		t.start();
    }
    
}
