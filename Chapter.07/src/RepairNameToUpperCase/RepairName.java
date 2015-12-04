
//File name RepairName.java
//Written by Ernest Mushinge
//Written on 2/21/15

package RepairNameToUpperCase; //This is just for my packaging of my code

import javax.swing.*;//import javax.swing.*;

public class RepairName {

	public static void main(String[] args) {
		
		String name, saveOriginalName;
		int stringLength;
		int i;
		char c;
		
		//To display my name and class
		JOptionPane.showMessageDialog(null, " Ernest Mushinge \n"
				+ " Assign 5\n" + " Java Programming, Spr 2015 CRN 11438,\n"
				+ " Due March 1st, 2015");
		
		//To prompt the user
		name = JOptionPane.showInputDialog(null, " Please enter your first and last name ");

		//Store the name entered in the saveOriginalName, calculate the length of the name entered
		
		saveOriginalName = name;
		stringLength = name.length();
		
		for( i= 0; i< stringLength; ++i)
		{
			c = name.charAt(i);//this will loop through every character of stringLength or i in a name
			if(i == 0)
			{
				c = Character.toUpperCase(c);
				name = c + name.substring(1, stringLength);
			}
			
			//After the first character has been converted to capital letter, other letters after the space are converted too
			
			else
				if(name.charAt(i) == ' ')
	
			{
			    ++i;	
			    c = name.charAt(i);
			    c = Character.toUpperCase(c);
			    name = name.substring(0, i) + c + name.substring(i +1, stringLength);
				
			}
		}
		
		//after every character has been examined,then the result is displayed
		
		JOptionPane.showConfirmDialog(null, " Original name was " + saveOriginalName + " \n Repaired name is " + name );

		
		
		
	}

}
