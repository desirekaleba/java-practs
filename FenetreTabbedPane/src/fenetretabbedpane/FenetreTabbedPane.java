/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenetretabbedpane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
public class FenetreTabbedPane extends JFrame {
private JTabbedPane onglet;
private int nb = 0;
private int i = 0;
public FenetreTabbedPane(){
this.setLocationRelativeTo(null);
this.setTitle("Gérer vos conteneurs");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(400, 200);
//Création de plusieurs Panneau
PanneauTabbedPane[] tPan = { new PanneauTabbedPane(Color.RED), new
PanneauTabbedPane(Color.GREEN), new PanneauTabbedPane(Color.BLUE)};
//Création de notre conteneur d'onglets
onglet = new JTabbedPane();

for(PanneauTabbedPane pan : tPan){
//Méthode d'ajout d'onglet
onglet.add("Onglet n° "+(++i), pan);
//Vous pouvez aussi utiliser la méthode addTab
//onglet.addTab("Onglet n° "+(++i), pan);
}
JButton b = new JButton("Ajouter");
b.addActionListener(new ActionListener()
{
    public void actionPerformed(ActionEvent event)
    {
        int se = onglet.getSelectedIndex();
        onglet.add("Onglet N " +(++i), new PanneauTabbedPane(Color.GRAY));
    }
});
JButton b2 = new JButton("Effacer");
b2.addActionListener(new ActionListener()
{
    public void actionPerformed(ActionEvent event)
    {
        int selected = onglet.getSelectedIndex();
        if(selected>0)onglet.remove(selected);
    }
});
JPanel sud = new JPanel();
sud.add(b);
sud.add(b2);
//On passe ensuite les onglets au content pane
this.getContentPane().add(onglet);
this.getContentPane().add(sud, BorderLayout.SOUTH);
this.setVisible(true);
} 
public static void main(String[] args){
FenetreTabbedPane fen = new FenetreTabbedPane();
}
}