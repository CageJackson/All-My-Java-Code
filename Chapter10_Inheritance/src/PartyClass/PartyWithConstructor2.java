     //File name Party.java
	//Written by Ernest Mushinge
	//Written on 3/16/15

// Assignment #6
// Java Programming
 //Spring 2015 CRN 11438
// Due: March 25, 2015


package PartyClass;




//The class hosts one integer data field-the number of guests expected at the party

public class PartyWithConstructor2{
	
	//this constructor executes before the subclass constructor

	public PartyWithConstructor2( int numGuests)
	{
		//System.out.println(" Creating a Party");
		guests = numGuests;
	}

	
	private int guests;
	
	public int getGuests()
	{
		return guests;
	}

	
	public void setGuests(int numGuests)
	{
		guests = numGuests;
	}
	
	//add a method that displays a party invitation
	
	public void displayInvitation()
	{
		System.out.println(" Please come to my party!");
	}
	
}
