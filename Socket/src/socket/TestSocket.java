/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.*;

public class TestSocket {

   public static void main(String[] args) {
      
       try
       {
           Socket sock = new Socket(InetAddress.getLocalHost(), 80);
           BufferedInputStream bis = new BufferedInputStream(sock.getInputStream());
           String content = "";
           int stream;
           while((stream = bis.read())!= -1)
           {
               content += (char)stream;
           }
           
       }catch(Exception e){e.printStackTrace();}
      }
   }
