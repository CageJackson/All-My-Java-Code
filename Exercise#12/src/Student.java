//File name Student.java
//Written by Ernest Mushinge
//Written on 1/20/15

public class Student {

	static int IDnumber;
	static int NumberOfCreditHours;
	static int NumberOfPointsEarned;
	static int GradePointAverage;
	
	
	public static int ComputeGradePointAverage()
	{
		GradePointAverage = NumberOfPointsEarned / NumberOfCreditHours;
		return GradePointAverage;
		}
	
	public static void Display()
	
	{
		System.out.println(" The Student ID Number is " + IDnumber );
		System.out.println(" The Student Number of credit hours is " + NumberOfCreditHours );
		System.out.println(" The Student number of points earned is " + NumberOfPointsEarned );
		System.out.println(" The Student grade point average is " + ComputeGradePointAverage());
	}
}


