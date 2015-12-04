//File name TimeFusedLoop.java
	//Written by Ernest Mushinge
	//Written on 2/17/15
public class TimeFusedLoop {

	public static void main(String[] args)
	{
		
		System.out.println(" Ernest Mushinge ITMP2650 Java Programming, Spring 2015, CRN 11438, Due Feb 18, 2015\n");
		long startTime1, startTime2, endTime1, endTime2;
		final int REPEAT = 10000;
		startTime1 = System.currentTimeMillis();
		
		for(int x = REPEAT; x >=0; --x)
			method1(REPEAT);
		
		for(int x = REPEAT; x >=0; --x)
			method2(REPEAT);
		
		endTime1 = System.currentTimeMillis();
		System.out.println(" Time for two separate loops; " + (endTime1 - startTime1) + " milliseconds ");
		
		startTime2 = System.currentTimeMillis();
		for(int x = REPEAT; x >=0; --x)
		{
			method1(REPEAT);
			method1(REPEAT);
			
		}
		endTime2 = System.currentTimeMillis();
		System.out.println(" Time for fused loops; " + (endTime2 - startTime2) + " milliseconds ");
		
		
		
		
	}

	//outside main method
	public static void method1(final int REPEAT)
	{
		for(int x = REPEAT; x >=0; --x);
		
	}
	
	public static void method2(final int REPEAT)
	{
		for(int x = REPEAT; x >=0; --x);
		
	}
	
	
}
