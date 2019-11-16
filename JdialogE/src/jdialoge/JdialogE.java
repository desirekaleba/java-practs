/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdialoge;
import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author desire
 */
public class JdialogE extends JDialog{
    public JdialogE(JFrame parent, String title, boolean model)
    {
        super(parent,title,model);
        setSize(200, 80);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
