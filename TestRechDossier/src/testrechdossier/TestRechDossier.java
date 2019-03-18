/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testrechdossier;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author desire
 */
public class TestRechDossier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path chemin = Paths.get("D:\\deska\\films");
        String filter = "*.avi";
        FolderScanner fs = new FolderScanner(chemin, filter);
        try
        {
            Long start = System.currentTimeMillis();
            Long Res = fs.sequentialScan();
            Long end = System.currentTimeMillis();
            System.out.println("il y a "+Res+" fichier(s) portant l'extention "+filter);
            System.out.println("temps d'execution "+(end-start)+" millisecond(s)");
        }catch(ScanException e){e.printStackTrace();}
    }
    
}
