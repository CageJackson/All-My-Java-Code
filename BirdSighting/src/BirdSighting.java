
//File name BirdSighting.java
	//Written by Ernest Mushinge
	//Written on 2/2/15

public class BirdSighting {

	
	//Bird sighting for Birmingham Birdwatcher's club
		
		
		static String BirdSpeciesSighted;
		static int TheNumberSeen;
		static int TheDayOfTheYear;
		
		
		
		
	//create a default constructor that automatically sets the species to robin and number to Day1
		public BirdSighting(String BirdsName,int Day1) {
			
			BirdSpeciesSighted = BirdsName;
			TheNumberSeen = Day1;
		}
		
		public BirdSighting( String SpeciesName, int NumberSeen, int DayOfYear )
		
		{
			BirdSpeciesSighted = SpeciesName;
			TheNumberSeen = NumberSeen;
			TheDayOfTheYear = DayOfYear;
			
		}
		
		
		
		
		//Using get and set methods
		
		public String GetBirdSpeciesSighted()
		{
			
			return BirdSpeciesSighted;
			
		}
		
		
		public int GetTheNumberSeen()
		{
			
			return TheNumberSeen;
			
		}
		
		
		public int GetTheDayOfTheYear()
		{
			
			return TheDayOfTheYear;
			
		}
		
		
	    public void SetBirdSpeciesSighted(String bird)
	    {
	    	
	    	bird = BirdSpeciesSighted;
	    	
	    	
	    }
	    
	    
	    
	    public void SetTheNumberSeen(int NumberOfBirds)
	    {
	    	
	    	NumberOfBirds = TheNumberSeen;
	    	
	    	
	    }
	    
	    
	    
	    public void SetTheDayOfTheYear(int Year)
	    {
	    	
	    	Year = TheDayOfTheYear;
	    	
	    	
	    }
		
	    //creating a method to display the result
	    
	    public static void display()
	    
	    {
	    	System.out.println( TheNumberSeen +" "+ BirdSpeciesSighted +"(s)" + " Sighted on the day " + TheDayOfTheYear + " of the year");
	    	
	    	
	    }
		
		
		
		
		

	}


