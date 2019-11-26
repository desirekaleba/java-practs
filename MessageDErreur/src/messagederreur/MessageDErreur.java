/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagederreur;

import javax.swing.JOptionPane;

/**
 *
 * @author desire
 */
public class MessageDErreur {
    private JOptionPane jop1,jop2,jop3;
    public MessageDErreur()
    {
       /*jop1 = new JOptionPane();
       jop1.showMessageDialog(null,"message informatif","information",JOptionPane.INFORMATION_MESSAGE);
       jop2 = new JOptionPane();
       jop2.showMessageDialog(null,"message preventif", "prevention", JOptionPane.WARNING_MESSAGE);
       jop3 = new JOptionPane();
       jop3.showMessageDialog(null, "message d?erreur","erreur",JOptionPane.ERROR_MESSAGE);*/
        /*jop1 = new JOptionPane();
        String nom = jop1.showInputDialog(null, "Quel est votre nom ? ", "inscription", JOptionPane.PLAIN_MESSAGE);
        jop2 = new JOptionPane();
        jop2.showMessageDialog(null, "votre nom est "+nom,"inscrits",JOptionPane.INFORMATION_MESSAGE);*/
        String[] sexe = {"masculin", "feminin", "indetermine"};
        jop1 = new JOptionPane();
        String nom = (String)jop1.showInputDialog(null,"quel est votre sexe ", "votre sexe",JOptionPane.QUESTION_MESSAGE, null,sexe,sexe[2]);
        jop2 = new JOptionPane();
        jop2.showMessageDialog(null, "votre sexe est "+nom, "selectionne",JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MessageDErreur();
        // TODO code application logic here
    }
    
}
