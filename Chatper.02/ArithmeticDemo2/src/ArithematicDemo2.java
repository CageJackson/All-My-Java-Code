//File name Hello2.java
	//Written by Ernest Mushinge
	//Written on 1/15/15

import java.util.Scanner;

public class ArithematicDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double firstNumber;
		double secondNumber;
		double sum;
		double difference;
		double average;
		
		//This is to initialize the Scanner object so to accept the input from the user
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter an integer
		
		System.out.println(" Please enter a double integer>> ");
		firstNumber = input.nextDouble();
		System.out.println(" Please enter another double integer>> ");
		secondNumber = input.nextDouble();
		
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
