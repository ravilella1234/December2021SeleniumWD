package icici.loans.eduloans;

public class StringDemo1 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		String s2 = new String("lella");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//s1=s1+s2;
		s1 = s1.concat(s2);
		System.out.println(s1.hashCode());
		
		System.out.println("-------------------------------------------");
		
		StringBuffer sb1 = new StringBuffer("ravi");
		StringBuffer sb2 = new StringBuffer("kanth");
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		sb1 = sb1.append(sb2);
		System.out.println(sb1.hashCode());
		

	}

}
