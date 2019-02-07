package adressage;
import java.io.BufferedReader;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Serveur {
public static void main(String[] args)
{
    ServerSocket socket;
    try
    {
        socket = new ServerSocket(2000);
        Thread t = new Thread(new A(socket));
    }catch(Exception e){e.printStackTrace();}
}
}
class A implements Runnable
{
    ServerSocket serveur;
    Socket socket;
    int nb = 1;
    public A(ServerSocket s)
    {
        serveur = s;
    }
    public void run()
    {
        try
        {
            while(true){
            socket = serveur.accept();
            System.out.println("client"+nb+"connected");
            nb++;
            socket.close();
            serveur.close();}
        }catch(Exception e){e.printStackTrace();}
    }
}