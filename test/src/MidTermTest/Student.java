package MidTermTest;

public class Student {
	
	
	private int studentID;
	private String name;
	private int pointsEarned;
	private int crHrs;
	
	int studentCount;
	String COLLEGE_NAME= " CCC";
	
	
public Student() {
	++studentCount;
		
	}


	//constructor with 4 instance variable
	public Student(int StudentID, String Name, int PointsEarned, int CreditHours) {
		this.studentID = StudentID;
		this.name = Name;
		this.pointsEarned = PointsEarned;
		this.crHrs = CreditHours;
	}


	
	
	//set methods
	public void setStudentID(int id)
	{
		this.studentID = id;
	}
	public void setName(String Name)
	{
		this.name = Name;
	}
	public void setPointsEarned(int Points)
	{
		this.pointsEarned = Points;
	}
	
	public void setCreditHours(int creditHours)
	{
		this.crHrs = creditHours;
	}
	
	//get methods
	public int getStudentID()
	{
		return studentID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPointsEarned()
	{
		return pointsEarned;
	}
	
	public int getCreditHours()
	{
		return crHrs;
	}
	
	
	public int getStudentCount()
	{
		
		return studentCount;
	}
	public int calculateGPA()
	{
		int GPA = pointsEarned / crHrs;
		return GPA;
	}
	
	

}
