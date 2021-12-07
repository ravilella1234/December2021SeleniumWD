package icici.loans.eduloans;

public class VariableTypes 
{
	//primitive variable
	int x = 100; // instance (or) global (or) non-static
	static String cname = "vmware"; // static (or) static-global
	static VariableTypes obj;

	public void m1()
	{
		int x = 200; // local 
		//System.out.println(y);
		
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(cname);
	}
	
	public static void m2()
	{
		 obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}
	
	public static void main(String[] args) 
	{
		 obj = new VariableTypes(); // non-primitive/Reference Variable
		System.out.println(obj.x);
		System.out.println(cname);
	}

}
