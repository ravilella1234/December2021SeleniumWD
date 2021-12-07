package icici.loans.eduloans;

public class WapperClassDemo 
{

	public static void main(String[] args)
	{
		/*
		   byte      ---> Byte
		   short     ---> Short
		   int       ---> Integer
		   long      ---> Long
		   float     ---> Float
		   double    ---> Double
		   char      ---> Character
		   boolean   ---> Boolean
		 */
		
		int x = 10;
		System.out.println(x);
		Integer y = Integer.valueOf(x);
		//Integer y = x; // autoboxing
		System.out.println(y);
		
		
		System.out.println("-----------------------------");
		
		String s1 = "417";
		String s2 = "420";
		
		
		System.out.println(s1+s2);
		
		int p1 = Integer.parseInt(s1);
		int p2 = Integer.parseInt(s2);
		int result = p1+p2;
		System.out.println(result);

	}

}
