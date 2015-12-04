//File name shortCircuitTest.java
	//Written by Ernest Mushinge
	//Written on 2/10/15

public class ShortCircuitTestOr {

	public static void main(String[] args) {
		
		System.out.println(" Ernest Mushinge ITMP2650 Java Programming, Spring 2015, CRN 11438, Due Feb 11, 2015\n");
		if( trueMethod()||falseMethod() )
		
			System.out.println(" Both are true ");
			
			
			
		else
			System.out.println(" Both are not true ");

	}

	
	
	
	public static boolean trueMethod()
	{
		System.out.println(" true method ");
		return true;
		
	}
	
	public static boolean falseMethod()
	{
		System.out.println(" false method ");
		return false;
		
	}
}
