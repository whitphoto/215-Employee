
public class PayrollSystemTest {

	public static void main(String[] args) 
	{
		Date.setDate(11, 1, 12);

	// create subclass objects
	SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111",11,03,1999, 800.00);
	HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222",10,22,1986, 16.75, 40);
	CommissionEmployee commissionEmployee = new CommissionEmployee( "Sue", "Jones", "333-33-3333",1,2,1965, 10000, .06);
	BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee( "Bob", "Lewis", "444-44-4444",5,6,1905, 5000, .04, 300); 
	PieceWorker pieceWorker = new PieceWorker ("Jim", "Jones", "555-55-5555", 8, 9, 165, 10, 100);
	
	/*
	System.out.println("Employees processed individually:");
	System.out.println("\n: " + salariedEmployee + " earned " + salariedEmployee.earnings());
	System.out.println("\n: " + hourlyEmployee + " earned " + hourlyEmployee.earnings());
	System.out.println("\n: " + commissionEmployee + " earned " + commissionEmployee.earnings());
	System.out.println("\n: " + basePlusCommissionEmployee + " earned " + basePlusCommissionEmployee.earnings());
	System.out.println("\n: " + pieceWorker + " earned " + pieceWorker.earnings());
	*/
	
	Employee[] employees = new Employee[5];
	// initialize array with Employees
	employees[0] = salariedEmployee;
	employees[1] = hourlyEmployee;
	employees[2] = commissionEmployee;
	employees[3] = basePlusCommissionEmployee;
	employees[4] = pieceWorker; 
	System.out.printf("Employees processed polymorphically:%n%n");
	
	for (int i = 0; i < employees.length; i++)
		{
		if (employees[i].birthMonth == Date.getMonth())
		{
			System.out.println(employees[i] + " earned " + (employees[i].earnings() + 100) + " Birthday Bonus!");
		}	
		else
		{	
			System.out.println(employees[i] + " earned " + employees[i].earnings());
		}
		
			
		
		}
	
	// generically process each element in array employees
	
	// get type name of each object in employees array
	for (int j = 0; j < employees.length; j++)
	 System.out.printf("Employee %d is a %s%n", j,
	 employees[j].getClass().getName()); 


	


	}//end main

}//end class PayrollSystemTest
