//File name TwoDimentionArrayDemo.java
//Written by Ernest Mushinge
//Written on 2/23/15

package TwoDimensionalArrayDemo;

import java.util.Scanner;

public class TwoDimentionalArrayDemo {

	public static void main(String[] args) {

		int[][] count = new int[3][3];
		Scanner input = new Scanner(System.in);
		int row, column;
		final int QUIT = 99;

		// to print my name and class
		System.out.println(" Ernest Mushinge \n" + " Assign 5\n"
				+ " Java Programming, Spr 2015 CRN 11438,\n"
				+ " Due March 1st, 2015\n");

		// prompt the user to enter a row or the QUIT value to quit
		System.out.println(" Enter a row or " + QUIT + " to quit > ");
		row = input.nextInt();

		// In a loop that continues if the user has not entered the QUIT value,
		// prompt the user for a column.
		// if the row and column are both within appropriate range, add 1 to the
		// element in the selected position.

		while (row != QUIT) {
			System.out.println(" Enter a column > ");
			column = input.nextInt();

			// if statement
			if (row < count.length && column < count[row].length) {
				count[row][column]++;// this will increment so a user is
										// prompted again and the value is added
										// to the array

				// Still within the if statement that check for a valid row and
				// column, add a nested loop that displays each row and column
				// of the newly incremented array. The element in each row are
				// displayed on the same line, and a new line is started at the
				// end of each row. Add a closing curly brace for the if
				// statement

				for (int r = 0; r < count.length; ++r) {
					for (int c = 0; c < count[r].length; ++c)
						System.out.println(count[r][c] + " ");
					System.out.println();

				}
			}

			// add an else clause to the if statement to display an error
			// message when the row or column value is too high.

			else
				System.out.println(" Invalid postion selected");

			// At the end of the loop, prompt the user for and accept the next
			// row number. Add closing curly braces for the loop, the main()
			// method and the class.

			System.out.println(" Enter a row or " + QUIT + " to quit > ");
			row = input.nextInt();

		}

	}

}
