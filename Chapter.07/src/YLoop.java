//File name YLoop.java
//Written by Ernest Mushinge
//Written on 2/21/15

import javax.swing.JOptionPane;

public class YLoop {

	public static void main(String[] args) {
		
		final char YES_OPTION = 'y';
		String entryString;
		char entryChar;
		int count = 0;
		
		//This will print my information to the screen
		
		JOptionPane.showMessageDialog(null, " Ernest Mushinge \n"
				+ " Assign 5\n" + " Java Programming, Spr 2015 CRN 11438,\n"
				+ " Due March 1st, 2015");
		
		//This will accept the String response from user, and use the charAt() method to extract the first character
		entryString = JOptionPane.showInputDialog(null, " Do you want to see a greeting? ");
		entryChar = entryString.charAt(0);
		
		//this loop will compare the entry to String's first character to 'y'
		
		while(Character.toLowerCase(entryChar)==YES_OPTION)
		{
			++count;
			entryString = JOptionPane.showInputDialog(null, " Greeting # " + count + " Hello!\n Do you want to see another greeting? ");
			entryChar = entryString.charAt(0);
			
		}
		

	}

}
