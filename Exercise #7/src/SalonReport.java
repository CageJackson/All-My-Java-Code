//File name SalonReport.java
//Written by Ernest Mushinge
//Written on 3/04/15

import java.util.*;

import javax.swing.*;

public class SalonReport {

	public static void main(String[] args) {
		String[] ServiceDescription = { " Cut ", " Shampoo", " Manicure",
				" Style", " Permanent", " Trim" };
		int[] Price = { 8, 4, 18, 48, 18, 6 };
		int[] TimeMinutes = { 15, 10, 30, 55, 35, 5 };

		String HoldServices = "";// to use as a subscript of an array
		int HoldTimeMinutes = 0;// to hold minutes
		int HoldPrice = 0;// to hold the sorting price
		String HoldService;// to hold sorted Service

		// This will print my information to the screen

		JOptionPane.showMessageDialog(null, " Ernest Mushinge \n"
				+ " Assign 5\n" + " Java Programming, Spr 2015 CRN 11438,\n"
				+ " Due March 1st, 2015");

		// This is to prompt the user for input
		String serviceInput = JOptionPane
				.showInputDialog(null,
						" Sort services by \n(S)ervice, (P)rice, or (T)ime\n Or (Q) to Quit Program");

		switch (serviceInput) {
		case ("P"):

			String end = "";
			// serviceInput= toString(HoldPrice);
			Arrays.sort(Price);

			for (int x1 = 0; x1 < Price.length; ++x1) {
				// PriceString = PriceString + Price[x1];
				HoldPrice = Price[x1];

				String hello = end += HoldPrice + " ";

				// initialize string bulder and stale sorted array in string
				// bulder then print the string bulder

				// System.out.println(HoldPrice);
				// JOptionPane.showMessageDialog(null, " Prices " + HoldPrice);
				// JOptionPane.showMessageDialog(null, "Sorted by Prices \n" +
				// hello);//take this to display method in class
				String SortByPrice = ("Sorted by Prices \n" + hello);
			}

			break;

		case ("S"):
			String end1 = "";
			Arrays.sort(ServiceDescription);

			for (int b = 0; b < ServiceDescription.length; ++b) {
				// PriceString = PriceString + Price[x1];
				HoldServices = (ServiceDescription[b]);

				String hello2 = end1 += HoldServices + " ";

				// initialize string bulder and stale sorted array in string
				// bulder then print the string bulder

				// System.out.println(HoldPrice);
				// JOptionPane.showMessageDialog(null, " Prices " + HoldPrice);
				// JOptionPane.showMessageDialog(null, "Sorted by Service \n" +
				// hello2);//take this to display method in class
				String SortByService = ("Sorted by Service \n" + hello2);

			}

			break;

		case ("T"):
			String end2 = "";
			Arrays.sort(TimeMinutes);

			for (int t = 0; t < TimeMinutes.length; ++t) {
				// PriceString = PriceString + Price[x1];
				HoldTimeMinutes = TimeMinutes[t];

				// String hello3 = end2 +=HoldTimeMinutes + " ";
				String hello3 = TimeMinutes[t] + " ";

				// initialize string bulder and stale sorted array in string
				// bulder then print the string bulder

				// System.out.println(HoldPrice);

				String SortByTime = ("Sorted by time \n" + hello3);// take this
																	// to
																	// display
																	// method in
																	// class
				// JOptionPane.showMessageDialog(null, " Prices " + hello3);
			}

			break;

		case ("Q"):

			System.exit(0);
			// } end if statement
			break;

		}

		Service service = new Service();
		service.setPrice(HoldPrice);
		service.setTime(HoldTimeMinutes);
		service.setDescription(HoldServices);
		service.display(ServiceDescription, Price, TimeMinutes);

	}

	/*
	 * Service service = new Service(holdServices,holdPrice,holdTimeMinutes) {
	 * 
	 * HoldServices = holdServices; HoldPrice = holdPrice; HoldTimeMinutes =
	 * holdTimeMinutes; }
	 */

	// this to exit the application
	/*
	 * while(!serviceInput.equals("Q")) { System.exit(0); }
	 */
	// this is to sort the array price

	// This is to sort the array of service description in ascending order
	/*
	 * Arrays.sort(ServiceDescription); for(int b=0; b <
	 * ServiceDescription.length; b++) { HoldService = ServiceDescription[b];
	 * System.out.println(HoldService + ""); }
	 * 
	 * //This is to sort the array of minutes in ascending order
	 * 
	 * Arrays.sort(TimeMinutes);
	 * 
	 * for(int m=0; m < TimeMinutes.length; m++) { HoldTimeMinutes =
	 * TimeMinutes[m]; System.out.println(HoldTimeMinutes + ""); }
	 */

	// Service service = new Service();

}

// }
