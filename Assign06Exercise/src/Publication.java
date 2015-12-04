
 /*//File name Book.java
//Written by Ernest Mushinge
//Written on 03/24/15
 * 
 Assignment #6
 Java Programming
 Spring 2015 CRN 11438
 Due: March 25, 2015
 Worth 50 points\n"*/


public abstract class Publication {

	public String Title;
	public double Cost;
	public int Quantity;
	protected int Price; 

	public Publication(String title, double cost, int quantity) {

		setTitle(title);
		setCost(cost);
		setQuantity(quantity);
	}
	
	//this is my information and course information
			public static String ProgrammerName()
			{
				
				String Programmer;
			Programmer =  " Ernest Mushinge \n"
					+ " Assignment #6\n" + " Java Programming, Spr 2015 CRN 11438,\n"
					+ " Due: March 25, 2015"
					+ " Worth 50 points\n";
			return Programmer;
			}

	// getters and setters of the three data members

	public void setTitle(String title) {
		this.Title = title;
	}

	public void setCost(double cost) {
		this.Cost = cost;
	}

	public void setQuantity(int quantity) {
		this.Quantity = quantity;
	}

	public String getTitle() {
		return Title;
	}

	public double getCost() {
		return Cost;
	}

	public int getQuantity() {
		return Quantity;
	}
	
	

	// Abstract method that will return the price of a book

	public abstract double PriceOfBook();

}
