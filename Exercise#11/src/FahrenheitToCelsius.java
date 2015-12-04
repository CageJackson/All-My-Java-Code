//File name FahrenheitToCelsius.java
//Written by Ernest Mushinge
//Written on 1/20/15

import java.util.Scanner;
public class FahrenheitToCelsius {
	
	private static int Fahrenheit;
	private static int Celsius;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner imput = new Scanner(System.in);
      
      System.out.println(" Please Enter tempereture in Fahrenheit>> ");
      Fahrenheit = imput.nextInt();
      displayInfo();
      
      
	}

	//to display the temp
	public static void displayInfo()
	{
		System.out.println(" You entered " + Fahrenheit + " Fahrenheit ");
		System.out.println(" Now the tempereture in Celsius is " + computeFahrenheitToCelsius() +" degrees ");
		
	}
	
	//To convert Fahrenheit to Celsius
	public static int computeFahrenheitToCelsius() 

	{
		// TODO Auto-generated method stub
		int FahrenheitValue;
		
		FahrenheitValue = Fahrenheit - 32;
		Celsius = (int) (FahrenheitValue * 0.5555555556);
		return Celsius;
	}
}
