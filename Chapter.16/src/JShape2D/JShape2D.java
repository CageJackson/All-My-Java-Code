//File name JShape2D.java
//Written by Ernest Mushinge
//Written on 4/27/15

package JShape2D;

//Next you use java 2D drawing object types to create
//a JFrame that illustrates sample
//rectangles, ovals, arcs and polygons

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class JShape2D extends JFrame {

	
	//add a constructor that sets close on operation
	public JShape2D() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//Enter the following statement to create a paint() method
	//create a Graphics enviroment gr, and cast the Graphics enviroment
	//to a Graphics2D enviroment gr2D
	
	public void paint(Graphics gr)
	{
		super.paint(gr);
		Graphics2D gr2D = (Graphics2D)gr;
		
		//Create a rectangle2D.Float object named rect and rect2. Draw
		//the rect object and fill the rect2 object
		
		Rectangle2D.Float rect = new Rectangle2D.Float(20F, 40F, 40F, 40F);
		Rectangle2D.Float rect2 = new Rectangle2D.Float(20F, 90F, 40F, 40F);
		gr2D.draw(rect);
		gr2D.draw(rect2);
		
		//Create two Elipse2D.Float objects named ellipse and ellipse2.
		//Draw the ellipse object and fill the ellipse2 object
		
		Ellipse2D.Float ellipse = new Ellipse2D.Float(20F, 140F,40F,40F);
		Ellipse2D.Float ellipse2 = new Ellipse2D.Float(20F, 190F,40F,40F);
		gr2D.draw(ellipse);
		gr2D.draw(ellipse2);
		
		//Create two Arc2D.Float objects named ac and ac2. Draw the ac
		//object and fill the ac2 object
		
		Arc2D.Float ac = new Arc2D.Float(20,240,50,50,30,120,Arc2D.PIE);
		Arc2D.Float ac2 = new Arc2D.Float(20,240,50,50,30,120,Arc2D.PIE);
		gr2D.draw(ac);
		gr2D.draw(ac2);
		
		//Create a new generalPath object name pol. Set the starting point of the polygon and create
		//the two additional points. Use the closePath() method
		//to close the polygon by connecting the current pint to the starting pint.
		//Draw the pol object, and then end the method with a curly brace.
		
		GeneralPath pol = new GeneralPath();
		pol.moveTo(20F, 320F);
		pol.lineTo(40F,320);
		pol.lineTo(100F, 400F);
		pol.closePath();
		gr2D.draw(pol);
	}

	//Main method
	public static void main(String[] args) {
		
		JShape2D frame = new JShape2D();
		frame.setSize(100,420);
		frame.setVisible(true);

	}

}
