package com.interview.programs;

import java.util.*;
import java.util.Map.Entry;

public class Rep_Letter_Cnt_Rplc {
	
	public static void main(String[] args) {
		
		String s = "abbcccc";
		
		char[] c = s.toCharArray();
		
		String str ="";
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char letter:c)
		{
			if(map.containsKey(letter))
			{
				Integer value = map.get(letter);
				
				value++;
				
				map.put(letter, value);
			}
			
			else
			{
				map.put(letter, 1);
			}	
			
		}
		
		String word = "";
		
	    Set<Entry<Character, Integer>> entrySet = map.entrySet();
	    
	    for (Entry<Character, Integer> entry : entrySet) {
	    	
	    	if(entry.getValue()>1)
	    	{
	    		Integer replacevalue = map.replace(entry.getKey(), entry.getValue());
	    		
	    		word = word+ replacevalue.toString();
	    	}
	    	
	    	else if(entry.getValue()==1)
	    	{
	    	    Character key = entry.getKey();
	    	    
	    	    word = word+key.toString();
	    	}
	  
		}
	    
	    System.out.println(word);
	
	}
}
