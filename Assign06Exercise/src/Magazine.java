//File name Magazine.java
//Written by Ernest Mushinge
//Written on 03/24/15

// Assignment #6
// Java Programming
 //Spring 2015 CRN 11438
// Due: March 25, 2015
// Worth 50 points

public class Magazine extends Publication {

	public String MonthOfIssue;

	public Magazine(String Title, double Cost, int Quantity) {
		super(Title, Cost, Quantity);
		setMonthOfIssue("January");

	}

	// The price of the magazine

	public double PriceOfBook() {
		double Price = 0;
		// double finalValue;

		// if statement that evaluate the quantity
		if (Quantity > 50)

			Price = Cost * 1.6;
		// I added this code to round up the double value
		// finalValue= Math.round( Price);

		// return finalValue;
		return Price;
	}

	// get and set method for a MonthOfIssue

	public void setMonthOfIssue(String monthOfIssue) {
		this.MonthOfIssue = monthOfIssue;
	}

	public String getMonthOfIssue() {
		return MonthOfIssue;
	}

	// [NB]This is a toString() method that returns the outcome that can be
	// further printed to the dialog box.

	public String toString() {
		return ("  is title  " + getTitle() + ", Price $" + PriceOfBook()
				+ ", Costs $" + getCost() + ", quantity " + getQuantity() + " and the name of the class is Magazine");
	}

}
