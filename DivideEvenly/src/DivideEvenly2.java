    //File name DivideEvenly2.java
	//Written by Ernest Mushinge
	//Written on 2/17/15

public class DivideEvenly2 {

	public static void main(String[] args) {
		final int LIMIT =100;
		int var;
		int number;
		
		System.out.println("Ernest Mushinge ITMP2650 Java Programming, Spring 2015, CRN 11438, Due Feb 18, 2015\n");
		System.out.println(LIMIT + " is evenly divisible by ");
		
		//I replaced the existing for loop with the following nested loop to loop through all numbers divisible by 100
		
		for(number = 1; number <= LIMIT; ++number)
		{
			System.out.println( number +" is evenly divisible by");
			   for(var = 1; var <= LIMIT; ++var){
				   
			if(LIMIT%var == 0)
			{
				System.out.println(var + " ");
				//This will display the number and space
				System.out.println();
				
			}
			
		  }
		}
	}

}
