package icici.loans.carloans;

import java.util.Date;

public  class A 
{
	final int x  =100;
	public final static String name= "ravi";
	

	public void m1()
	{
		
		System.out.println("iam m1 in A");
	}
	
	public static void m6()
	{
		System.out.println("iam m6 static ");
	}
	
	static
	{
		System.out.println("iam static block");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}
	
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		m6();
	}

}
