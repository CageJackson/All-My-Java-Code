
//File name CreatePolicy.java
	//Written by Ernest Mushinge
	//Written on 2/2/15

public class CreatePolicy2 {

	public static void main(String[] args) {
		System.out.println(" Ernest Mushinge ITMP2650 Java Programming, Spring 2015, CRN 11438, Due Feb 4, 2015");	
		System.out.println(" You Do It (Chapter 4 )\n");
		
		CarInsurancePolicy2 first = new CarInsurancePolicy2(1);
		
		first.display();
		
		CarInsurancePolicy2 second = new CarInsurancePolicy2(456, 4); 
		
		second.display();
	    CarInsurancePolicy2 third = new CarInsurancePolicy2(789, 12, "Newcastle");
	    
	    third.display();
	    
	    //CarInsurancePolicy forth = new CarInsurancePolicy();
		
		
	}

}
