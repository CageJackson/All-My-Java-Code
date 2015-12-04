
//File name DemoOverloard.java
	//Written by Ernest Mushinge
	//Written on 2/2/15

public class DemoOverloard {

	public static void main(String[] args) {
		
		System.out.println(" Ernest Mushinge ITMP2650 Java Programming, Spring 2015, CRN 11438, Due Feb 4, 2015");	
		System.out.println(" You Do It Chapter 4 \n");
		
		int month = 6, day = 24, year = 2015;
		displayData(month);
		displayData(month, day);
		displayData(month, day, year);

	}

	

	private static void displayData(int mm, int dd, int yy) {
		System.out.println(" Event date " + mm + " /" + dd + "/" + yy);
		
	}



	private static void displayData(int mm) {
		
		System.out.println(" Event date " + mm + " /1/2014");
		
	}
private static void displayData(int mm, int dd) {
		
		System.out.println(" Event date " + mm + " /" + dd + "/2014");
		
	}
}
