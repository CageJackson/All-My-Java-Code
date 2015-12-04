//File name JBoxAround.java
//Written by Ernest Mushinge
//Written on 4/26/15

package JBoxaroung;
//Using FontMetrics Method to Place a Border Around
//a String

//Next you use the FontMetrics methods to draw a rectangle
//around a string. Instead of guessing at appropriate pixel position, you
//can use the height and width of the string to create a box
//with borders placed symmetrically around the string

import javax.swing.*;
import java.awt.*;

public class JBoxAround extends JFrame{
	
	//Enter the following statements to add a string, a font, and variables to hold
	//the font metrics and x-and y- coordinates:
	
	String movieQuote = new String("An offer he can't refuse");
	Font serifItalic = new Font("Serif", Font.ITALIC, 20);
	int leading, ascent, height, width;
	int x = 40, y = 60;
	
	
	//Create the following named constant that holds a number indicating
	//the dimensions in pixels of the rectangle that you draw around the string:
	
	static final int BORDER = 5;
	
	//Add a constructor

	public JBoxAround() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	//Add the following paint() method, which sets the font, draws the String,
	// and obtains the font metrics:
	
	public void paint(Graphics gr)
	{
		super.paint(gr);
		gr.setFont(serifItalic);
		gr.drawString(movieQuote, x, y);
		leading = gr.getFontMetrics().getLeading();
		ascent = gr.getFontMetrics().getAscent();
		height = gr.getFontMetrics().getHeight();
		width = gr.getFontMetrics().stringWidth(movieQuote);
		
		//Draw a rectangle around the string using the following drawRect() method.
		//In the text book, figure 16-31 on page 919(Joyce Farrel(Java programming)), the 
		//x- and y- coordinates of the upper-left edge are set at x - BORDER, y- (ascent + leading + BORDER).
		//The proper width and height are then determined to draw a uniform rectangle around the string.
		
		//The values of the x- and y- coordinates used in the drawString() method indicate the left
		//side of the baseline of the first character in the String.
		//You want to position the upper-left corner of the rectangle five pixels to the left of the String, so
		// the first argument to drawRect() is five less than x, or x- BORDER. The second argument to drawRec()
		//is the y-coordinate of the String minus the ascent of the string, minus the leading of the string.
		//minus five, or y-(ascent + leading + BORDER). The final two arguments to drawRec() are the width and
		//height of the rectangle. The width is the string's width plus five pixels on the left and five pixels
		//on the right. The height of the rectangle is the string's height, plus five pixels above
		//the String and five pixels below the String
		
		gr.drawRect(x-BORDER, y-(ascent + leading + BORDER), width + 2* BORDER, height+2*BORDER);
	}
	
	
	//Main method
	public static void main(String[] args) {
		JBoxAround frame = new JBoxAround();
		frame.setSize(330, 100);
		frame.setVisible(true);
		
		//Experiment with changing the contents of the String, the x and y starting coordinates
		//and the value of BORDER constant. Confirm that the rectangle is drawn symmetrically around
		//any String object.

	}

}
