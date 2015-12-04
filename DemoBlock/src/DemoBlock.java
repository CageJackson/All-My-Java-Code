

//File name DemoBlock.java
	//Written by Ernest Mushinge
	//Written on 2/2/15


public class DemoBlock {

	public static void main(String[] args) {
		
		System.out.println(" Ernest Mushinge ITMP2650 Java Programming, Spring 2015, CRN 11438, Due Feb 4, 2015");
		System.out.println(" You Do It Chapter 4 \n");
		System.out.println(" Demostrating block scope \n");
		
		int X = 1111;
		System.out.println(" In first block X is " + X);
		
		{
			
			int Y = 2222;
			System.out.println(" In the second block X is " + X);
			System.out.println(" In the second block Y is " + Y);
			
			
		}
		
		{
			int Y = 3333;
			System.out.println(" In the third block X is " + X);
			System.out.println(" In the third block Y is " + Y);
			demoMethod();
			System.out.println(" After method X is " + X);
			System.out.println(" After method Y is " + Y);
			
			
		}
		
		System.out.println(" At the end X is " + X);

	
	}
//This is a method that changes the value of X and Y
	private static void demoMethod() {
		
		int x = 8888, y = 9999;
		System.out.println(" In demo method X is " + x);
		System.out.println(" In demo method block Y is " + y);
		
	}

}
