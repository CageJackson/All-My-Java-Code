//File name Car.java
//Written by Ernest Mushinge
//Written on 2/28/15

package CarDemo;

//defining a car class that holds three fields
public class Car {

	private int year;
	private model model;
	private color color;
	
	
	//add a constructor for the car class that accepts parameter that hold the value for year, and color
	
	public Car(int yr, model m, color c)
	{
		year = yr;
		model = m;
		color = c;
	}

   //Add a display() method that displays a Car object's data, then add a closing curly brace for the class
	public void display()
	{
		System.out.println(" Car is a " + year + " " + color + " " + model);
	}


}

