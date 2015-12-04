
public class HourlyEmpl extends Employee {
int hourlyRate;
int no_of_hrs_worked;

int WeeklyPay;



//I think I have to call the abstract method here to calculate the pay

 public int CalculatePay(){
	WeeklyPay = hourlyRate * no_of_hrs_worked;
	return WeeklyPay;
}

	public HourlyEmpl(String EmployeeName, int EmployeeNumber) {
		
		super(EmployeeName, EmployeeNumber);
			 
		CalculatePay();
		toString();
	}
	
	

	
	
	

	

}
