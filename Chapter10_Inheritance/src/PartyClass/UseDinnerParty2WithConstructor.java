    //File name UseDinnerParty2WithConstructor.java
	//Written by Ernest Mushinge
	//Written on 3/16/15


package UseDinnerParty2WithConstructor;
import java.util.*;

import PartyClass.DinnerParty2WithConstructor;
import PartyClass.PartyWithConstructor2;

//import PartyClassWithConstructor.PartyWithConstructor;
public class UseDinnerParty2WithConstructor {

	public static void main(String[] args) {
		
		//This is to display my information
		System.out.println(" Ernest Mushinge ITMP2650 Java Programming, Spring 2015, CRN 11438, Due March 25th, 2015\n");
		
		int guests;
		//This variable hold the dinner choice of the Dinner Party sub-class of Party class
		
		int choice = 0;
		/////////
		
		
		PartyWithConstructor2 aParty = new PartyWithConstructor2();
		DinnerParty2WithConstructor aDinnerParty = new DinnerParty2WithConstructor();
		Scanner keyboard = new Scanner(System.in);
		
		//prompt the user for a number of guests and accept the value from the keyboard
		
		System.out.println(" Enter number of guests for the party>> ");
		guests = keyboard.nextInt();
		//this is to set a guests in a party class
		aParty.setGuests(guests);
        
		//this is to display the number of guests
		
		System.out.println(" The party has "+ aParty.getGuests() + " guests");
		
		//this to display the invitation
		
		aParty.displayInvitation();
		
		//After the party object data and invitation are displayed, prompt user to enter number of dinner party guest
		
		System.out.println(" Enter number of guests for the dinner party>> ");
		//guests = keyboard.nextInt();
		aDinnerParty.setGuests(guests);
		
		//prompt the user for dinner choice
		System.out.println(" Enter the menu option -- 1 for chicken or 2 for beef >> ");
		//choice = keyboard.nextInt();
		aDinnerParty.setDinnerChoice(choice);
		
		//display information to the user
		System.out.println(" The dinner party has " + aDinnerParty.getGuests() + " guests\n" + " Menu option " + aDinnerParty.getDinnerChoice()+ " Will be reserved");
		//access the display method from the party class, since the dinner party class extends the party class
		aDinnerParty.displayInvitation();
		

	}

}
