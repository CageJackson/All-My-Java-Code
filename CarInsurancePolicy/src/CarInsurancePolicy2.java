//File name CarInsurancePolicy.java
	//Written by Ernest Mushinge
	//Written on 2/2/15

public class CarInsurancePolicy2 {
	private static int policyNumber;
	private static int numPayments;
	private static String residentCity;
	
    
	
	
	public CarInsurancePolicy2(int num)
	{
	
		this(num, 2);// this passes policy number and two constant values to the three-parameter constructor
		
	}
	
	public CarInsurancePolicy2(int num, int payments)
	{
		
		this(num, payments, "Mayfield");
	}
	
	public CarInsurancePolicy2(int num, int payments, String city)
	{
		policyNumber = num;
		numPayments = payments;
		residentCity = city;
		
	}
	public void display()
	{
		System.out.println(" Policy # " + policyNumber + ", " + numPayments + " payments annually, Driver resides in " + residentCity + ",");
		
	}
}
