/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author desire
 */
public class Frame implements MouseListener, MouseMotionListener{

    static Panel pan = new Panel();
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setTitle("Title");
        frame.setBounds(300,300,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(pan);
        frame.addMouseListener(new Frame());
        frame.setVisible(true);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
                     pan.setX(e.getX()-30);
                     pan.setY(e.getY()-60);
                     pan.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
       pan.setX(e.getClickCount()-30);
                     pan.setY(e.getClickCount()-60);
                     pan.repaint();
                     
    
    }

    @Override
    public void mouseMoved(MouseEvent e) {
         //To change body of generated methods, choose Tools | Templates.
         pan.setX(e.getClickCount()-30);
                     pan.setY(e.getClickCount()-60);
                     pan.repaint();
    }
    
}
