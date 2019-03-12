/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package split;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

/**
 *
 * @author desire
 */
public class Split extends JFrame{
    private JPanel pan = new JPanel();
    private JPanel pan2 = new JPanel();
    private JSplitPane split;
    
    public Split()
    {
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.pan.setBackground(Color.red);
        this.pan2.setBackground(Color.blue);
        split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pan, pan2);
        split.setOneTouchExpandable(true);
        this.getContentPane().add(split,BorderLayout.CENTER);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Split();
    }
    
}
