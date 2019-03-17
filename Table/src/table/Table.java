/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author desire
 */
public class Table extends JFrame{
    public Table()
    {
        this.setSize(200,150);
        this.setTitle("tableau");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        Object[][] data = 
            {
                {"Deska","19","M"},
                {"Raissa","20","F"},
                {"Alain","19","M"},
                {"Dieume","19","M"}
            };
        String title[]={"Nom","Age","Sexe"};
        JTable tab = new JTable(data,title);
        this.getContentPane().add(new JScrollPane(tab));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Table t = new Table();
        // TODO code application logic here
    }
    
}
