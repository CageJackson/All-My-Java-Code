package MidTermTest;

// file name is TestStudent.java
//Written by Ernest Mushinge
//Written on 03/02/15

public class TestStudent {

	public static void main(String[] args) {
		Student unknownStudent = new Student();
		Student firstStudent = new Student( 5, "Mary", 10, 38);
		
		
		unknownStudent.setStudentID(5);
		unknownStudent.setName("Joe");
		unknownStudent.setCreditHours(20);
		unknownStudent.setPointsEarned(70);
		
		
		
		System.out.println(" The first student GPA is " + firstStudent.calculateGPA());
		System.out.println(" The unknown student GPA is " +unknownStudent.calculateGPA());
		System.out.println(" And the student counter is " + firstStudent.getStudentCount());
		

	}

}
