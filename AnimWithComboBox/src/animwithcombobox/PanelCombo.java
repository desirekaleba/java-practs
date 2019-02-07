/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animwithcombobox;
import javax.swing.*;
import java.awt.*;
import java.util.*;
/**
 *
 * @author desire
 */
public class PanelCombo extends JPanel{
    private int posX = -50, posY=-50;
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g;
        GradientPaint gp = new GradientPaint(0,0,Color.BLUE,20,20,Color.GREEN,true);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
        GradientPaint gp1 = new GradientPaint(0,0,Color.ORANGE,20,20,Color.RED,true);
        g2d.setPaint(gp1);
        g2d.fillOval(posX, posY, 50, 50);
        
    }
    public int getPosX()
    {
        return posX;
    }
    public void setPosX(int x)
    {
        this.posX = x;
    }
    public int getPosY()
    {
        return posY;
    }
    public void setPosY(int y)
    {
        this.posY = y;
    }
}
