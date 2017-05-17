
public abstract class Employee {
	protected String firstName;
	protected String lastName;
	protected String socialSecurityNumber;
	protected int birthMonth;
	protected int birthDay;
	protected int birthYear;
		
	public Employee( String first, String last, String ssn, int dobMonth, int dobDay, int dobYear)
		{
			firstName = first;
			lastName = last;
			socialSecurityNumber = ssn;
			birthMonth = dobMonth;
			birthDay = dobDay;
			birthYear = dobYear;
			
		}
	
public int getBirthMonth()
	{

	return birthMonth;
	
	
	}
		
	public String getFirstName()
		{
			return firstName;
			
		}// end getFirstName
	
	public String getLastName()
		{
			return lastName;
			
		}// end getLastName
		
	public String getSocialSecurityNumber()
		{
			return socialSecurityNumber;
			
		}// end getSocialSecurityNumber
	
	public void setLastName(String last)
		{
			lastName = last;
		}// end setLastName



public void setSocialSecurityNumber(String ssn)
	{
		socialSecurityNumber = ssn;
		
	}// end SetSocialSecurityNumber
	

@Override
public String toString()
	{
			return String.format("employee" + " " + firstName + " " + lastName + " " + "Social security number" + " " + socialSecurityNumber);

	}// end toString

public abstract double earnings();



}//end Employee Class
