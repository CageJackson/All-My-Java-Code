  //File name DemoIncrement2.java
	//Written by Ernest Mushinge
	//Written on 2/17/15

public class DemoIncrement2 {

	public static void main(String[] args) {
		int V = 4;
		int plusPlusV = ++V;
		
		System.out.println(" Ernest Mushinge ITMP2650 Java Programming, Spring 2015, CRN 11438, Due Feb 18, 2015\n");
		System.out.println(" V is "+ V );
		System.out.println(" ++V is "+ plusPlusV);
		System.out.println(" V++ is "+ plusPlusV);
		
		int W = 17, X = 17, Y = 18;
		boolean compare1 = (++W == Y);
		boolean compare2 = (X++ == Y);
		
		
		System.out.println(" First compare is "+ compare1);
		System.out.println(" Second compare is "+ compare2);
		
	}

}
