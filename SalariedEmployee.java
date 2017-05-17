
public class SalariedEmployee extends Employee
{

	private double weeklySalary;
	
	public SalariedEmployee( String first, String last, String ssn,int dobMonth, int dobDay,int dobYear, double salary)
		{
			super( first, last, ssn, dobMonth, dobDay, dobYear );
			setWeeklySalary(salary);
			
				
		}//end SalariedEmployee constructor
	
	public void setWeeklySalary(double salary)
		{
		if (salary >= 0.0)
			this.weeklySalary = salary;
		else 
			System.out.println("Weekly salary must be >== 0.0");
		}
	public double getWeeklySalary()
		{
			return weeklySalary;
		}
	
	public double earnings()
		{
			return weeklySalary;
			
		}
	
	@Override 
	public String toString()
		{
			return String.format("Salaried Employee: " + super.toString() + " weekly salay" + getWeeklySalary()  );
		}


	
	
		
}//end SalariedEmployee class
