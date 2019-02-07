/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animwithcombobox;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class AnimWithComboBox extends JFrame{
    PanelCombo pan = new PanelCombo();
    JComboBox combo = new JComboBox();
    JLabel labCombo = new JLabel(" Your Choice : ");
    JPanel container = new JPanel();
    boolean backX = false, backY = false, active = true;
    int x,y; Thread t;
    public AnimWithComboBox()
    {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        JPanel top = new JPanel();
        labCombo.setForeground(Color.black);
        top.add(labCombo); 
        combo.addItem("Play");
        combo.addItem("Stop");
        combo.addActionListener(new Action());
        top.add(combo);
        
        container.setLayout(new BorderLayout());
        container.add(top, BorderLayout.NORTH);
        container.add(pan, BorderLayout.CENTER);
        getContentPane().add(container);
        play();
    }
    public void play()
    {
        x= pan.getPosX(); y = pan.getPosY();
       while(active)
       {
           
           if(x<1)
               backX = false;
           if(x>pan.getWidth()-50)
               backX = true;

           if(y<1)
               backY = false;
           if(y>pan.getHeight()-50)
               backY = true;
           if(!backX)
               pan.setPosX(x++);
           else
               pan.setPosX(x--);
           if(!backY)
               pan.setPosY(y++);
           else
               pan.setPosY(y--);
           pan.repaint();
           try{
               Thread.sleep(3);
           }catch(Exception e){e.printStackTrace();}
           
       }
    }
    public class Action implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(combo.getSelectedItem().equals("Play"))
            {
                active=true;
               t= new Thread(new PlayA());
               t.start();
               
            }
            else
                active=false;
        }
    }
    public class PlayA implements Runnable
    {
        public void run(){ play();}
    }
   
    public static void main(String[] args) {
        new AnimWithComboBox();
    }
    
}
