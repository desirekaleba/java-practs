/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inettest;

import java.util.Enumeration;
import java.net.*;

/**
 *
 * @author desire
 */
public class InetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       try{
        Enumeration<NetworkInterface> list = NetworkInterface.getNetworkInterfaces();
        while(list.hasMoreElements())
        {
            NetworkInterface ni = list.nextElement();
            Enumeration<InetAddress> listAddress = ni.getInetAddresses();
                    while(listAddress.hasMoreElements())
                    {
                        InetAddress address = listAddress.nextElement();
                        showInformations(address);
                    }
        }
       }catch(Exception e){e.printStackTrace();}
       
               }
    public static void showInformations(InetAddress address)
    {
        System.out.println("-----------------------------------------");
        System.out.println("INFORMATION DE : "+ address.getHostName());
        System.out.println("-----------------------------------------");
        System.out.println("Nom : "+address.getHostName());
        System.out.println("Address : "+address.getHostAddress());
        System.out.println("Nom canonique : "+address.getCanonicalHostName());
        byte bAddress[] = address.getAddress();
        String ip = "";
        for(byte b : bAddress)
            ip += (b & 0xFF)+".";
        System.out.println(" Address ip depuis tableau de byte : "+ip);
        
    }
    
}
