//File name Book.java
//Written by Ernest Mushinge
//Written on 03/24/15


// Assignment #6
// Java Programming
 //Spring 2015 CRN 11438
// Due: March 25, 2015
// Worth 50 points

//This a subClass called Book that will calculate the price of the book
public class Book extends Publication {

	static String title;
	static double cost;
	static int quantity;

	// Book class constructor that passes data to the super constructor
	public Book(String Title, double Cost, int Quantity) {
		super(Title, Cost, Quantity);

	}

	public Book() {
		super(title, cost, quantity);

	}

	public double PriceOfBook() {
		double Price = 0;

		// if statement that evaluate the quantity
		if (Quantity > 50)

			Price = Cost * 1.5 - 5;

		else

			Price = Cost * 1.5;

		return Price;

	}

	// toString method to print the result
	public String toString() {
		return (" is title  " + getTitle() + ", price $" + PriceOfBook()
				+ ", Costs $" + getCost() + ", quantity " + getQuantity() + " and the name of the class is HardCovers");
	}

}
