//File name JDemoCreateGraphicsObject3.java
//Written by Ernest Mushinge
//Written on 4/25/15

//This program uses Graphics object named pen to draw
//a String on the Screen.The text of the String will appear
//to move each time a JButton is clicked

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;

//This class extends JFrame and uses the mouse. The class defines a string
//, a JButton, a Font, and four integers: two to hold x - and y- coordinates, one to act
//as a constant size to measure the gap between lines displayed on the screen, and on to
//hold the size of the JFrame

//Next you add a simple line drawing to the program. The drawing appears after the user clicks the JButton enough
//times to disable the JButton

public class JDemoCreateGraphicsObject3 extends JFrame implements ActionListener{

	String movieQuote = new String("Here's looking at you, kid");
	JButton moveButton = new JButton("Move It");
	Font broadwayFont = new Font("Broadway", Font.ITALIC, 12);
	int x = 10, y= 50;
	final int GAP = 20;
	final int SIZE = 400;
	
	//this is to avoid drawing beyond the size of the frame
	final int LIMIT = SIZE - 50;
	
	//Type the following constructor; it changes the background color and sets the layout of the
	//container, adds the JButton, prepares the JFrame to listen for JButton events,
	//sets the close operation, and sets the size of the frame
	
	public JDemoCreateGraphicsObject3 ()
	{
		Container con = getContentPane();
		con.setBackground(Color.YELLOW);
		con.setLayout(new FlowLayout());
		con.add(moveButton);
		moveButton.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SIZE, SIZE);
	}
	
	//Within the actionPerformed() method, you can create a Graphic object and use it
	//to draw the String on the screen. Each time a user clicks the JButton, the x- and Y- coordinates
	//both increase, so a copy of the move quote appears slightly below and to the right of the previous one
	
	public void actionPerformed(ActionEvent e)
	{
		Graphics pen = getGraphics();
		pen.setFont(broadwayFont);
		pen.setColor(Color.MAGENTA);
		pen.drawString("movieQuote", x+=GAP, y+=GAP);
		
		//to make sure you don't draw beyond limit, the following code is necessary
		///////////////////////////////////////////
		//Replace the current if else structure that tests whether y is less that LIMIT
		//in the ActionPerformed() method. Instead, use the following code, which
		//tests the value of y and either draws the quote or disables the JButton
		//and draws a picture. Set the drawing color to black, and create simple drawing of 
		//a stick person that includes a head, torso and two legs;
		
		/*if(y<LIMIT)
			pen.drawString(movieQuote, x+=GAP, y+=GAP);
		
		else
			moveButton.setEnabled(false);*/
		
		if(y<LIMIT)
			pen.drawString(movieQuote, x+=GAP, y+=GAP);
		pen.setColor(Color.BLACK);
		pen.drawOval(50, 170, 70, 70);
		pen.drawLine(85, 240, 90, 280);
		pen.drawLine(90, 280, 60, 380);
		pen.drawLine(90, 840, 110, 380);
		
		
	}
	//Main method
	
	public static void main(String[] args)
	{
		JDemoCreateGraphicsObject3 frame = new JDemoCreateGraphicsObject3();
		frame.setVisible(true);
	}
}
