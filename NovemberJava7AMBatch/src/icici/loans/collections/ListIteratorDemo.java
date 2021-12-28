package icici.loans.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("sai");
		a.add("kiran");
		a.add("ravi");
		a.add("varun");
		
		System.out.println(a);
		
		ListIterator<String> var = a.listIterator();
		while(var.hasNext())
		{
			String str = var.next();
			if(str.equals("ravi"))
				var.set("ravilella");
			else
				var.remove();
		}
		System.out.println(a);
	}

}
