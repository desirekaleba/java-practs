/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author desire
 */
public class Panel extends JPanel{
    int x =0, y=0;
    public Panel(){
    super();
    }
    void setX(int x){
        this.x = x;
    }
    void setY(int y){
        this.y = y;
    }
    
    public void paintComponent(Graphics g){
       super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(x, y, 50,50);
    }
    
}
