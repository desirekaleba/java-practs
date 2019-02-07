/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbre;

import java.io.File;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author desire
 */
public class Arbre extends JFrame{
    private JTree arbre;
    private DefaultMutableTreeNode racine;
    public Arbre()
    {
        this.setTitle("Arbre");
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        try {
//On force à utiliser le « look and feel » du système
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//Ici on force tous les composants de notre fenêtre (this) à se redessiner avec le « look and feel » du système
SwingUtilities.updateComponentTreeUI(this);
}
        catch (InstantiationException e) {}
        catch (ClassNotFoundException e) {}
        catch (UnsupportedLookAndFeelException e) {}
        catch (IllegalAccessException e) {}
        this.setVisible(true);
        listRoot();
        
        
    }
    public void listRoot()
    {
        this.racine = new DefaultMutableTreeNode();
        int count = 0;
        for(File file : File.listRoots())
            {
                DefaultMutableTreeNode lecteur = new DefaultMutableTreeNode(file.getAbsolutePath());
                try
                    {
                        for(File nom : file.listFiles())
                            {
                                DefaultMutableTreeNode node = new DefaultMutableTreeNode(nom.getName()+"\\");
                                lecteur.add(this.listFile(nom,node));
                            }
                    } catch(NullPointerException e){}
                this.racine.add(lecteur);
            }
        arbre = new JTree(racine);
        this.getContentPane().add(new JScrollPane(arbre));
    }
    private DefaultMutableTreeNode listFile(File file,DefaultMutableTreeNode node)
        {
            int count = 0;
            if(file.isFile())
                return new DefaultMutableTreeNode(file.getName());
            else
                {
                    File[] list = file.listFiles();
if(list == null)
return new DefaultMutableTreeNode(file.getName());
for(File nom : list){
count++;
//Pas plus de 5 enfants par noeud
if(count < 5){
DefaultMutableTreeNode subNode;
if(nom.isDirectory()){
subNode = new
DefaultMutableTreeNode(nom.getName()+"\\");
node.add(this.listFile(nom, subNode));
}else{
subNode = new DefaultMutableTreeNode(nom.getName());
}
node.add(subNode);
}
}
return node;
                }
            
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbre ar = new Arbre();
        // TODO code application logic here
    }
    
}
