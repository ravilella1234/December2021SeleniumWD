package icici.loans.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapUserDefinedObject 
{

	public static void main(String[] args) 
	{
		StudentDB s1 = new StudentDB(1, "Student1");
		StudentDB s2 = new StudentDB(2, "Student2");
		StudentDB s3 = new StudentDB(3, "Student3");
		StudentDB s4 = new StudentDB(4, "Student4");
		

		/*
		 * System.out.println(s1); System.out.println(s2); System.out.println(s3);
		 * System.out.println(s4);
		 * 
		 * s1.display(); s2.display(); s3.display(); s4.display();
		 */
		
		HashMap<Integer, StudentDB> obj = new HashMap<Integer, StudentDB>();
		obj.put(s1.sno, s1);
		obj.put(s2.sno, s2);
		obj.put(s3.sno, s3);
		obj.put(s4.sno, s4);
		
		//entrySet
		Set<Entry<Integer, StudentDB>> entries = obj.entrySet();
		for(Entry<Integer, StudentDB> e:entries)
		{
			System.out.println(e.getKey());
			StudentDB ee = e.getValue();
			ee.display();
		}
		
		System.out.println("----------------------------");
		
		//alternative way by using Iterator
		Iterator<Integer> itr = obj.keySet().iterator();
		while(itr.hasNext())
		{
			StudentDB var = obj.get(itr.next());
			var.display();
		}
	}

}
