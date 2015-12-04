
public class SalaryEmpl extends Employee {
	
	
	
	int yearlySalary;
	
	int SalaryEmplPay = yearlySalary / 52;
	
	//I think I have to call the abstract method here to calculate the pay

	public int CalculatePay(){
		SalaryEmplPay = yearlySalary / 52;
		return SalaryEmplPay;
	}
	
	//constructor
	public SalaryEmpl(String EmployeeName, int EmployeeNumber) {
		
		super(EmployeeName, EmployeeNumber);
	}

	

}
