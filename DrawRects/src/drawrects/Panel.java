/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawrects;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author desire
 */
public class Panel extends javax.swing.JPanel{
    public Panel(){
        super();
        this.setPreferredSize(new Dimension(50,50));
        
    }
    
    @Override
    public void paintComponent(java.awt.Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,0,this.getWidth(), this.getHeight());
    }
    
    
    
    
}
