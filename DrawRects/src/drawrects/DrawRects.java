/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawrects;

import java.awt.Dimension;

/**
 *
 * @author desire
 */
public class DrawRects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setTitle("DRAW_RECTS");
        frame.setBounds(0,0,350,400);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
       javax.swing.JPanel pan = new javax.swing.JPanel();
       for(int i = 0; i<36;i++){
           pan.add(new Panel());
    }
        frame.getContentPane().add(pan);
        frame.setVisible(true);
    }
    
}
