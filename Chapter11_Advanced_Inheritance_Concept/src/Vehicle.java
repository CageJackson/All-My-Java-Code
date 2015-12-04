//File name Vehicle.java
//Written by Ernest Mushinge
//Written on 03/16/15



//The code below is for packaging vehicle class
//package com.vehicleswesell.vehicle;

//This is an abstract vehicle class.This class include fields for the power source, the number of
//wheels, and the price. Vehicle is an abstract class, they will never be "plain" vehicle object.


public abstract class Vehicle {

	private String powerSource;
	private int wheels;
	protected int price;

	
	//Vehicle constructor accepts three parameters and calls three methods
	
	public Vehicle(String PowerSource, int Wheels)
	{
		setPowerSource(PowerSource);
		setWheels(Wheels);
		setPrice();
	}
	
	//three get methods
	public String getPowerSource()
	{
		return powerSource;
	}
	
	public int getWheels()
	{
		return wheels;
	}
		
	public int getPrice()
	{
		return price;
	}
	
	//set methods
	
	public void setPowerSource(String SSource)
	{
		powerSource = SSource;
	}
	
	public void setWheels(int wls)
	{
		wheels = wls;
	}
	
	//The setPrice() method is an abstract method. Each subclass you eventually create 
	//that represents different vehicle types will have a unique prompt for the price and a
	//different maximum allowed price
	
	public abstract void setPrice();
	
	//this is my information and course information
		public String AuthorName()
		{
			
			String Author;
		Author =  " Ernest Mushinge \n"
				+ " Assignment #6\n" + " Java Programming, Spr 2015 CRN 11438,\n"
				+ " Due: March 25, 2015"
				+ " Worth 50 points";
		return Author;
		}
	}
	


