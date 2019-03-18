/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testrechdossier;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author desire
 */
public class FolderScanner {
    Path path;
    String filter = "*";
    long result;
    public FolderScanner(){}
    public FolderScanner(Path p, String f)
    {
        path=p;
        filter=f;
    }
    public long sequentialScan() throws ScanException
    {
        if(path==null || path.equals(""))
            throw new ScanException("chemin d'acces invalide");
        System.out.println("scan du dossier "+path+" a la recherche du dossier portant l'extention "+filter);
        try(DirectoryStream<Path> listing = Files.newDirectoryStream(path))
        {
           for(Path nom : listing)
           {
               if(Files.isDirectory(nom.toAbsolutePath()))
               {
                   FolderScanner f = new FolderScanner(nom.toAbsolutePath(), filter);
                   result += f.sequentialScan();
               }
           } 
        }catch(Exception e){e.printStackTrace();}
        try(DirectoryStream<Path> listing = Files.newDirectoryStream(path, this.filter))
            {
                for(Path nom : listing)
                    result++;
            }catch(Exception e){e.printStackTrace();}
        return result;
    }
}
