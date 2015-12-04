
//File name CreateJFramWithComponents.java
//Written by Ernest Mushinge
//Written on 4/10/15

package JFrameWithComponents;
import javax.swing.*;
//This application will create a new JFrame to use JFrameWithComponents
public class CreateJFrameWithComponents {

	public static void main(String[] args)
	{
		
		JAction2 aFrame = new JAction2();
		
		final int WIDTH = 350;
		final int HEIGHT = 100;
		
		
		aFrame.setSize(WIDTH, HEIGHT);
		aFrame.setVisible(true);
		
	}
}
