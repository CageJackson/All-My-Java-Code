//File name BirdSighting2.java
//Written by Ernest Mushinge
//Written on 2/2/15

package BirdSighting2;

public class BirdSighting2 {

		
		
		static String BirdSpeciesSighted;
		static int TheNumberSeen;
		static int TheDayOfTheYear;
			
		
	//A default constructor that calls a three - parameter constructor
		public BirdSighting2() {
			
			this(BirdSpeciesSighted,TheNumberSeen, TheDayOfTheYear);
		}
		
		public BirdSighting2(String SpeciesName, int NumberSeen, int DayOfYear) {
		// TODO Auto-generated constructor stub
			this.BirdSpeciesSighted = SpeciesName;
			this.TheNumberSeen = NumberSeen;
			this.TheDayOfTheYear = DayOfYear;
			
			
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




