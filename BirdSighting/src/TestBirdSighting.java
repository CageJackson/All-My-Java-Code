

//File name TestBirdSighting.java
	//Written by Ernest Mushinge
	//Written on 2/2/15

		public class TestBirdSighting {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				
				BirdSighting birds = new BirdSighting("Robin", 1);
				
				System.out.println(" Ernest Mushinge ITMP2650 Java Programming, Spring 2015, CRN 11438, Due Feb 4, 2015");	
				System.out.println(" Assignment #2 ");
				System.out.println(" Test of no parameter constructor using the get method ( part A )");
				
				
				System.out.println(birds.GetTheNumberSeen()+" " + birds.GetBirdSpeciesSighted() + "(s)" + " Sighted on the day of the year");
				
				
				//Test result after using the 3 parameter constructor (part B)
				
				System.out.println(" Test result after using the 3 parameter constructor (part B)");
				
				BirdSighting Birds = new BirdSighting("Cardinal", 3, 75);
			
				
				//System.out.println(Birds.GetTheNumberSeen()+" " + Birds.GetBirdSpeciesSighted() + "(s)" + " Sighted on the day of the year");
				Birds.display();
				
			}

		


	}


