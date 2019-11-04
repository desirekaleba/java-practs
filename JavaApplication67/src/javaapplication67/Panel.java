/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication67;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author desire
 */
public class Panel extends JPanel{
    
    int[] x = {100,140,145};
        int[] y = {200,230,250};
        int sw=600;
        int sh=600;
        
    public Panel(){
        super();
 
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        
        int del;
        int n=30;
        del=sw/n;
        
        for(int i = 0; i<n; i++){
       
            g.drawLine(del*i,0,sh,i*del);
            g.drawLine(del*i,sw,0,i*del);
            g.drawLine(sw-i*del,0,0,i*del);
            g.drawLine(i*del,sh,sh,sw-i*del);
            
        }
    }
    
}
