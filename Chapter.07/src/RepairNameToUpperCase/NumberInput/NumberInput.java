//File name NumberInput.java
//Written by Ernest Mushinge
//Written on 2/21/15


package RepairNameToUpperCase.NumberInput;

import javax.swing.*;
public class NumberInput {

	public static void main(String[] args) {
		
		String inputString;
		int inputNumber;
		int result;
		
		//It will multiply user input by 10
		
		final int FACTOR =10;
		
		//Print my information 
		JOptionPane.showMessageDialog(null, " Ernest Mushinge \n"
				+ " Assign 5\n" + " Java Programming, Spr 2015 CRN 11438,\n"
				+ " Due March 1st, 2015");
		
		//prompt the user
		inputString = JOptionPane.showInputDialog(null, " Enter a number ");
		
		//convert the input to an integer
		
		inputNumber = Integer.parseInt(inputString);
		result = inputNumber * FACTOR;
		JOptionPane.showMessageDialog(null, inputNumber +  " * " + FACTOR + " = " + result);

	}

}
