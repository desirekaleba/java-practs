/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author desire
 */
class Exeptionss extends Exception
{
    public Exeptionss(){
    System.out.println("Une exception a ete levee");}
}
public class Exceptions {

    /**
     * @param args the command line arguments
     * 
     */
    public Exceptions(int nombre) throws Exeptionss
    {
        if(nombre==0)
            throw new Exeptionss();
    }
    public static void main(String[] args) {
       
        
    }
    
}
