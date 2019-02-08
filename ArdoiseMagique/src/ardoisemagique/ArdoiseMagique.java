/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardoisemagique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/**
 *
 * @author desire
 */
public class ArdoiseMagique extends JFrame{
    private JMenuBar mPrinc = new JMenuBar();
    private JMenu fichier = new JMenu("Fichier");
    private JMenuItem effacer = new JMenuItem("Effacer");
    private JMenuItem quitter = new JMenuItem("Quitter");
    private JMenu edition = new JMenu("Edition");
    private JMenu formeDuPointeur = new JMenu("Forme du pointeur");
    private JMenuItem rond = new JMenuItem("Rond");
    private JMenuItem carre = new JMenuItem("Carré");
    private JMenu couleurDuPointeur = new JMenu("Couleur du pointeur");
    private JMenuItem rouge = new JMenuItem("Rouge");
    private JMenuItem vert = new JMenuItem("Vert");
    private JMenuItem bleu = new JMenuItem("Bleu");
    private JToolBar toolBar = new JToolBar();
    private JButton b = new JButton("lancer");
    private JButton b1 = new JButton("stopper");
    JPanel pan = new JPanel();
    
    public ArdoiseMagique()
    {
        this.setSize(400,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.fichier.add(effacer);
        this.fichier.addSeparator();
        this.fichier.add(quitter);
        this.formeDuPointeur.add(rond);
        this.formeDuPointeur.add(carre);
        this.couleurDuPointeur.add(rouge);
        rouge.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                    {
                       pan.setBackground(Color.RED);
                    }
            });
        this.couleurDuPointeur.add(vert);
        vert.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                    {
                       pan.setBackground(Color.GREEN);
                    }
            });
        this.couleurDuPointeur.add(bleu);
        bleu.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                    {
                       pan.setBackground(Color.BLUE);
                    }
            });
        this.edition.add(formeDuPointeur);
        this.edition.add(couleurDuPointeur);
        this.mPrinc.add(fichier);
        this.mPrinc.add(edition);
        this.toolBar.add(b);
        this.toolBar.addSeparator();
        this.toolBar.add(b1);
        toolBar.setPreferredSize(new Dimension(this.getWidth(),20));
        pan.setBackground(Color.red);
        this.getContentPane().add(pan, BorderLayout.CENTER);
        this.getContentPane().add(toolBar, BorderLayout.NORTH);
        this.setJMenuBar(mPrinc);
        this.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArdoiseMagique ad = new ArdoiseMagique();
        // TODO code application logic here
    }
    
}
