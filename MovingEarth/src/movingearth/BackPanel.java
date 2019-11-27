/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingearth;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import javax.imageio.ImageIO;
public class BackPanel extends JPanel implements ActionListener, Runnable{

	BufferedImage img,imgBall;
	BufferedImage bimage;
	int x=100,y=100;
	BufferedImage [] images;
	//Timer timer;
        
	private static int speed = 100;
	int imgw,imgh;
	int xvel=4,yvel=5;
	int xdir=1,ydir=1;
	int sw=600,sh=600;
	public BackPanel() {
		setLayout(null);	
		takeImage();
		imgw=img.getWidth();
		imgh=img.getHeight();
		imgBall=new BufferedImage(30,30, BufferedImage.TYPE_INT_RGB);
		Graphics g=imgBall.getGraphics();
		g.drawImage(img,0,0,x+imgBall.getWidth(),y+imgBall.getHeight(),0,0,imgw,imgh,this);
	}
	public void takeImage() 
	{
		URL imgURL = getClass().getResource("/earth.jpeg");
		System.out.println(imgURL);
		try {
			img=ImageIO.read(imgURL);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(img,x,y,this);
		//g.drawImage(img,x,y,x+imgw/3,y+imgh/3,0,0,imgw,imgh,this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		x=x+10;
		y=y+10;
		
		repaint();
	}
	@Override
	public void run() {
		 while(true){
	            try{
	            	
	               x=x+xdir*xvel;
	               y=y+ydir*yvel;
	                Thread.sleep(100);
	                repaint();
	            } catch (InterruptedException iex) {
	               
	            }
	        }
	}



}

