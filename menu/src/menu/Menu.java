/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author desire
 */
public class Menu extends JFrame{
    private JMenuBar menuPrinc = new JMenuBar();
    private JMenu Animation = new JMenu("Animation");
    private JMenuItem lancer = new JMenuItem("Lancer");
    private JMenuItem interrompre = new JMenuItem("Interrompre");
    private JMenuItem quitter = new JMenuItem("Quitter");
    private JMenu forme = new JMenu("Forme");
    private JMenu forme2 = new JMenu("Quelle forme");
    private JMenu Apropos = new JMenu("A propos");
    private  JRadioButtonMenuItem rond = new JRadioButtonMenuItem("rond");
    private  JRadioButtonMenuItem carre = new JRadioButtonMenuItem("carre");
    private  JRadioButtonMenuItem triangle = new JRadioButtonMenuItem("triangle");
    private  JRadioButtonMenuItem etoile = new JRadioButtonMenuItem("etoile");
    public Menu()
    {
        this.setTitle("Menu");
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.Animation.add(lancer);
        lancer.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                    {
                        JOptionPane jop = new JOptionPane();
                        int op = jop.showConfirmDialog(null, "voulez vous lancer l'animation?", "lancement",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if(op==JOptionPane.OK_OPTION){System.out.println("lancememt en cours...");}
                    }
            });
        this.Animation.add(interrompre);
        
        this.Animation.add(quitter);
       
        quitter.addActionListener(new ActionListener()
            {public void actionPerformed(ActionEvent event)
                {
                    System.exit(0);
                }
            });
        this.forme.add(forme2);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rond);
        bg.add(carre);
        bg.add(triangle);
        bg.add(etoile);
        this.forme2.add(rond);
        rond.setSelected(true);
        this.forme2.add(carre);
        this.forme2.add(triangle);
        this.forme2.add(etoile);
        this.menuPrinc.add(Animation);
        this.menuPrinc.add(forme);
        this.menuPrinc.add(Apropos);
        
        this.setJMenuBar(menuPrinc);
        this.setVisible(true);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu m = new Menu();
    }
    
}
