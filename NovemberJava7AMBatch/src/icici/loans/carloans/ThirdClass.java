package icici.loans.carloans;

public class ThirdClass 
{
	// data Properties
	int a =10, b=20, result;
	
	// Behaviours
	public void add()
	{
		result = a+b;
		System.out.println("Add of A & B is :" + result);
	}
	
	public void sub()
	{
		result = a-b;
		System.out.println("Sub of A & B is : " + result);
	}

	public static void main(String[] args) 
	{
		System.out.println("Hi");
			
		ThirdClass obj = new ThirdClass();
		obj.add();
		obj.sub();
		
		ThirdClass obj1 = new ThirdClass();
		obj1.add();
		obj1.sub();
	}

}
