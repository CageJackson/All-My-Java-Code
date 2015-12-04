//File name JivinJavaCoffeeShop.java
//Written by Ernest Mushinge
//Written on 2/10/15


import javax.swing.JOptionPane;

public class MenuOfThreeItems {

	private static double American = 1.99;
	private static double Espresso = 2.50;
	private static double Latte = 2.15;
	private static boolean Quit = false;
	private static double price = 0;
	private static float total=0;

	public static void main(String[] args) {

		MenuOfThreeItems menu = new MenuOfThreeItems();
		JOptionPane.showMessageDialog(null, " Ernest Mushinge \n"
				+ " Assign 3\n" + " Java Programming, Spr 2015 CRN 11438,\n"
				+ " Due Feb 11, 2015");

		// menu.totalPrice();
		display();

	}
	
	
	
	
	static String imput = JOptionPane.showInputDialog(" (1) American 1.99\n"
			+ " (2) Espresso 2.50\n" + " (3) Latte 2.15\n"
			+ " Make selection, Press 0 to quit");
	

	

	public static void display() {
		
		
		switch (imput) {

		case ("1"):
			
			
			setAmerican(1.99);
			price = getAmerican();
			
			JOptionPane.showMessageDialog(null, " Your total order comes to "
					 + "$" +price);
			
			
			JOptionPane.showInputDialog(" (1) American 1.99\n"
					+ " (2) Espresso 2.50\n" + " (3) Latte 2.15\n"
					+ " Make selection, Press 0 to quit");
			break;
			
			
			
			
		case ("2"):
		
			setEspresso(2.50);
			price = getEspresso();
			
			JOptionPane.showMessageDialog(null, " Your total order comes to "
					 + "$" +price);
			
			JOptionPane.showInputDialog(" (1) American 1.99\n"
					+ " (2) Espresso 2.50\n" + " (3) Latte 2.15\n"
					+ " Make selection, Press 0 to quit");
			break;
			
			

		case ("3"):
			setLattte(3.15);
			price = getLatte();
			
			JOptionPane.showInputDialog(" (1) American 1.99\n"
					+ " (2) Espresso 2.50\n" + " (3) Latte 2.15\n"
					+ " Make selection, Press 0 to quit");
			
		    JOptionPane.showMessageDialog(null, " Your total order comes to "
					+ "$ " + price);
			break;
			
			

		case ("0"):
		
			JOptionPane.showMessageDialog(null, " Your total order comes to " + "$ " + price);

			//Quit = true;
			//System.exit(0);
			break;

		}

	}

	//  get and set methods for the orders

	public static double getAmerican() {
		return American;

	}

	public static void setAmerican(double american) {

		American = american;
	}

	// to get Espresso
	public static double getEspresso() {
		return Espresso;

	}

	// /to set Espresso
	public static void setEspresso(double espresso) {
		Espresso = espresso;
	}

	// to get Latte
	public static double getLatte() {
		return Latte;
	}

	// to set Latte

	public static void setLattte(double latte) {
		Latte = latte;
	}

	//method to compute total price
	
	public static void totalPrice() 
	
	{
		switch (imput) {
		case ("1"):
			getAmerican();

		case ("2"):
			getEspresso();
		case ("3"):
			getLatte();

		}

	}

}
