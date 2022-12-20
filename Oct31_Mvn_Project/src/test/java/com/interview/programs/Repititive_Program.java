package com.interview.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections4.iterators.EntrySetMapIterator;

public class Repititive_Program {
	
	public static void main(String[] args) {
		
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		
		m.put("Starc", 56);
		m.put("Smith", 49);
		m.put("Watson", 33);
		m.put("Finch", 5);
		
		
	    Set<Entry<String, Integer>> entrySet = m.entrySet();
	    
	    for(Entry<String, Integer> entry : entrySet)
	    {
	    	if(entry.getValue()>50)
	    	{
	    		System.out.println(entry);
	    	}
	    }
		
		// Without iteration 
		if(m.containsKey("Smith"))
		{
			System.out.println(m.get("Smith"));
		}
		
		/*Set<String> keyValues = m.keySet();
		
		
		for (String key : keyValues) {
			
			if(key.equals("Smith"))
			{
				Integer value = m.get(key);
			}
			
		}*/
		System.out.println(m);
	    System.out.println(m.keySet());
	}

}
