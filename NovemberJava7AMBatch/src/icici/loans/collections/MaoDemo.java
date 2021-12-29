package icici.loans.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;

public class MaoDemo 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		h.put(10, 100);
		h.put(20, 200);
		h.put(30, 200);
		h.put(10, 300);
		h.put(40, 400);
		
		System.out.println(h);
		System.out.println(h.get(30));
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		
		Set<Integer> keys = h.keySet();
		for(Integer k:keys)
		{
			System.out.println(k + "--->" + h.get(k));
		}
		
		System.out.println(h.containsKey(30));
		System.out.println(h.containsValue(2000));
		
		
		//LinkedHashMap<Integer, Integer> lh = new LinkedHashMap<Integer, Integer>();
		TreeMap<Integer, Integer> lh = new TreeMap<Integer, Integer>();
		lh.put(100, 100);
		lh.put(200, 200);
		lh.put(30, 200);
		lh.put(1, 300);
		lh.put(40, 400);
		
		System.out.println(lh);
	}

}
