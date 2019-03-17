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
public class RunImpl implements Runnable{
    private CompteEnBanque cb;
public RunImpl(CompteEnBanque cb){
this.cb = cb;
}
public void run() {
for(int i = 0; i < 25; i++){
if(cb.getSolde() > 0){
cb.retraitArgent(2);
System.out.println("Retrait effectué");
}
}
}}
