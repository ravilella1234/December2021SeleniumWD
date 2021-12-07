package icici.loans.carloans;

public class B extends A // ISA Relationship
{
	public void m1()
	{
		System.out.println("iam overriden m1 in B");
	}
	
	public void m2()
	{
		System.out.println("iam m2 in B");
	}

	public static void main(String[] args)
	{
		A a = new A(); // HAsA Relationship
		a.m1();
		
		B b = new B();
		b.m2();
		b.m1();
		
		//We can use parent class reference variable to refer/hold child class object.
		A obj = new B();
		obj.m1();
		
		B obj1 = (B) obj;
		obj1.m1();
		obj1.m2();
		
		//We cannot use child class reference variable to hold parent class object
		B a1 = (B) new A();
		B p = a1;
		p.m1();
		p.m2();
		
	}

}
