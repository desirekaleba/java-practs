/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horloge;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author desire
 */
public class Horloge extends JFrame{
    private JLabel label = new JLabel();
    private HorlogeI horloge;
    
    public Horloge()
    {
        setSize(300,80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        horloge = new HorlogeI();
        horloge.addObservateur(new Observateur()
        {
            public void update(String heure)
            {
                label.setText(heure);
            }
        });
        Font police = new Font("Arial", Font.BOLD,40);
        label.setFont(police);
        label.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(label, BorderLayout.NORTH);
        setVisible(true);
        horloge.run();
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
      new Horloge();
    }
    
}
