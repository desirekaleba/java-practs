/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenetretabbedpane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author desire
 */
public class PanneauTabbedPane extends JPanel{
    private Color color = Color.WHITE;
    private static int count = 0;
    private String message = "";
    public PanneauTabbedPane(){}
    public PanneauTabbedPane(Color color)
    {
        this.color = color;
        this.message = "contenu de l'onglet N° " + (++count);
    }
    public void paintComponent(Graphics g){
        g.setColor(this.color);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 15));
        g.drawString(this.message, 10, 20);
}
    
}
