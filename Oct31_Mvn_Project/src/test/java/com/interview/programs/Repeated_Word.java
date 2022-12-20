package com.interview.programs;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated_Word {

	public static void main(String[] args) {
		
		String s = "of the people by the people for the people";
		
		System.out.println("Given String: " + s);
		
		String[] words = s.split(" ");
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		for (String word : words) {
			
			int i = 1;
			
			if(map.containsKey(word))
			{
				Integer count = map.get(word);
				count++;
				map.put(word, count);
			}
			
			else
			{
				map.put(word, i);
			}
		}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Entry<String, Integer> entry : entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry);
			}
		}
	}
}