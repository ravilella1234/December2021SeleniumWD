package icici.loans.eduloans;

public class EmployeeChild extends Employee
{
	String city;
	
	public EmployeeChild(String city) 
	{
		super(100,"ravi",20.21f);
		this.city = city;
		
		System.out.println(this.city);
	}
	
	public void m5()
	{
		
	}
	
	public static void main(String[] args) 
	{
		EmployeeChild ec = new EmployeeChild("hyderabad");

	}

}
