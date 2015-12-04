    //File name DinnerParty.java
	//Written by Ernest Mushinge
	//Written on 3/16/15


    // Assignment #6
    // Java Programming
   //Spring 2015 CRN 11438
   // Due: March 25, 2015
   
package PartyClass;

//import PartyClassWithConstructor.PartyWithConstructor;
//import PartyClassWithConstructor.PartyWithConstructor2;


// This class is a child class of Party Class
public class DinnerParty2WithConstructor extends PartyWithConstructor2 {

	private int dinnerChoice;
	
	//in order for this class to compile, I have to set the constructor with a parameter
	
	public DinnerParty2WithConstructor(int numGuests)
	{
		super(numGuests);//this is same as using a declared variable in a parent class PartyWithConstructor2
	}
	
	//The Party class already contains methods to get and the set number of guests,
	//so DinnerParty needs methods only to get and set the dinner choice variable as follows
	
	public int getDinnerChoice()
	{
		return dinnerChoice;
	}
	
	public void setDinnerChoice(int choice)
	{
		dinnerChoice = choice;
	}
	
	//Just in case you want to override the display method in the parent class(Party class)
	//This method below overrides the display method in the Party class
	
	public void displayInvitation()
	{
		System.out.println(" Please come to my dinner party!");
	}
}
