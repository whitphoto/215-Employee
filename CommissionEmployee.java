
public class CommissionEmployee extends Employee
{

	protected double grossSales;
	protected double commissionRate;
	
	public CommissionEmployee( String first, String last, String ssn, int dobMonth, int dobDay, int dobYear, double sales, double rate)
		{
		super( first, last, ssn, dobMonth, dobDay, dobYear );
			setGrossSales( sales );
			setCommissionRate( rate );
				
			
		}// end CommissionEmployee constructor

	public void setFirstName(String first)
		{
			firstName = first;
			
			
		}// end setFirstName
	
	

	
	public double getgrossSales()
		{
			return grossSales;
	
		}// end getGrossSales
	
	public void setCommissionRate(double rate)
		{
			if (rate > 0.0 && rate < 1.0)
				commissionRate = rate;
			else
				System.out.println("Commission rate must be > 0.0 and < 1.0");
			
		}// end setCommissionRate
	
	public double getCommissionRate()
		{
			return commissionRate;
			
		}//end getCommissionRate

	public double getCommissonRate()
		{
			return commissionRate;
			
		}//end getCommissionRate
	
	public double earnings()
		{
			return commissionRate * grossSales;
		}// end earnings
	
	public void setGrossSales(double sales)
	{
		if (sales >=0.0)
			grossSales = sales;
		else
			System.out.println("Gross sales must be >= 0.0");
				
	}// end setGrossSales
	@Override
	public String toString()
		{
				return String.format(super.toString() + " gross sales " + grossSales + " commission rate " +commissionRate );

		}// end toString
	
	
	
}// end CommissionEmployee
