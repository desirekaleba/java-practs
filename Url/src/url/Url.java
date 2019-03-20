/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url;
import java.net.*;

/**
 *
 * @author desire
 */
public class Url {

    
    public static void main(String[] args) {
        try
        {
            URL url = new URL("http://www.google.com:82");
            showInformations(url);
        }catch(Exception e){e.printStackTrace();}
    }
    public static void showInformations(URL url)
    {
        System.out.println(" Authority : " + url.getAuthority());
        System.out.println(" Default port : " + url.getDefaultPort());
        System.out.println(" port : " + url.getPort());
        System.out.println(" protocol : " + url.getProtocol());
        System.out.println(" Host : " + url.getHost());
        
    }
    
}
