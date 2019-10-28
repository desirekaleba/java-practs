/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horloge;
import java.util.*;


/**
 *
 * @author desire
 */
public class HorlogeI implements Observable{
    private Calendar cal;
    private String H;
    private ArrayList<Observateur> listObservateur = new ArrayList<Observateur>();
    public void run()
    {
    while(true)
    {
       this.cal = Calendar.getInstance();
       this.H = this.cal.get(Calendar.HOUR_OF_DAY) +" : "+
               //les minutes
               (
               this.cal.get(Calendar.MINUTE)<10 ? "0"+this.cal.get(Calendar.MINUTE)
               : this.cal.get(Calendar.MINUTE)
               )+" : "+
               //les secondes
               (
               this.cal.get(Calendar.SECOND)<10 ? "0"+this.cal.get(Calendar.SECOND)
               : this.cal.get(Calendar.SECOND)
               );
               updateObservateur();
    }
    }
    public void addObservateur(Observateur obs)
    {
        listObservateur.add(obs);
    }
    public void updateObservateur()
    {
        for(Observateur oo : listObservateur)
        {
            oo.update(H);
        }
    }
    public void delObservateur()
    {
        listObservateur = new ArrayList<Observateur>();
    }
    
}
