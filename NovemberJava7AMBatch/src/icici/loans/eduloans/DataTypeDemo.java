package icici.loans.eduloans;

public class DataTypeDemo 
{
	//integer Types
	byte b; // 1 byte
	short s; // 2 bytes
	int  i; // 4 bytes
	long l; // 8 bytes
	
	//floating Type
	float f; // 4 bytes
	double  d; // 8 bytes
	
	boolean bb;
	char  ch; // 2 bytes
	
	String name;
	
	static String cname;
	static float roi;

	public static void main(String[] args)
	{
		int x = 10 ;
		
		DataTypeDemo obj = new DataTypeDemo();
		System.out.println("Byte :  "+ obj.b);
		System.out.println("Short : " + obj.s);
		System.out.println("Int : " + obj.i);
		System.out.println("Long : " + obj.l);
		
		System.out.println("Float :" + obj.f);
		System.out.println("Double : " + obj.d);
		
		System.out.println("Boolean : " + obj.bb);
		System.out.println("Char : " + obj.ch);
		
		System.out.println("String : " + obj.name);
		
		System.out.println("cname : " + DataTypeDemo.cname);
		System.out.println("ROI : " + DataTypeDemo.roi);
		
		System.out.println("X : " + x);
	}

}
