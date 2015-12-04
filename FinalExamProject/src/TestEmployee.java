
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	Employee[] empRef = new  Employee[3];
	
	HourlyEmpl Empl1 = new HourlyEmpl("Ernest Mushinge", 32);
	//HourlyEmpl Empl2 = new HourlyEmpl();
	
	//SalaryEmpl SEmp1 = new SalaryEmpl();
	
	empRef[0]= new HourlyEmpl("Ernest Mushinge", 32);
	empRef[1]= new HourlyEmpl("John Stewart", 36);
	empRef[2] = new SalaryEmpl("Mika Vinsent", 77);
	
	for(int i= 0; i> empRef.length; i++ )
	{
		System.out.pri(Empl1.toString());
	}
	
	}
}
