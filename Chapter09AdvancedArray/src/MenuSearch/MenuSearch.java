//File name MenuSearch.java
//Written by Ernest Mushinge
//Written on 2/21/15

package MenuSearch;


//this will use JOptionPane and array class
import java.lang.reflect.Array;
import java.util.*;

import javax.swing.*;

public class MenuSearch {

	public static void main(String[] args) {
		//this application  demonstrates several arrays class method. The application will allow the user to enter a menu of entrees
		//that are available for the day at a restaurant. Then the application will present the menu to the user and indicate whether
		//the request is on the menu

		String[] menuChoices = new String[10];// to hold the days menu choices
		String entry = "", menuString = "";//declare two  string valueble one to the user current entry and one to accumulate the entire menu
		int x = 0;//to use as a subscript of an array
		int numEntered;//to hold the number of menu item entered
		int highestSub = menuChoices.length -1;//to hold the highest allowable subscript
		
		// use array.fill method to fill the menu array with z character, if you don't fill it, your search method might give an error
		
		Arrays.fill(menuChoices, "zzzzzzz");//Lowercase z were purposely chosen as the array fill character bCouse they have a higher value
		//than any other character. When the users entries are sorted, the zzzz entries will be at the bottom of the list
		
		//This will print my information to the screen
		
				JOptionPane.showMessageDialog(null, " Ernest Mushinge \n"
						+ " Assign 5\n" + " Java Programming, Spr 2015 CRN 11438,\n"
						+ " Due March 1st, 2015");
		
		//Display the input dialog box, allow the user to quit before entering 10 item by typing "zzz"..zzz is the common programming 
		//technique to check for the user's desire to stop entering data. If the data items are numeric instead of text, you might use
		//a value such as 999. 
		menuChoices[x] = JOptionPane.showInputDialog(null, " Enter an item for today's menu, or zzz to quit:");
		while(!menuChoices[x].equals("zzz") && x < highestSub)
		{
			menuString = menuString + menuChoices[x] + "\n";
			++x;
			
			if(x < highestSub)
			
				menuChoices[x] = JOptionPane.showInputDialog(null, " Enter an item for today's menu, or zzz to quit");
			
			
		}
		
		numEntered = x;
		
		//When the menu is complete, display it for the user and allow the user to make a request
		
		entry = JOptionPane.showInputDialog(null, " Today's menu is:\n" + menuString + " Please make a selection:");
		
		//Sort the array from index position 0 to numEntered so that it is in ascending order prior to using the binarySearch() method. 
		//if you do not sort the array, the result of the binarySearch() method is unpredictable. you could sort the entire array, but it
		//is more efficient to sort only the elements that hold actual menu item.
		
		Arrays.sort(menuChoices, 0, numEntered);
		
		//Use the Arrays.binarySearch() method to search for the requested entry in the previously sorted array. If the method returns a
		//non negative value that is less than the numEntered value, display the message "Excellent choice", other wise display an error msg
		
		x = Arrays.binarySearch(menuChoices, entry);
		if(x >= 0 && x < numEntered)
			JOptionPane.showMessageDialog(null, " Excellent choice");
		else
			JOptionPane.showMessageDialog(null, " Sorry - that item is not on tonight's menu");
			
	}

}
