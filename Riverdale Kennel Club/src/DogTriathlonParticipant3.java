//File name DogTriathlonParticipant.java
	//Written by Ernest Mushinge
	//Written on 2/10/15

public class DogTriathlonParticipant3 {

	private final int NUM_EVENTS;
	private static int totalCumulativeScore = 0;
	
	
	private String name;
	private  int obedienceScore;
	private int conformationScore;
	private int agilityScore;
	private int total;
	private double avg;
	
	private boolean scoresAgree;
	 
	public DogTriathlonParticipant3(String name, int numEvents, int score1, int score2,  int score3) 
	{
		//comment about the code added below here
		
		int totalNot0 = 0;
		if(score1 != 0)
			totalNot0 = score1;//I changed to score 1
		
		if(score2 != 0)
			totalNot0 = score2;
		
		if(score3 != 0)
			totalNot0 = score3;
		//to compare number of events to the total of nonzero scores, and set the Boolean variable scores Agree
		
		
		if (numEvents == totalNot0)
			scoresAgree = true;
		
		else
			scoresAgree = false;
		
		
		if(scoresAgree)
		{
			obedienceScore = score1;
			conformationScore = score2;
			agilityScore = score3;
			
		}
		
		
		else
		{
			obedienceScore = 0;
			conformationScore = 0;
			agilityScore = 0;
			
		}
		//continual with the constructor assignment....
		this.name = name;
		NUM_EVENTS = numEvents;
		obedienceScore = score1;
		conformationScore = score2;
		agilityScore = score3;

		
		total = obedienceScore + conformationScore + agilityScore;
		   //avg = (double) total / NUM_EVENTS;
		
		
		//This will give the correct result when number of events is equal to 0
		if(NUM_EVENTS == 0)
		
			avg = 0;
			
		else
			avg = (double) total / NUM_EVENTS;
		
		   totalCumulativeScore = totalCumulativeScore + total;
	}
	
	
	public void display()
	{
		if(!scoresAgree)
			System.out.println(" Notice! Number of events for " + name + " does not agree with scores reported. ");
		System.out.print(name + " participated in " + NUM_EVENTS +  " events and has an average score of "+ avg +"\n");
		System.out.print("  " + name +  " has a total score of "+ total + " bringing the total cumlative score to " + totalCumulativeScore);
	}
}

