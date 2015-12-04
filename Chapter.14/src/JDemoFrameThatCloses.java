//File name JDemoFrameThatCloses .java
//Written by Ernest Mushinge
//Written on 4/10/15

import javax.swing.*;
public class JDemoFrameThatCloses {
	
	
	

	public static void main(String[] args) {
		
        //code will be entered to declare a JFram with title, set its size and make it visible
		//if you neglect to set its size, you will see only a title bar of the JFrame(the size is 0 x 0 by default).
		//if you neglect to set the JFrame visible you won't see anything
		
		
		
		JFrame aFrame = new JFrame("This is a frame");
		final int WIDTH = 250;
		final int HEIGHT = 250;
		aFrame.setSize(WIDTH, HEIGHT);
		aFrame.setVisible(true);
		//This will stop the application when you close the form
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
