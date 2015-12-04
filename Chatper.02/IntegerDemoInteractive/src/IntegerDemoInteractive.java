
/**
 * File name IntegerDemo.java
	Written by Ernest Mushinge
	Written on 1/16/15
 *
 */
import java.util.Scanner;
public class IntegerDemoInteractive {

	/**
	 * This program accepts user input
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anInt;
		byte aByte;
		short aShort;
		long aLong;
		String name;
		
		Scanner input = new Scanner(System.in);
		System.out.println(" Please enter an integer ");
		anInt = input.nextInt();
		System.out.println(" Please enter a byte integer ");
		aByte = input.nextByte();
		System.out.println(" Please enter a short inter ");
		aShort = input.nextShort();
		System.out.println(" Please enter a long inter ");
		aLong = input.nextLong();
		System.out.println(" Please enter your name ");
		name = input.nextLine();
		input.nextLine();
		

		
		System.out.println(" The int is " + anInt);
		System.out.println(" The byte is " + aByte);
		System.out.println(" The short is " + aShort);
		System.out.println(" The long is " + aLong);
		System.out.println(" Thank You " + name);
		
	}


	}


