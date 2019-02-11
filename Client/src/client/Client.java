package client;
import java.net.*;
import java.io.*;

public class Client
{
    public static void main(String[] args)
    {
       Socket socket;
       try
       {
          socket = new Socket("localhost",2009);
          socket.close();
       }catch(Exception e){e.printStackTrace();}
    }
    
}