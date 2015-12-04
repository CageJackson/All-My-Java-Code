//File name BowlingTeam.java
//Written by Ernest Mushinge
//Written on 03/02/15

package BowlingTeamDemo;
import java.util.*;

public class BowlingTeam {
	
	
	final int NUM_TEAM = 4;
	BowlingTeam[] teams = new BowlingTeam[NUM_TEAM];
	private String teamName;
	private String[] members = new String[4];
	 
	
	//A method that sets team name
	public  void setTeamName(String team)
	{
		teamName = team;
		
	}
	
	//a method that gets team name
	public String getTeamName()
	{
		return teamName;
		
	}
	
	//A method that sets team member's name, it uses a position as a subscript for an array and a name
	
	public void setMember(int number, String name)
	{
		members[number] = name;
	}

	
	//A method that returns a team member's name. It requires value used as the subscript that determines which member's name to return
	
	public String getMember(int number)
	{
		return members[number];
		
	}
}
