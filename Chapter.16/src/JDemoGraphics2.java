//File name JDemoGraphics2.java
//Written by Ernest Mushinge
//Written on 4/25/15


//This class extends JFrame and uses the drawString() method

import javax.swing.*;
import java.awt.*;
import java.awt.color.*;//makes the application to use color

public class JDemoGraphics2 extends JFrame {
	
	//Declare a String by typing the following
	String movieQuote = new String("You talkin' to me?");
	
	//add a font object
	
	Font bigFont = new Font("Boopee", Font.ITALIC, 30);
	
	//Add a constructor to set the default close Operation:
	
	public JDemoGraphics2()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//Type the following paint() method that calls the super() method and uses
	//a Graphic object to draw the movieQuote String
	
	public void paint(Graphics gr)
	{
		super.paint(gr);
		//Within the paint() method after the call to super
		//type the statement so the gr object can use the font and the color 

		gr.setFont(bigFont);
		gr.setColor(Color.MAGENTA);
		gr.drawString(movieQuote, 30, 100);
		
		//Following the existing drawString() method call, type lines
		//to change the color and add another call to the drawString() method
		gr.setColor(Color.BLUE);
		gr.drawString(movieQuote, 60, 140);
	}

	//main method
	public static void main(String[] args) {
		
		JDemoGraphics2 frame = new JDemoGraphics2();
		frame.setSize(280, 200);
		frame.setVisible(true);

	}

}
