package icici.loans.eduloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.hashCode());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('v'));
		
		String s2 = new String("lella");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		
		String s3 = "Ravikanth";
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		String s4 = "ravikan";
		System.out.println(s1.equals(s4));
		System.out.println( s1.equalsIgnoreCase(s4));
		System.out.println(s1.contains(s4));
		
		//s1 = s1+s2;
		//s1 = s1+ " " + s2;
		//s1 = s1.concat(s2);
		System.out.println(s1);
		
		//System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s3.toLowerCase());
		System.out.println(s1.toUpperCase());
		//System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equals(s3.toLowerCase()));
		
		System.out.println(s1);
		System.out.println(s1.replace('r', 'k'));
		System.out.println(s1.substring(2, 7));
		
		
		String s5 = " ravikanth";
		System.out.println(s1);
		System.out.println(s5);
		System.out.println(s5.trim());
		System.out.println(s1.equals(s5.trim()));
		
		String s6 = " Ravikanth";
		System.out.println(s1.equals(s6));
		System.out.println(s1.equals(s6.trim().toLowerCase()));
		
		String s7 = "ravi kanth lella";
		System.out.println(s7);
		String[] str = s7.split(" ");
		for(String s:str)
		{
			System.out.println(s);
		}
		
		System.out.println(s1.startsWith("rav"));
		System.out.println(s1.endsWith("h"));
	}

}
