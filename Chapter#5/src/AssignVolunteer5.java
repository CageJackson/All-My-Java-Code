    //File name AssignVounteer4.java
	//Written by Ernest Mushinge
	//Written on 2/17/15


import java.util.Scanner;


public class AssignVolunteer5 {

	public static void main(String[] args) {
		
		int donationType;
		String volunteer = "" ;
		String message ="";
		
		final String FURNITURE_PRICER = " Walter ";
		final String ELECTRONICS_PRICER = " Lydia";
		final int CLOTHING_CODE = 1;
		final int FURNITURE_CODE= 2;
		final int ELECTRONICS_CODE = 3;
		final int OTHER_CODE = 4;
		final String CLOTHING_PRICER = "Regina";
		final String OTHER_PRICER = "Marco";
		
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter an integer... ");
		System.out.println(" Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else... ");
		donationType = input.nextInt();
		
		
		//this is to while loop is to make sure that a user is reminded that the input enter is not valid
		while(donationType < CLOTHING_CODE || donationType> OTHER_CODE)
		{
			System.out.println(" You entered "+ donationType + " Which is not a valid donation type ");
			System.out.println(" Please enter a value between "+ CLOTHING_CODE + " and " + OTHER_CODE + " ___ ");
			System.out.println(" Enter an integer___");
			donationType = input.nextInt();
			
			
		}
		
		//this is a switch statement 
		
		switch(donationType)
		{
		
		case(CLOTHING_CODE):
			volunteer = CLOTHING_PRICER;
		    message = " a clothing donation";
		    break;
		case(FURNITURE_CODE):
			volunteer = FURNITURE_PRICER;
		    message = " a furniture donation";
		    break;
		case(ELECTRONICS_CODE):
			volunteer = ELECTRONICS_PRICER;
		    message = " an electronics donation";
		    break;
		case(OTHER_CODE):
			volunteer = OTHER_PRICER;
		    message = " another donation";
		    break;
		    default:
		    	volunteer = "invalid";
		        message = " an invalid donation type";
		
		}

		
		//To display the chosen code and corresponding volunteer's name
		System.out.println(" Ernest Mushinge ITMP2650 Java Programming, Spring 2015, CRN 11438, Due Feb 11, 2015\n");
		System.out.println(" You entered " + donationType);
		System.out.println(" This is  " + message);
		System.out.println(" The volunteer who will price this item is " + volunteer);
		

	}

}
