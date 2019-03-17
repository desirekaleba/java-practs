
package draganddraw;

import javax.swing.*;
import java.awt.*;
import java.util.*;
public class DragAndDraw {

    public DragAndDraw(){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){e.printStackTrace();}
    }
    public static void main(String[] args) {
        
        JFrame mainWindow = new JFrame();
		mainWindow.setTitle("My Drawing Graphics");
		mainWindow.setBounds(200,200,600,630);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainWindow.setLocationRelativeTo(null);
		 
		BackPanel dc=new BackPanel();
		mainWindow.getContentPane().add(dc);
		dc.setBackground(Color.WHITE);
			
		mainWindow.setVisible(true);
    }
    
}
