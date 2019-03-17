/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draganddraw;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author desire
 */
public class Shape extends Rectangle {
	int shape=-1;
	
	public Shape(int type,int x,int y,int width,int height)
	{
		super(x,y,width,height);
		shape=type;
	}
	public int getShape()
	{
		return shape;
	}
	public void draw(Graphics g)
	{
		if(shape==ToolPanel.OVAL)
		{
				g.drawOval(x,y,width,height);
		}else if(shape==ToolPanel.RECT)
		{
			g.drawRect(x,y,width,height);
		}
	}
}
