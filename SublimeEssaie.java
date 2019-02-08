import javax.swing.*;
import java.awt.*;
import java.io.*;

public class SublimeEssaie extends JFrame
{
	private JPanel pan;
	private JTextField field1;
	private JPasswordField field2;
	private Jlabel lab1, lab2;
	public SublimeEssaie()
	{
		this.setSize(300, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		lab1 = new JLabel("Enter your name : ");
		lab2 = new JLabel("Enter your passWord : ");
		field1 = new JTextField();
		field2 = new JPasswordField();
		pan.add(lab1);
		pan.add(field1);
		pan.add(lab2);
		pan.add(field2);
		this.getContentPane().add(pan);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new SublimeEssaie();
		
	}
}