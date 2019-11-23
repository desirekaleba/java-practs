/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lookup;
import java.net.InetAddress;
import java.net.MalformedURLException;
import static java.rmi.Naming.lookup;
import java.rmi.NotBoundException;
import java.rmi.UnknownHostException;
import java.util.*;
/**
 *
 * @author desire
 */
public class Lookup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.net.UnknownHostException {
        
      Scanner sc = new Scanner(System.in);

      while(true){
         System.out.println("---------------------------------------------------");
         System.out.println("Saisissez une adresse IPV4 ou un nom de domaine : ");
         System.out.println("---------------------------------------------------");
         String hote = sc.nextLine();
         if(hote.equalsIgnoreCase("fin")){
            break;
         }
         System.out.println("Voici le résultat trouvé : ");
         System.out.println(lookup(hote));
      }
      
      System.out.println("Fin du programme");
   }
   
   public static String lookup(String host) throws java.net.UnknownHostException{
      String result = "";
      
      //Il s'agit d'un nom de domaine et non d'une adresse IPV4
      if(host.matches("[a-zA-Z\\.]+")){
          result = InetAddress.getByName(host).getHostAddress();
      }
      //IP V4
      else{
          result = InetAddress.getByName(host).getHostName();
      }  
      return result;

    }
    
}
