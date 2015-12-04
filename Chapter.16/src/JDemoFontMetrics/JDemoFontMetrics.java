//File name JDemoFontMetrics.java
//Written by Ernest Mushinge
//Written on 4/26/15

package JDemoFontMetrics;
//This program demonstrates FontMetrics methods. You will create three
// Font objects and display their metrics

import javax.swing.JFrame;
import java.awt.*;

public class JDemoFontMetrics extends JFrame {
	
	//Type the following code to create a String and a few fonts to use for demonstration
	//purposes
	
	String movieQuote = new String("Go ahead, make my day");
	Font courierItalic =  new Font("Courier New", Font.ITALIC, 16), timesPlain = new Font("Times New Roman", Font.PLAIN, 16),
			ScriptBold = new Font("Freestyle Script", Font.BOLD, 16);
	
	//Add the following code to define four integer variables to hold the four font
	//measurements, and two integer variables to hold the current horizontal and
	//vertical output position within the JFrame
	
	int ascent, descent, height,leading;
	int x = 20, y = 50;
	
	//Within the JFrame, you draw Strings positioned 40 pixels apart vertically. 
	//After each of those Strings, the Strings that hold the statistics will be 15 pixels apart. 
	//Type the following statements to create constants to hold these vertical increase values.
	
	final int INCREASE_SMALL = 15;
	final int INCREASE_LARGE = 40;
	
	//add a constructor as follow

	public JDemoFontMetrics() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//Add the following statements to start writing a paint() method. Within the
	//method, you set the Font to courierItalic, draw the phrase String to show
	//a working example of the font, and then call a displayMetrics() method
	//that you will write in later on. Pass the Graphics object to the displayMetrics()
	//method, so the method can discover the sizes associated with the current font.
	//Perform the same three steps using the timesPlain and ScriptBold fonts
	
	public void paint(Graphics pen)
	{
		super.paint(pen);
		pen.setFont(courierItalic);
		pen.drawString(movieQuote, x, y);
		displayMetrics(pen);
		pen.setFont(timesPlain);
		pen.drawString(movieQuote, x, y+= INCREASE_LARGE);
		displayMetrics(pen);
		pen.setFont(ScriptBold);
		pen.drawString(movieQuote, x, y+= INCREASE_LARGE);
		displayMetrics(pen);
		
		
	}
	
	//Next, add the header and opening curly brace for the displayMetrics()
	//method. The method will receive a Graphics object from the paint()method.
	//Add the following statements to call the four getFontMetrics() method
	//to obtain values for the leading, ascent, descent, and height variables
	
	public void displayMetrics(Graphics metrics)
	{
		leading = metrics.getFontMetrics().getLeading();
		ascent = metrics.getFontMetrics().getAscent();
		descent = metrics.getFontMetrics().getDescent();
		height = metrics.getFontMetrics().getHeight();
	
	
	//Add the following four drawString() statements to display the value.
	//Use the expression y += INCREASE_SMALL to change the vertical position of each
	//String by the constant
		
		metrics.drawString("Leading is " + leading, x, y += INCREASE_SMALL);
		metrics.drawString("Ascent is " + ascent, x, y += INCREASE_SMALL);
		metrics.drawString("Descent is " + descent, x, y += INCREASE_SMALL);
		metrics.drawString("Height is " + height, x, y += INCREASE_SMALL);
	
	}
	
	
//Main method
	public static void main(String[] args) {
		JDemoFontMetrics frame = new JDemoFontMetrics();
		frame.setSize(250, 350);
		frame.setVisible(true);

	}

}
