package com.interview.programs;

import java.util.*;

import java.util.Map.Entry;

public class Rep_Num_With_Letter {
	
	public static void main(String[] args) {
		
		String s = "a24";
		
		char[] c = s.toCharArray();
		
		String word ="";
		
		Map<Integer, Character> map = new LinkedHashMap<Integer, Character>();
		map.put(1, 'a');
		map.put(2, 'b');
		map.put(3, 'c');
		map.put(4, 'd');
		map.put(5, 'e');
		map.put(6, 'f');
		map.put(7,'g');
		map.put(8, 'h');
		map.put(9, 'i');
		map.put(10, 'j');
		map.put(11,'k');
		map.put(12,'l');
		map.put(13, 'm');
		map.put(14,'n');
		map.put(15, 'o');
		map.put(16, 'p');
		map.put(17, 'q');
		map.put(18, 'r');
		map.put(19, 's');
		map.put(20, 't');
		map.put(21, 'u');
		map.put(22, 'v');
		map.put(23, 'w');
		map.put(24, 'x');
		map.put(25, 'y');
		map.put(26, 'z');
		//System.out.println(map);
		
		for(char letter:c)
		{
			if(Character.isAlphabetic(letter))
			{
				word = word + String.valueOf(letter);
			}
			
			else if(letter>1)
			{	
				int number = letter-'0';
				
				for(int i=0; i<number;i++)
				{
				Integer key = Integer.valueOf(number);
				
				Character character = map.get(key) ;
				
				word = word + String.valueOf(character);
				}
			}
			
		}
		
		System.out.println("Given String: " +s);
		System.out.println(word);
	}
}