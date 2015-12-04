//File name BowlingTeamDemo.java
//Written by Ernest Mushinge
//Written on 03/01/15

package BowlingTeamDemo;

import java.util.Scanner;


public class BowlingTeamDemo2 {

	public static void main(String[] args) {

		String name;
		// BowlingTeam bowlTeam = new BowlingTeam(); // replace this with an
		// array declaration of four bowlingTeam object
		int x;// this is used as a subscript to display team member
		int y; // this is to display the teams
		final int NUM_TEAM_MEMBERS = 4;
		final int NUM_TEAMS = 4;
		BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS]; // array of object

		Scanner input = new Scanner(System.in);
		
		// This is to execute as many times as teams array
		for (y = 0; y < NUM_TEAMS; ++y) {
			teams[y] = new BowlingTeam();

		}

		// prompt the user for bowling team name

		System.out.println(" Enter team name >> ");//////
		name = input.nextLine();/////////
		// bowlTeam.setTeamName(name);// to be deleted
		// replaced by
		teams[y].setTeamName(name);//////////////////

		// In a loop that executes four times, prompt the user for a team
		// member's name.
		// Accept the name and assign it to the BowlingTeam object using the
		// subscript to
		// indicate the team member's position in the array in the BowlingTeam
		// class

		for (x = 0; x < NUM_TEAM_MEMBERS; ++x) {

			System.out.println(" Enter team member's name >> ");
			name = input.nextLine();
			//bowlTeam.setMember(x, name);
             teams[y].setMember(x, name);
		}

		// Display the detail of the BowlingTeam object using the code
		System.out.println(" \nMembers of team  " + teams[y].getMember(x));

		for (x = 0; x < NUM_TEAM_MEMBERS; ++x) {
			System.out.print(teams[y].getMember(x) + " ");

			System.out.println();
		}

	}

}
