
public class BasePlusCommissionEmployee extends CommissionEmployee 
{
private double baseSalary;
	public BasePlusCommissionEmployee (String first, String last, String ssn, int dobMonth, int dobDay,int dobYear,  double sales, double rate, double salary)
		{
		super( first, last, ssn, dobMonth, dobDay, dobYear, sales, rate );
			setBaseSalary(salary);
			
			
		}//end BasePlusCommissionEmployee constructor
	
	public void setBaseSalary(double salary)
		{
			if (salary >= 0.0)
				baseSalary = salary;
			else
				throw new IllegalArgumentException("Base salary must be >= 0.0");
			
		}//end setBaseSalary
	
	public double getBaseSalary()
		{
			return baseSalary;
		}//end getBaseSalary
		
	@Override
	public String toString()
	{
		return String.format(super.toString() + " base salary " + baseSalary );
	}// end toString
	
	
}//end BasePlusCommissionEmployee
