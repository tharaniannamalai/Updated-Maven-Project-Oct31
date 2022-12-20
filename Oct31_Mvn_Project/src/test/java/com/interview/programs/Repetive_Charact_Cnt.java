package com.interview.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetive_Charact_Cnt {
	
	public static void main(String[] args) {
		
		String s = "abbccc";
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++)
		{
			char letter = s.charAt(i);
			
			if(map.containsKey(letter))
			{
			
				Integer integer = map.get(letter);
				
				map.put(letter, integer+1);
			}
			
			else
			{
				map.put(letter, 1);
			}
		}
		
	    Set<Entry<Character, Integer>> entrySet = map.entrySet();
	    
	    for(Entry<Character, Integer> entry : entrySet)
	    {
	    	System.out.print(entry.getKey());
	    	System.out.print(entry.getValue());
	    }	
	}
}