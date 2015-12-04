//File name InsertionSortDemo.java
//Written by Ernest Mushinge
//Written on 2/23/15

import java.util.*;

public class InsertionSortDemo {

	public static void main(String[] args) {
		

		int[] someNums = new int[5];
		//int comparisonToMake =someNums.length -1;
		Scanner keyboard = new Scanner(System.in);
		int a, b, temp;
		
		
		//to print my name and class
		System.out.println(" Ernest Mushinge \n" + " Assign 5\n"
				+ " Java Programming, Spr 2015 CRN 11438,\n"
				+ " Due March 1st, 2015\n");
		
		for(a= 0; a < someNums.length; ++a)
		{
			System.out.println(" Enter number" + (a + 1) + " >> ");
			someNums[a] = keyboard.nextInt();
		}
		
		//next call a method that accepts the array and the number of sort iterations performed so far, which is 0.
		//The purpose of the method is to display the current status of the array as it is being sorted
		
		display(someNums, 0);
		
		//Add the nested loop that perform the sort. The outer loop controls the number of passes through the list
		// and the inner loop controls the comparisons on each pass through the list
		
		/*for(a = 0; a < someNums.length -1; ++a)
		{
			for(b = 0; b < comparisonToMake; ++b)
			{
				if(someNums[b] > someNums[b + 1])
				{
					
					temp = someNums[b];
					someNums[b] = someNums[b+1];
					someNums[b + 1] = temp;
				}
			}
			
			display(someNums, (a + 1));
			--comparisonToMake;//decrements comparisonToMake
		}*/
		
		
		//This statements performs the insertion sort
		
		a = 1;
		while (a < someNums.length)
		{
			temp = someNums[a];
			b = a - 1;
			while(b >= 0 && someNums[b] > temp)
			{
				someNums[b + 1] = someNums[b];
				--b;
			}
			
			someNums[b + 1] = temp;
			display(someNums, a);
			++a;
		}
	}

	
	public static void display(int[] someNums, int a)
	{
		

		System.out.println(" Iteration " + a + ": ");
		
		
		for(int x = 0; x < someNums.length; ++x)
		{
			System.out.print(someNums[x] + " ");
			System.out.println();
		}
	}
}
