/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author desire
 */
public class Test extends Thread{
    public static void main(String[] args) 
    {
        CompteEnBanque cb = new CompteEnBanque();
        Thread t = new Thread(new RunImpl(cb));
        t.start();
    }
    
}
