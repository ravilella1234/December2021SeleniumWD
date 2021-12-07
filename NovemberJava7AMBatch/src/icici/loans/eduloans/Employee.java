package icici.loans.eduloans;

public class Employee 
{
	int eno;
	String ename;
	
	public Employee()
    {
		System.out.println("iam default constructor...");
    }
	
	public Employee(int eno, String ename) 
	{
		this.eno=eno;
		this.ename=ename;
	}

	public Employee(int eno)
	{
		this.eno = eno;
	}

	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		System.out.println(e1.eno);
		System.out.println(e1.ename);
		
		Employee e2 = new Employee(1744,"ravi");
		System.out.println(e2.eno);
		System.out.println(e2.ename);	
	
		Employee e3 = new Employee(100,"sai");
		System.out.println(e3.eno);
		System.out.println(e3.ename);
	}

}
