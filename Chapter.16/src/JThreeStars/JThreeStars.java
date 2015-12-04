//File name JThreeStars.java
//Written by Ernest Mushinge
//Written on 4/27/15

package JThreeStars;

//This application will copy an area containing a shape that
//you want to appear several times on JFrame
//By copying, you do not have to re-create the shape each time
//will use the copyArea() method
import javax.swing.*;

import java.awt.*;
import java.awt.color.*;

public class JThreeStars extends JFrame {

	// Add the following statement which create a polygon in the shape
	// of the star

	int xPoints[] = { 42, 52, 72, 52, 60, 40, 15, 28, 9, 32, 42 };
	int yPoints[] = { 38, 62, 68, 80, 105, 85, 102, 75, 58, 60, 38 };

	Polygon aStar = new Polygon(xPoints, yPoints, xPoints.length);

	// add a constructor that sets a default close operation

	public JThreeStars() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// Add the following paint() method, which sets a color, draws a star
	// and then draws two additional identical stars

	public void paint(Graphics star) {
		super.paint(star);
		;// I removed a super in front of paint
		star.setColor(Color.BLUE);
		star.drawPolygon(aStar);
		star.copyArea(0, 0, 75, 105, 80, 40);
		star.copyArea(0, 0, 75, 105, 40, 150);

	}

	public static void main(String[] args) {

		JThreeStars frame = new JThreeStars();
		frame.setSize(200, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
