/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draganddraw;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.UIManager;

public class BackPanel extends JPanel implements MouseListener, MouseMotionListener {
	ToolPanel tp;
	int tool=ToolPanel.OVAL;
	boolean start=false;
	Point stPoint=null;
	Point endPoint=null;
	ArrayList<Shape> shapes=new ArrayList<Shape>();
        JButton btn_clear = new JButton("Clear");
	public BackPanel() {
            try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){e.printStackTrace();}
		setLayout(null);
		tp=new ToolPanel(this);
		tp.setBounds(0,0,60,600);
		tp.setBackground(Color.YELLOW);
               btn_clear.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent event){
                       shapes = new ArrayList<Shape>();
                       repaint();
                   }
               });
                tp.add(btn_clear, BorderLayout.SOUTH);

		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		tp.addMouseListener(this);
		add(tp);
		this.setFocusable(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JPanel p=(JPanel) e.getSource();

		if(p==tp)
		{
			System.out.println("Tools");
			Point ploc=e.getPoint();
			tool=tp.getTool(ploc);
			if(tool==ToolPanel.OVAL)
			{
				System.out.println("OVAL");
			}else if(tool==ToolPanel.RECT)
			{
				System.out.println("RECT");
			}
			repaint();
		}else
		{
			for(Shape sh: shapes){
                            if(sh.getBounds().contains(e.getX(), e.getY())){
                                JPanel pann = new JPanel();
                                pann.setBounds(sh.getBounds());
                                pann.setBackground(Color.BLACK);
                                Graphics gg = pann.getGraphics();
                                //
                             repaint();
                            }
                        }

		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(!start)
		{
			stPoint=e.getPoint();
			start=true;
			stPoint=e.getPoint();
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(start)
		{
			endPoint=e.getPoint();
			Shape r=new Shape(tool,stPoint.x,stPoint.y,endPoint.x-stPoint.x,endPoint.y-stPoint.y);
			shapes.add(r);
			start=false;
		}
		repaint();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		if(start)
		{
			endPoint=new Point(x,y);
		}
		repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
            
		}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		Iterator itr =shapes.iterator();
		while(itr.hasNext()) {
			Shape sh = (Shape) itr.next();
			sh.draw(g);
		}
		drawLast(g);
	}
	public void drawLast(Graphics g)
	{
		if(start)
		{
			if(tool==ToolPanel.OVAL)
			{
				if(stPoint!=null && endPoint!=null)
					g.drawOval((int)stPoint.getX(), (int)stPoint.getY(), (int)endPoint.getY()-(int)stPoint.getX(), (int)endPoint.getY()-(int)stPoint.getX());
			}else if(tool==ToolPanel.RECT)
			{
				if(stPoint!=null && endPoint!=null)
					g.drawRect((int)stPoint.getX(), (int)stPoint.getY(), (int)endPoint.getY()-(int)stPoint.getX(), (int)endPoint.getY()-(int)stPoint.getX());
			}
		}
	}
}

