//File name J2DLine.java
//Written by Ernest Mushinge
//Written on 4/26/15

package J2DLine;

// Next you create a line with a drawing stroke to illustrate how it can
//have different end types and juncture types where lines intersect


//Note that you are importing the java.awt.geom package

import javax.swing.*;

import java.awt.*;
import java.awt.geom.*;
public class J2DLine extends JFrame{

	
	//Add a constructor
	public J2DLine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//Enter the following to creat paint() method, create a Graphics
	//Environment gr, and cast the Graphics enviroment to a Graphics2d enviroment
	//gr2D. Create x- and y-points with the pointed2D.Float class
	
	public void paint(Graphics gr)
	{
		super.paint(gr);
		Graphics2D gr2D = (Graphics2D)gr;
		Point2D.Float pos1 = new Point2D.Float(80, 50);
		Point2D.Float pos2 = new Point2D.Float(20, 100);
		
		//Create a BasicStroke object, and then create a drawing stroke named
		//aStroke.Note that the line width is set to 15pixels, and the endcap style
		//and juncture style are set to CAP_ROUND and JOIN_MITER, respectively
		
		BasicStroke aStroke = new BasicStroke( 15.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
		//Add the following code to create a line between pos1 and pos2 and draw the line
		
		gr2D.setStroke(aStroke);
		Line2D.Float line = new Line2D.Float(pos1, pos2);
		gr2D.draw(line);
	}
	
	//Main method

	public static void main(String[] args) {
		J2DLine frame = new J2DLine();
		frame.setSize(100, 120);
		frame.setVisible(true);

	}

}
