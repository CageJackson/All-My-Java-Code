//File name ParadiseInfo2.java
//Written by Ernest Mushinge
//Written on 1/20/15

import java.util.Scanner;

public class ParadiseInfo2 {

	static double price;
	static double discount;
	static double savings;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter cutoff price for discount>>>");
		price = keyboard.nextDouble();
		System.out.print(" Enter discount rate as a whole number>>>");
		discount = keyboard.nextDouble();
		savings = computeDiscountInfo(price, discount);

		System.out.println(" Special this week on any service over " + price);
		displayInfo();
		computeDiscountInfo(34, 34);
	}

	public static void displayInfo() {
		System.out.println(" Paradise Day Spa wants to pamper you. ");
		System.out.println(" We will make you look good. ");

	}

	public static double computeDiscountInfo(double pr, double dscnt)

	{
		// TODO Auto-generated method stub
		double saving;
		saving = pr * dscnt / 100;
		return saving;
	}

}
