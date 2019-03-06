/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrollpane;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author desire
 */
public class ScrollPane extends JFrame{
    private JScrollPane scroll;
    private JTextArea jta = new JTextArea();
    private JButton b = new JButton("OK");
    private JOptionPane jp = new JOptionPane();
    public ScrollPane()
    {
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        scroll = new JScrollPane(jta);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
                    
            {
                    jp.showMessageDialog(null,"vous avez ecrit : "+jta.getText(),"message",JOptionPane.PLAIN_MESSAGE);
                }
        });
        this.getContentPane().add(scroll, BorderLayout.CENTER);
        this.getContentPane().add(b,BorderLayout.SOUTH);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ScrollPane p = new ScrollPane();
    }
    
}
