//File name Menu2.java
	//Written by Ernest Mushinge
	//Written on 03/8/15


//this class automatically throws exceptions

import javax.swing.*;
public class Menu2 
{
	//this is an array that stores entreeChoice
	//protected access specifier allow the extended classes to access the array
	protected String[] entreeChoice = {"Rosemary Chicken", "Beef Wellington", "Maine Lobster"};
	
	private String menu = "";
	private int choice;
	
	//This array list have characters that can hold the first letter of each of the entries in the menu. 
		protected char initial[] = new char[entreeChoice.length];
	//is to create two methods that throw exception but don't catch them
	//this is a method that will display the menu to the user
	public String displayMenu()
	{
	
		for(int x = 0; x < entreeChoice.length; ++x)
		{
			menu = menu + "\n" + (x +1) + " for " + entreeChoice[x];
			
			//add a statement that takes the first character of each entreeChoice and stores
			//in the corresponding element of the initial array
			//At the end of for loop, the initial array holds the first character of each available entry
			
			initial[x] = entreeChoice[x].charAt(0);
		}
		
		//String input = JOptionPane.showMessageDialog(null, "Type your selection, then press Enter," + menu);
		
		String input = JOptionPane.showInputDialog(null, "Type your selection, then press Enter," + menu);
		
		//add a loop that compares the first letter of the user's choice to each of the initials of valid
		//menu options. If a match is found throws a new instance of the MenuException class that uses the corresponding
		//entry as its String argument.In other words, when this thrown MenueException is caught by another method, the
		//assumed entry is the String returned by the getMessage() method. By placing this test before the call to parseInt(), 
		//you cause entry of R,B,or M to throw a MenuException before they can cause a NumberFormatException. 
		for(int y=0; y < entreeChoice.length; ++y)
		{
			if(input.charAt(0) == initial[y])
				throw(new MenuException(entreeChoice[y]));
		}
		choice = Integer.parseInt(input);
		return(entreeChoice[choice-1]);
	}

	//You add this clause because you are going to add code that throws such an exception
	throws MenuException
}
