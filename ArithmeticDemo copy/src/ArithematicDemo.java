//File name Hello2.java
	//Written by Ernest Mushinge
	//Written on 1/15/15

import java.util.Scanner;

public class ArithematicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber;
		int secondNumber;
		int sum;
		int difference;
		int average;
		
		//This is to initialize the Scanner object so to accept the input from the user
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter an integer
		
		System.out.println(" Please enter an integer>> ");
		firstNumber = input.nextInt();
		System.out.println(" Please enter another integer>> ");
		secondNumber = input.nextInt();
		
		// this statements computes sum, difference and average
		
		sum= firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = sum / 2;
	
		//Print out the results
		System.out.println( firstNumber + "+" + secondNumber + "+" + sum);
		System.out.println (firstNumber + "-" + secondNumber + " is " + difference);
        System.out.println ( " The Average of " + firstNumber + " and " + secondNumber + " is " + average);
	}

}
