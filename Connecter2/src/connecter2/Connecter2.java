/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connecter2;
import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author desire
 */
public class Connecter2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        File f = new File("test.txt");
System.out.println("Chemin absolu du fichier : " +
f.getAbsolutePath());
System.out.println("Nom du fichier : " + f.getName());
System.out.println("Est-ce qu'il existe ? " + f.exists());
System.out.println("Est-ce un répertoire ? " + f.isDirectory());
System.out.println("Est-ce un fichier ? " + f.isFile());
System.out.println("Affichage des lecteurs à la racine du PC :");
for(File file : f.listRoots())
{
System.out.println(file.getAbsolutePath());
try {
int i = 1;
//On parcourt la liste des fichiers et répertoires
for(File nom : file.listFiles()){
//S'il s'agit d'un dossier, on ajoute un "/"
System.out.print("\t\t" + ((nom.isDirectory()) ?
nom.isDirectory() ? nom.listFiles()+"//"+nom.getName() : "+"+nom.getName() : nom.getName()));
if((i%2) == 0){
System.out.print("\n");

}i
++;
}System.out.println("\n");
} catch (NullPointerException e) {
//L'instruction peut générer une NullPointerException
//s'il n'y a pas de sous-fichier !
}
}
}
    
}
