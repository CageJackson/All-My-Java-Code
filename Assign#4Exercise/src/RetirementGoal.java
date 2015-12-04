//File name JivinJavaCoffeeShop.java
//Written by Ernest Mushinge
//Written on 2/10/15

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class RetirementGoal {

	private static int NumberOfYearsUntilRetirement11;
	private static int SavingsAnually1;
	static double InterestRate;

	public RetirementGoal(int numberOfYearsUntilRetirement,
			int savingsAnnually, double interestRate2) {
		this.NumberOfYearsUntilRetirement11 = numberOfYearsUntilRetirement;
		this.SavingsAnually1 = savingsAnnually;
		this.InterestRate = interestRate2;

	}

	public static void main(String[] args) {

		int NumberOfYearsUntilRetirement121;
		int SavingsAnually121;
		double InterestRate121;

		// DecimalFormat f = new DecimalFormat("0.00");//come back to this
		JOptionPane.showMessageDialog(null, " Ernest Mushinge \n"
				+ " Assign 4\n" + " Java Programming, Spr 2015 CRN 11438,\n"
				+ " Due Feb 17, 2015");

		// prompt the user
		NumberOfYearsUntilRetirement121 = Integer
				.parseInt(JOptionPane.showInputDialog(null,
						" How many years until retirement?___ "));

		// To validate the data entered
		while (NumberOfYearsUntilRetirement121 <= 0) {
			JOptionPane.showMessageDialog(null,
					" Please enter valid positive numbers only! ");

			NumberOfYearsUntilRetirement121 = Integer.parseInt(JOptionPane
					.showInputDialog(null,
							" How many years until retirement?___ "));
		}

		// prompt the user
		int SavingsAnnually121 = Integer.parseInt(JOptionPane
				.showInputDialog(" How much can you save annually? "));

		// To validate the data entered
		while (SavingsAnnually121 <= 0) {
			JOptionPane.showMessageDialog(null,
					" Please enter valid positive numbers only! ");

			SavingsAnnually121 = Integer.parseInt(JOptionPane
					.showInputDialog(" How much can you save annually? "));
		}
		double InterestRates121 = Double.parseDouble(JOptionPane
				.showInputDialog(" Enter interest rate (as a decimal)"));

		RetirementGoal goal = new RetirementGoal(
				NumberOfYearsUntilRetirement121, SavingsAnnually121,
				InterestRates121);
		goal.displayResult();
	}

	// Method to calculate the total with interest

	public static Double CalculateTotalWithInterest() {
		Double TotalAmount;
		TotalAmount = NumberOfYearsUntilRetirement11 * SavingsAnually1
				+ (InterestRate * SavingsAnually1);
		return TotalAmount;
	}

	public static Double CalculateTotalWithOutInterest() {
		Double TotalAmount2;
		TotalAmount2 = (double) (NumberOfYearsUntilRetirement11 * SavingsAnually1);
		return TotalAmount2;
	}
         //To display results
	public void displayResult() {
		// This is to format the currency
		String calculateTotalWithInterest = java.text.NumberFormat
				.getCurrencyInstance().format(CalculateTotalWithInterest());
		String calculateTotalWithoutInterest = java.text.NumberFormat
				.getCurrencyInstance().format(CalculateTotalWithOutInterest());
		String savings = java.text.NumberFormat.getCurrencyInstance().format(
				SavingsAnually1);

		// This is to loop through years and increment by 1
		for (int i = 1; i <= NumberOfYearsUntilRetirement11; i++)

		{

			String msg = "If you save " + savings + " " + " each year for "
					+ NumberOfYearsUntilRetirement11 + " years"
					+ "\n        With " + InterestRate + "%" + "  interest "
					+ "        Without Interest" + "\n After year " + i
					+ "      " + calculateTotalWithInterest + "               "
					+ calculateTotalWithoutInterest;

			JOptionPane.showMessageDialog(null, msg);

		}
	}
}
