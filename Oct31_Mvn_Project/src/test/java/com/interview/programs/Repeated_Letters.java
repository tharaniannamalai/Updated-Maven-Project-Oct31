package com.interview.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Repeated_Letters {

	public static void main(String[] args) {
		
		String s = "accenture";
		
		char[] c = s.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
	    for (char letter : c) {
			
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
	    
	    Set<Entry<Character, Integer>> entrySet = map.entrySet();
	    
	    for(Entry<Character, Integer> entry : entrySet)
	    {
	    	if(entry.getValue()>1)
	    	{
	    		System.out.println(entry);
	    	}
	    }
	    
	    System.out.println("All Letters Count: " +entrySet);
	}
}