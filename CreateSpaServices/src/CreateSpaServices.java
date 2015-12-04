//File name CreateSpaServices.java
//Written by Ernest Mushinge
	//Written on 1/20/15

import java.util.Scanner;

public class CreateSpaServices {
	

	public static void main(String[] args)
	{

	Sparservices firstService = new Sparservices(); //instantiate First Service object 
	Sparservices secondService = new Sparservices(); // instantiate Second Service object
	
      getData(firstService);
      getData(secondService);
      
      //display the detail for the first Service

	System.out.println(" First service details; ");
	System.out.println(firstService.getServiceDescription() + " and the price is $ " + firstService.getPrice());

	//Display the detail for the secondService object.

	System.out.println(" Second service details; ");
	System.out.println(secondService.getServiceDescription() + " and the price is $ " + secondService.getPrice());

	}

	//this method makes the main method shorter 
	
	public static Sparservices getData( Sparservices s)
	
	{
		String services;
		double price;
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println(" Enter service>>> ");
		services = keyboard.nextLine();
		System.out.println(" Enter price>>> ");
		price = keyboard.nextDouble();
		
		s.setServiceDescription(services);
		s.setPrice(price);
		 return s;
	}

	
	}


