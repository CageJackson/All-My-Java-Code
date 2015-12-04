//File name InsuredCar.java
//Written by Ernest Mushinge
//Written on 03/16/15

 /* 
 Assignment #6
 Java Programming
 Spring 2015 CRN 11438
 Due: March 25, 2015
 "*/


//In this class I extend Vehicle class to create an InsuredCar class that implements
//the Insured interface

import javax.swing.*;

//import com.vehicleswesell.vehicle.Vehicle;
public class InsuredCar extends Vehicle implements Insured{
	
//variable of amount covered by insurance
	private int coverage;
	
	//Add a constructor that calls a Vehicle class constructor
	//passing arguments for the InsuredCar's power source and number of wheels.
	
	public InsuredCar()
	{
		super("gas", 4);
		setCoverage();
	}
	
	//setPrice method required by the Vehicle class. The method accepts the car's price from the user and enforces 
	//a maximum value of $60,000.
	
	public void setPrice()
	{
		String entry;
		final int MAX = 60000;
		entry = JOptionPane.showInputDialog(null, "Enter car price ");
		price = Integer.parseInt(entry);
		//if statement
		if(price > MAX)
			price = MAX;
		
	}
	
	//SetCoverage method and getCoverage method that is required by the Insured class. 
	//The setCoverage method sets the coverage value for an insured car to 90% of the car's price.
	
	public void setCoverage()
	{
		coverage = (int)(price*0.9);
	}
	
	public int getCoverage()
	{
		return coverage;
	}
	
	//[NB]This is a toString() method that returns the outcome that can be further printed to the dialog box.
	
	public String toString()
	{
		return("The insured car is powered by " + getPowerSource() + "; it has " + getWheels() + " wheels, costs $" + getPrice()
				+ " and is insured for $" +getCoverage());
	}
	
}
