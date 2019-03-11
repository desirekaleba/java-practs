/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketmethods;
import java.net.*;
/**
 *
 * @author desire
 */
public class SocketMethods {

    
   static Socket s = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
         s = new Socket(InetAddress.getLocalHost(),80);
        System.out.println("Port serveur : "+ s.getPort());
        System.out.println("Port client : "+s.getLocalPort());
        System.out.println("Nom de l'hote distant : "+s.getInetAddress().getHostName());
        System.out.println("Address de l'hote distant : "+s.getInetAddress().getHostAddress());
        System.out.println("Address socket de l'hote distant : "+s.getRemoteSocketAddress());
    }catch(Exception e){e.printStackTrace();}
    finally
        {
            
     if( s != null)
                {
                    try
                   {
                  s.close();
              
                    }catch(Exception e){e.printStackTrace(); s = null;}
                }
        } 
    }
    
}
