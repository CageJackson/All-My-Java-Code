
public abstract class  Employee {
	
	private int EmployeeNumber;
	private String EmployeeName;
	
	public int getEmpNum()
	{
		return EmployeeNumber;
	}
	
	public String getEmpName()
	{
		return EmployeeName;
	}
	
	public void setEmpNum(String Name)
	{
		EmployeeName = Name;
	}

	public void setEmpNum(int EmpNum)
	{
		EmployeeNumber = EmpNum;
	}
	
	
	//constructor
	public Employee(String EmpName,int EmpNum) {
		
		EmployeeNumber = EmpNum;
		EmployeeName = EmpName;
	}

	
	public  String toString()
	{
		String Result = "The Employee name is " + EmployeeName + " and the employee number is " + EmployeeNumber;
		return Result;
		
	}
	
	//This abstract will return the weekly pay
	public abstract int CalculatePay();
	
	

}
