package pack3;

import pack1.Class1;

public class Class11 extends Class1
{

	public Class11(int a, int b) 
	{
		super(a, b);
	}

	public static void main(String[] args) 
	{
		Class11 c11 = new Class11(1000, 2000);
		c11.add();
		c11.sub();
	}

}
