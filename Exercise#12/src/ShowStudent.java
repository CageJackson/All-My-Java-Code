import java.util.Scanner;

//File name ShowStudent.java
//Written by Ernest Mushinge
//Written on 1/20/15

import java.util.Scanner;
public class ShowStudent {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		Student student = new Student();
		System.out.println(" Please Enter the student ID Number>> ");
		student.IDnumber = keyboard.nextInt();
		System.out.println(" Please Enter the student number of credit hours>> ");
		student.NumberOfCreditHours = keyboard.nextInt();
		System.out.println(" Please Enter student number of points earned>> ");
		student.NumberOfPointsEarned = keyboard.nextInt();
		
		student.Display();
	}
}
